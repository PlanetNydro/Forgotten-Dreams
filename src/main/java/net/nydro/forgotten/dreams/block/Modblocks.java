package net.nydro.forgotten.dreams.block;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.nydro.forgotten.dreams.forgotten_dreams;
import net.nydro.forgotten.dreams.block.custom.BookBoxBlock;
import net.nydro.forgotten.dreams.block.custom.ModFluidBlock;
import net.nydro.forgotten.dreams.block.custom.ModPotBlock;
import net.nydro.forgotten.dreams.block.custom.ModSaplingBlock;
import net.nydro.forgotten.dreams.block.custom.PalmLogBlock;
import net.nydro.forgotten.dreams.block.custom.ScreamingBlock;
import net.nydro.forgotten.dreams.block.custom.StrippedPalmLogBlock;
import net.nydro.forgotten.dreams.block.custom.CarvedMelon;
import net.nydro.forgotten.dreams.block.entity.ModSignTypes;
import net.nydro.forgotten.dreams.fluid.ModFluids;
import net.nydro.forgotten.dreams.item.ModItemGroup;
import net.nydro.forgotten.dreams.world.feature.tree.BaobabSaplingGenerator;
import net.nydro.forgotten.dreams.world.feature.tree.BlossomSaplingGenerator;
import net.nydro.forgotten.dreams.world.feature.tree.NightmareSaplingGenerator;
import net.nydro.forgotten.dreams.world.feature.tree.PalmSaplingGenerator;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.CarpetBlock;
import net.minecraft.block.DoorBlock;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.FlowerBlock;
import net.minecraft.block.FlowerPotBlock;
import net.minecraft.block.GlassBlock;
import net.minecraft.block.LeavesBlock;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.block.NetherWartBlock;
import net.minecraft.block.PillarBlock;
import net.minecraft.block.PlantBlock;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.RedstoneBlock;
import net.minecraft.block.SignBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.TrapdoorBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.block.WallSignBlock;
import net.minecraft.block.WoodenButtonBlock;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class Modblocks {
    

    public static final Block RAINBOW_WOOL = registerBlock("rainbow_wool",
    new Block(FabricBlockSettings.copy(Blocks.WHITE_WOOL).sounds(BlockSoundGroup.WOOL).strength(0.8f, 0.8f)), ModItemGroup.DREAMS);
    
    public static final Block RAINBOW_CARPET = registerBlock("rainbow_carpet",
    new CarpetBlock(FabricBlockSettings.of(Material.CARPET).strength(1.0f, 1.0f).sounds(BlockSoundGroup.WOOL)), ModItemGroup.DREAMS);


    public static final Block CARVED_MELON = registerBlock("carved_melon",
    new CarvedMelon(FabricBlockSettings.of(Material.GOURD).sounds(BlockSoundGroup.WOOD).strength(1f, 1f)), ModItemGroup.DREAMS);


    public static final Block RUBY_ORE = registerBlock("ruby_ore",
    new Block(FabricBlockSettings.of(Material.STONE).sounds(BlockSoundGroup.STONE).strength(3f, 3.0f).requiresTool()), ModItemGroup.DREAMS);

    public static final Block DEEPSLATE_RUBY_ORE = registerBlock("deepslate_ruby_ore",
    new Block(FabricBlockSettings.of(Material.STONE).mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE).strength(4.5f, 3.0f).requiresTool()), ModItemGroup.DREAMS);

    public static final Block RUBY_BLOCK = registerBlock("ruby_block",
    new Block(FabricBlockSettings.of(Material.METAL).strength(5f, 6.0f).requiresTool()), ModItemGroup.DREAMS);

    public static final Block CHARCOAL_BLOCK = registerBlock("charcoal_block",
    new Block(FabricBlockSettings.copy(Blocks.COAL_BLOCK).sounds(BlockSoundGroup.METAL).strength(5.0f, 6.0f).requiresTool()), ModItemGroup.DREAMS);

    public static final Block PINK_IRON_ORE = registerBlock("pink_iron_ore",
    new Block(FabricBlockSettings.copy(Blocks.IRON_ORE).sounds(BlockSoundGroup.STONE).strength(3f, 3.0f).requiresTool()), ModItemGroup.DREAMS);

    public static final Block DEEPSLATE_PINK_IRON_ORE = registerBlock("deepslate_pink_iron_ore",
    new Block(FabricBlockSettings.copy(Blocks.DEEPSLATE_IRON_ORE).mapColor(MapColor.DEEPSLATE_GRAY).sounds(BlockSoundGroup.DEEPSLATE).strength(4.5f, 3.0f).requiresTool()), ModItemGroup.DREAMS);
    
    public static final Block RAW_PINK_IRON_BLOCK = registerBlock("raw_pink_iron_block",
        new Block(FabricBlockSettings.copy(Blocks.RAW_IRON_BLOCK).sounds(BlockSoundGroup.METAL).strength(5f, 6.0f).requiresTool()), ModItemGroup.DREAMS);

    public static final Block PINK_IRON_BLOCK = registerBlock("pink_iron_block",
    new Block(FabricBlockSettings.copy(Blocks.IRON_ORE).sounds(BlockSoundGroup.METAL).strength(5f, 6f).requiresTool()), ModItemGroup.DREAMS);



    public static final Block NIGHTMARE_LOG = registerBlock("nightmare_log",
    new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);

    public static final Block NIGHTMARE_WOOD = registerBlock("nightmare_wood",
        new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);

    public static final Block STRIPPED_NIGHTMARE_LOG = registerBlock("stripped_nightmare_log",
        new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);

    public static final Block STRIPPED_NIGHTMARE_WOOD = registerBlock("stripped_nightmare_wood",
        new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);

    public static final Block NIGHTMARE_PLANKS = registerBlock("nightmare_planks",
        new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).strength(2f)), ModItemGroup.DREAMS);

    public static final Block NIGHTMARE_BUTTON = registerBlock("nightmare_button",
            new WoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON)
            .sounds(BlockSoundGroup.WOOD).strength(0.5f, 0.5f).noCollision()), ModItemGroup.DREAMS);

    public static final Block NIGHTMARE_PRESSURE_PLATE = registerBlock("nightmare_pressure_plate",
            new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)
            .sounds(BlockSoundGroup.WOOD).strength(0.5f, 0.5f)), ModItemGroup.DREAMS);

    public static final Block NIGHTMARE_FENCE = registerBlock("nightmare_fence",
            new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);

    public static final Block NIGHTMARE_FENCE_GATE = registerBlock("nightmare_fence_gate",
            new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);

        public static final Block NIGHTMARE_SLAB = registerBlock("nightmare_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);

    public static final Block NIGHTMARE_STAIRS = registerBlock("nightmare_stairs",
            new StairsBlock(Modblocks.NIGHTMARE_PLANKS.getDefaultState(),
                    FabricBlockSettings.copy(Blocks.OAK_STAIRS).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);

    public static final Block NIGHTMARE_DOOR = registerBlock("nightmare_door",
            new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR)
            .sounds(BlockSoundGroup.WOOD).strength(3f, 3.0f).nonOpaque()), ModItemGroup.DREAMS);

    public static final Block NIGHTMARE_TRAPDOOR = registerBlock("nightmare_trapdoor",
            new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR)
            .sounds(BlockSoundGroup.WOOD).strength(3f, 3.0f).nonOpaque()), ModItemGroup.DREAMS);

        public static final Block NIGHTMARE_LEAVES = registerBlock("nightmare_leaves",
                new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f).nonOpaque()), ModItemGroup.DREAMS);
        
        public static final Block NIGHTMARE_SAPLING = registerBlock("nightmare_sapling",
                new ModSaplingBlock(new NightmareSaplingGenerator(),
                        FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.DREAMS);       
        

        public static final Block BLOSSOM_LOG = registerBlock("blossom_log",
                new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);
                
        public static final Block BLOSSOM_WOOD = registerBlock("blossom_wood",
                new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);
                
        public static final Block STRIPPED_BLOSSOM_LOG = registerBlock("stripped_blossom_log",
                new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);
                
        public static final Block STRIPPED_BLOSSOM_WOOD = registerBlock("stripped_blossom_wood",
                new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);
                
        public static final Block BLOSSOM_PLANKS = registerBlock("blossom_planks",
                new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).strength(2f)), ModItemGroup.DREAMS);
                
        public static final Block BLOSSOM_BUTTON = registerBlock("blossom_button",
                new WoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON)
                .sounds(BlockSoundGroup.WOOD).strength(0.5f, 0.5f).noCollision()), ModItemGroup.DREAMS);
                
        public static final Block BLOSSOM_PRESSURE_PLATE = registerBlock("blossom_pressure_plate",
                new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)
                .sounds(BlockSoundGroup.WOOD).strength(0.5f, 0.5f)), ModItemGroup.DREAMS);
                
        public static final Block BLOSSOM_FENCE = registerBlock("blossom_fence",
                new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);
                
        public static final Block BLOSSOM_FENCE_GATE = registerBlock("blossom_fence_gate",
                new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);
                
        public static final Block BLOSSOM_SLAB = registerBlock("blossom_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);
                
        public static final Block BLOSSOM_STAIRS = registerBlock("blossom_stairs",
                new StairsBlock(Modblocks.BLOSSOM_PLANKS.getDefaultState(),
                        FabricBlockSettings.copy(Blocks.OAK_STAIRS).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);
                
         public static final Block BLOSSOM_DOOR = registerBlock("blossom_door",
                new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR)
                .sounds(BlockSoundGroup.WOOD).strength(3f, 3.0f).nonOpaque()), ModItemGroup.DREAMS);
                
        public static final Block BLOSSOM_TRAPDOOR = registerBlock("blossom_trapdoor",
                new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR)
                .sounds(BlockSoundGroup.WOOD).strength(3f, 3.0f).nonOpaque()), ModItemGroup.DREAMS);
                
        public static final Block BLOSSOM_LEAVES = registerBlock("blossom_leaves",
                new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f).nonOpaque()), ModItemGroup.DREAMS);

        public static final Block BLOSSOM_SAPLING = registerBlock("blossom_sapling",
            new ModSaplingBlock(new BlossomSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.DREAMS);

        public static final Block PALM_LOG = registerBlock("palm_log",
                new PalmLogBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f).nonOpaque()), ModItemGroup.DREAMS);
        
        public static final Block PALM_WOOD = registerBlock("palm_wood",
                new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);
                
        public static final Block STRIPPED_PALM_LOG = registerBlock("stripped_palm_log",
                new StrippedPalmLogBlock(FabricBlockSettings.of(Material.WOOD).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);
                
        public static final Block STRIPPED_PALM_WOOD = registerBlock("stripped_palm_wood",
                new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);
                
        public static final Block PALM_PLANKS = registerBlock("palm_planks",
                new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).strength(2f)), ModItemGroup.DREAMS);
                
        public static final Block PALM_BUTTON = registerBlock("palm_button",
                new WoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON)
                .sounds(BlockSoundGroup.WOOD).strength(0.5f, 0.5f).noCollision()), ModItemGroup.DREAMS);
                
        public static final Block PALM_PRESSURE_PLATE = registerBlock("palm_pressure_plate",
                new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)
                .sounds(BlockSoundGroup.WOOD).strength(0.5f, 0.5f)), ModItemGroup.DREAMS);
                
        public static final Block PALM_FENCE = registerBlock("palm_fence",
                new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);
                
        public static final Block PALM_FENCE_GATE = registerBlock("palm_fence_gate",
                new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);
                
        public static final Block PALM_SLAB = registerBlock("palm_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);
                
        public static final Block PALM_STAIRS = registerBlock("palm_stairs",
                new StairsBlock(Modblocks.PALM_PLANKS.getDefaultState(),
                        FabricBlockSettings.copy(Blocks.OAK_STAIRS).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);
                
         public static final Block PALM_DOOR = registerBlock("palm_door",
                new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR)
                .sounds(BlockSoundGroup.WOOD).strength(3f, 3.0f).nonOpaque()), ModItemGroup.DREAMS);
                
        public static final Block PALM_TRAPDOOR = registerBlock("palm_trapdoor",
                new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR)
                .sounds(BlockSoundGroup.WOOD).strength(3f, 3.0f).nonOpaque()), ModItemGroup.DREAMS);
                
        public static final Block PALM_LEAVES = registerBlock("palm_leaves",
                new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f).nonOpaque()), ModItemGroup.DREAMS);

        public static final Block PALM_SAPLING = registerBlock("palm_sapling",
            new ModSaplingBlock(new PalmSaplingGenerator(),
                    FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.DREAMS);

        public static final Block BAOBAB_LOG = registerBlock("baobab_log",
                new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_LOG).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);
                    
        public static final Block BAOBAB_WOOD = registerBlock("baobab_wood",
                new PillarBlock(FabricBlockSettings.copy(Blocks.OAK_WOOD).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);
                    
        public static final Block STRIPPED_BAOBAB_LOG = registerBlock("stripped_baobab_log",
                new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_LOG).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);
                    
        public static final Block STRIPPED_BAOBAB_WOOD = registerBlock("stripped_baobab_wood",
                new PillarBlock(FabricBlockSettings.copy(Blocks.STRIPPED_OAK_WOOD).sounds(BlockSoundGroup.WOOD).strength(2f, 2.0f)), ModItemGroup.DREAMS);
                    
        public static final Block BAOBAB_PLANKS = registerBlock("baobab_planks",
                new Block(FabricBlockSettings.of(Material.WOOD).strength(2.0f, 3.0f).sounds(BlockSoundGroup.WOOD).strength(2f)), ModItemGroup.DREAMS);
                    
        public static final Block BAOBAB_BUTTON = registerBlock("baobab_button",
                new WoodenButtonBlock(FabricBlockSettings.copy(Blocks.OAK_BUTTON)
                .sounds(BlockSoundGroup.WOOD).strength(0.5f, 0.5f).noCollision()), ModItemGroup.DREAMS);
                    
        public static final Block BAOBAB_PRESSURE_PLATE = registerBlock("baobab_pressure_plate",
                new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)
                .sounds(BlockSoundGroup.WOOD).strength(0.5f, 0.5f)), ModItemGroup.DREAMS);
                    
        public static final Block BAOBAB_FENCE = registerBlock("baobab_fence",
                new FenceBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);
                    
        public static final Block BAOBAB_FENCE_GATE = registerBlock("baobab_fence_gate",
                new FenceGateBlock(FabricBlockSettings.copy(Blocks.OAK_FENCE_GATE).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);
                    
        public static final Block BAOBAB_SLAB = registerBlock("baobab_slab",
                new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);
                    
        public static final Block BAOBAB_STAIRS = registerBlock("baobab_stairs",
                new StairsBlock(Modblocks.BAOBAB_PLANKS.getDefaultState(),
                            FabricBlockSettings.copy(Blocks.OAK_STAIRS).sounds(BlockSoundGroup.WOOD).strength(2f, 3.0f)), ModItemGroup.DREAMS);
                    
        public static final Block BAOBAB_DOOR = registerBlock("baobab_door",
                new DoorBlock(FabricBlockSettings.copy(Blocks.OAK_DOOR)
                .sounds(BlockSoundGroup.WOOD).strength(3f, 3.0f).nonOpaque()), ModItemGroup.DREAMS);
                    
        public static final Block BAOBAB_TRAPDOOR = registerBlock("baobab_trapdoor",
                new TrapdoorBlock(FabricBlockSettings.copy(Blocks.OAK_TRAPDOOR)
                .sounds(BlockSoundGroup.WOOD).strength(3f, 3.0f).nonOpaque()), ModItemGroup.DREAMS);
                    
        public static final Block BAOBAB_LEAVES = registerBlock("baobab_leaves",
                new LeavesBlock(FabricBlockSettings.copy(Blocks.OAK_LEAVES).sounds(BlockSoundGroup.GRASS).strength(0.2f, 0.2f).nonOpaque()), ModItemGroup.DREAMS);
    
        public static final Block BAOBAB_SAPLING = registerBlock("baobab_sapling",
            new ModSaplingBlock(new BaobabSaplingGenerator(),
            FabricBlockSettings.copy(Blocks.OAK_SAPLING)), ModItemGroup.DREAMS);

        public static final Block BUTTERCUP = registerBlock("buttercup",
                new FlowerBlock(StatusEffects.SATURATION, 7,FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)), ModItemGroup.DREAMS);

        public static final Block PINK_DAISY = registerBlock("pink_daisy",
                new FlowerBlock(StatusEffects.SATURATION, 7,FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)), ModItemGroup.DREAMS);

        public static final Block ROSE = registerBlock("rose",
                new FlowerBlock(StatusEffects.SATURATION, 7,FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)), ModItemGroup.DREAMS);

        public static final Block BLUE_ROSE = registerBlock("blue_rose",
                new FlowerBlock(StatusEffects.SATURATION, 7,FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)), ModItemGroup.DREAMS);

        public static final Block VIOLET = registerBlock("violet",
                new FlowerBlock(StatusEffects.SATURATION, 7,FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)), ModItemGroup.DREAMS);

        public static final Block PAEONIA = registerBlock("paeonia",
                new FlowerBlock(StatusEffects.SATURATION, 7,FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)), ModItemGroup.DREAMS);

        public static final Block SHRUB = registerBlock("shrub",
                new PlantBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)), ModItemGroup.DREAMS);

        public static final Block GREEN_SHRUB = registerBlock("green_shrub",
                new PlantBlock(FabricBlockSettings.of(Material.PLANT).noCollision().breakInstantly().sounds(BlockSoundGroup.GRASS)), ModItemGroup.DREAMS);

        public static final Block POTTED_BUTTERCUP = registerBlockWithoutBlockItem("potted_buttercup",
                new FlowerPotBlock(Modblocks.BUTTERCUP,
                        FabricBlockSettings.of(Material.DECORATION).breakInstantly().nonOpaque()), ModItemGroup.DREAMS);
        
        public static final Block POTTED_PINK_DAISY = registerBlockWithoutBlockItem("potted_pink_daisy",
                new FlowerPotBlock(Modblocks.PINK_DAISY, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.GRASS).breakInstantly().nonOpaque()), ModItemGroup.DREAMS);
        
        public static final Block POTTED_ROSE = registerBlockWithoutBlockItem("potted_rose",
                new FlowerPotBlock(Modblocks.ROSE, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.GRASS).breakInstantly().nonOpaque()), ModItemGroup.DREAMS);
                
        public static final Block POTTED_BLUE_ROSE = registerBlockWithoutBlockItem("potted_blue_rose",
                new FlowerPotBlock(Modblocks.BLUE_ROSE, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.GRASS).breakInstantly().nonOpaque()), ModItemGroup.DREAMS);

        public static final Block POTTED_VIOLET = registerBlockWithoutBlockItem("potted_violet",
                new FlowerPotBlock(Modblocks.VIOLET, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.GRASS).breakInstantly().nonOpaque()), ModItemGroup.DREAMS);

        public static final Block POTTED_PAEONIA = registerBlockWithoutBlockItem("potted_paeonia",
                new FlowerPotBlock(Modblocks.PAEONIA, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.GRASS).breakInstantly().nonOpaque()), ModItemGroup.DREAMS);

        public static final Block POTTED_NIGHTMARE_SAPLING = registerBlockWithoutBlockItem("potted_nightmare_sapling",
                new FlowerPotBlock(Modblocks.NIGHTMARE_SAPLING, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.GRASS).breakInstantly().nonOpaque()), ModItemGroup.DREAMS);

        public static final Block POTTED_BLOSSOM_SAPLING = registerBlockWithoutBlockItem("potted_blossom_sapling",
                new FlowerPotBlock(Modblocks.BLOSSOM_SAPLING, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.GRASS).breakInstantly().nonOpaque()), ModItemGroup.DREAMS);

        public static final Block POTTED_PALM_SAPLING = registerBlockWithoutBlockItem("potted_palm_sapling",
                new FlowerPotBlock(Modblocks.PALM_SAPLING, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.GRASS).breakInstantly().nonOpaque()), ModItemGroup.DREAMS);

        public static final Block POTTED_BAOBAB_SAPLING = registerBlockWithoutBlockItem("potted_baobab_sapling",
                new FlowerPotBlock(Modblocks.BAOBAB_SAPLING, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.GRASS).breakInstantly().nonOpaque()), ModItemGroup.DREAMS);
        
        public static final Block POTTED_SHRUB = registerBlockWithoutBlockItem("potted_shrub",
                new FlowerPotBlock(Modblocks.SHRUB, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.GRASS).breakInstantly().nonOpaque()), ModItemGroup.DREAMS);
        
        public static final Block POTTED_GREEN_SHRUB = registerBlockWithoutBlockItem("potted_green_shrub",
                new FlowerPotBlock(Modblocks.GREEN_SHRUB, FabricBlockSettings.of(Material.DECORATION).sounds(BlockSoundGroup.GRASS).breakInstantly().nonOpaque()), ModItemGroup.DREAMS);
        
        

        public static final Block NIGHTMARE_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("nightmare_wall_sign",
                new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.NIGHTMARE), ModItemGroup.DREAMS);
    
        public static final Block NIGHTMARE_SIGN_BLOCK = registerBlockWithoutBlockItem("nightmare_sign",
                new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.NIGHTMARE), ModItemGroup.DREAMS);

        public static final Block BLOSSOM_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("blossom_wall_sign",
                new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.BLOSSOM), ModItemGroup.DREAMS);
    
        public static final Block BLOSSOM_SIGN_BLOCK = registerBlockWithoutBlockItem("blossom_sign",
                new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.BLOSSOM), ModItemGroup.DREAMS);

        public static final Block PALM_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("palm_wall_sign",
                new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.PALM), ModItemGroup.DREAMS);
    
        public static final Block PALM_SIGN_BLOCK = registerBlockWithoutBlockItem("palm_sign",
                new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.PALM), ModItemGroup.DREAMS);

        public static final Block BAOBAB_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("baobab_wall_sign",
                new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.BAOBAB), ModItemGroup.DREAMS);
    
        public static final Block BAOBAB_SIGN_BLOCK = registerBlockWithoutBlockItem("baobab_sign",
                new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.BAOBAB), ModItemGroup.DREAMS);

        public static final Block IRON_WALL_SIGN_BLOCK = registerBlockWithoutBlockItem("iron_wall_sign",
            new WallSignBlock(FabricBlockSettings.copy(Blocks.OAK_WALL_SIGN), ModSignTypes.IRON), ModItemGroup.DREAMS);

        public static final Block IRON_SIGN_BLOCK = registerBlockWithoutBlockItem("iron_sign",
            new SignBlock(FabricBlockSettings.copy(Blocks.OAK_SIGN), ModSignTypes.IRON), ModItemGroup.DREAMS);


        public static final Block RIFT_FRAME = registerBlock("rift_frame",
        new GlassBlock(FabricBlockSettings.copy(Blocks.BEDROCK).sounds(BlockSoundGroup.GLASS).nonOpaque().strength(-1, -1)), ModItemGroup.DREAMS);

        public static final Block DUST_DEVIL_SANDSTONE = registerBlock("dust_devil_sandstone",
         new Block(FabricBlockSettings.copy(Blocks.CHISELED_SANDSTONE).sounds(BlockSoundGroup.STONE).strength(2, 6).requiresTool()), ModItemGroup.DREAMS);

        public static final Block SANDSTONE_TILES = registerBlock("sandstone_tiles",
        new Block(FabricBlockSettings.copy(Blocks.CHISELED_SANDSTONE).sounds(BlockSoundGroup.STONE).strength(2, 6).requiresTool()), ModItemGroup.DREAMS);

        public static final Block NETHERITE_STAIRS = registerBlock("netherite_stairs",
            new StairsBlock(Modblocks.NIGHTMARE_PLANKS.getDefaultState(),
                    FabricBlockSettings.copy(Blocks.STONE_STAIRS).sounds(BlockSoundGroup.METAL).strength(50, 1200).requiresTool()), ModItemGroup.DREAMS);

        public static final Block DIRT_SLAB = registerBlock("dirt_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.OAK_SLAB).sounds(BlockSoundGroup.GRAVEL).strength(0.5f, 0.5f)), ModItemGroup.DREAMS);

        public static final Block ETHO_SLAB = registerBlock("etho_slab",
            new SlabBlock(FabricBlockSettings.copy(Blocks.PETRIFIED_OAK_SLAB).sounds(BlockSoundGroup.GRASS).strength(0, 0)), ModItemGroup.DREAMS);

        public static final Block GLOWING_OBSIDIAN = registerBlock("glowing_obsidian",
            new Block(FabricBlockSettings.copy(Blocks.OBSIDIAN).luminance(state -> 12).sounds(BlockSoundGroup.STONE).strength(50, 1200).requiresTool()), ModItemGroup.DREAMS);
        
        public static final Block USB_BLOCK = registerBlock("usb_block",
            new RedstoneBlock(FabricBlockSettings.of(Material.METAL, MapColor.BRIGHT_RED).requiresTool().strength(5.0f, 6.0f).sounds(BlockSoundGroup.METAL)), ModItemGroup.DREAMS);
        
        public static final Block BOOK_BOX = registerBlock("book_box",
            new BookBoxBlock(FabricBlockSettings.copy(Blocks.BOOKSHELF).sounds(BlockSoundGroup.WOOD).strength(1.5f, 2)), ModItemGroup.DREAMS);
            
        public static final Block CURSOR = registerBlock("cursor",
            new Block(FabricBlockSettings.copy(Blocks.BLACK_CONCRETE).sounds(BlockSoundGroup.STONE).strength(1.8f)), ModItemGroup.DREAMS);
            
        public static final Block REACTOR_CORE = registerBlock("reactor_core",
            new Block(FabricBlockSettings.copy(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(50, 1200)), ModItemGroup.DREAMS);
           
        public static final Block WOODCUTTER = registerBlock("woodcutter",
            new Block(FabricBlockSettings.copy(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(1, 1)), ModItemGroup.DREAMS);

        public static final Block UPDATE_DIRT = registerBlock("update_dirt",
            new Block(FabricBlockSettings.of(Material.SOIL, MapColor.LICHEN_GREEN).sounds(BlockSoundGroup.GRAVEL).strength(0.5f)), ModItemGroup.DREAMS);
        
        public static final Block COPPER_BUTTON = registerBlock("copper_button",
            new StoneButtonBlock(FabricBlockSettings.copy(Blocks.STONE_BUTTON)
            .sounds(BlockSoundGroup.METAL).strength(0.5f, 0.5f).noCollision()), ModItemGroup.DREAMS);
        public static final Block EXPOSED_COPPER_BUTTON = registerBlock("exposed_copper_button",
            new StoneButtonBlock(FabricBlockSettings.copy(Blocks.STONE_BUTTON)
            .sounds(BlockSoundGroup.METAL).strength(0.5f, 0.5f).noCollision()), ModItemGroup.DREAMS);
        public static final Block WEATHERED_COPPER_BUTTON = registerBlock("weathered_copper_button",
            new StoneButtonBlock(FabricBlockSettings.copy(Blocks.STONE_BUTTON)
            .sounds(BlockSoundGroup.METAL).strength(0.5f, 0.5f).noCollision()), ModItemGroup.DREAMS);
        public static final Block OXIDIZED_COPPER_BUTTON = registerBlock("oxidized_copper_button",
            new StoneButtonBlock(FabricBlockSettings.copy(Blocks.STONE_BUTTON)
            .sounds(BlockSoundGroup.METAL).strength(0.5f, 0.5f).noCollision()), ModItemGroup.DREAMS);

        public static final Block COPPER_PRESSURE_PLATE = registerBlock("copper_pressure_plate",
                new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)
                .sounds(BlockSoundGroup.METAL).strength(0.5f, 0.5f)), ModItemGroup.DREAMS);
        public static final Block EXPOSED_COPPER_PRESSURE_PLATE = registerBlock("exposed_pressure_plate",
                new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)
                .sounds(BlockSoundGroup.METAL).strength(0.5f, 0.5f)), ModItemGroup.DREAMS);
        public static final Block WEATHERED_COPPER_PRESSURE_PLATE = registerBlock("weathered_pressure_plate",
                new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)
                .sounds(BlockSoundGroup.METAL).strength(0.5f, 0.5f)), ModItemGroup.DREAMS);
        public static final Block OXIDIZED_COPPER_PRESSURE_PLATE = registerBlock("oxidized_pressure_plate",
                new PressurePlateBlock(PressurePlateBlock.ActivationRule.EVERYTHING, FabricBlockSettings.copy(Blocks.OAK_PRESSURE_PLATE)
                .sounds(BlockSoundGroup.METAL).strength(0.5f, 0.5f)), ModItemGroup.DREAMS);

        public static final Block SCREAMING_BLOCK = registerBlock("screaming_block",
                new ScreamingBlock(FabricBlockSettings.copy(Blocks.STONE).sounds(BlockSoundGroup.STONE).strength(50, 1200)), ModItemGroup.DREAMS);
           
        public static final Block RAW_CLAY_POT = registerBlock("raw_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.ORGANIC_PRODUCT).strength(0.6f).sounds(BlockSoundGroup.GRAVEL)), ModItemGroup.DREAMS);
        public static final Block CLAY_POT = registerBlock("clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.ORANGE).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block WHITE_CLAY_POT = registerBlock("white_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_WHITE).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block ORANGE_CLAY_POT = registerBlock("orange_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_ORANGE).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block MAGENTA_CLAY_POT = registerBlock("magenta_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_MAGENTA).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block LIGHT_BLUE_CLAY_POT = registerBlock("light_blue_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_LIGHT_BLUE).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block YELLOW_CLAY_POT = registerBlock("yellow_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_YELLOW).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block LIME_CLAY_POT = registerBlock("lime_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_LIME).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block PINK_CLAY_POT = registerBlock("pink_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_PINK).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block GRAY_CLAY_POT = registerBlock("gray_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_GRAY).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block LIGHT_GRAY_CLAY_POT = registerBlock("light_gray_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_LIGHT_GRAY).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block CYAN_CLAY_POT = registerBlock("cyan_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_CYAN).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block PURPLE_CLAY_POT = registerBlock("purple_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_PURPLE).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block BLUE_CLAY_POT = registerBlock("blue_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_BLUE).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block BROWN_CLAY_POT = registerBlock("brown_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_BROWN).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block GREEN_CLAY_POT = registerBlock("green_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_GREEN).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block RED_CLAY_POT = registerBlock("red_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_RED).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        public static final Block BLACK_CLAY_POT = registerBlock("black_clay_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.TERRACOTTA_BLACK).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        
        public static final Block REBUILT_POT = registerBlock("rebuilt_pot", new ModPotBlock(FabricBlockSettings.of(Material.STONE, MapColor.ORANGE).requiresTool().strength(1.25f, 4.2f)), ModItemGroup.DREAMS);
        

        public static final Block BLUE_NETHER_BRICKS = registerBlock("blue_nether_bricks", 
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.CYAN).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ModItemGroup.DREAMS);
       
        public static final Block BLUE_NETHER_BRICK_STAIRS = registerBlock("blue_nether_brick_stairs", 
        new StairsBlock(BLUE_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(BLUE_NETHER_BRICKS)), ModItemGroup.DREAMS);
    
        public static final Block BLUE_NETHER_BRICK_SLAB = registerBlock("blue_nether_brick_slab", 
        new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.CYAN).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ModItemGroup.DREAMS);
    
        public static final Block BLUE_NETHER_BRICK_WALL = registerBlock("blue_nether_brick_wall", 
        new WallBlock(FabricBlockSettings.copy(BLUE_NETHER_BRICKS)), ModItemGroup.DREAMS);
   
        public static final Block CRACKED_BLUE_NETHER_BRICKS = registerBlock("cracked_blue_nether_bricks", 
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.CYAN).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ModItemGroup.DREAMS);
   
        public static final Block CHISELED_BLUE_NETHER_BRICKS = registerBlock("chiseled_blue_nether_bricks", 
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.CYAN).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ModItemGroup.DREAMS);
    
        public static final Block BLACK_NETHER_BRICKS = registerBlock("black_nether_bricks", 
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ModItemGroup.DREAMS);
       
        public static final Block BLACK_NETHER_BRICK_STAIRS = registerBlock("black_nether_brick_stairs", 
        new StairsBlock(BLACK_NETHER_BRICKS.getDefaultState(), AbstractBlock.Settings.copy(BLACK_NETHER_BRICKS)), ModItemGroup.DREAMS);
    
        public static final Block BLACK_NETHER_BRICK_SLAB = registerBlock("black_nether_brick_slab", 
        new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ModItemGroup.DREAMS);
    
        public static final Block BLACK_NETHER_BRICK_WALL = registerBlock("black_nether_brick_wall", 
        new WallBlock(FabricBlockSettings.copy(BLACK_NETHER_BRICKS)), ModItemGroup.DREAMS);
   
        public static final Block CRACKED_BLACK_NETHER_BRICKS = registerBlock("cracked_black_nether_bricks", 
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ModItemGroup.DREAMS);
   
        public static final Block CHISELED_BLACK_NETHER_BRICKS = registerBlock("chiseled_black_nether_bricks", 
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.BLACK).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ModItemGroup.DREAMS);
    

     public static final Block CRACKED_RED_NETHER_BRICKS = registerBlock("cracked_red_nether_bricks", 
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.DARK_RED).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ModItemGroup.DREAMS);
  
     public static final Block CHISELED_RED_NETHER_BRICKS = registerBlock("chiseled_red_nether_bricks", 
        new Block(FabricBlockSettings.of(Material.STONE, MapColor.DARK_RED).requiresTool().strength(2.0f, 6.0f).sounds(BlockSoundGroup.NETHER_BRICKS)), ModItemGroup.DREAMS);
    
      
    public static final Block WARPED_WART = registerBlock("warped_wart", 
        new NetherWartBlock(FabricBlockSettings.of(Material.PLANT, MapColor.CYAN).noCollision().ticksRandomly().sounds(BlockSoundGroup.NETHER_WART)), ModItemGroup.DREAMS);
