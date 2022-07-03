package net.nydro.forgotten.dreams.block.custom;



import javax.annotation.Nullable;

import net.minecraft.block.Block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FallingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.entity.FallingBlockEntity;
import net.minecraft.entity.ai.pathing.NavigationType;
import net.minecraft.entity.damage.DamageSource;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.entity.projectile.TridentEntity;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import net.minecraft.world.World;
import net.minecraft.world.WorldEvents;

public class ModPotBlock 
extends FallingBlock{

    public ModPotBlock(Settings settings) {
        super(settings);
    }

    
        protected static final VoxelShape SHAPE = VoxelShapes.union(Block.createCuboidShape(0, 0, 0, 16, 11, 16), Block.createCuboidShape(5, 15, 5, 11, 16, 11), Block.createCuboidShape(2, 13, 2, 14, 15, 14), Block.createCuboidShape(4, 11, 4, 12, 13, 12));
        private static final float FALLING_BLOCK_ENTITY_DAMAGE_MULTIPLIER = 1.5f;
        private static final int FALLING_BLOCK_ENTITY_MAX_DAMAGE = 40;
   
        @Override
        public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
            return SHAPE;
        }

        @Override
        protected void configureFallingBlockEntity(FallingBlockEntity entity) {
            entity.setHurtEntities(1.5f, 40);
        }

        @Override
    public void onLanding(World world, BlockPos pos, BlockState fallingBlockState, BlockState currentStateInPos, FallingBlockEntity fallingBlockEntity) {
        if (!fallingBlockEntity.isSilent()) {
            world.syncWorldEvent(WorldEvents.ANVIL_LANDS, pos, 0);
        }
    }

    @Override
    public void onDestroyedOnLanding(World world, BlockPos pos, FallingBlockEntity fallingBlockEntity) {
        if (!fallingBlockEntity.isSilent()) {
            world.syncWorldEvent(WorldEvents.ANVIL_DESTROYED, pos, 0);
        }
    }

    @Override
    public DamageSource getDamageSource() {
        return DamageSource.ANVIL;
    }

    @Override
    public boolean canPathfindThrough(BlockState state, BlockView world, BlockPos pos, NavigationType type) {
        return false;
    }
    
    @Override
    public void onProjectileHit(World world, BlockState state, BlockHitResult hit, ProjectileEntity projectile) {
        BlockPos blockPos = hit.getBlockPos();
        if (!world.isClient && projectile.canModifyAt(world, blockPos) && projectile instanceof TridentEntity && projectile.getVelocity().length() > 0.6) {
            world.breakBlock(blockPos, true);
        }
    }

}
