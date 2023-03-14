package me.roundaround.slabsstairs.data;

import java.util.function.BiConsumer;

import me.roundaround.slabsstairs.SlabsStairsBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.text.Text;

public class SlabsStairsLangProvider extends AbstractLangProvider {
  public SlabsStairsLangProvider(DataGenerator generator) {
    super(generator);
  }

  @Override
  protected void addTranslations(BiConsumer<String, String> consumer) {
    SlabsStairsBlocks.ALL_MOD_BLOCKS.forEach((entry) -> {
      String sourceName = Text.translatable(entry.getSource().getTranslationKey()).getString();
      if (entry.hasSlab()) {
        consumer.accept(entry.getSlab().getTranslationKey(), sourceName + " Slab");
      }
      if (entry.hasStairs()) {
        consumer.accept(entry.getStairs().getTranslationKey(), sourceName + " Stairs");
      }
      if (entry.hasWall()) {
        consumer.accept(entry.getWall().getTranslationKey(), sourceName + " Wall");
      }
      if (entry.hasPressurePlate()) {
        consumer.accept(entry.getPressurePlate().getTranslationKey(), sourceName + " Pressure Plate");
      }
      if (entry.hasButton()) {
        consumer.accept(entry.getButton().getTranslationKey(), sourceName + " Button");
      }
    });
  }
}
