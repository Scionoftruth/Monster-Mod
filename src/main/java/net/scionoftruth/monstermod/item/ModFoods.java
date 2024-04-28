package net.scionoftruth.monstermod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties MONSTER = new FoodProperties.Builder().nutrition(2).
            saturationMod(0.0f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 3), 1f).build();
}
