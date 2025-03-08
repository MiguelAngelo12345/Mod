package dev.turtywurty.tutorialmod.init;

import dev.turtywurty.tutorialmod.TutorialMod;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.sound.SoundEvents;

import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

public class ArmorMaterialInit {
    public static final RegistryEntry<ArmorMaterial> AQUARIDIUM = register("aquaridium", Map.of(
            ArmorItem.Type.HELMET, 3,
            ArmorItem.Type.CHESTPLATE, 8,
            ArmorItem.Type.LEGGINGS, 6,
            ArmorItem.Type.BOOTS, 3
    ),
    15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ItemInit.AQUARIDIUM_SCRAP),
            3.0F,
            0.1F,
            false);

    public static final RegistryEntry<ArmorMaterial> FIRIDIUM = register("firidium", Map.of(
                    ArmorItem.Type.HELMET, 3,
                    ArmorItem.Type.CHESTPLATE, 8,
                    ArmorItem.Type.LEGGINGS, 6,
                    ArmorItem.Type.BOOTS, 3
            ),
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ItemInit.FIRIDIUM_INGOT),
            3.0F,
            0.1F,
            false);

    public static final RegistryEntry<ArmorMaterial> ENDIRIUM = register("endirium", Map.of(
                    ArmorItem.Type.HELMET, 8,
                    ArmorItem.Type.CHESTPLATE, 32,
                    ArmorItem.Type.LEGGINGS, 24,
                    ArmorItem.Type.BOOTS, 8
            ),
            15,
            SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE,
            () -> Ingredient.ofItems(ItemInit.ENDIRIUM_INGOT),
            4.0F,
            0.2F,
            false);

    public static RegistryEntry<ArmorMaterial> register(String id, Map<ArmorItem.Type, Integer> defensePoints,
                                                        int enchantaility, RegistryEntry<SoundEvent> equipSound,
                                                        Supplier<Ingredient> repairIngredient, float toughness,
                                                        float knockbackResistance, boolean dyeable) {
        List<ArmorMaterial.Layer> layers = List.of(
                new ArmorMaterial.Layer(TutorialMod.id(id), "", dyeable)
        );

        var material = new ArmorMaterial(defensePoints, enchantaility, equipSound, repairIngredient, layers,
                toughness, knockbackResistance);
        material = Registry.register(Registries.ARMOR_MATERIAL, TutorialMod.id(id), material);

        return RegistryEntry.of(material);
    }

    public static void load(){}
}
