package net.otm.jumble.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Blocks;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.otm.jumble.block.JumbleBlocks;
import net.otm.jumble.item.JumbleItems;

public class JumbleModelProvider extends FabricModelProvider {
    public JumbleModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

        BlockStateModelGenerator.BlockTexturePool corruptedPurpurPool = blockStateModelGenerator.registerCubeAllModelTexturePool(JumbleBlocks.CORRUPTED_PURPUR);

        blockStateModelGenerator.registerSimpleCubeAll(JumbleBlocks.CELESTIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(JumbleBlocks.CELESTIUM_ORE);
        //blockStateModelGenerator.registerSimpleCubeAll(JumbleBlocks.CORRUPTED_PURPUR);

        corruptedPurpurPool.stairs(JumbleBlocks.CORRUPTED_PURPUR_STAIRS);
        corruptedPurpurPool.slab(JumbleBlocks.CORRUPTED_PURPUR_SLAB);
        corruptedPurpurPool.wall(JumbleBlocks.CORRUPTED_PURPUR_WALL);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(JumbleItems.CELESTIUM, Models.GENERATED);
        itemModelGenerator.register(JumbleItems.CELESTIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(JumbleItems.CELESTIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(JumbleItems.CELESTIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(JumbleItems.CELESTIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(JumbleItems.CELESTIUM_HOE, Models.HANDHELD);
        itemModelGenerator.register(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE, Models.GENERATED);
        itemModelGenerator.registerArmor(((ArmorItem) JumbleItems.CELESTIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) JumbleItems.CELESTIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) JumbleItems.CELESTIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) JumbleItems.CELESTIUM_BOOTS));


    }
}
