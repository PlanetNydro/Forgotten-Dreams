package net.nydro.forgotten.dreams.entity.renderers;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.nydro.forgotten.dreams.forgotten_dreams;
import net.nydro.forgotten.dreams.entity.custom.JollyLlamaEntity;
import net.nydro.forgotten.dreams.entity.modles.JollyLlamaModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class JollyLlamaRenderer extends GeoEntityRenderer<JollyLlamaEntity> {
    public JollyLlamaRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new JollyLlamaModel());
    }

    @Override
    public Identifier getTextureLocation(JollyLlamaEntity instance) {
        return new Identifier(forgotten_dreams.MOD_ID, "textures/entity/llama/jolly_llama.png");
    }
}