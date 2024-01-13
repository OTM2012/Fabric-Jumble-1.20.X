package net.otm.jumble.datagen;

import net.fabricmc.fabric.api.block.v1.FabricBlock;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricLootTableProvider;
import net.otm.jumble.block.JumbleBlocks;
import net.otm.jumble.item.JumbleItems;

public class JumbleLootTableProvider extends FabricBlockLootTableProvider {
    public JumbleLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(JumbleBlocks.CELESTIUM_BLOCK);
        addDrop(JumbleBlocks.CELESTIUM_ORE, oreDrops(JumbleBlocks.CELESTIUM_ORE, JumbleItems.CELESTIUM));
    }
}
