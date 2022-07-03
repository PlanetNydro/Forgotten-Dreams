package net.nydro.forgotten.dreams.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStep;
import net.nydro.forgotten.dreams.world.feature.ModPlacedFeatures;

public class ModTreeGeneration {
    public static void generateTrees() {
        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BLOSSOM_TREE_PLACED.getKey().get());

        BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.PLAINS),
                GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.NIGHTMARE_TREE_PLACED.getKey().get());

       BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.DESERT),
               GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.PALM_TREE_PLACED.getKey().get());
        
       BiomeModifications.addFeature(BiomeSelectors.categories(Biome.Category.SAVANNA),
               GenerationStep.Feature.VEGETAL_DECORATION, ModPlacedFeatures.BAOBAB_TREE_PLACED.getKey().get());
    }
}
