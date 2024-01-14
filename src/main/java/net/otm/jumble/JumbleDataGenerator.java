package net.otm.jumble;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import net.otm.jumble.datagen.*;
import net.otm.jumble.world.JumbleConfiguredFeatures;
import net.otm.jumble.world.JumblePlacedFeatures;

public class JumbleDataGenerator implements DataGeneratorEntrypoint {
	@Override
	public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
		FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

		pack.addProvider(JumbleBlockTagProvider::new);
		pack.addProvider(JumbleItemTagProvider::new);
		pack.addProvider(JumbleLootTableProvider::new);
		pack.addProvider(JumbleModelProvider::new);
		pack.addProvider(JumbleRecipeProvider::new);
		pack.addProvider(JumbleWorldGenerator::new);

	}

	@Override
	public void buildRegistry(RegistryBuilder registryBuilder) {
		registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, JumbleConfiguredFeatures::boostrap);
		registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, JumblePlacedFeatures::boostrap);
	}

}
