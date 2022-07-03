package net.nydro.forgotten.dreams.world.feature;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.PlacementModifier;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.feature.VegetationPlacedFeatures;
import net.minecraft.world.gen.placementmodifier.BiomePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SurfaceWaterDepthFilterPlacementModifier;

public class ModPlacedFeatures {
    public static final PlacementModifier NOT_IN_SURFACE_WATER_MODIFIER = SurfaceWaterDepthFilterPlacementModifier.of(0);
   
   
    public static final RegistryEntry<PlacedFeature> NIGHTMARE_TREE_PLACED = PlacedFeatures.register("nightmare_tree_placed",
            ModConfiguredFeatures.NIGHTMARE_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
                PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));

    public static final RegistryEntry<PlacedFeature> BLOSSOM_TREE_PLACED = PlacedFeatures.register("blossom_tree_placed",
            ModConfiguredFeatures.BLOSSOM_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
                PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));

    public static final RegistryEntry<PlacedFeature> BAOBAB_TREE_PLACED = PlacedFeatures.register("baobab_tree_placed",
            ModConfiguredFeatures.BAOBAB_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
                PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));

    public static final RegistryEntry<PlacedFeature> PALM_TREE_PLACED = PlacedFeatures.register("palm_tree_placed",
            ModConfiguredFeatures.PALM_TREE_SPAWN, VegetationPlacedFeatures.modifiers(
                 PlacedFeatures.createCountExtraModifier(1, 0.1f, 2)));


    public static final RegistryEntry<PlacedFeature> NIGHTMARE_FOREST_VEGETATION = PlacedFeatures.register("nightmare_forest_vegetation", 
        ModConfiguredFeatures.NIGHTMARE_FOREST_VEGETATION, 
        CountPlacementModifier.of(16), 
        SquarePlacementModifier.of(), 
        NOT_IN_SURFACE_WATER_MODIFIER, 
        PlacedFeatures.OCEAN_FLOOR_HEIGHTMAP, 
        BiomePlacementModifier.of());
    

     



}
