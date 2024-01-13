package net.otm.jumble.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.SmithingTransformRecipeJsonBuilder;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
import net.otm.jumble.Jumble;
import net.otm.jumble.block.JumbleBlocks;
import net.otm.jumble.item.JumbleItems;

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

        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, JumbleItems.CELESTIUM_INGOT, RecipeCategory.DECORATIONS, JumbleBlocks.CELESTIUM_BLOCK);

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_PICKAXE),Ingredient.ofItems(JumbleItems.CELESTIUM_INGOT), RecipeCategory.MISC, JumbleItems.CELESTIUM_PICKAXE)
                .criterion(hasItem(JumbleItems.CELESTIUM_INGOT), conditionsFromItem(JumbleItems.CELESTIUM_INGOT)).offerTo(exporter, new Identifier(Jumble.MOD_ID, "celestium_pickaxe_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_AXE),Ingredient.ofItems(JumbleItems.CELESTIUM_INGOT), RecipeCategory.MISC, JumbleItems.CELESTIUM_AXE)
                .criterion(hasItem(JumbleItems.CELESTIUM_INGOT), conditionsFromItem(JumbleItems.CELESTIUM_INGOT)).offerTo(exporter, new Identifier(Jumble.MOD_ID, "celestium_axe_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_SHOVEL),Ingredient.ofItems(JumbleItems.CELESTIUM_INGOT), RecipeCategory.MISC, JumbleItems.CELESTIUM_SHOVEL)
                .criterion(hasItem(JumbleItems.CELESTIUM_INGOT), conditionsFromItem(JumbleItems.CELESTIUM_INGOT)).offerTo(exporter, new Identifier(Jumble.MOD_ID, "celestium_shovel_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_SWORD),Ingredient.ofItems(JumbleItems.CELESTIUM_INGOT), RecipeCategory.MISC, JumbleItems.CELESTIUM_SWORD)
                .criterion(hasItem(JumbleItems.CELESTIUM_INGOT), conditionsFromItem(JumbleItems.CELESTIUM_INGOT)).offerTo(exporter, new Identifier(Jumble.MOD_ID, "celestium_sword_smithing"));

        SmithingTransformRecipeJsonBuilder.create(Ingredient.ofItems(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE), Ingredient.ofItems(Items.DIAMOND_HOE),Ingredient.ofItems(JumbleItems.CELESTIUM_INGOT), RecipeCategory.MISC, JumbleItems.CELESTIUM_HOE)
                .criterion(hasItem(JumbleItems.CELESTIUM_INGOT), conditionsFromItem(JumbleItems.CELESTIUM_INGOT)).offerTo(exporter, new Identifier(Jumble.MOD_ID, "celestium_hoe_smithing"));

    }
}
