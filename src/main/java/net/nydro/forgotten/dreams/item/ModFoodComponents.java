package net.nydro.forgotten.dreams.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;
public class ModFoodComponents {
    public static final FoodComponent DREAM_APPLE = new FoodComponent.Builder().hunger(4).saturationModifier(6.2f).statusEffect(new StatusEffectInstance(StatusEffects.REGENERATION, 50, 0), 1.0f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 120, 0), 1.0f).alwaysEdible().build();
    public static final FoodComponent THREE_D = new FoodComponent.Builder().hunger(2).saturationModifier(2f).alwaysEdible().build();
    public static final FoodComponent BLUE_FISH =  new FoodComponent.Builder().hunger(2).saturationModifier(0.1f).build();
    public static final FoodComponent COOKED_BLUE_FISH = new FoodComponent.Builder().hunger(5).saturationModifier(0.6f).build();
    
}