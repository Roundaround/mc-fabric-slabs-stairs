package me.roundaround.slabsstairs.data;

import me.roundaround.slabsstairs.SlabsStairsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.data.server.BlockLootTableGenerator;

public class SlabsStairsLootTableProvider extends FabricBlockLootTableProvider {
  public SlabsStairsLootTableProvider(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateBlockLootTables() {
    SlabsStairsBlocks.CONCRETE_SLABS.forEach((entry) -> {
      addDrop(entry.slab, BlockLootTableGenerator::slabDrops);
    });

    SlabsStairsBlocks.CONCRETE_STAIRS.forEach((entry) -> {
      addDrop(entry.stairs);
    });

    SlabsStairsBlocks.CONCRETE_WALLS.forEach((entry) -> {
      addDrop(entry.wall);
    });
  }
}
