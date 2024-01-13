package net.otm.jumble;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.otm.jumble.datagen.*;

public class JumbleDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(JumbleBlockTagProvider::new);
		pack.addProvider(JumbleItemTagProvider::new);
		pack.addProvider(JumbleLootTableProvider::new);
		pack.addProvider(JumbleModelProvider::new);
		pack.addProvider(JumbleRecipeProvider::new);

	}
}
