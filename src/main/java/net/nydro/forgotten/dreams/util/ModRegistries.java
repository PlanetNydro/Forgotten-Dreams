package net.nydro.forgotten.dreams.util;


import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;
import net.fabricmc.fabric.api.registry.FlattenableBlockRegistry;
import net.fabricmc.fabric.api.registry.StrippableBlockRegistry;
import net.minecraft.block.Blocks;
import net.nydro.forgotten.dreams.forgotten_dreams;
import net.nydro.forgotten.dreams.block.Modblocks;
import net.nydro.forgotten.dreams.entity.ModEntities;
import net.nydro.forgotten.dreams.entity.custom.JollyLlamaEntity;
import net.nydro.forgotten.dreams.entity.custom.MagmaCowEntity;



public class ModRegistries {
    public static void registerModStuffs() {
        registerFuels();
        registerStrippables();
        registerFlammableBlock();
        registerPathBlocks();
        
        registerAttributes();
        
    }
    
    private static void registerFuels() {
        forgotten_dreams.LOGGER.info("Registering Fuels for " + forgotten_dreams.MOD_ID);
        FuelRegistry registry = FuelRegistry.INSTANCE;

        registry.add(Modblocks.CHARCOAL_BLOCK, 1600);
        registry.add(Modblocks.BOOK_BOX, 300);
        registry.add(Modblocks.NIGHTMARE_FENCE_GATE, 300);
        registry.add(Modblocks.NIGHTMARE_FENCE, 300);
        registry.add(Modblocks.BLOSSOM_FENCE_GATE, 300);
        registry.add(Modblocks.BLOSSOM_FENCE, 300);
        registry.add(Modblocks.PALM_FENCE_GATE, 300);
        registry.add(Modblocks.PALM_FENCE, 300);
        registry.add(Modblocks.BAOBAB_FENCE_GATE, 300);
        registry.add(Modblocks.BAOBAB_FENCE, 300);
    }



    private static void registerFlammableBlock() {
        
        FlammableBlockRegistry instance = FlammableBlockRegistry.getDefaultInstance();

        instance.add(Modblocks.NIGHTMARE_LOG, 5, 5);
        instance.add(Modblocks.STRIPPED_NIGHTMARE_LOG, 5, 5);
        instance.add(Modblocks.NIGHTMARE_WOOD, 5, 5);
        instance.add(Modblocks.STRIPPED_NIGHTMARE_WOOD, 5, 5);
        instance.add(Modblocks.NIGHTMARE_PLANKS, 5, 20);
        instance.add(Modblocks.NIGHTMARE_LEAVES, 30, 60);
        instance.add(Modblocks.NIGHTMARE_SLAB, 5, 20);
        instance.add(Modblocks.NIGHTMARE_FENCE_GATE, 5, 20);
        instance.add(Modblocks.NIGHTMARE_FENCE, 5, 20);
        instance.add(Modblocks.NIGHTMARE_STAIRS, 5, 20);

        instance.add(Modblocks.BLOSSOM_LOG, 5, 5);
        instance.add(Modblocks.STRIPPED_BLOSSOM_LOG, 5, 5);
        instance.add(Modblocks.BLOSSOM_WOOD, 5, 5);
        instance.add(Modblocks.STRIPPED_BLOSSOM_WOOD, 5, 5);
        instance.add(Modblocks.BLOSSOM_PLANKS, 5, 20);
        instance.add(Modblocks.BLOSSOM_LEAVES, 30, 60);
        instance.add(Modblocks.BLOSSOM_SLAB, 5, 20);
        instance.add(Modblocks.BLOSSOM_FENCE_GATE, 5, 20);
        instance.add(Modblocks.BLOSSOM_FENCE, 5, 20);
        instance.add(Modblocks.BLOSSOM_STAIRS, 5, 20);

        
        instance.add(Modblocks.PALM_LOG, 5, 5);
        instance.add(Modblocks.STRIPPED_PALM_LOG, 5, 5);
        instance.add(Modblocks.PALM_WOOD, 5, 5);
        instance.add(Modblocks.STRIPPED_PALM_WOOD, 5, 5);
        instance.add(Modblocks.PALM_PLANKS, 5, 20);
        instance.add(Modblocks.PALM_LEAVES, 30, 60);
        instance.add(Modblocks.PALM_SLAB, 5, 20);
        instance.add(Modblocks.PALM_FENCE_GATE, 5, 20);
        instance.add(Modblocks.PALM_FENCE, 5, 20);
        instance.add(Modblocks.PALM_STAIRS, 5, 20);

        instance.add(Modblocks.BAOBAB_LOG, 5, 5);
        instance.add(Modblocks.STRIPPED_BAOBAB_LOG, 5, 5);
        instance.add(Modblocks.BAOBAB_WOOD, 5, 5);
        instance.add(Modblocks.STRIPPED_BAOBAB_WOOD, 5, 5);
        instance.add(Modblocks.BAOBAB_PLANKS, 5, 20);
        instance.add(Modblocks.BAOBAB_LEAVES, 30, 60);
        instance.add(Modblocks.BAOBAB_SLAB, 5, 20);
        instance.add(Modblocks.BAOBAB_FENCE_GATE, 5, 20);
        instance.add(Modblocks.BAOBAB_FENCE, 5, 20);
        instance.add(Modblocks.BAOBAB_STAIRS, 5, 20);

        instance.add(Modblocks.RAINBOW_WOOL, 30, 60);
        instance.add(Modblocks.RAINBOW_CARPET, 60, 20);
        instance.add(Modblocks.BUTTERCUP,60, 100);
        instance.add(Modblocks.PINK_DAISY,60, 100);
        instance.add(Modblocks.ROSE,60, 100);
        instance.add(Modblocks.BLUE_ROSE,60, 100);
        instance.add(Modblocks.ETHO_SLAB,15, 100);
    }

    private static void registerStrippables() {
        StrippableBlockRegistry.register(Modblocks.NIGHTMARE_LOG, Modblocks.STRIPPED_NIGHTMARE_LOG);
        StrippableBlockRegistry.register(Modblocks.NIGHTMARE_WOOD, Modblocks.STRIPPED_NIGHTMARE_WOOD);
        StrippableBlockRegistry.register(Modblocks.BLOSSOM_LOG, Modblocks.STRIPPED_BLOSSOM_LOG);
        StrippableBlockRegistry.register(Modblocks.BLOSSOM_WOOD, Modblocks.STRIPPED_BLOSSOM_WOOD);
        StrippableBlockRegistry.register(Modblocks.PALM_WOOD, Modblocks.STRIPPED_PALM_WOOD);
        StrippableBlockRegistry.register(Modblocks.BAOBAB_LOG, Modblocks.STRIPPED_BAOBAB_LOG);
        StrippableBlockRegistry.register(Modblocks.BAOBAB_WOOD, Modblocks.STRIPPED_BAOBAB_WOOD);
        
    }


    private static void registerPathBlocks() {
        FlattenableBlockRegistry.register(Modblocks.UPDATE_DIRT, Blocks.DIRT_PATH.getDefaultState());
    }

    private static void registerAttributes() {
        FabricDefaultAttributeRegistry.register(ModEntities.MAGMA_COW, MagmaCowEntity.setAttributes());
        FabricDefaultAttributeRegistry.register(ModEntities.JOLLY_LLAMA, JollyLlamaEntity.setAttributes());
            }
        }
