package net.nydro.forgotten.dreams.fluid;

import net.minecraft.fluid.FlowableFluid;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.nydro.forgotten.dreams.forgotten_dreams;

public class ModFluids {
    public static final FlowableFluid MUD_STILL = register("mud_still", new MudFluid.Still());
    public static final FlowableFluid MUD_FLOWING = register("mud_flowing", new MudFluid.Flowing());

    private static FlowableFluid register(String name, FlowableFluid flowableFluid) {
        return Registry.register(Registry.FLUID, new Identifier(forgotten_dreams.MOD_ID, name), flowableFluid);
    }
}