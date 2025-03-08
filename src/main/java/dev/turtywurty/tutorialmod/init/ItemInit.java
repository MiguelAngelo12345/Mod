package dev.turtywurty.tutorialmod.init;

import dev.turtywurty.tutorialmod.TutorialMod;
import dev.turtywurty.tutorialmod.list.FoodList;
import dev.turtywurty.tutorialmod.list.enums.TutorialModToolMaterials;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;

public class ItemInit {
    public static final Item AQUARIDIUM_SCRAP = register("aquaridium_scrap", new Item(new Item.Settings()));

    public static final Item SANDWICH = register("sandwich",
            new Item(new Item.Settings().food(FoodList.SANDWICH_SETTINGS).maxCount(32)));

    public static final SwordItem AQUARIDIUM_SWORD = register("aquaridium_sword",
            new SwordItem(TutorialModToolMaterials.AQUARIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(SwordItem.createAttributeModifiers(TutorialModToolMaterials.AQUARIDIUM, 6, -2.4f))));

    public static final PickaxeItem AQUARIDIUM_PICKAXE = register("aquaridium_pickaxe",
            new PickaxeItem(TutorialModToolMaterials.AQUARIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(TutorialModToolMaterials.AQUARIDIUM, 1.0F, -2.8F))));

    public static final ShovelItem AQUARIDIUM_SHOVEL = register("aquaridium_shovel",
            new ShovelItem(TutorialModToolMaterials.AQUARIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(TutorialModToolMaterials.AQUARIDIUM, 1.5F, -3.0F))));

    public static final AxeItem AQUARIDIUM_AXE = register("aquaridium_axe",
            new AxeItem(TutorialModToolMaterials.AQUARIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(AxeItem.createAttributeModifiers(TutorialModToolMaterials.AQUARIDIUM, 6.0F, -3.0F))));

    public static final HoeItem AQUARIDIUM_HOE = register("aquaridium_hoe",
            new HoeItem(TutorialModToolMaterials.AQUARIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(HoeItem.createAttributeModifiers(TutorialModToolMaterials.AQUARIDIUM, -4.0F, -0.0F))));

    public static final ArmorItem AQUARIDIUM_HELMET = register("aquaridium_helmet",
            new ArmorItem(ArmorMaterialInit.AQUARIDIUM, ArmorItem.Type.HELMET, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));

    public static final ArmorItem AQUARIDIUM_CHESTPLATE = register("aquaridium_chestplate",
            new ArmorItem(ArmorMaterialInit.AQUARIDIUM, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));

    public static final ArmorItem AQUARIDIUM_LEGGINGS = register("aquaridium_leggings",
            new ArmorItem(ArmorMaterialInit.AQUARIDIUM, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));

    public static final ArmorItem AQUARIDIUM_BOOTS = register("aquaridium_boots",
            new ArmorItem(ArmorMaterialInit.AQUARIDIUM, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));

    public static final Item FIRIDIUM_INGOT = register("firidium_ingot", new Item(new Item.Settings()));

    public static final SwordItem FIRIDIUM_SWORD = register("firidium_sword",
            new SwordItem(TutorialModToolMaterials.FIRIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(SwordItem.createAttributeModifiers(TutorialModToolMaterials.AQUARIDIUM, 6, -2.4f))));

    public static final PickaxeItem FIRIDIUM_PICKAXE = register("firidium_pickaxe",
            new PickaxeItem(TutorialModToolMaterials.FIRIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(TutorialModToolMaterials.AQUARIDIUM, 1.0F, -2.8F))));

    public static final ShovelItem FIRIDIUM_SHOVEL = register("firidium_shovel",
            new ShovelItem(TutorialModToolMaterials.FIRIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(TutorialModToolMaterials.AQUARIDIUM, 1.5F, -3.0F))));

    public static final AxeItem FIRIDIUM_AXE = register("firidium_axe",
            new AxeItem(TutorialModToolMaterials.FIRIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(AxeItem.createAttributeModifiers(TutorialModToolMaterials.AQUARIDIUM, 6.0F, -3.0F))));

    public static final HoeItem FIRIDIUM_HOE = register("firidium_hoe",
            new HoeItem(TutorialModToolMaterials.FIRIDIUM, new Item.Settings().fireproof()
                    .attributeModifiers(HoeItem.createAttributeModifiers(TutorialModToolMaterials.AQUARIDIUM, -4.0F, -0.0F))));

    public static final ArmorItem FIRIDIUM_HELMET = register("firidium_helmet",
            new ArmorItem(ArmorMaterialInit.FIRIDIUM, ArmorItem.Type.HELMET, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(45))));

    public static final ArmorItem FIRIDIUM_CHESTPLATE = register("firidium_chestplate",
            new ArmorItem(ArmorMaterialInit.FIRIDIUM, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(45))));

    public static final ArmorItem FIRIDIUM_LEGGINGS = register("firidium_leggings",
            new ArmorItem(ArmorMaterialInit.FIRIDIUM, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(45))));

    public static final ArmorItem FIRIDIUM_BOOTS = register("firidium_boots",
            new ArmorItem(ArmorMaterialInit.FIRIDIUM, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(45))));

    public static final Item ENDIRIUM_INGOT = register("endirium_ingot", new Item(new Item.Settings()));

    public static final SwordItem ENDIRIUM_SWORD = register("endirium_sword",
            new SwordItem(TutorialModToolMaterials.ENDIRIUM, new Item.Settings().fireproof()
                    .attributeModifiers(SwordItem.createAttributeModifiers(TutorialModToolMaterials.ENDIRIUM, 16, -2.4f))));

    public static final PickaxeItem ENDIRIUM_PICKAXE = register("endirium_pickaxe",
            new PickaxeItem(TutorialModToolMaterials.ENDIRIUM, new Item.Settings().fireproof()
                    .attributeModifiers(PickaxeItem.createAttributeModifiers(TutorialModToolMaterials.ENDIRIUM, 6.0F, -2.8F))));

    public static final ShovelItem ENDIRIUM_SHOVEL = register("endirium_shovel",
            new ShovelItem(TutorialModToolMaterials.ENDIRIUM, new Item.Settings().fireproof()
                    .attributeModifiers(ShovelItem.createAttributeModifiers(TutorialModToolMaterials.ENDIRIUM, 3.5F, -3.0F))));

    public static final AxeItem ENDIRIUM_AXE = register("endirium_axe",
            new AxeItem(TutorialModToolMaterials.ENDIRIUM, new Item.Settings().fireproof()
                    .attributeModifiers(AxeItem.createAttributeModifiers(TutorialModToolMaterials.ENDIRIUM, 18.0F, -3.0F))));

    public static final HoeItem ENDIRIUM_HOE = register("endirium_hoe",
            new HoeItem(TutorialModToolMaterials.ENDIRIUM, new Item.Settings().fireproof()
                    .attributeModifiers(HoeItem.createAttributeModifiers(TutorialModToolMaterials.ENDIRIUM, -4.0F, -0.0F))));

    public static final ArmorItem ENDIRIUM_HELMET = register("endirium_helmet",
            new ArmorItem(ArmorMaterialInit.ENDIRIUM, ArmorItem.Type.HELMET, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.HELMET.getMaxDamage(90))));

    public static final ArmorItem ENDIRIUM_CHESTPLATE = register("endirium_chestplate",
            new ArmorItem(ArmorMaterialInit.ENDIRIUM, ArmorItem.Type.CHESTPLATE, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(90))));

    public static final ArmorItem ENDIRIUM_LEGGINGS = register("endirium_leggings",
            new ArmorItem(ArmorMaterialInit.ENDIRIUM, ArmorItem.Type.LEGGINGS, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(90))));

    public static final ArmorItem ENDIRIUM_BOOTS = register("endirium_boots",
            new ArmorItem(ArmorMaterialInit.ENDIRIUM, ArmorItem.Type.BOOTS, new Item.Settings().fireproof()
                    .maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(90))));

    public static <T extends Item> T register(String name, T item){
        return Registry.register(Registries.ITEM, TutorialMod.id(name), item);
    }

    public static void load() {}
}
