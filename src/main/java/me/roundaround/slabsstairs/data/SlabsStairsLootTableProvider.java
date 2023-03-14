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
    SlabsStairsBlocks.ALL_MOD_BLOCKS.forEach((entry) -> {
      if (entry.hasSlab()) {
        addDrop(entry.getSlab(), BlockLootTableGenerator::slabDrops);
      }
      if (entry.hasStairs()) {
        addDrop(entry.getStairs());
      }
      if (entry.hasWall()) {
        addDrop(entry.getWall());
      }
      if (entry.hasPressurePlate()) {
        addDrop(entry.getPressurePlate());
      }
      if (entry.hasButton()) {
        addDrop(entry.getButton());
      }
    });
  }
}
