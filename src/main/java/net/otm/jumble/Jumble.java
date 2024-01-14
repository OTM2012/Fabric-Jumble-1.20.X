package net.otm.jumble;

import net.fabricmc.api.ModInitializer;

import net.otm.jumble.block.JumbleBlocks;
import net.otm.jumble.item.JumbleItemGroups;
import net.otm.jumble.item.JumbleItems;
import net.otm.jumble.world.gen.JumbleOreGeneration;
import net.otm.jumble.world.gen.JumbleWorldGeneration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Jumble implements ModInitializer {
	public static final String MOD_ID = "jumble";

    public static final Logger LOGGER = LoggerFactory.getLogger("jumble");

	@Override
	public void onInitialize() {

		JumbleItemGroups.registerItemGroups();
		JumbleItems.registerJumbleItems();
		JumbleBlocks.registerJumbleBlocks();
		JumbleWorldGeneration.generateModWorldGen();
	}
}