package dev.turtywurty.tutorialmod.data.provider;

import dev.turtywurty.tutorialmod.TutorialMod;
import dev.turtywurty.tutorialmod.init.BlockInit;
import dev.turtywurty.tutorialmod.init.ItemGroupInit;
import dev.turtywurty.tutorialmod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLanguageProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableTextContent;
import org.jetbrains.annotations.NotNull;

import java.util.concurrent.CompletableFuture;

public class TutorialModEnglishLanguageProvider extends FabricLanguageProvider {
    public TutorialModEnglishLanguageProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    private static void addText(@NotNull TranslationBuilder builder, @NotNull Text text, @NotNull String value) {
        if (text.getContent() instanceof TranslatableTextContent translatableTextContent) {
            builder.add(translatableTextContent.getKey(), value);
        } else {
            TutorialMod.LOGGER.warn("Failed to add translation for text: {}", text.getString());
        }
    }

    @Override
    public void generateTranslations(RegistryWrapper.WrapperLookup wrapperLookup, TranslationBuilder translationBuilder) {
        translationBuilder.add(ItemInit.AQUARIDIUM_SCRAP, "Aquaridium Scrap");
        translationBuilder.add(ItemInit.SANDWICH, "Sandwich");
        translationBuilder.add(BlockInit.AQUARIDIUM_BLOCK, "Aquaridium Block");
        translationBuilder.add(BlockInit.AQUARIDIUM_OVERWORLD_ORE, "Aquaridium Overworld Ore");
        translationBuilder.add(BlockInit.AQUARIDIUM_DEEPSLATE_ORE, "Aquaridium Deepslate Ore");
        translationBuilder.add(BlockInit.AQUARIDIUM_NETHER_ORE, "Aquaridium Nether Ore");
        translationBuilder.add(BlockInit.AQUARIDIUM_END_ORE, "Aquaridium End Ore");
        translationBuilder.add(ItemInit.AQUARIDIUM_SWORD, "Aquaridium Sword");
        translationBuilder.add(ItemInit.AQUARIDIUM_PICKAXE, "Aquaridium Pickaxe");
        translationBuilder.add(ItemInit.AQUARIDIUM_SHOVEL, "Aquaridium Shovel");
        translationBuilder.add(ItemInit.AQUARIDIUM_AXE, "Aquaridium Axe");
        translationBuilder.add(ItemInit.AQUARIDIUM_HOE, "Aquaridium Hoe");
        translationBuilder.add(ItemInit.AQUARIDIUM_HELMET, "Aquaridium Helmet");
        translationBuilder.add(ItemInit.AQUARIDIUM_CHESTPLATE, "Aquaridium Chestplate");
        translationBuilder.add(ItemInit.AQUARIDIUM_LEGGINGS, "Aquaridium Leggings");
        translationBuilder.add(ItemInit.AQUARIDIUM_BOOTS, "Aquaridium Boots");
        translationBuilder.add(ItemInit.FIRIDIUM_INGOT, "Firidium Ingot");
        translationBuilder.add(BlockInit.FIRIDIUM_BLOCK, "Firidium Block");
        translationBuilder.add(BlockInit.FIRIDIUM_OVERWORLD_ORE, "Firidium Overworld Ore");
        translationBuilder.add(BlockInit.FIRIDIUM_DEEPSLATE_ORE, "Firidium Deepslate Ore");
        translationBuilder.add(BlockInit.FIRIDIUM_NETHER_ORE, "Firidium Nether Ore");
        translationBuilder.add(BlockInit.FIRIDIUM_END_ORE, "Firidium End Ore");
        translationBuilder.add(ItemInit.FIRIDIUM_SWORD, "Firidium Sword");
        translationBuilder.add(ItemInit.FIRIDIUM_PICKAXE, "Firidium Pickaxe");
        translationBuilder.add(ItemInit.FIRIDIUM_SHOVEL, "Firidium Shovel");
        translationBuilder.add(ItemInit.FIRIDIUM_AXE, "Firidium Axe");
        translationBuilder.add(ItemInit.FIRIDIUM_HOE, "Firidium Hoe");
        translationBuilder.add(ItemInit.FIRIDIUM_HELMET, "Firidium Helmet");
        translationBuilder.add(ItemInit.FIRIDIUM_CHESTPLATE, "Firidium Chestplate");
        translationBuilder.add(ItemInit.FIRIDIUM_LEGGINGS, "Firidium Leggings");
        translationBuilder.add(ItemInit.FIRIDIUM_BOOTS, "Firidium Boots");
        translationBuilder.add(ItemInit.ENDIRIUM_INGOT, "Endirium Ingot");
        translationBuilder.add(BlockInit.ENDIRIUM_BLOCK, "Endirium Block");
        translationBuilder.add(ItemInit.ENDIRIUM_SWORD, "Endirium Sword");
        translationBuilder.add(ItemInit.ENDIRIUM_PICKAXE, "Endirium Pickaxe");
        translationBuilder.add(ItemInit.ENDIRIUM_SHOVEL, "Endirium Shovel");
        translationBuilder.add(ItemInit.ENDIRIUM_AXE, "Endirium Axe");
        translationBuilder.add(ItemInit.ENDIRIUM_HOE, "Endirium Hoe");
        translationBuilder.add(ItemInit.ENDIRIUM_HELMET, "Endirium Helmet");
        translationBuilder.add(ItemInit.ENDIRIUM_CHESTPLATE, "Endirium Chestplate");
        translationBuilder.add(ItemInit.ENDIRIUM_LEGGINGS, "Endirium Leggings");
        translationBuilder.add(ItemInit.ENDIRIUM_BOOTS, "Endirium Boots");
        addText(translationBuilder, ItemGroupInit.AQUACRAFT_TITLE, "AquaCraft");
    }
}
