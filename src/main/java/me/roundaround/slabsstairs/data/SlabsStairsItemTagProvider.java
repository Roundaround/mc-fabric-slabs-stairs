package me.roundaround.slabsstairs.data;

import me.roundaround.slabsstairs.SlabsStairsMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.ItemTagProvider;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SlabsStairsItemTagProvider extends ItemTagProvider {
  public static final TagKey<Item> CONCRETE_SLABS = TagKey.of(
      Registry.ITEM_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete_slabs"));
  public static final TagKey<Item> CONCRETE_STAIRS = TagKey.of(
      Registry.ITEM_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete_stairs"));
  public static final TagKey<Item> CONCRETE_WALLS = TagKey.of(
      Registry.ITEM_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete_walls"));
  public static final TagKey<Item> CONCRETE_PRESSURE_PLATES = TagKey.of(
      Registry.ITEM_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete_pressure_plates"));
  public static final TagKey<Item> CONCRETE_BUTTONS = TagKey.of(
      Registry.ITEM_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete_buttons"));
  public static final TagKey<Item> TERRACOTTA_SLABS = TagKey.of(
      Registry.ITEM_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "terracotta_slabs"));
  public static final TagKey<Item> TERRACOTTA_STAIRS = TagKey.of(
      Registry.ITEM_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "terracotta_stairs"));
  public static final TagKey<Item> TERRACOTTA_WALLS = TagKey.of(
      Registry.ITEM_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "terracotta_walls"));
  public static final TagKey<Item> TERRACOTTA_PRESSURE_PLATES = TagKey.of(
      Registry.ITEM_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "terracotta_pressure_plates"));
  public static final TagKey<Item> TERRACOTTA_BUTTONS = TagKey.of(
      Registry.ITEM_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "terracotta_buttons"));

  public SlabsStairsItemTagProvider(FabricDataGenerator dataGenerator, BlockTagProvider blockTagProvider) {
    super(dataGenerator, blockTagProvider);
  }

  @Override
  protected void generateTags() {
    copy(SlabsStairsBlockTagProvider.CONCRETE_SLABS, CONCRETE_SLABS);
    copy(SlabsStairsBlockTagProvider.CONCRETE_STAIRS, CONCRETE_STAIRS);
    copy(SlabsStairsBlockTagProvider.CONCRETE_WALLS, CONCRETE_WALLS);
    copy(SlabsStairsBlockTagProvider.CONCRETE_PRESSURE_PLATES, CONCRETE_PRESSURE_PLATES);
    copy(SlabsStairsBlockTagProvider.CONCRETE_BUTTONS, CONCRETE_BUTTONS);
    copy(SlabsStairsBlockTagProvider.TERRACOTTA_SLABS, TERRACOTTA_SLABS);
    copy(SlabsStairsBlockTagProvider.TERRACOTTA_STAIRS, TERRACOTTA_STAIRS);
    copy(SlabsStairsBlockTagProvider.TERRACOTTA_WALLS, TERRACOTTA_WALLS);
    copy(SlabsStairsBlockTagProvider.TERRACOTTA_PRESSURE_PLATES, TERRACOTTA_PRESSURE_PLATES);
    copy(SlabsStairsBlockTagProvider.TERRACOTTA_BUTTONS, TERRACOTTA_BUTTONS);
  }
}
