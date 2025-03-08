package dev.turtywurty.tutorialmod.data.provider;

import dev.turtywurty.tutorialmod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.util.concurrent.CompletableFuture;

public class TutorialModItemTagProvider extends FabricTagProvider<Item> {

    public TutorialModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, RegistryKeys.ITEM, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ItemInit.AQUARIDIUM_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ItemInit.AQUARIDIUM_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ItemInit.AQUARIDIUM_SHOVEL);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ItemInit.AQUARIDIUM_AXE);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ItemInit.AQUARIDIUM_HOE);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ItemInit.AQUARIDIUM_HELMET);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ItemInit.AQUARIDIUM_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ItemInit.AQUARIDIUM_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ItemInit.AQUARIDIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ItemInit.FIRIDIUM_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ItemInit.FIRIDIUM_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ItemInit.FIRIDIUM_SHOVEL);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ItemInit.FIRIDIUM_AXE);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ItemInit.FIRIDIUM_HOE);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ItemInit.FIRIDIUM_HELMET);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ItemInit.FIRIDIUM_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ItemInit.FIRIDIUM_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ItemInit.FIRIDIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ItemInit.ENDIRIUM_SWORD);

        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ItemInit.ENDIRIUM_PICKAXE);

        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ItemInit.ENDIRIUM_SHOVEL);

        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ItemInit.ENDIRIUM_AXE);

        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ItemInit.ENDIRIUM_HOE);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ItemInit.ENDIRIUM_HELMET);

        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ItemInit.ENDIRIUM_CHESTPLATE);

        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ItemInit.ENDIRIUM_LEGGINGS);

        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ItemInit.ENDIRIUM_BOOTS);
    }
}
