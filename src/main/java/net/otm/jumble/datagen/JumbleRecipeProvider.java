package net.otm.jumble.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.otm.jumble.Jumble;
import net.otm.jumble.block.JumbleBlocks;
import net.otm.jumble.item.JumbleItems;
import org.apache.logging.log4j.core.appender.mom.JmsAppender;

import java.util.List;
import java.util.function.Consumer;

public class JumbleRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> CELESTIUM_SMELTABLE = List.of(
        JumbleBlocks.CELESTIUM_BLOCK, JumbleBlocks.CELESTIUM_ORE);

    public JumbleRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, CELESTIUM_SMELTABLE, RecipeCategory.MISC, JumbleItems.CELESTIUM, 0.7f,200,"celestium");
        offerBlasting(exporter, CELESTIUM_SMELTABLE, RecipeCategory.MISC, JumbleItems.CELESTIUM, 0.7f,100,"celestium");

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, JumbleItems.CELESTIUM, RecipeCategory.DECORATIONS, JumbleBlocks.CELESTIUM_BLOCK);

        //example of how to do shapeless recipe so i don't forget
        /*ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, JumbleItems.CELESTIUM_INGOT).input(JumbleItems.CELESTIUM).input(Items.SHULKER_SHELL).criterion(FabricRecipeProvider.hasItem(JumbleItems.CELESTIUM_INGOT),
                FabricRecipeProvider.conditionsFromItem(JumbleItems.CELESTIUM_INGOT)).criterion(FabricRecipeProvider.hasItem(JumbleItems.CELESTIUM),
                FabricRecipeProvider.conditionsFromItem(JumbleItems.CELESTIUM)).criterion(FabricRecipeProvider.hasItem(Items.SHULKER_SHELL),
                FabricRecipeProvider.conditionsFromItem(Items.SHULKER_SHELL));*/

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_PICKAXE),Ingredient.ofItems(JumbleBlocks.CELESTIUM_BLOCK), RecipeCategory.MISC, JumbleItems.CELESTIUM_PICKAXE)
                .criterion(hasItem(JumbleBlocks.CELESTIUM_BLOCK), conditionsFromItem(JumbleBlocks.CELESTIUM_BLOCK)).offerTo(exporter, new Identifier(Jumble.MOD_ID, "celestium_pickaxe_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_AXE),Ingredient.ofItems(JumbleBlocks.CELESTIUM_BLOCK), RecipeCategory.MISC, JumbleItems.CELESTIUM_AXE)
                .criterion(hasItem(JumbleBlocks.CELESTIUM_BLOCK), conditionsFromItem(JumbleBlocks.CELESTIUM_BLOCK)).offerTo(exporter, new Identifier(Jumble.MOD_ID, "celestium_axe_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_SHOVEL),Ingredient.ofItems(JumbleBlocks.CELESTIUM_BLOCK), RecipeCategory.MISC, JumbleItems.CELESTIUM_SHOVEL)
                .criterion(hasItem(JumbleBlocks.CELESTIUM_BLOCK), conditionsFromItem(JumbleBlocks.CELESTIUM_BLOCK)).offerTo(exporter, new Identifier(Jumble.MOD_ID, "celestium_shovel_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_SWORD),Ingredient.ofItems(JumbleBlocks.CELESTIUM_BLOCK), RecipeCategory.MISC, JumbleItems.CELESTIUM_SWORD)
                .criterion(hasItem(JumbleBlocks.CELESTIUM_BLOCK), conditionsFromItem(JumbleBlocks.CELESTIUM_BLOCK)).offerTo(exporter, new Identifier(Jumble.MOD_ID, "celestium_sword_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_HOE),Ingredient.ofItems(JumbleBlocks.CELESTIUM_BLOCK), RecipeCategory.MISC, JumbleItems.CELESTIUM_HOE)
                .criterion(hasItem(JumbleBlocks.CELESTIUM_BLOCK), conditionsFromItem(JumbleBlocks.CELESTIUM_BLOCK)).offerTo(exporter, new Identifier(Jumble.MOD_ID, "celestium_hoe_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_HELMET),Ingredient.ofItems(JumbleBlocks.CELESTIUM_BLOCK), RecipeCategory.MISC, JumbleItems.CELESTIUM_HELMET)
                .criterion(hasItem(JumbleBlocks.CELESTIUM_BLOCK), conditionsFromItem(JumbleBlocks.CELESTIUM_BLOCK)).offerTo(exporter, new Identifier(Jumble.MOD_ID, "celestium_helmet_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_CHESTPLATE),Ingredient.ofItems(JumbleBlocks.CELESTIUM_BLOCK), RecipeCategory.MISC, JumbleItems.CELESTIUM_CHESTPLATE)
                .criterion(hasItem(JumbleBlocks.CELESTIUM_BLOCK), conditionsFromItem(JumbleBlocks.CELESTIUM_BLOCK)).offerTo(exporter, new Identifier(Jumble.MOD_ID, "celestium_chestplate_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_LEGGINGS),Ingredient.ofItems(JumbleBlocks.CELESTIUM_BLOCK), RecipeCategory.MISC, JumbleItems.CELESTIUM_LEGGINGS)
                .criterion(hasItem(JumbleBlocks.CELESTIUM_BLOCK), conditionsFromItem(JumbleBlocks.CELESTIUM_BLOCK)).offerTo(exporter, new Identifier(Jumble.MOD_ID, "celestium_leggings_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_BOOTS),Ingredient.ofItems(JumbleBlocks.CELESTIUM_BLOCK), RecipeCategory.MISC, JumbleItems.CELESTIUM_BOOTS)
                .criterion(hasItem(JumbleBlocks.CELESTIUM_BLOCK), conditionsFromItem(JumbleBlocks.CELESTIUM_BLOCK)).offerTo(exporter, new Identifier(Jumble.MOD_ID, "celestium_boots_smithing"));
    }
}
