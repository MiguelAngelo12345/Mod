package dev.turtywurty.tutorialmod;

import dev.turtywurty.tutorialmod.init.ArmorMaterialInit;
import dev.turtywurty.tutorialmod.init.BlockInit;
import dev.turtywurty.tutorialmod.init.ItemGroupInit;
import dev.turtywurty.tutorialmod.init.ItemInit;
import dev.turtywurty.tutorialmod.init.worldgen.BiomeModificationInit;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.Items;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TutorialMod implements ModInitializer {
	public static final String MOD_ID = "tutorialmod";
	public static final Logger LOGGER = LoggerFactory.getLogger("TutorialMod");


	@Override
	public void onInitialize() {
		LOGGER.info("Loading...");
		ItemInit.load();
		BlockInit.load();
		ItemGroupInit.load();
		BiomeModificationInit.load();
		ArmorMaterialInit.load();

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
			entries.addAfter(Items.BREAD, ItemInit.SANDWICH);
		});
	}

	public static Identifier id(String path) {
		return Identifier.of(MOD_ID, path);
	}
}

