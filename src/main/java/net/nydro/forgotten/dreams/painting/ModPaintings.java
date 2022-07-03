package net.nydro.forgotten.dreams.painting;


import net.minecraft.entity.decoration.painting.PaintingMotive;
import net.minecraft.util.Identifier;
import net.nydro.forgotten.dreams.forgotten_dreams;
import net.minecraft.util.registry.Registry;


public class ModPaintings {
    
    public static final PaintingMotive HEADACHE = registerPainting("headache", new PaintingMotive(16, 16));
    public static final PaintingMotive GRASS_WAR = registerPainting("grass_war", new PaintingMotive(32, 16));
    public static final PaintingMotive MARS_EFFECT = registerPainting("mars_effect", new PaintingMotive(32, 16));
    public static final PaintingMotive WATER_CUBES = registerPainting("water_cubes", new PaintingMotive(32, 32));
    public static final PaintingMotive LAVA_CUBES = registerPainting("lava_cubes", new PaintingMotive(32, 32));
    public static final PaintingMotive PINK_WITHER = registerPainting("pink_wither", new PaintingMotive(32, 32));
    public static final PaintingMotive UNKNOWN_PACK = registerPainting("unknown_pack", new PaintingMotive(32, 32));
    public static final PaintingMotive BETA = registerPainting("beta", new PaintingMotive(64, 32));
    public static final PaintingMotive SHIPWRECK = registerPainting("shipwreck", new PaintingMotive(64, 32));
    public static final PaintingMotive OUTPOST = registerPainting("outpost", new PaintingMotive(64, 32));
    public static final PaintingMotive BEES = registerPainting("bees", new PaintingMotive(64, 32));
    public static final PaintingMotive NETHER = registerPainting("nether", new PaintingMotive(64, 32));
    public static final PaintingMotive AMATHEST = registerPainting("amathest", new PaintingMotive(64, 32));
    public static final PaintingMotive SUNSET = registerPainting("sunset", new PaintingMotive(64, 32));
    public static final PaintingMotive SWAMP = registerPainting("swamp", new PaintingMotive(64, 32));
    public static final PaintingMotive CREEPERS = registerPainting("creepers", new PaintingMotive(64, 32));
    public static final PaintingMotive TINY_VOTES = registerPainting("tiny_votes", new PaintingMotive(64, 48));
    public static final PaintingMotive GLOW_SQUIDS = registerPainting("glow_squids", new PaintingMotive(64, 48));
    public static final PaintingMotive MINECREEPER = registerPainting("minecreeper", new PaintingMotive(64, 48));
    public static final PaintingMotive STORE = registerPainting("store", new PaintingMotive(64, 64));
    public static final PaintingMotive MINE_AND_WATCH = registerPainting("mine_and_watch", new PaintingMotive(64, 64));

    
    public static PaintingMotive registerPainting(String name, PaintingMotive paintingMotive) {

        return Registry.register(Registry.PAINTING_MOTIVE, new Identifier(forgotten_dreams.MOD_ID, name), paintingMotive);
    }
    
    public static void registerPaintings() {
        forgotten_dreams.LOGGER.info("Registering Paintings for " + forgotten_dreams.MOD_ID);

    }
}
