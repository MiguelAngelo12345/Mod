package dev.turtywurty.tutorialmod.data.provider;

import dev.turtywurty.tutorialmod.init.BlockInit;
import dev.turtywurty.tutorialmod.init.ItemInit;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.fabricmc.fabric.api.tag.convention.v2.ConventionalItemTags;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.VanillaRecipeProvider;
import net.minecraft.item.Item;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.TagKey;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class TutorialModRecipeProvider extends FabricRecipeProvider {
    public TutorialModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    public void generate(RecipeExporter exporter) {
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.AQUARIDIUM_BLOCK)
                .input('E', ItemInit.AQUARIDIUM_SCRAP)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(ItemInit.AQUARIDIUM_SCRAP), conditionsFromItem(ItemInit.AQUARIDIUM_SCRAP))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD, ItemInit.SANDWICH)
                .input('E', Items.BREAD)
                .input('H', Items.COOKED_BEEF)
                .input('B', Items.SUGAR_CANE)
                .pattern(" E ")
                .pattern(" H ")
                .pattern(" B ")
                .criterion(hasItem(Items.BREAD), conditionsFromItem(Items.BREAD))
                .criterion(hasItem(Items.COOKED_BEEF), conditionsFromItem(Items.COOKED_BEEF))
                .criterion(hasItem(Items.SUGAR_CANE), conditionsFromItem(Items.SUGAR_CANE))
                .offerTo(exporter);

        List<ItemConvertible> aquaridiumOres = List.of(BlockInit.AQUARIDIUM_OVERWORLD_ORE, BlockInit.AQUARIDIUM_DEEPSLATE_ORE, BlockInit.AQUARIDIUM_NETHER_ORE, BlockInit.AQUARIDIUM_END_ORE);

        RecipeProvider.offerBlasting(exporter,
            aquaridiumOres,
                RecipeCategory.MISC,
                ItemInit.AQUARIDIUM_SCRAP,
                0.5F,
                100,
                "aquaridium");

        RecipeProvider.offerSmelting(exporter,
                aquaridiumOres,
                RecipeCategory.MISC,
                ItemInit.AQUARIDIUM_SCRAP,
                0.3F,
                200,
                "aquaridium");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.AQUARIDIUM_SWORD)
                .input('E', ItemInit.AQUARIDIUM_SCRAP)
                .input('S', Items.STICK)
                .pattern("E")
                .pattern("E")
                .pattern("S")
                .criterion(hasItem(ItemInit.AQUARIDIUM_SCRAP), conditionsFromItem(ItemInit.AQUARIDIUM_SCRAP))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.AQUARIDIUM_PICKAXE)
                .input('E', ItemInit.AQUARIDIUM_SCRAP)
                .input('S', Items.STICK)
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.AQUARIDIUM_SCRAP), conditionsFromItem(ItemInit.AQUARIDIUM_SCRAP))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.AQUARIDIUM_AXE)
                .input('E', ItemInit.AQUARIDIUM_SCRAP)
                .input('S', Items.STICK)
                .pattern("EE ")
                .pattern("ES ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.AQUARIDIUM_SCRAP), conditionsFromItem(ItemInit.AQUARIDIUM_SCRAP))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.AQUARIDIUM_SHOVEL)
                .input('E', ItemInit.AQUARIDIUM_SCRAP)
                .input('S', Items.STICK)
                .pattern("E")
                .pattern("S")
                .pattern("S")
                .criterion(hasItem(ItemInit.AQUARIDIUM_SCRAP), conditionsFromItem(ItemInit.AQUARIDIUM_SCRAP))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.AQUARIDIUM_HOE)
                .input('E', ItemInit.AQUARIDIUM_SCRAP)
                .input('S', Items.STICK)
                .pattern(" EE")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.AQUARIDIUM_SCRAP), conditionsFromItem(ItemInit.AQUARIDIUM_SCRAP))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.AQUARIDIUM_HELMET)
                .input('E', ItemInit.AQUARIDIUM_SCRAP)
                .pattern("EEE")
                .pattern("E E")
                .pattern("   ")
                .criterion(hasItem(ItemInit.AQUARIDIUM_SCRAP), conditionsFromItem(ItemInit.AQUARIDIUM_SCRAP))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.AQUARIDIUM_CHESTPLATE)
                .input('E', ItemInit.AQUARIDIUM_SCRAP)
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(ItemInit.AQUARIDIUM_SCRAP), conditionsFromItem(ItemInit.AQUARIDIUM_SCRAP))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.AQUARIDIUM_LEGGINGS)
                .input('E', ItemInit.AQUARIDIUM_SCRAP)
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .criterion(hasItem(ItemInit.AQUARIDIUM_SCRAP), conditionsFromItem(ItemInit.AQUARIDIUM_SCRAP))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.AQUARIDIUM_BOOTS)
                .input('E', ItemInit.AQUARIDIUM_SCRAP)
                .pattern("   ")
                .pattern("E E")
                .pattern("E E")
                .criterion(hasItem(ItemInit.AQUARIDIUM_SCRAP), conditionsFromItem(ItemInit.AQUARIDIUM_SCRAP))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, BlockInit.FIRIDIUM_BLOCK)
                .input('E', ItemInit.FIRIDIUM_INGOT)
                .pattern("EEE")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(ItemInit.FIRIDIUM_INGOT), conditionsFromItem(ItemInit.FIRIDIUM_INGOT))
                .offerTo(exporter);

        List<ItemConvertible> firidiumOres = List.of(BlockInit.FIRIDIUM_OVERWORLD_ORE, BlockInit.FIRIDIUM_DEEPSLATE_ORE, BlockInit.FIRIDIUM_NETHER_ORE, BlockInit.FIRIDIUM_END_ORE);

        RecipeProvider.offerBlasting(exporter,
                firidiumOres,
                RecipeCategory.MISC,
                ItemInit.FIRIDIUM_INGOT,
                0.5F,
                100,
                "firidium");

        RecipeProvider.offerSmelting(exporter,
                firidiumOres,
                RecipeCategory.MISC,
                ItemInit.FIRIDIUM_INGOT,
                0.3F,
                200,
                "firidium");

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.FIRIDIUM_SWORD)
                .input('E', ItemInit.FIRIDIUM_INGOT)
                .input('S', Items.STICK)
                .pattern("E")
                .pattern("E")
                .pattern("S")
                .criterion(hasItem(ItemInit.FIRIDIUM_INGOT), conditionsFromItem(ItemInit.FIRIDIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.FIRIDIUM_PICKAXE)
                .input('E', ItemInit.FIRIDIUM_INGOT)
                .input('S', Items.STICK)
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.FIRIDIUM_INGOT), conditionsFromItem(ItemInit.FIRIDIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.FIRIDIUM_AXE)
                .input('E', ItemInit.FIRIDIUM_INGOT)
                .input('S', Items.STICK)
                .pattern("EE ")
                .pattern("ES ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.FIRIDIUM_INGOT), conditionsFromItem(ItemInit.FIRIDIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.FIRIDIUM_SHOVEL)
                .input('E', ItemInit.FIRIDIUM_INGOT)
                .input('S', Items.STICK)
                .pattern("E")
                .pattern("S")
                .pattern("S")
                .criterion(hasItem(ItemInit.FIRIDIUM_INGOT), conditionsFromItem(ItemInit.FIRIDIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.FIRIDIUM_HOE)
                .input('E', ItemInit.FIRIDIUM_INGOT)
                .input('S', Items.STICK)
                .pattern(" EE")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.FIRIDIUM_INGOT), conditionsFromItem(ItemInit.FIRIDIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.FIRIDIUM_HELMET)
                .input('E', ItemInit.FIRIDIUM_INGOT)
                .pattern("EEE")
                .pattern("E E")
                .pattern("   ")
                .criterion(hasItem(ItemInit.FIRIDIUM_INGOT), conditionsFromItem(ItemInit.FIRIDIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.FIRIDIUM_CHESTPLATE)
                .input('E', ItemInit.FIRIDIUM_INGOT)
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(ItemInit.FIRIDIUM_INGOT), conditionsFromItem(ItemInit.FIRIDIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.FIRIDIUM_LEGGINGS)
                .input('E', ItemInit.FIRIDIUM_INGOT)
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .criterion(hasItem(ItemInit.FIRIDIUM_INGOT), conditionsFromItem(ItemInit.FIRIDIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.FIRIDIUM_BOOTS)
                .input('E', ItemInit.FIRIDIUM_INGOT)
                .pattern("   ")
                .pattern("E E")
                .pattern("E E")
                .criterion(hasItem(ItemInit.FIRIDIUM_INGOT), conditionsFromItem(ItemInit.FIRIDIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ItemInit.ENDIRIUM_INGOT)
                .input('E', ItemInit.AQUARIDIUM_SCRAP)
                .input('S', ItemInit.FIRIDIUM_INGOT)
                .pattern("EEE")
                .pattern("SSS")
                .pattern("   ")
                .criterion(hasItem(ItemInit.AQUARIDIUM_SCRAP), conditionsFromItem(ItemInit.AQUARIDIUM_SCRAP))
                .criterion(hasItem(ItemInit.FIRIDIUM_INGOT), conditionsFromItem(ItemInit.FIRIDIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.ENDIRIUM_SWORD)
                .input('E', ItemInit.ENDIRIUM_INGOT)
                .input('S', Items.STICK)
                .pattern("E")
                .pattern("E")
                .pattern("S")
                .criterion(hasItem(ItemInit.ENDIRIUM_INGOT), conditionsFromItem(ItemInit.ENDIRIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.ENDIRIUM_PICKAXE)
                .input('E', ItemInit.ENDIRIUM_INGOT)
                .input('S', Items.STICK)
                .pattern("EEE")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.ENDIRIUM_INGOT), conditionsFromItem(ItemInit.ENDIRIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.ENDIRIUM_AXE)
                .input('E', ItemInit.ENDIRIUM_INGOT)
                .input('S', Items.STICK)
                .pattern("EE ")
                .pattern("ES ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.ENDIRIUM_INGOT), conditionsFromItem(ItemInit.ENDIRIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);


        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.ENDIRIUM_SHOVEL)
                .input('E', ItemInit.ENDIRIUM_INGOT)
                .input('S', Items.STICK)
                .pattern("E")
                .pattern("S")
                .pattern("S")
                .criterion(hasItem(ItemInit.ENDIRIUM_INGOT), conditionsFromItem(ItemInit.ENDIRIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ItemInit.ENDIRIUM_HOE)
                .input('E', ItemInit.FIRIDIUM_INGOT)
                .input('S', Items.STICK)
                .pattern(" EE")
                .pattern(" S ")
                .pattern(" S ")
                .criterion(hasItem(ItemInit.ENDIRIUM_INGOT), conditionsFromItem(ItemInit.ENDIRIUM_INGOT))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.ENDIRIUM_HELMET)
                .input('E', ItemInit.ENDIRIUM_INGOT)
                .pattern("EEE")
                .pattern("E E")
                .pattern("   ")
                .criterion(hasItem(ItemInit.ENDIRIUM_INGOT), conditionsFromItem(ItemInit.ENDIRIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.ENDIRIUM_CHESTPLATE)
                .input('E', ItemInit.ENDIRIUM_INGOT)
                .pattern("E E")
                .pattern("EEE")
                .pattern("EEE")
                .criterion(hasItem(ItemInit.ENDIRIUM_INGOT), conditionsFromItem(ItemInit.ENDIRIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.ENDIRIUM_LEGGINGS)
                .input('E', ItemInit.ENDIRIUM_INGOT)
                .pattern("EEE")
                .pattern("E E")
                .pattern("E E")
                .criterion(hasItem(ItemInit.ENDIRIUM_INGOT), conditionsFromItem(ItemInit.ENDIRIUM_INGOT))
                .offerTo(exporter);

        ShapedRecipeJsonBuilder.create(RecipeCategory.COMBAT, ItemInit.ENDIRIUM_BOOTS)
                .input('E', ItemInit.ENDIRIUM_INGOT)
                .pattern("   ")
                .pattern("E E")
                .pattern("E E")
                .criterion(hasItem(ItemInit.ENDIRIUM_INGOT), conditionsFromItem(ItemInit.ENDIRIUM_INGOT))
                .offerTo(exporter);
    }

        private static String hasTag(TagKey<Item> tag) {
        return "has_" + tag.id().toString();
    }
}
