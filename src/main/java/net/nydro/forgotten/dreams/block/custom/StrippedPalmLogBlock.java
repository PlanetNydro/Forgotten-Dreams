package net.nydro.forgotten.dreams.block.custom;


import net.minecraft.block.Block;

import net.minecraft.block.BlockState;
import net.minecraft.block.FacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Direction;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;

public class StrippedPalmLogBlock 
extends FacingBlock{
    public static final DirectionProperty FACING = Properties.FACING;

    public StrippedPalmLogBlock(Settings settings) {
        super(settings);
        this.setDefaultState((BlockState)((BlockState)((BlockState)this.stateManager.getDefaultState()).with(FACING, Direction.UP)));
    }



    private static final VoxelShape SHAPE_N = VoxelShapes.combineAndSimplify(Block.createCuboidShape(1, 1, 7, 15, 15, 16), Block.createCuboidShape(0, 0, 0, 16, 16, 7), BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_S = VoxelShapes.combineAndSimplify(Block.createCuboidShape(1, 1, 0, 15, 15, 9), Block.createCuboidShape(0, 0, 9, 16, 16, 16), BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_E = VoxelShapes.combineAndSimplify(Block.createCuboidShape(0, 1, 1, 9, 15, 15), Block.createCuboidShape(9, 0, 0, 16, 16, 16), BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_W = VoxelShapes.combineAndSimplify(Block.createCuboidShape(7, 1, 1, 16, 15, 15), Block.createCuboidShape(0, 0, 0, 7, 16, 16), BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_U = VoxelShapes.combineAndSimplify(Block.createCuboidShape(1, 0, 1, 15, 9, 15), Block.createCuboidShape(0, 9, 0, 16, 16, 16), BooleanBiFunction.OR);
    private static final VoxelShape SHAPE_D = VoxelShapes.combineAndSimplify(Block.createCuboidShape(1, 7, 1, 15, 16, 15), Block.createCuboidShape(0, 0, 0, 16, 7, 16), BooleanBiFunction.OR);
    
    @Override
    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        switch (state.get(FACING)) {
            case NORTH:
                return SHAPE_N;
            case SOUTH:
                return SHAPE_S;
            case WEST:
                return SHAPE_W;
            case EAST:
                return SHAPE_E;
            case UP:
                return SHAPE_U;
            case DOWN:
                return SHAPE_D;
            default:
                return SHAPE_U;
        }
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext context) {
		return this.getDefaultState().with(FACING, context.getPlayerLookDirection().getOpposite());
	}
}
