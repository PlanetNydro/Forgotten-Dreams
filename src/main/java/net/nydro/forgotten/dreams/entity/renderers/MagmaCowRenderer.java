package net.nydro.forgotten.dreams.entity.renderers;

import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.util.Identifier;
import net.nydro.forgotten.dreams.forgotten_dreams;
import net.nydro.forgotten.dreams.entity.custom.MagmaCowEntity;
import net.nydro.forgotten.dreams.entity.modles.MagmaCowModel;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class MagmaCowRenderer extends GeoEntityRenderer<MagmaCowEntity> {
    public MagmaCowRenderer(EntityRendererFactory.Context ctx) {
        super(ctx, new MagmaCowModel());
    }

    @Override
    public Identifier getTextureLocation(MagmaCowEntity instance) {
        return new Identifier(forgotten_dreams.MOD_ID, "textures/entity/cow/magma/magma.png");
    }
}