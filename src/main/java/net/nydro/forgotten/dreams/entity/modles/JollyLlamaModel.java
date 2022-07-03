package net.nydro.forgotten.dreams.entity.modles;

import net.minecraft.util.Identifier;
import net.nydro.forgotten.dreams.forgotten_dreams;
import net.nydro.forgotten.dreams.entity.custom.JollyLlamaEntity;
import software.bernie.geckolib3.core.event.predicate.AnimationEvent;
import software.bernie.geckolib3.core.processor.IBone;
import software.bernie.geckolib3.model.AnimatedGeoModel;
import software.bernie.geckolib3.model.provider.data.EntityModelData;

public class JollyLlamaModel extends AnimatedGeoModel<JollyLlamaEntity> {
    @Override
    public Identifier getModelLocation(JollyLlamaEntity object) {
        return new Identifier(forgotten_dreams.MOD_ID, "geo/jolly_llama.geo.json");
    }

    @Override
    public Identifier getTextureLocation(JollyLlamaEntity object) {
        return new Identifier(forgotten_dreams.MOD_ID, "textures/entity/jolly_llama.png");
    }

    @Override
    public Identifier getAnimationFileLocation(JollyLlamaEntity animatable) {
        return new Identifier(forgotten_dreams.MOD_ID, "animations/jolly_llama.animation.json");
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
    @Override
    public void setLivingAnimations(JollyLlamaEntity entity, Integer uniqueID, AnimationEvent customPredicate) {
        super.setLivingAnimations(entity, uniqueID, customPredicate);
        IBone head = this.getAnimationProcessor().getBone("head");

        EntityModelData extraData = (EntityModelData) customPredicate.getExtraDataOfType(EntityModelData.class).get(0);
        if (head != null) {
            head.setRotationX(extraData.headPitch * ((float) Math.PI / 180F));
            head.setRotationY(extraData.netHeadYaw * ((float) Math.PI / 180F));
        }
    }
}

