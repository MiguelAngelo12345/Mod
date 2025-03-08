package dev.turtywurty.tutorialmod.data.provider;

import dev.turtywurty.tutorialmod.init.BlockInit;
import dev.turtywurty.tutorialmod.list.TagList;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class TutorialModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public TutorialModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(BlockInit.AQUARIDIUM_BLOCK)
                .add(BlockInit.AQUARIDIUM_OVERWORLD_ORE)
                .add(BlockInit.AQUARIDIUM_DEEPSLATE_ORE)
                .add(BlockInit.AQUARIDIUM_NETHER_ORE)
                .add(BlockInit.AQUARIDIUM_END_ORE)
                .add(BlockInit.FIRIDIUM_BLOCK)
                .add(BlockInit.FIRIDIUM_OVERWORLD_ORE)
                .add(BlockInit.FIRIDIUM_DEEPSLATE_ORE)
                .add(BlockInit.FIRIDIUM_NETHER_ORE)
                .add(BlockInit.FIRIDIUM_END_ORE)
                .add(BlockInit.ENDIRIUM_BLOCK);

        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(BlockInit.AQUARIDIUM_BLOCK)
                .add(BlockInit.AQUARIDIUM_OVERWORLD_ORE)
                .add(BlockInit.AQUARIDIUM_DEEPSLATE_ORE)
                .add(BlockInit.AQUARIDIUM_NETHER_ORE)
                .add(BlockInit.AQUARIDIUM_END_ORE)
                .add(BlockInit.FIRIDIUM_BLOCK)
                .add(BlockInit.FIRIDIUM_OVERWORLD_ORE)
                .add(BlockInit.FIRIDIUM_DEEPSLATE_ORE)
                .add(BlockInit.FIRIDIUM_NETHER_ORE)
                .add(BlockInit.FIRIDIUM_END_ORE)
                .add(BlockInit.ENDIRIUM_BLOCK);

        getOrCreateTagBuilder(TagList.Blocks.INCORRECT_FOR_AQUARIDIUM_TOOL);
        getOrCreateTagBuilder(TagList.Blocks.INCORRECT_FOR_FIRIDIUM_TOOL);
        getOrCreateTagBuilder(TagList.Blocks.INCORRECT_FOR_ENDIRIUM_TOOL);
    }
}
