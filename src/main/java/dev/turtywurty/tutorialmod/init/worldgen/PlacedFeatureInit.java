package dev.turtywurty.tutorialmod.init.worldgen;

import dev.turtywurty.tutorialmod.TutorialMod;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryEntryLookup;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.placementmodifier.*;

import java.util.List;

public class PlacedFeatureInit {
    public static final RegistryKey<PlacedFeature> OVERWORLD_AQUARIDIUM_ORE_KEY = registerKey("overworld_aquaridium_ore");
    public static final RegistryKey<PlacedFeature> NETHER_AQUARIDIUM_ORE_KEY = registerKey("nether_aquaridium_ore");
    public static final RegistryKey<PlacedFeature> END_AQUARIDIUM_ORE_KEY = registerKey("end_aquaridium_ore");
    public static final RegistryKey<PlacedFeature> OVERWORLD_FIRIDIUM_ORE_KEY = registerKey("overworld_firidium_ore");
    public static final RegistryKey<PlacedFeature> NETHER_FIRIDIUM_ORE_KEY = registerKey("nether_firidium_ore");
    public static final RegistryKey<PlacedFeature> END_FIRIDIUM_ORE_KEY = registerKey("end_firidium_ore");

    public static void bootstrap(Registerable<PlacedFeature> context) {
        RegistryEntryLookup<ConfiguredFeature<?, ?>> registryLookup = context.getRegistryLookup(RegistryKeys.CONFIGURED_FEATURE);

        register(context, OVERWORLD_AQUARIDIUM_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.OVERWORLD_AQUARIDIUM_ORE_KEY),
                Modifiers.modifiersCount(9,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-24),YOffset.fixed(64))));

        register(context, NETHER_AQUARIDIUM_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.NETHER_AQUARIDIUM_ORE_KEY),
                Modifiers.modifiersCount(9,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0),YOffset.fixed(128))));

        register(context, END_AQUARIDIUM_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.END_AQUARIDIUM_ORE_KEY),
                Modifiers.modifiersCount(9,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0),YOffset.fixed(128))));

        register(context, OVERWORLD_FIRIDIUM_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.OVERWORLD_FIRIDIUM_ORE_KEY),
                Modifiers.modifiersCount(9,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(-24),YOffset.fixed(64))));

        register(context, NETHER_FIRIDIUM_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.NETHER_FIRIDIUM_ORE_KEY),
                Modifiers.modifiersCount(9,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0),YOffset.fixed(128))));

        register(context, END_FIRIDIUM_ORE_KEY, registryLookup.getOrThrow(ConfiguredFeatureInit.END_FIRIDIUM_ORE_KEY),
                Modifiers.modifiersCount(9,
                        HeightRangePlacementModifier.uniform(YOffset.fixed(0),YOffset.fixed(128))));
    }

    private static RegistryKey<PlacedFeature> registerKey(String name) {
        return RegistryKey.of(RegistryKeys.PLACED_FEATURE, TutorialMod.id(name));
    }

    private static void register(Registerable<PlacedFeature> context,
                                 RegistryKey<PlacedFeature> key,
                                 RegistryEntry<ConfiguredFeature<?, ?>> config,
                                 List<PlacementModifier> modifiers) {
        context.register(key, new PlacedFeature(config, List.copyOf(modifiers)));
    }

    public static class Modifiers {
        public static List<PlacementModifier> modifiers(PlacementModifier countModifier, PlacementModifier heightModifier) {
            return List.of(countModifier, SquarePlacementModifier.of(), heightModifier, BiomePlacementModifier.of());
        }

        public static List<PlacementModifier> modifiersCount(int count, PlacementModifier heightModifier) {
            return modifiers(CountPlacementModifier.of(count), heightModifier);
        }

        public static List<PlacementModifier> modifiersRarity(int chance, PlacementModifier heightModifier) {
            return modifiers(RarityFilterPlacementModifier.of(chance), heightModifier);
        }
    }
}
