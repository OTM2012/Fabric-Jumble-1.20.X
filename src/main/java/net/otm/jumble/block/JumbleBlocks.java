package net.otm.jumble.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import net.otm.jumble.Jumble;

public class JumbleBlocks {

    public static final Block CELESTIUM_ORE = registerBlock("celestium_ore", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(2f)));
    public static final Block CELESTIUM_BLOCK = registerBlock("celestium_block", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(2f)));
    public static final Block CORRUPTED_PURPUR = registerBlock("corrupted_purpur", new Block(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK).strength(2f)));

    public static final Block CORRUPTED_PURPUR_STAIRS = registerBlock("corrupted_purpur_stairs",
            new StairsBlock(JumbleBlocks.CORRUPTED_PURPUR.getDefaultState(), FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));
    public static final Block CORRUPTED_PURPUR_SLAB = registerBlock("corrupted_purpur_slab",
            new SlabBlock(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));

    public static final Block CORRUPTED_PURPUR_WALL = registerBlock("corrupted_purpur_wall",
            new WallBlock(FabricBlockSettings.copyOf(Blocks.PURPUR_BLOCK)));


    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Jumble.MOD_ID, name), block);
    }
    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Jumble.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }
    public static void registerJumbleBlocks() {
        Jumble.LOGGER.info("Registering JumbleBlocks for" + Jumble.MOD_ID);
    }
}
