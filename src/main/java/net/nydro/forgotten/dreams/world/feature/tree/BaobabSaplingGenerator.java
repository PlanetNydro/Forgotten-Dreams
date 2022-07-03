package net.nydro.forgotten.dreams.world.feature.tree;

import net.minecraft.block.sapling.SaplingGenerator;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.nydro.forgotten.dreams.world.feature.ModConfiguredFeatures;

import org.jetbrains.annotations.Nullable;
    
import java.util.Random;
    
public class BaobabSaplingGenerator extends SaplingGenerator {
    @Nullable
    @Override
    protected RegistryEntry<? extends ConfiguredFeature<?, ?>> getTreeFeature(Random random, boolean bees) {
        return ModConfiguredFeatures.BAOBAB_TREE;
    }}
   
    
