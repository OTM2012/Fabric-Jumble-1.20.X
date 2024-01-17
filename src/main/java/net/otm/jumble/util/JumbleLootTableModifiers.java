package net.otm.jumble.util;

import net.fabricmc.fabric.api.loot.v2.LootTableEvents;
import net.minecraft.item.Items;
import net.minecraft.loot.LootPool;
import net.minecraft.loot.condition.RandomChanceLootCondition;
import net.minecraft.loot.entry.ItemEntry;
import net.minecraft.loot.function.SetCountLootFunction;
import net.minecraft.loot.provider.number.ConstantLootNumberProvider;
import net.minecraft.loot.provider.number.UniformLootNumberProvider;
import net.minecraft.util.Identifier;
import net.otm.jumble.item.JumbleItems;

public class JumbleLootTableModifiers {
    private static final Identifier END_CITY_ID = new Identifier("minecraft", "chests/end_city_treasure");
    private static final Identifier FROG_ID = new Identifier("minecraft", "entities/frog");
    private static final Identifier GOAT_ID = new Identifier("minecraft", "entities/goat");

    public static void modifyLootTables() {
        LootTableEvents.MODIFY.register((resourceManager, lootManager, id, tableBuilder, source) -> {
            if(END_CITY_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder()
                        .rolls(ConstantLootNumberProvider.create(1))
                        .conditionally(RandomChanceLootCondition.builder(0.15f)) // Drops 15% of the time
                        .with(ItemEntry.builder(JumbleItems.CELESTIUM_UPGRADE_SMITHING_TEMPLATE))
                        .apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(1.0f, 1.0f)).build());

                tableBuilder.pool(poolBuilder.build());
            }
            if(FROG_ID.equals(id)) {
                        LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.builder(0.5f)) //Drops 50% of the time
                        .with(ItemEntry.builder(Items.SLIME_BALL)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 2.0f)));
                tableBuilder.pool(poolBuilder.build());
            }
            if(GOAT_ID.equals(id)) {
                LootPool.Builder poolBuilder = LootPool.builder().rolls(ConstantLootNumberProvider.create(1)).conditionally(RandomChanceLootCondition.builder(0.5f)) //Drops 50% of the time
                        .with(ItemEntry.builder(Items.MUTTON)).apply(SetCountLootFunction.builder(UniformLootNumberProvider.create(0.0f, 3.0f)));
                tableBuilder.pool(poolBuilder.build());
            }
        });

    }
}
