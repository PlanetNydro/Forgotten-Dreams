package net.nydro.forgotten.dreams.world.feature;

import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.feature.size.TwoLayersFeatureSize;
import net.minecraft.world.gen.foliage.AcaciaFoliagePlacer;
import net.minecraft.world.gen.foliage.BlobFoliagePlacer;
import net.minecraft.world.gen.foliage.DarkOakFoliagePlacer;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.world.gen.stateprovider.BlockStateProvider;
import net.minecraft.world.gen.trunk.DarkOakTrunkPlacer;
import net.minecraft.world.gen.trunk.ForkingTrunkPlacer;
import net.minecraft.world.gen.trunk.GiantTrunkPlacer;
import net.minecraft.world.gen.trunk.StraightTrunkPlacer;
import net.nydro.forgotten.dreams.forgotten_dreams;
import net.nydro.forgotten.dreams.block.Modblocks;

import java.util.List;
import java.util.OptionalInt;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.ConfiguredFeatures;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.TreeFeatureConfig;
import net.minecraft.world.gen.feature.size.ThreeLayersFeatureSize;


public class ModConfiguredFeatures {
        public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> NIGHTMARE_TREE =
                ConfiguredFeatures.register("nightmare_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Modblocks.NIGHTMARE_LOG),
                        new DarkOakTrunkPlacer(6, 2, 1),
                        BlockStateProvider.of(Modblocks.NIGHTMARE_LEAVES),
                        new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                        new ThreeLayersFeatureSize(1, 1, 0, 1, 2, OptionalInt.empty())).ignoreVines().build());

        public static final RegistryEntry<PlacedFeature> NIGHTMARE_TREE_CHECKED =
                PlacedFeatures.register("nightmare_tree_checked", NIGHTMARE_TREE,
                        PlacedFeatures.wouldSurvive(Modblocks.NIGHTMARE_SAPLING));
                    

        public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> NIGHTMARE_TREE_SPAWN =
                ConfiguredFeatures.register("nightmare_spawn", Feature.RANDOM_SELECTOR,
                        new RandomFeatureConfig(List.of(new RandomFeatureEntry(NIGHTMARE_TREE_CHECKED, 0.5f)),
                        NIGHTMARE_TREE_CHECKED));


        public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> NIGHTMARE_FOREST_VEGETATION = 
                ConfiguredFeatures.register("nightmare_forest_vegetation", Feature.RANDOM_SELECTOR, 
                        new RandomFeatureConfig(List.of(new RandomFeatureEntry(PlacedFeatures.createEntry(TreeConfiguredFeatures.HUGE_BROWN_MUSHROOM, new PlacementModifier[0]), 0.025f), 
                        new RandomFeatureEntry(PlacedFeatures.createEntry(TreeConfiguredFeatures.HUGE_RED_MUSHROOM, new PlacementModifier[0]), 0.05f), 
                        new RandomFeatureEntry(NIGHTMARE_TREE_CHECKED, 0.6666667f), 
                        new RandomFeatureEntry(TreePlacedFeatures.BIRCH_CHECKED, 0.2f), 
                        new RandomFeatureEntry(TreePlacedFeatures.FANCY_OAK_CHECKED, 0.1f)), 
                        TreePlacedFeatures.OAK_CHECKED));
      


        public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BLOSSOM_TREE =
                ConfiguredFeatures.register("blossom_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Modblocks.BLOSSOM_LOG),
                        new StraightTrunkPlacer(5, 6, 3),
                        BlockStateProvider.of(Modblocks.BLOSSOM_LEAVES),
                        new BlobFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0), 4),
                        new TwoLayersFeatureSize(1, 0, 2)).build());
                
        public static final RegistryEntry<PlacedFeature> BLOSSOM_TREE_CHECKED =
                PlacedFeatures.register("blossom_tree_checked", BLOSSOM_TREE,
                PlacedFeatures.wouldSurvive(Modblocks.BLOSSOM_SAPLING));
                
        public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BLOSSOM_TREE_SPAWN =
                ConfiguredFeatures.register("blossom_tree_spawn", Feature.RANDOM_SELECTOR,
                        new RandomFeatureConfig(List.of(new RandomFeatureEntry(BLOSSOM_TREE_CHECKED, 0.5f)),
                        BLOSSOM_TREE_CHECKED));


        public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> BAOBAB_TREE =
                ConfiguredFeatures.register("baobab_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Modblocks.BAOBAB_LOG),
                        new GiantTrunkPlacer(13, 5, 14),
                        BlockStateProvider.of(Modblocks.BAOBAB_LEAVES),
                        new DarkOakFoliagePlacer(ConstantIntProvider.create(0), ConstantIntProvider.create(0)),
                        new ThreeLayersFeatureSize(2, 2, 1, 2, 4, OptionalInt.empty())).ignoreVines().build());
    
        public static final RegistryEntry<PlacedFeature> BAOBAB_TREE_CHECKED =
                PlacedFeatures.register("baobab_tree_checked", BAOBAB_TREE,
                PlacedFeatures.wouldSurvive(Modblocks.BAOBAB_SAPLING));
                            
        public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> BAOBAB_TREE_SPAWN =
                ConfiguredFeatures.register("baobab_tree_spawn", Feature.RANDOM_SELECTOR,
                        new RandomFeatureConfig(List.of(new RandomFeatureEntry(BAOBAB_TREE_CHECKED, 0.5f)),
                        BAOBAB_TREE_CHECKED));
            


        public static final RegistryEntry<ConfiguredFeature<TreeFeatureConfig, ?>> PALM_TREE =
                ConfiguredFeatures.register("palm_tree", Feature.TREE, new TreeFeatureConfig.Builder(
                        BlockStateProvider.of(Modblocks.PALM_LOG),
                        new ForkingTrunkPlacer(5, 2, 2),
                        BlockStateProvider.of(Modblocks.PALM_LEAVES),
                        new AcaciaFoliagePlacer(ConstantIntProvider.create(2), ConstantIntProvider.create(0)),
                        new TwoLayersFeatureSize(1, 0, 2)).ignoreVines().build());

                        
          
        public static final RegistryEntry<PlacedFeature> PALM_TREE_CHECKED =
                PlacedFeatures.register("palm_tree_checked", PALM_TREE,
                PlacedFeatures.wouldSurvive(Modblocks.PALM_SAPLING));
                                    
        public static final RegistryEntry<ConfiguredFeature<RandomFeatureConfig, ?>> PALM_TREE_SPAWN =
                ConfiguredFeatures.register("palm_tree_spawn", Feature.RANDOM_SELECTOR,
                        new RandomFeatureConfig(List.of(new RandomFeatureEntry(PALM_TREE_CHECKED, 0.5f)),
                        PALM_TREE_CHECKED));

    public static void registerConfiguredFeatures() {
        System.out.println("Registering ModConfiguredFeatures for " + forgotten_dreams.MOD_ID);
    }
}