package dev.turtywurty.tutorialmod.data.provider;

import dev.turtywurty.tutorialmod.init.BlockInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class TutorialModBlockLootTableProvider extends FabricBlockLootTableProvider {

    public TutorialModBlockLootTableProvider(FabricDataOutput dataOutput, CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(BlockInit.AQUARIDIUM_BLOCK);
        addDrop(BlockInit.AQUARIDIUM_DEEPSLATE_ORE);
        addDrop(BlockInit.AQUARIDIUM_OVERWORLD_ORE);
        addDrop(BlockInit.AQUARIDIUM_NETHER_ORE);
        addDrop(BlockInit.AQUARIDIUM_END_ORE);
        addDrop(BlockInit.FIRIDIUM_BLOCK);
        addDrop(BlockInit.FIRIDIUM_DEEPSLATE_ORE);
        addDrop(BlockInit.FIRIDIUM_OVERWORLD_ORE);
        addDrop(BlockInit.FIRIDIUM_NETHER_ORE);
        addDrop(BlockInit.FIRIDIUM_END_ORE);
        addDrop(BlockInit.ENDIRIUM_BLOCK);
    }
}
