package net.otm.jumble.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;
import net.otm.jumble.block.JumbleBlocks;

import java.util.concurrent.CompletableFuture;

public class JumbleBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public JumbleBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(JumbleBlocks.CELESTIUM_BLOCK)
                .add(JumbleBlocks.CELESTIUM_ORE)
                        .add(JumbleBlocks.CORRUPTED_PURPUR);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(JumbleBlocks.CELESTIUM_BLOCK)
                .add(JumbleBlocks.CELESTIUM_ORE);


    }
}
