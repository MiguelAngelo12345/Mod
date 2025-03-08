package dev.turtywurty.tutorialmod.init;

import dev.turtywurty.tutorialmod.TutorialMod;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.world.gen.root.AboveRootPlacement;

public class BlockInit {

    public static final Block AQUARIDIUM_BLOCK = registerWithItem("aquaridium_block", new Block(AbstractBlock.Settings.create()
            .strength(5.0F, 6.0F)
            .requiresTool()));

    public static final Block AQUARIDIUM_OVERWORLD_ORE = registerWithItem("aquaridium_overworld_ore", new Block(AbstractBlock.Settings.create()
            .strength(3.0F, 3.0F)
            .requiresTool()));

    public static final Block AQUARIDIUM_DEEPSLATE_ORE = registerWithItem("aquaridium_deepslate_ore", new Block(AbstractBlock.Settings.create()
            .strength(4.5F, 3.0F)
            .requiresTool()));

    public static final Block AQUARIDIUM_NETHER_ORE = registerWithItem("aquaridium_nether_ore", new Block(AbstractBlock.Settings.create()
            .strength(3.0F, 3.0F)
            .requiresTool()));

    public static final Block AQUARIDIUM_END_ORE = registerWithItem("aquaridium_end_ore", new Block(AbstractBlock.Settings.create()
            .strength(3.0F, 3.0F)
            .requiresTool()));

    public static final Block FIRIDIUM_BLOCK = registerWithItem("firidium_block", new Block(AbstractBlock.Settings.create()
            .strength(5.0F, 6.0F)
            .requiresTool()));

    public static final Block FIRIDIUM_OVERWORLD_ORE = registerWithItem("firidium_overworld_ore", new Block(AbstractBlock.Settings.create()
            .strength(3.0F, 3.0F)
            .requiresTool()));

    public static final Block FIRIDIUM_DEEPSLATE_ORE = registerWithItem("firidium_deepslate_ore", new Block(AbstractBlock.Settings.create()
            .strength(4.5F, 3.0F)
            .requiresTool()));

    public static final Block FIRIDIUM_NETHER_ORE = registerWithItem("firidium_nether_ore", new Block(AbstractBlock.Settings.create()
            .strength(3.0F, 3.0F)
            .requiresTool()));

    public static final Block FIRIDIUM_END_ORE = registerWithItem("firidium_end_ore", new Block(AbstractBlock.Settings.create()
            .strength(3.0F, 3.0F)
            .requiresTool()));

    public static final Block ENDIRIUM_BLOCK = registerWithItem("endirium_block", new Block(AbstractBlock.Settings.create()
            .strength(5.0F, 6.0F)
            .requiresTool()));

    public static <T extends Block> T register(String name, T block) {
        return Registry.register(Registries.BLOCK, TutorialMod.id(name), block);
    }
    public static <T extends Block> T registerWithItem(String name, T block, Item.Settings settings) {
        T registered = register(name, block);
        ItemInit.register(name, new BlockItem(registered, settings));
        return registered;
    }

    public static <T extends Block> T registerWithItem(String name, T block) {
        return registerWithItem(name, block, new Item.Settings());
    }
    public static void load() {
    }
}
