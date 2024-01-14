package net.otm.jumble.world.gen;

import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.world.gen.GenerationStep;
import net.otm.jumble.world.JumblePlacedFeatures;

public class JumbleOreGeneration {
    public static void generateOres() {

        BiomeModifications.addFeature(BiomeSelectors.foundInTheEnd(),
                GenerationStep.Feature.UNDERGROUND_ORES, JumblePlacedFeatures.END_CELESTIUM_ORE_PLACED_KEY);
    }
}
