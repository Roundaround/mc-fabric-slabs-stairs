package me.roundaround.slabsstairs.data;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class SlabsStairsDataGen implements DataGeneratorEntrypoint {
  @Override
  public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
    fabricDataGenerator.addProvider(SlabsStairsModelProvider::new);
    fabricDataGenerator.addProvider(SlabsStairsLootTableProvider::new);
    fabricDataGenerator.addProvider(SlabsStairsRecipeProvider::new);
    fabricDataGenerator.addProvider(SlabsStairsLangProvider::new);

    SlabsStairsBlockTagProvider blockTagProvider = fabricDataGenerator.addProvider(SlabsStairsBlockTagProvider::new);
    fabricDataGenerator.addProvider((dataGenerator) -> {
      return new SlabsStairsItemTagProvider(dataGenerator, blockTagProvider);
    });
  }
}
