package net.otm.jumble.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;
import net.otm.jumble.item.JumbleItems;

import java.util.concurrent.CompletableFuture;

public class JumbleItemTagProvider extends FabricTagProvider.ItemTagProvider {
    public JumbleItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(JumbleItems.CELESTIUM_HELMET, JumbleItems.CELESTIUM_CHESTPLATE, JumbleItems.CELESTIUM_LEGGINGS, JumbleItems.CELESTIUM_BOOTS);

    }
}
