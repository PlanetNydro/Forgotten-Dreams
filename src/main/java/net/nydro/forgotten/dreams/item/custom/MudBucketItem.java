package net.nydro.forgotten.dreams.item.custom;

import javax.annotation.Nullable;

import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.fluid.Fluid;
import net.minecraft.item.BucketItem;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.WorldAccess;
import net.minecraft.world.event.GameEvent;
import net.nydro.forgotten.dreams.sounds.ModSounds;

public class MudBucketItem 
extends BucketItem{

    
    public MudBucketItem(Fluid fluid, Settings settings) {
        super(fluid, settings);
    }

    @Override
    protected void playEmptyingSound(@Nullable PlayerEntity player, WorldAccess world, BlockPos pos) {
        SoundEvent soundEvent = ModSounds.ITEM_BUCKET_EMPTY_MUD;
        world.playSound(player, pos, soundEvent, SoundCategory.BLOCKS, 1.0f, 1.0f);
        world.emitGameEvent((Entity)player, GameEvent.FLUID_PLACE, pos);
    }
}
