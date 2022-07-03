package net.nydro.forgotten.dreams.util;


import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModTags {
    
    public static class Items {
        public static final TagKey<Item> AXES = createCommonTag("axes");


        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(Registry.ITEM_KEY, new Identifier("c", name));
        }
    }

}
