package net.otm.jumble.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.otm.jumble.Jumble;

public class JumbleItems {

    public static final Item CELESTIUM = registerItem("celestium",new Item(new FabricItemSettings()));
    public static final Item CELESTIUM_INGOT = registerItem("celestium_ingot",new Item(new FabricItemSettings()));

    public static final Item CELESTIUM_PICKAXE = registerItem("celestium_pickaxe",new PickaxeItem(JumbleToolMaterial.CELESTIUM,4,2f,new FabricItemSettings()));
    public static final Item CELESTIUM_AXE = registerItem("celestium_axe",new AxeItem(JumbleToolMaterial.CELESTIUM,4,2f,new FabricItemSettings()));
    public static final Item CELESTIUM_SHOVEL = registerItem("celestium_shovel",new ShovelItem(JumbleToolMaterial.CELESTIUM,4,2f,new FabricItemSettings()));
    public static final Item CELESTIUM_SWORD = registerItem("celestium_sword",new SwordItem(JumbleToolMaterial.CELESTIUM,4,2f,new FabricItemSettings()));
    public static final Item CELESTIUM_HOE = registerItem("celestium_hoe",new HoeItem(JumbleToolMaterial.CELESTIUM,4,2f,new FabricItemSettings()));

    public static final Item CELESTIUM_UPGRADE_SMITHING_TEMPLATE = registerItem("celestium_upgrade_smithing_template",new Item(new FabricItemSettings()));




    private static void addItemsToIngredientTabItemsGroup(FabricItemGroupEntries entries) {
        entries.add(CELESTIUM);
    }
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Jumble.MOD_ID, name), item);
    }
    public static void registerJumbleItems() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(JumbleItems::addItemsToIngredientTabItemsGroup);
    }
}
