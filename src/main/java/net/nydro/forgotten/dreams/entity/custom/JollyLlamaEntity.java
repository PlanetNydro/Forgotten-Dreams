package net.nydro.forgotten.dreams.entity.custom;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.goal.*;
import net.minecraft.entity.attribute.DefaultAttributeContainer;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.passive.AbstractDonkeyEntity;
import net.minecraft.entity.passive.AnimalEntity;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.passive.TameableEntity;
import net.minecraft.entity.passive.WolfEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.recipe.Ingredient;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.World;
import net.nydro.forgotten.dreams.sounds.ModSounds;

import org.jetbrains.annotations.Nullable;
import software.bernie.geckolib3.core.IAnimatable;
import software.bernie.geckolib3.core.PlayState;
import software.bernie.geckolib3.core.builder.AnimationBuilder;
import software.bernie.geckolib3.core.controller.AnimationController;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.manager.AnimationData;
import software.bernie.geckolib3.core.manager.AnimationFactory;


public class JollyLlamaEntity extends AbstractDonkeyEntity
implements IAnimatable {
    private static final Ingredient TAMING_INGREDIENT = Ingredient.ofItems(Items.WHEAT, Blocks.HAY_BLOCK.asItem());
    boolean spit;
    @Nullable
    private JollyLlamaEntity following;
    @Nullable
    private JollyLlamaEntity follower;
    private AnimationFactory factory = new AnimationFactory(this);
    public JollyLlamaEntity(EntityType<? extends JollyLlamaEntity> entityType, World world) {
        super((EntityType<? extends AbstractDonkeyEntity>)entityType, world);
    }



    public static DefaultAttributeContainer.Builder setAttributes() {
        return TameableEntity.createMobAttributes()
                .add(EntityAttributes.GENERIC_MAX_HEALTH, 20.0D)
                .add(EntityAttributes.GENERIC_ATTACK_DAMAGE, 8.0f)
                .add(EntityAttributes.GENERIC_ATTACK_SPEED, 2.0f)
                .add(EntityAttributes.GENERIC_MOVEMENT_SPEED, 0.3f);
    }

    @Override
    protected void initGoals() {
        this.goalSelector.add(0, new SwimGoal(this));
        this.goalSelector.add(1, new HorseBondWithPlayerGoal(this, 1.2));
        this.goalSelector.add(3, new EscapeDangerGoal(this, 1.2));
        this.goalSelector.add(4, new AnimalMateGoal(this, 1.0));
        this.goalSelector.add(5, new TemptGoal(this, 1.25, Ingredient.ofItems(Items.HAY_BLOCK), false));
        this.goalSelector.add(6, new FollowParentGoal(this, 1.0));
        this.goalSelector.add(7, new WanderAroundFarGoal(this, 0.7));
        this.goalSelector.add(8, new LookAtEntityGoal(this, PlayerEntity.class, 6.0f));
        this.goalSelector.add(9, new LookAroundGoal(this));
        this.targetSelector.add(1, new SpitRevengeGoal(this));
        this.targetSelector.add(2, new ChaseWolvesGoal(this));


        this.targetSelector.add(1, new AnimalMateGoal(this, 1.0));
    }

    public static DefaultAttributeContainer.Builder createLlamaAttributes() {
        return JollyLlamaEntity.createAbstractDonkeyAttributes().add(EntityAttributes.GENERIC_FOLLOW_RANGE, 40.0);
    }

    private <E extends IAnimatable> PlayState predicate(AnimationEvent<E> event) {
        if (event.isMoving()) {
            event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.jolly_llama.prance", true));
            return PlayState.CONTINUE;
        }

        event.getController().setAnimation(new AnimationBuilder().addAnimation("animation.jolly_llama.idle", true));
        return PlayState.CONTINUE;
    }

    @Override
    public boolean isBreedingItem(ItemStack stack) {
        return TAMING_INGREDIENT.test(stack);
    }

    @Override
    protected boolean receiveFood(PlayerEntity player, ItemStack item) {
        int i = 0;
        int j = 0;
        float f = 0.0f;
        boolean bl = false;
        if (item.isOf(Items.WHEAT)) {
            i = 10;
            j = 3;
            f = 2.0f;
        } else if (item.isOf(Blocks.HAY_BLOCK.asItem())) {
            i = 90;
            j = 6;
            f = 10.0f;
            if (this.isTame() && this.getBreedingAge() == 0 && this.canEat()) {
                bl = true;
                this.lovePlayer(player);
            }
        }
        if (this.getHealth() < this.getMaxHealth() && f > 0.0f) {
            this.heal(f);
            bl = true;
        }
        if (this.isBaby() && i > 0) {
            this.world.addParticle(ParticleTypes.HAPPY_VILLAGER, this.getParticleX(1.0), this.getRandomBodyY() + 0.5, this.getParticleZ(1.0), 0.0, 0.0, 0.0);
            if (!this.world.isClient) {
                this.growUp(i);
            }
            bl = true;
        }
        if (j > 0 && (bl || !this.isTame()) && this.getTemper() < this.getMaxTemper()) {
            bl = true;
            if (!this.world.isClient) {
                this.addTemper(j);
            }
        }
        
        return bl;
    }

    @Override
    protected boolean isImmobile() {
        return this.isDead() || this.isEatingGrass();
    }


    @Override
    public SoundCategory getSoundCategory() {
        return SoundCategory.AMBIENT;
    }

    @Override
    protected SoundEvent getAmbientSound() {
        return SoundEvents.ENTITY_LLAMA_AMBIENT;
    }

    @Override
    protected SoundEvent getHurtSound(DamageSource source) {
        return SoundEvents.ENTITY_LLAMA_HURT;
    }

    @Override
    protected SoundEvent getDeathSound() {
        return SoundEvents.ENTITY_LLAMA_DEATH;
    }

    @Override
    @Nullable
    protected SoundEvent getEatSound() {
        return ModSounds.JOLLY_LLAMA_EAT;
    }

    @Override
    protected void playStepSound(BlockPos pos, BlockState state) {
        this.playSound(ModSounds.JOLLY_LLAMA_STEP, 0.15f, 1.0f);
    }


    @Override
    public void playAngrySound() {
        SoundEvent soundEvent = this.getAngrySound();
        if (soundEvent != null) {
            this.playSound(soundEvent, this.getSoundVolume(), this.getSoundPitch());
        }
    }


    @Override
    public void updatePassengerPosition(Entity passenger) {
        if (!this.hasPassenger(passenger)) {
            return;
        }
        float f = MathHelper.cos(this.bodyYaw * ((float)Math.PI / 180));
        float g = MathHelper.sin(this.bodyYaw * ((float)Math.PI / 180));
        passenger.setPosition(this.getX() + (double)(0.3f * g), this.getY() + this.getMountedHeightOffset() + passenger.getHeightOffset(), this.getZ() - (double)(0.3f * f));
    }

    @Override
    public double getMountedHeightOffset() {
        return (double)this.getHeight() * 0.6;
    }

    @Override
    public boolean canBeControlledByRider() {
        return false;
    }
    
    @Override
    public boolean canBeSaddled() {
        return false;
    }

    @Override
    public int getMaxTemper() {
        return 30;
    }

    @Override
    public boolean canBreedWith(AnimalEntity other) {
        return other != this && other instanceof JollyLlamaEntity && this.canBreed() && ((JollyLlamaEntity)other).canBreed();
    }


    public void stopFollowing() {
        if (this.following != null) {
            this.following.follower = null;
        }
        this.following = null;
    }

    public void follow(JollyLlamaEntity llama) {
        this.following = llama;
        this.following.follower = this;
    }

    public boolean hasFollower() {
        return this.follower != null;
    }

    public boolean isFollowing() {
        return this.following != null;
    }

    @Nullable
    public JollyLlamaEntity getFollowing() {
        return this.following;
    }

    @Override
    protected double getRunFromLeashSpeed() {
        return 2.0;
    }

    @Override
    protected void walkToParent() {
        if (!this.isFollowing() && this.isBaby()) {
            super.walkToParent();
        }
    }

    @Override
    public boolean eatsGrass() {
        return false;
    }


    @Override
    public Vec3d getLeashOffset() {
        return new Vec3d(0.0, 0.75 * (double)this.getStandingEyeHeight(), (double)this.getWidth() * 0.5);
    }

    @Override
    public /* synthetic */ PassiveEntity createChild(ServerWorld world, PassiveEntity entity) {
        return this.createChild(world, entity);
    }

    static class SpitRevengeGoal
    extends RevengeGoal {
        public SpitRevengeGoal(JollyLlamaEntity llama) {
            super(llama, new Class[0]);
        }

        @Override
        public boolean shouldContinue() {
            if (this.mob instanceof JollyLlamaEntity) {
                JollyLlamaEntity llamaEntity = (JollyLlamaEntity)this.mob;
                if (llamaEntity.spit) {
                    llamaEntity.setSpit(false);
                    return false;
                }
            }
            return super.shouldContinue();
        }
    }

    static class ChaseWolvesGoal
    extends ActiveTargetGoal<WolfEntity> {
        public ChaseWolvesGoal(JollyLlamaEntity Jollyllama) {
            super(Jollyllama, WolfEntity.class, 16, false, true, wolf -> !((WolfEntity)wolf).isTamed());
        }

        @Override
        protected double getFollowRange() {
            return super.getFollowRange() * 0.25;
        }
    }
    
    void setSpit(boolean spit) {
        this.spit = spit;
    }

    

    @Override
    public void registerControllers(AnimationData animationData) {
        animationData.addAnimationController(new AnimationController((IAnimatable) this, "controller",
                0, this::predicate));
    }

    @Override
    public AnimationFactory getFactory() {
        return factory;
    }


}
