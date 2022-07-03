package net.nydro.forgotten.dreams;

import net.fabricmc.api.ModInitializer;
import net.nydro.forgotten.dreams.block.Modblocks;
import net.nydro.forgotten.dreams.item.Moditems;
import net.nydro.forgotten.dreams.painting.ModPaintings;
import net.nydro.forgotten.dreams.util.ModRegistries;
import net.nydro.forgotten.dreams.world.feature.ModConfiguredFeatures;
import net.nydro.forgotten.dreams.world.gen.ModWorldGen;
import software.bernie.example.GeckoLibMod;
import software.bernie.geckolib3.GeckoLib;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class forgotten_dreams implements ModInitializer {

    public static final String MOD_ID = "forgotten_dreams";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    
   
	@Override
	public void onInitialize() {
		ModConfiguredFeatures.registerConfiguredFeatures();
		Moditems.registeredModItems();
		Modblocks.registerModBlocks();
		ModPaintings.registerPaintings();
		GeckoLib.initialize();
		GeckoLibMod.DISABLE_IN_DEV = true;
		ModRegistries.registerModStuffs();
		
		ModWorldGen.generateModWorldGen();
		
	}
}