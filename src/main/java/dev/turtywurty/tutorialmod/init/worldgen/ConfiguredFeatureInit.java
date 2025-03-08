package dev.turtywurty.tutorialmod.init.worldgen;

import dev.turtywurty.tutorialmod.TutorialMod;
import dev.turtywurty.tutorialmod.init.BlockInit;
import net.minecraft.block.Blocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.BlockMatchRuleTest;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;

import java.util.List;

public class ConfiguredFeatureInit {
    public static final RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_AQUARIDIUM_ORE_KEY = registerKey("overworld_aquaridium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_AQUARIDIUM_ORE_KEY = registerKey("nether_aquaridium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_AQUARIDIUM_ORE_KEY = registerKey("end_aquaridium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> OVERWORLD_FIRIDIUM_ORE_KEY = registerKey("overworld_firidium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> NETHER_FIRIDIUM_ORE_KEY = registerKey("nether_firidium_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> END_FIRIDIUM_ORE_KEY = registerKey("end_firidium_ore");

    public static void bootstrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneOreReplaceables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateOreReplaceables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);
        RuleTest netherOreReplaceables = new TagMatchRuleTest(BlockTags.BASE_STONE_NETHER);
        RuleTest endOreReplaceables = new BlockMatchRuleTest(Blocks.END_STONE);

        List<OreFeatureConfig.Target> overworldAquaridiumTargets = List.of(
                OreFeatureConfig.createTarget(stoneOreReplaceables, BlockInit.AQUARIDIUM_OVERWORLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateOreReplaceables, BlockInit.AQUARIDIUM_DEEPSLATE_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> overworldFiridiumTargets = List.of(
                OreFeatureConfig.createTarget(stoneOreReplaceables, BlockInit.FIRIDIUM_OVERWORLD_ORE.getDefaultState()),
                OreFeatureConfig.createTarget(deepslateOreReplaceables, BlockInit.FIRIDIUM_DEEPSLATE_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> netherAquaridiumTargets = List.of(
                OreFeatureConfig.createTarget(netherOreReplaceables, BlockInit.AQUARIDIUM_NETHER_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> netherFiridiumTargets = List.of(
                OreFeatureConfig.createTarget(netherOreReplaceables, BlockInit.FIRIDIUM_NETHER_ORE.getDefaultState()));

        List<OreFeatureConfig.Target> endAquaridiumTargets = List.of(
                OreFeatureConfig.createTarget(endOreReplaceables, BlockInit.AQUARIDIUM_END_ORE.getDefaultState()));
        List<OreFeatureConfig.Target> endFiridiumTargets = List.of(
                OreFeatureConfig.createTarget(endOreReplaceables, BlockInit.FIRIDIUM_END_ORE.getDefaultState()));

        register(context, OVERWORLD_AQUARIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAquaridiumTargets, 9));
        register(context, NETHER_AQUARIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherAquaridiumTargets, 9));
        register(context, END_AQUARIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endAquaridiumTargets, 9));
        register(context, OVERWORLD_FIRIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldFiridiumTargets, 9));
        register(context, NETHER_FIRIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(netherFiridiumTargets, 9));
        register(context, END_FIRIDIUM_ORE_KEY, Feature.ORE, new OreFeatureConfig(endFiridiumTargets, 9));
    }


    private static RegistryKey<ConfiguredFeature<?, ?>> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, TutorialMod.id(name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key,
                                                                                    F feature,
                                                                                    FC featureConfig) {
        context.register(key, new ConfiguredFeature<>(feature, featureConfig));
    }
}
