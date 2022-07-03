package net.nydro.forgotten.dreams.item;


import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArrowItem;
import net.minecraft.item.Item;
import net.minecraft.item.NetherStarItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SignItem;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolMaterials;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import net.nydro.forgotten.dreams.forgotten_dreams;
import net.nydro.forgotten.dreams.block.Modblocks;
import net.nydro.forgotten.dreams.entity.ModEntities;
import net.nydro.forgotten.dreams.fluid.ModFluids;
import net.nydro.forgotten.dreams.item.custom.HeartWandItem;
import net.nydro.forgotten.dreams.item.custom.ModAxeItem;
import net.nydro.forgotten.dreams.item.custom.ModHoeItem;
import net.nydro.forgotten.dreams.item.custom.ModMusicDiscItem;
import net.nydro.forgotten.dreams.item.custom.ModPickaxeItem;
import net.nydro.forgotten.dreams.item.custom.MudBucketItem;
import net.nydro.forgotten.dreams.sounds.ModSounds;

public class Moditems {


    public static final Item RAM_HORN = registerItem("ram_horn",
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item FANCY_FEATHER = registerItem("fancy_feather",
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));


    public static final Item RUBY = registerItem("ruby",
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item WOODEN_WAND = registerItem("wooden_wand",
        new HeartWandItem(ToolMaterials.WOOD, 3, -2.4f,
        new FabricItemSettings().group(ModItemGroup.DREAMS)));
    public static final Item STONE_WAND = registerItem("stone_wand",
        new HeartWandItem(ToolMaterials.STONE, 3, -2.4f,
        new FabricItemSettings().group(ModItemGroup.DREAMS)));
    public static final Item IRON_WAND = registerItem("iron_wand",
        new HeartWandItem(ToolMaterials.IRON, 3, -2.4f,
        new FabricItemSettings().group(ModItemGroup.DREAMS)));
    public static final Item GOLDEN_WAND = registerItem("golden_wand",
        new HeartWandItem(ToolMaterials.GOLD, 3, -2.4f,
        new FabricItemSettings().group(ModItemGroup.DREAMS)));
    public static final Item DIAMOND_WAND = registerItem("diamond_wand",
        new HeartWandItem(ToolMaterials.DIAMOND, 3, -2.4f,
        new FabricItemSettings().group(ModItemGroup.DREAMS)));
    public static final Item NETHERITE_WAND = registerItem("netherite_wand",
        new HeartWandItem(ToolMaterials.NETHERITE, 3, -2.4f,
        new FabricItemSettings().group(ModItemGroup.DREAMS)));


    public static final Item LOVE_DART = registerItem("love_dart",
    new ArrowItem(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item PINK_IRON_SWORD = registerItem("pink_iron_sword",
        new SwordItem(ModToolMaterials.PINK_IRON, 3, -2.4f,
            new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item PINK_IRON_PICKAXE = registerItem("pink_iron_pickaxe",
        new ModPickaxeItem(ModToolMaterials.PINK_IRON, 1, -2.8f,
            new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item PINK_IRON_AXE = registerItem("pink_iron_axe",
        new ModAxeItem(ModToolMaterials.PINK_IRON, 6, -3.1f,
            new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item PINK_IRON_SHOVEL = registerItem("pink_iron_shovel",
        new ShovelItem(ModToolMaterials.PINK_IRON, 1.5f, -3f,
            new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item PINK_IRON_HOE = registerItem("pink_iron_hoe",
        new ModHoeItem(ModToolMaterials.PINK_IRON, -2, -1f,
            new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item PINK_IRON_HELMET = registerItem("pink_iron_helmet",
        new ArmorItem(ModArmorMaterials.PINK_IRON, EquipmentSlot.HEAD,
            new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item PINK_IRON_CHESTPLATE = registerItem("pink_iron_chestplate",
        new ArmorItem(ModArmorMaterials.PINK_IRON, EquipmentSlot.CHEST,
            new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item PINK_IRON_LEGGINGS = registerItem("pink_iron_leggings",
        new ArmorItem(ModArmorMaterials.PINK_IRON, EquipmentSlot.LEGS,
            new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item PINK_IRON_BOOTS = registerItem("pink_iron_boots",
        new ArmorItem(ModArmorMaterials.PINK_IRON, EquipmentSlot.FEET,
            new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item PINK_IRON_INGOT = registerItem("pink_iron_ingot",
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item RAW_PINK_IRON = registerItem("raw_pink_iron",
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item DREAM_APPLE = registerItem("dream_apple",
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS).food(ModFoodComponents.DREAM_APPLE)));

    public static final Item BLUE_FISH = registerItem("blue_fish",
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS).food(ModFoodComponents.BLUE_FISH)));

    public static final Item COOKED_BLUE_FISH = registerItem("cooked_blue_fish",
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS).food(ModFoodComponents.COOKED_BLUE_FISH)));

    public static final Item CALM4_MUSIC_DISC = registerItem("calm4_music_disc",
        new ModMusicDiscItem(7, ModSounds.CALM4,
                new FabricItemSettings().group(ModItemGroup.DREAMS).maxCount(1).rarity(Rarity.RARE)));

    public static final Item BAR_BRAWL_MUSIC_DISC = registerItem("villagersong_music_disc",
        new ModMusicDiscItem(7, ModSounds.VILLAGERSONG,
            new FabricItemSettings().group(ModItemGroup.DREAMS).maxCount(1).rarity(Rarity.RARE)));

    public static final Item NIGHTMARE_SIGN = registerItem("nightmare_sign",
        new SignItem(new FabricItemSettings().group(ModItemGroup.DREAMS).maxCount(16),
            Modblocks.NIGHTMARE_SIGN_BLOCK, Modblocks.NIGHTMARE_WALL_SIGN_BLOCK));

    public static final Item BLOSSOM_SIGN = registerItem("blossom_sign",
        new SignItem(new FabricItemSettings().group(ModItemGroup.DREAMS).maxCount(16),
            Modblocks.BLOSSOM_SIGN_BLOCK, Modblocks.BLOSSOM_WALL_SIGN_BLOCK));

    public static final Item PALM_SIGN = registerItem("palm_sign",
        new SignItem(new FabricItemSettings().group(ModItemGroup.DREAMS).maxCount(16),
            Modblocks.PALM_SIGN_BLOCK, Modblocks.PALM_WALL_SIGN_BLOCK));

    public static final Item BAOBAB_SIGN = registerItem("baobab_sign",
        new SignItem(new FabricItemSettings().group(ModItemGroup.DREAMS).maxCount(16),
            Modblocks.BAOBAB_SIGN_BLOCK, Modblocks.BAOBAB_WALL_SIGN_BLOCK));
            
    public static final Item IRON_SIGN = registerItem("iron_sign",
        new SignItem(new FabricItemSettings().group(ModItemGroup.DREAMS).maxCount(16),
            Modblocks.IRON_SIGN_BLOCK, Modblocks.IRON_WALL_SIGN_BLOCK));

    

    public static final Item THREE_D = registerItem("3d",
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS).food(ModFoodComponents.THREE_D)));

    public static final Item RED_KEY = registerItem("red_key",
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item BLUE_KEY = registerItem("blue_key",
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item YELLOW_KEY = registerItem("yellow_key",
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item FINE_ITEM = registerItem("fine_item",
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item FOOTPRINT = registerItem("footprint",
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item DREAM_STAR = registerItem("dream_star",
        new NetherStarItem(new FabricItemSettings().rarity(Rarity.UNCOMMON).group(ModItemGroup.DREAMS)));
    

        
    public static final Item ORANGE_CERAMIC_SHARD = registerItem("orange_ceramic_shard", 
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item GRAY_CERAMIC_SHARD = registerItem("gray_ceramic_shard", 
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item LIGHT_GRAY_CERAMIC_SHARD = registerItem("light_gray_ceramic_shard", 
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item BLACK_CERAMIC_SHARD = registerItem("black_ceramic_shard", 
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item GREEN_CERAMIC_SHARD = registerItem("green_ceramic_shard", 
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));

    public static final Item BROWN_CERAMIC_SHARD = registerItem("brown_ceramic_shard", 
        new Item(new FabricItemSettings().group(ModItemGroup.DREAMS)));


    public static final Item MAGMA_COW_SPAWN_EGG = registerItem("magma_cow_spawn_egg",
        new SpawnEggItem(ModEntities.MAGMA_COW,0x222222, 0xe66410,
            new FabricItemSettings().group(ModItemGroup.DREAMS).maxCount(1)));

    public static final Item JOLLY_LLAMA_SPAWN_EGG = registerItem("jolly_llama_spawn_egg",
        new SpawnEggItem(ModEntities.JOLLY_LLAMA,0x5f3425, 0x539957,
                new FabricItemSettings().group(ModItemGroup.DREAMS).maxCount(1)));



    public static final Item MUD_BUCKET = registerItem("mud_bucket",
        new MudBucketItem(ModFluids.MUD_STILL, new FabricItemSettings().group(ModItemGroup.DREAMS).maxCount(1)));
    
        

            
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(forgotten_dreams.MOD_ID, name),  item); 
    }

    public static void registeredModItems() {
        forgotten_dreams.LOGGER.info("Registering Mod Items for forgotten_dreams");

    }
}
