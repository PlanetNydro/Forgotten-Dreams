package net.nydro.forgotten.dreams.sounds;


import net.nydro.forgotten.dreams.forgotten_dreams;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModSounds {
    

    public static SoundEvent CALM4 = registerSoundEvent("calm4");
    
    public static SoundEvent VILLAGERSONG = registerSoundEvent("villagersong");

    public static SoundEvent ETERNAL_SCREAMING = registerSoundEvent("eternal_screaming");

    public static SoundEvent COPPER_HORN_1 = registerSoundEvent("copper_horn_1");

    public static SoundEvent COOL_INTRO = registerSoundEvent("cool_intro");

    
    public static SoundEvent ITEM_BUCKET_EMPTY_MUD = registerSoundEvent("mud_bucket_empty");

    public static SoundEvent BONE_SPIDER_ATTACK = registerSoundEvent("bone_spider_attack");
    public static SoundEvent BONE_SPIDER_DEATH = registerSoundEvent("bone_spider_death");
    public static SoundEvent BONE_SPIDER_IDLE = registerSoundEvent("bone_spider_idle");
    public static SoundEvent BONE_SPIDER_SPIT = registerSoundEvent("bone_spider_spit");
    public static SoundEvent BONE_SPIDER_STEP = registerSoundEvent("bone_spider_step");

    public static SoundEvent BONE_WOLF_IDLE = registerSoundEvent("bone_wolf_idle");
    public static SoundEvent BONE_WOLF_DEATH = registerSoundEvent("bone_wolf_death");
    public static SoundEvent BONE_WOLF_GROWL = registerSoundEvent("bone_wolf_growl");
    public static SoundEvent BONE_WOLF_HOWL = registerSoundEvent("bone_wolf_howl");
    public static SoundEvent BONE_WOLF_HURT = registerSoundEvent("bone_wolf_hurt");
    public static SoundEvent BONE_WOLF_PANT = registerSoundEvent("bone_wolf_pant");
    public static SoundEvent BONE_WOLF_SHAKE = registerSoundEvent("bone_wolf_shake");
    public static SoundEvent BONE_WOLF_STEP = registerSoundEvent("bone_wolf_step");
    public static SoundEvent BONE_WOLF_WHINE = registerSoundEvent("bone_wolf_whine");

    public static SoundEvent FANCY_CHICKEN_CROW = registerSoundEvent("fancy_chicken_crow");
    public static SoundEvent FANCY_CHICKEN_DEATH = registerSoundEvent("fancy_chicken_death");
    public static SoundEvent FANCY_CHICKEN_HURT = registerSoundEvent("fancy_chicken_hurt");
    public static SoundEvent FANCY_CHICKEN_IDLE = registerSoundEvent("fancy_chicken_idle");
    
    public static SoundEvent JOLLY_LLAMA_STEP = registerSoundEvent("jolly_llama_step");
    public static SoundEvent JOLLY_LLAMA_BELL = registerSoundEvent("jolly_llama_bell");
    public static SoundEvent JOLLY_LLAMA_FERN = registerSoundEvent("jolly_llama_fern");
    public static SoundEvent JOLLY_LLAMA_EAT = registerSoundEvent("jolly_llama_eat");

    public static SoundEvent JUMBO_RABBIT_HOP = registerSoundEvent("jumbo_rabbit_hop");
    public static SoundEvent JUMBO_RABBIT_HURT = registerSoundEvent("jumbo_rabbit_hurt");
    public static SoundEvent JUMBO_RABBIT_IDLE = registerSoundEvent("jumbo_rabbit_idle");

    public static SoundEvent LOBBER_PROJECTILE = registerSoundEvent("lobber_projectile");
    public static SoundEvent LOBBER_THROW = registerSoundEvent("lobber_throw");

    public static SoundEvent MELON_GOLEM_AGGRO = registerSoundEvent("melon_golem_aggro");
    public static SoundEvent MELON_GOLEM_CHARGE = registerSoundEvent("melon_golem_charge");
    public static SoundEvent MELON_GOLEM_SPIT = registerSoundEvent("melon_golem_spit");
    public static SoundEvent MELON_GOLEM_SEED = registerSoundEvent("melon_golem_seed");

    public static SoundEvent RAINBOW_SHEEP_STEP = registerSoundEvent("rainbow_sheep_step");
    public static SoundEvent RAINBOW_SHEEP_IDLE = registerSoundEvent("rainbow_sheep_idle");
    public static SoundEvent RAINBOW_SHEEP_DEATH = registerSoundEvent("rainbow_sheep_death");

    public static SoundEvent VILLER_WITCH_CAST = registerSoundEvent("viler_witch_cast");

    public static SoundEvent WOLLY_COW_PREP = registerSoundEvent("wolly_cow_prep");
    public static SoundEvent WOLLY_COW_SHAKE = registerSoundEvent("wolly_cow_shake");


    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(forgotten_dreams.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }
}
