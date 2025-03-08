package dev.turtywurty.tutorialmod.init;

import dev.turtywurty.tutorialmod.TutorialMod;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;

import java.util.Optional;

public class ItemGroupInit {
    public static final Text AQUACRAFT_TITLE = Text.translatable("itemGroup." + TutorialMod.MOD_ID + ".aquacraft_group");

    public static final ItemGroup AQUACRAFT_GROUP = register("aquacraft_group", FabricItemGroup.builder()
            .displayName(AQUACRAFT_TITLE)
            .icon(ItemInit.AQUARIDIUM_SCRAP::getDefaultStack)
            .entries((displayContext, entries) -> Registries.ITEM.getIds()
                    .stream()
                    .filter(key -> key.getNamespace().equals(TutorialMod.MOD_ID))
                    .map(Registries.ITEM::getOrEmpty)
                    .map(Optional::orElseThrow)
                    .forEach(entries::add))
            .build());

    public static <T extends ItemGroup> T register(String name, T itemGroup) {
        return Registry.register(Registries.ITEM_GROUP, TutorialMod.id(name), itemGroup);
    }
    public static void load() {}
}
