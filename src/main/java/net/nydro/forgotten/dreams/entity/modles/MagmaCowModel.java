package net.nydro.forgotten.dreams.entity.modles;

import net.minecraft.util.Identifier;
import net.nydro.forgotten.dreams.forgotten_dreams;
import net.nydro.forgotten.dreams.entity.custom.MagmaCowEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class MagmaCowModel extends AnimatedGeoModel<MagmaCowEntity> {
    @Override
    public Identifier getModelLocation(MagmaCowEntity object) {
        return new Identifier(forgotten_dreams.MOD_ID, "geo/magmacow.geo.json");
    }

    @Override
    public Identifier getTextureLocation(MagmaCowEntity object) {
        return new Identifier(forgotten_dreams.MOD_ID, "textures/entity/cow/magma/magma.png");
    }

    @Override
    public Identifier getAnimationFileLocation(MagmaCowEntity animatable) {
        return new Identifier(forgotten_dreams.MOD_ID, "animations/magmacow.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(MagmaCowEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}

