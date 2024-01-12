package net.otm.jumble.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.otm.jumble.Jumble;

public class JumbleItems {

    public static final Item CELESTIUM = registerItem("celestium",new Item(new FabricItemSettings()));
    public static final Item CELESTIUM_INGOT = registerItem("celestium_ingot",new Item(new FabricItemSettings()));


    private static void addItemsToIngredientTabItemsGroup(FabricItemGroupEntries entries) {
        entries.add(CELESTIUM);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Jumble.MOD_ID, name), item);
    }
    public static void registerJumbleItems() {
        Jumble.LOGGER.info("Registering Items for " + Jumble.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(JumbleItems::addItemsToIngredientTabItemsGroup);
    }
}
