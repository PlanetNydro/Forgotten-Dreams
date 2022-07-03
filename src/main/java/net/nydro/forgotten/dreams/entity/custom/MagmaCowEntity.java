package net.nydro.forgotten.dreams.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.ai.pathing.PathNodeType;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.tag.FluidTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;

import org.jetbrains.annotations.Nullable;


public class MagmaCowEntity extends AnimalEntity implements IAnimatable{
    private AnimationFactory factory = new AnimationFactory(this);
    public MagmaCowEntity(EntityType<? extends AnimalEntity> entityType, World world) {
            super((EntityType<? extends AnimalEntity>)entityType, world);
            this.setPathfindingPenalty(PathNodeType.WATER, -1.0f);
            this.setPathfindingPenalty(PathNodeType.LAVA, 0.0f);
            this.setPathfindingPenalty(PathNodeType.DANGER_FIRE, 0.0f);
            this.experiencePoints = 10;
        }
        
    
        @Nullable
        @Override
        public PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
            return null;
        }
    
        public static DefaultAttributeContainer.Builder setAttributes() {
            return AnimalEntity.createMobAttributes()
            .add(EntityAttributes.GENERIC_MAX_HEALTH, 10.0)
            .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.2f);
                    }
                
        @Override
            protected void swimUpward(TagKey<Fluid> fluid) {
                if (fluid == FluidTags.LAVA) {
                    this.getVelocity();
                    this.velocityDirty = true;
                } else {
                    super.swimUpward(fluid);
                 }
            }

            @Override
    public boolean isOnFire() {
        return false;
    }

    
                        
        @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new EscapeDangerGoal(this, 2.0));
        this.goalSelector.add(2, new AnimalMateGoal(this, 1.0));
        this.goalSelector.add(3, new TemptGoal(this, 1.25, Ingredient.ofItems(Items.WHEAT), false));
        this.goalSelector.add(4, new FollowParentGoal(this, 1.25));
        this.goalSelector.add(5, new WanderAroundFarGoal(this, 1.0));
        this.goalSelector.add(6, new LookAtEntityGoal(this, PlayerEntity.class, 6.0f));
        this.goalSelector.add(7, new LookAroundGoal(this));

        this.targetSelector.add(1, new AnimalMateGoal(this, 1.0));
    }
    
    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return stack.getItem() == Items.WHEAT;
    }

    

    @Override
    protected float getSoundVolume() {
        return 0.4f;
    }

    @Override
    public boolean hurtByWater() {
        return true;
    }

    
    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.magmacow.walk", true));
            return PlayState.CONTINUE;
        }
        
        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.magmacow.idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController(this, "controller",0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }


    @Override
    public SoundCategory getSoundCategory() {
        return SoundCategory.AMBIENT;
    }
    
    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_COW_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_COW_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_COW_DEATH;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(SoundEvents.ENTITY_COW_STEP, 0.15f, 1.0f);
    }
    }