public static final Block WITHERING_WART = registerBlock("withering_wart", 
        new NetherWartBlock(FabricBlockSettings.of(Material.PLANT, MapColor.BLACK).noCollision().ticksRandomly().sounds(BlockSoundGroup.NETHER_WART)), ModItemGroup.DREAMS);
    

        public static final Block PETRIFIED_SPRUCE_SLAB = registerBlock("petrified_spruce_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.SPRUCE_BROWN).sounds(BlockSoundGroup.STONE).strength(2f, 6f).requiresTool()), ModItemGroup.DREAMS);
        public static final Block PETRIFIED_BIRCH_SLAB = registerBlock("petrified_birch_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.PALE_YELLOW).sounds(BlockSoundGroup.STONE).strength(2f, 6f).requiresTool()), ModItemGroup.DREAMS);
        public static final Block PETRIFIED_DARK_OAK_SLAB = registerBlock("petrified_dark_oak_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.BROWN).sounds(BlockSoundGroup.STONE).strength(2f, 6f).requiresTool()), ModItemGroup.DREAMS);
        public static final Block PETRIFIED_ACACIA_SLAB = registerBlock("petrified_acacia_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.ORANGE).sounds(BlockSoundGroup.STONE).strength(2f, 6f).requiresTool()), ModItemGroup.DREAMS);
        public static final Block PETRIFIED_JUNGLE_SLAB = registerBlock("petrified_jungle_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.DIRT_BROWN).sounds(BlockSoundGroup.STONE).strength(2f, 6f).requiresTool()), ModItemGroup.DREAMS);
        public static final Block PETRIFIED_WARPED_SLAB = registerBlock("petrified_warped_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.DARK_AQUA).sounds(BlockSoundGroup.STONE).strength(2f, 6.0f).requiresTool()), ModItemGroup.DREAMS);
        public static final Block PETRIFIED_CRIMSON_SLAB = registerBlock("petrified_crimson_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.DULL_PINK).sounds(BlockSoundGroup.STONE).strength(2f, 6.0f).requiresTool()), ModItemGroup.DREAMS);
        public static final Block PETRIFIED_NIGHTMARE_SLAB = registerBlock("petrified_nightmare_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.GRAY).sounds(BlockSoundGroup.STONE).strength(2f, 6f).requiresTool()), ModItemGroup.DREAMS);
        public static final Block PETRIFIED_BLOSSOM_SLAB = registerBlock("petrified_blossom_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.PINK).sounds(BlockSoundGroup.STONE).strength(2f, 6f).requiresTool()), ModItemGroup.DREAMS);
        public static final Block PETRIFIED_PALM_SLAB = registerBlock("petrified_palm_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.PINK).sounds(BlockSoundGroup.STONE).strength(2f, 6f).requiresTool()), ModItemGroup.DREAMS);
        public static final Block PETRIFIED_BAOBAB_SLAB = registerBlock("petrified_baobab_slab",
            new SlabBlock(FabricBlockSettings.of(Material.STONE, MapColor.PINK).sounds(BlockSoundGroup.STONE).strength(2f, 6f).requiresTool()), ModItemGroup.DREAMS);
            

       

        public static final Block MUD_FLUID_BLOCK = registerBlockWithoutBlockItem("mud_fluid_block",
            new ModFluidBlock(ModFluids.MUD_STILL, FabricBlockSettings.of(Material.WATER)
                    .noCollision().nonOpaque().dropsNothing()), ModItemGroup.DREAMS);
                   
        
   





    private static Block registerBlockWithoutBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.BLOCK, new Identifier(forgotten_dreams.MOD_ID, name), block);
    }


private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(forgotten_dreams.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(forgotten_dreams.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        forgotten_dreams.LOGGER.info("Registering ModBlocks for " + forgotten_dreams.MOD_ID);
    }
}