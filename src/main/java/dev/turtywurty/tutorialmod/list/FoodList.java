package dev.turtywurty.tutorialmod.list;

import net.minecraft.component.type.FoodComponent;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;

public class FoodList {
    public static final FoodComponent SANDWICH_SETTINGS = new FoodComponent.Builder()
            .nutrition(8)
            .saturationModifier(0.3F)
            .alwaysEdible()
            .statusEffect(new StatusEffectInstance(StatusEffects.HASTE, 20 * 60, 2), 1.0F)
            .build();
}
