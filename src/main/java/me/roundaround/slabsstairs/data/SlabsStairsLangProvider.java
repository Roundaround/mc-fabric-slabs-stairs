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
    SlabsStairsBlocks.CONCRETE_SLABS.forEach((entry) -> {
      String sourceName = Text.translatable(entry.source.getTranslationKey()).getString();
      consumer.accept(entry.slab.getTranslationKey(), sourceName + " Slab");
    });

    SlabsStairsBlocks.CONCRETE_STAIRS.forEach((entry) -> {
      String sourceName = Text.translatable(entry.source.getTranslationKey()).getString();
      consumer.accept(entry.stairs.getTranslationKey(), sourceName + " Stairs");
    });

    SlabsStairsBlocks.CONCRETE_WALLS.forEach((entry) -> {
      String sourceName = Text.translatable(entry.source.getTranslationKey()).getString();
      consumer.accept(entry.wall.getTranslationKey(), sourceName + " Wall");
    });

    SlabsStairsBlocks.CONCRETE_PRESSURE_PLATES.forEach((entry) -> {
      String sourceName = Text.translatable(entry.source.getTranslationKey()).getString();
      consumer.accept(entry.pressurePlate.getTranslationKey(), sourceName + " Pressure Plate");
    });

    SlabsStairsBlocks.CONCRETE_BUTTONS.forEach((entry) -> {
      String sourceName = Text.translatable(entry.source.getTranslationKey()).getString();
      consumer.accept(entry.button.getTranslationKey(), sourceName + " Button");
    });
  }
}
