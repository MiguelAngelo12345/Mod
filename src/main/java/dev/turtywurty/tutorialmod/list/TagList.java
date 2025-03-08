package dev.turtywurty.tutorialmod.list;

import dev.turtywurty.tutorialmod.TutorialMod;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;

public class TagList {
    public static class Blocks {
        public static final TagKey<Block> INCORRECT_FOR_FIRIDIUM_TOOL = TagKey.of(RegistryKeys.BLOCK, TutorialMod.id("incorrect_for_firidium_tool"));
        public static final TagKey<Block> INCORRECT_FOR_ENDIRIUM_TOOL = TagKey.of(RegistryKeys.BLOCK, TutorialMod.id("incorrect_for_endirium_tool"));
        public static final TagKey<Block> INCORRECT_FOR_AQUARIDIUM_TOOL = TagKey.of(RegistryKeys.BLOCK, TutorialMod.id("incorrect_for_aquaridium_tool"));
    }
}
