package net.nydro.forgotten.dreams.item;


import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.nydro.forgotten.dreams.forgotten_dreams;

public class ModItemGroup {
    
    public static final ItemGroup DREAMS = FabricItemGroupBuilder.build(new Identifier(forgotten_dreams.MOD_ID, "dreams"),
            () -> new ItemStack(Moditems.RUBY));
}
