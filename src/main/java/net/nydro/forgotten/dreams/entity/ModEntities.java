package net.nydro.forgotten.dreams.entity;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nydro.forgotten.dreams.forgotten_dreams;
import net.nydro.forgotten.dreams.entity.custom.JollyLlamaEntity;
import net.nydro.forgotten.dreams.entity.custom.MagmaCowEntity;

public class ModEntities {
        public static final EntityType<MagmaCowEntity> MAGMA_COW = Registry.register(
            Registry.ENTITY_TYPE, new Identifier(forgotten_dreams.MOD_ID, "magma_cow"),
            FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, MagmaCowEntity::new)
                    .dimensions(EntityDimensions.fixed(0.9f, 1.4f)).build());


        public static final EntityType<JollyLlamaEntity> JOLLY_LLAMA = Registry.register(
                Registry.ENTITY_TYPE, new Identifier(forgotten_dreams.MOD_ID, "jolly_llama"),
                FabricEntityTypeBuilder.create(SpawnGroup.CREATURE, JollyLlamaEntity::new)
                        .dimensions(EntityDimensions.fixed(0.9f, 1.87f)).build());


}