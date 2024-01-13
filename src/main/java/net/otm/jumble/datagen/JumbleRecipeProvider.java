package net.otm.jumble.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.item.ItemConvertible;
import net.minecraft.recipe.book.RecipeCategory;
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


    }
}
