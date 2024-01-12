package net.otm.jumble.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.otm.jumble.Jumble;
import net.otm.jumble.block.JumbleBlocks;

public class JumbleItemGroups {

    public static final ItemGroup JUMBLE_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(Jumble.MOD_ID, "jumble"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.jumble"))
                    .icon(() ->new ItemStack(JumbleItems.CELESTIUM)).entries((displayContext, entries) -> {
                        entries.add(JumbleItems.CELESTIUM);
                        entries.add(JumbleBlocks.CELESTIUM_ORE);
                    }).build());
    public static void registerItemGroups() {
        Jumble.LOGGER.info("Registering Item Groups for " + Jumble.MOD_ID);
    }
}
