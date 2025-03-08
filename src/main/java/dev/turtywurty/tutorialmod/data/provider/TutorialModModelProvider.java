package dev.turtywurty.tutorialmod.data.provider;

import dev.turtywurty.tutorialmod.init.BlockInit;
import dev.turtywurty.tutorialmod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class TutorialModModelProvider extends FabricModelProvider {
    public TutorialModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.AQUARIDIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.AQUARIDIUM_OVERWORLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.AQUARIDIUM_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.AQUARIDIUM_NETHER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.AQUARIDIUM_END_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.FIRIDIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.FIRIDIUM_OVERWORLD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.FIRIDIUM_DEEPSLATE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.FIRIDIUM_NETHER_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.FIRIDIUM_END_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(BlockInit.ENDIRIUM_BLOCK);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ItemInit.AQUARIDIUM_SCRAP, Models.GENERATED);
        itemModelGenerator.register(ItemInit.SANDWICH, Models.GENERATED);
        itemModelGenerator.register(ItemInit.AQUARIDIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.AQUARIDIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.AQUARIDIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.AQUARIDIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.AQUARIDIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.AQUARIDIUM_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.AQUARIDIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.AQUARIDIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.AQUARIDIUM_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.FIRIDIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.FIRIDIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.FIRIDIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.FIRIDIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.FIRIDIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.FIRIDIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.FIRIDIUM_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.FIRIDIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.FIRIDIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.FIRIDIUM_BOOTS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ENDIRIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ENDIRIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ENDIRIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ENDIRIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ENDIRIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ENDIRIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(ItemInit.ENDIRIUM_HELMET, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ENDIRIUM_CHESTPLATE, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ENDIRIUM_LEGGINGS, Models.GENERATED);
        itemModelGenerator.register(ItemInit.ENDIRIUM_BOOTS, Models.GENERATED);
    }
}
