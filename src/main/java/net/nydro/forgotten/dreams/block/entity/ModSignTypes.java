package net.nydro.forgotten.dreams.block.entity;


import net.nydro.forgotten.dreams.mixin.SignTypeAccessor;
import net.minecraft.util.SignType;

    
    public class ModSignTypes {
        public static final SignType NIGHTMARE =
                SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("nightmare"));

        public static final SignType BLOSSOM =
                SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("blossom"));

        public static final SignType PALM =
                SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("palm"));

        public static final SignType BAOBAB =
                SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("baobab"));

        public static final SignType IRON =
                SignTypeAccessor.registerNew(SignTypeAccessor.newSignType("iron"));
    }
