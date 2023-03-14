package me.roundaround.slabsstairs.data;

import me.roundaround.slabsstairs.SlabsStairsMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.ItemTagProvider;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SlabsStairsItemTagProvider extends ItemTagProvider {
  public static final TagKey<Item> CONCRETE = TagKey.of(
      Registry.ITEM_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete"));
  public static final TagKey<Item> CONCRETE_SLABS = TagKey.of(
      Registry.ITEM_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete_slabs"));
  public static final TagKey<Item> CONCRETE_STAIRS = TagKey.of(
      Registry.ITEM_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete_stairs"));
  public static final TagKey<Item> CONCRETE_WALLS = TagKey.of(
      Registry.ITEM_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete_walls"));

  public SlabsStairsItemTagProvider(FabricDataGenerator dataGenerator, BlockTagProvider blockTagProvider) {
    super(dataGenerator, blockTagProvider);
  }

  @Override
  protected void generateTags() {
    copy(SlabsStairsBlockTagProvider.CONCRETE, CONCRETE);
    copy(SlabsStairsBlockTagProvider.CONCRETE_SLABS, CONCRETE_SLABS);
    copy(SlabsStairsBlockTagProvider.CONCRETE_STAIRS, CONCRETE_STAIRS);
    copy(SlabsStairsBlockTagProvider.CONCRETE_WALLS, CONCRETE_WALLS);
  }
}
