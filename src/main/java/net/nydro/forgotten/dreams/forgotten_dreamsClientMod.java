package net.nydro.forgotten.dreams;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.render.fluid.v1.FluidRenderHandlerRegistry;
import net.fabricmc.fabric.api.client.render.fluid.v1.SimpleFluidRenderHandler;
import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.event.client.ClientSpriteRegistryCallback;
import net.minecraft.client.render.RenderLayer;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.util.Identifier;
import net.nydro.forgotten.dreams.block.Modblocks;
import net.nydro.forgotten.dreams.entity.ModEntities;
import net.nydro.forgotten.dreams.entity.renderers.JollyLlamaRenderer;
import net.nydro.forgotten.dreams.entity.renderers.MagmaCowRenderer;
import net.nydro.forgotten.dreams.fluid.ModFluids;

public class forgotten_dreamsClientMod implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.NIGHTMARE_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.NIGHTMARE_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.BLOSSOM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.BLOSSOM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.PALM_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.PALM_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.BAOBAB_DOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.BAOBAB_TRAPDOOR, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.RIFT_FRAME, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.WARPED_WART, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.WITHERING_WART, RenderLayer.getCutout());
        
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.PALM_LOG, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.STRIPPED_PALM_LOG, RenderLayer.getCutout());
        
        
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.SCREAMING_BLOCK, RenderLayer.getCutout());

        
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.PAEONIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.POTTED_PAEONIA, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.POTTED_VIOLET, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.SHRUB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.POTTED_SHRUB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.GREEN_SHRUB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.POTTED_GREEN_SHRUB, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.BUTTERCUP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.POTTED_BUTTERCUP, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.PINK_DAISY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.POTTED_PINK_DAISY, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.POTTED_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.BLUE_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.POTTED_BLUE_ROSE, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.NIGHTMARE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.POTTED_NIGHTMARE_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.BLOSSOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.POTTED_BLOSSOM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.PALM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.POTTED_PALM_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.BAOBAB_SAPLING, RenderLayer.getCutout());
        BlockRenderLayerMap.INSTANCE.putBlock(Modblocks.POTTED_BAOBAB_SAPLING, RenderLayer.getCutout());

        EntityRendererRegistry.register(ModEntities.MAGMA_COW, MagmaCowRenderer::new);
        EntityRendererRegistry.register(ModEntities.JOLLY_LLAMA, JollyLlamaRenderer::new);

        ClientSpriteRegistryCallback.event(PlayerScreenHandler.BLOCK_ATLAS_TEXTURE).register((atlasTexture, registry) -> {
            registry.register(new Identifier("forgotten_dreams:block/mud_still"));
            registry.register(new Identifier("forgotten_dreams:block/mud_flow"));
        });
        
        FluidRenderHandlerRegistry.INSTANCE.register(ModFluids.MUD_STILL, ModFluids.MUD_FLOWING, new SimpleFluidRenderHandler(
				new Identifier("forgotten_dreams:block/mud_still"),
				new Identifier("forgotten_dreams:block/mud_flow")
		));

    }
}