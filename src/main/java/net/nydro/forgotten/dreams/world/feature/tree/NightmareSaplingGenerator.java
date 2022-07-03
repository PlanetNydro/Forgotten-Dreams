package net.nydro.forgotten.dreams.world.feature.tree;

import net.minecraft.block.sapling.LargeTreeSaplingGenerator;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.nydro.forgotten.dreams.world.feature.ModConfiguredFeatures;

import org.jetbrains.annotations.Nullable;
    
import java.util.Random;
    
public class NightmareSaplingGenerator 
extends LargeTreeSaplingGenerator {
     @Override
    @Nullable
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return null;
    }

    @Override
    @Nullable
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getLargeTreeFeature(Random random) {
        return ModConfiguredFeatures.NIGHTMARE_TREE;
    }}

   
    
