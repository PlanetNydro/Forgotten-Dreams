package net.nydro.forgotten.dreams.block.custom;




import net.minecraft.block.Block;

import net.minecraft.block.BlockState;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.util.math.BlockPos;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.hit.BlockHitResult;
import net.minecraft.world.World;
import net.nydro.forgotten.dreams.block.Modblocks;
import net.nydro.forgotten.dreams.util.ModTags;

public class PalmLogBlock 
extends StrippedPalmLogBlock{
   
    public static final DirectionProperty FACING = Properties.FACING;

    public PalmLogBlock(Settings settings) {
        super(settings);
    }


    @Override
    public ActionResult onUse(BlockState state, World world, BlockPos pos, PlayerEntity player2, Hand hand, BlockHitResult hit) {
        ItemStack itemStack = player2.getStackInHand(hand);

        if (itemStack.isIn(ModTags.Items.AXES)) {
            if (!world.isClient) {
               
            
                world.playSound(null, pos, SoundEvents.ITEM_AXE_STRIP, SoundCategory.BLOCKS, 1.0f, 1.0f);
                world.setBlockState(pos, (BlockState)Modblocks.STRIPPED_PALM_LOG.getDefaultState().with(StrippedPalmLogBlock.FACING, state.get(PalmLogBlock.FACING)), Block.NOTIFY_ALL | Block.REDRAW_ON_MAIN_THREAD);
                itemStack.damage(1, player2, player -> player.sendToolBreakStatus(hand));
            }
            return ActionResult.success(world.isClient);
        }
        return ActionResult.PASS;
    }

    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
		builder.add(FACING);
	}

	@Override
	public BlockState getPlacementState(ItemPlacementContext context) {
		return this.getDefaultState().with(FACING, context.getPlayerLookDirection().getOpposite());
	}

    
}
