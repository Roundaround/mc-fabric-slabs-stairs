package me.roundaround.slabsstairs.data;

import me.roundaround.slabsstairs.ModBlock;
import me.roundaround.slabsstairs.SlabsStairsBlocks;
import me.roundaround.slabsstairs.SlabsStairsMod;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider.BlockTagProvider;
import net.minecraft.block.Block;
import net.minecraft.tag.BlockTags;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SlabsStairsBlockTagProvider extends BlockTagProvider {
  public static final TagKey<Block> CONCRETE_SLABS = TagKey.of(
      Registry.BLOCK_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete_slabs"));
  public static final TagKey<Block> CONCRETE_STAIRS = TagKey.of(
      Registry.BLOCK_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete_stairs"));
  public static final TagKey<Block> CONCRETE_WALLS = TagKey.of(
      Registry.BLOCK_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete_walls"));
  public static final TagKey<Block> CONCRETE_PRESSURE_PLATES = TagKey.of(
      Registry.BLOCK_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete_pressure_plates"));
  public static final TagKey<Block> CONCRETE_BUTTONS = TagKey.of(
      Registry.BLOCK_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete_buttons"));

  public static final TagKey<Block> TERRACOTTA_SLABS = TagKey.of(
      Registry.BLOCK_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "terracotta_slabs"));
  public static final TagKey<Block> TERRACOTTA_STAIRS = TagKey.of(
      Registry.BLOCK_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "terracotta_stairs"));
  public static final TagKey<Block> TERRACOTTA_WALLS = TagKey.of(
      Registry.BLOCK_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "terracotta_walls"));
  public static final TagKey<Block> TERRACOTTA_PRESSURE_PLATES = TagKey.of(
      Registry.BLOCK_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "terracotta_pressure_plates"));
  public static final TagKey<Block> TERRACOTTA_BUTTONS = TagKey.of(
      Registry.BLOCK_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "terracotta_buttons"));

  public static final TagKey<Block> WOOL_SLABS = TagKey.of(
      Registry.BLOCK_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "wool_slabs"));
  public static final TagKey<Block> WOOL_STAIRS = TagKey.of(
      Registry.BLOCK_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "wool_stairs"));

  public SlabsStairsBlockTagProvider(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateTags() {
    getOrCreateTagBuilder(CONCRETE_SLABS)
        .add(SlabsStairsBlocks.CONCRETE_MOD_BLOCKS
            .stream()
            .filter(ModBlock::hasSlab)
            .map(ModBlock::getSlab)
            .toArray(Block[]::new));
    getOrCreateTagBuilder(CONCRETE_STAIRS)
        .add(SlabsStairsBlocks.CONCRETE_MOD_BLOCKS
            .stream()
            .filter(ModBlock::hasStairs)
            .map(ModBlock::getStairs)
            .toArray(Block[]::new));
    getOrCreateTagBuilder(CONCRETE_WALLS)
        .add(SlabsStairsBlocks.CONCRETE_MOD_BLOCKS
            .stream()
            .filter(ModBlock::hasWall)
            .map(ModBlock::getWall)
            .toArray(Block[]::new));
    getOrCreateTagBuilder(CONCRETE_PRESSURE_PLATES)
        .add(SlabsStairsBlocks.CONCRETE_MOD_BLOCKS
            .stream()
            .filter(ModBlock::hasPressurePlate)
            .map(ModBlock::getPressurePlate)
            .toArray(Block[]::new));
    getOrCreateTagBuilder(CONCRETE_BUTTONS)
        .add(SlabsStairsBlocks.CONCRETE_MOD_BLOCKS
            .stream()
            .filter(ModBlock::hasButton)
            .map(ModBlock::getButton)
            .toArray(Block[]::new));

    getOrCreateTagBuilder(TERRACOTTA_SLABS)
        .add(SlabsStairsBlocks.TERRACOTTA_MOD_BLOCKS
            .stream()
            .filter(ModBlock::hasSlab)
            .map(ModBlock::getSlab)
            .toArray(Block[]::new));
    getOrCreateTagBuilder(TERRACOTTA_STAIRS)
        .add(SlabsStairsBlocks.TERRACOTTA_MOD_BLOCKS
            .stream()
            .filter(ModBlock::hasStairs)
            .map(ModBlock::getStairs)
            .toArray(Block[]::new));
    getOrCreateTagBuilder(TERRACOTTA_WALLS)
        .add(SlabsStairsBlocks.TERRACOTTA_MOD_BLOCKS
            .stream()
            .filter(ModBlock::hasWall)
            .map(ModBlock::getWall)
            .toArray(Block[]::new));
    getOrCreateTagBuilder(TERRACOTTA_PRESSURE_PLATES)
        .add(SlabsStairsBlocks.TERRACOTTA_MOD_BLOCKS
            .stream()
            .filter(ModBlock::hasPressurePlate)
            .map(ModBlock::getPressurePlate)
            .toArray(Block[]::new));
    getOrCreateTagBuilder(TERRACOTTA_BUTTONS)
        .add(SlabsStairsBlocks.TERRACOTTA_MOD_BLOCKS
            .stream()
            .filter(ModBlock::hasButton)
            .map(ModBlock::getButton)
            .toArray(Block[]::new));

    getOrCreateTagBuilder(WOOL_SLABS)
        .add(SlabsStairsBlocks.WOOL_MOD_BLOCKS
            .stream()
            .filter(ModBlock::hasSlab)
            .map(ModBlock::getSlab)
            .toArray(Block[]::new));
    getOrCreateTagBuilder(WOOL_STAIRS)
        .add(SlabsStairsBlocks.WOOL_MOD_BLOCKS
            .stream()
            .filter(ModBlock::hasStairs)
            .map(ModBlock::getStairs)
            .toArray(Block[]::new));

    getOrCreateTagBuilder(BlockTags.SLABS)
        .addTag(CONCRETE_SLABS)
        .addTag(TERRACOTTA_SLABS)
        .addTag(WOOL_SLABS);

    getOrCreateTagBuilder(BlockTags.STAIRS)
        .addTag(CONCRETE_STAIRS)
        .addTag(TERRACOTTA_STAIRS)
        .addTag(WOOL_STAIRS);

    getOrCreateTagBuilder(BlockTags.WALLS)
        .addTag(CONCRETE_WALLS)
        .addTag(TERRACOTTA_WALLS);

    getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES)
        .addTag(CONCRETE_PRESSURE_PLATES)
        .addTag(TERRACOTTA_PRESSURE_PLATES);

    getOrCreateTagBuilder(BlockTags.BUTTONS)
        .addTag(CONCRETE_BUTTONS)
        .addTag(TERRACOTTA_BUTTONS);

    getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
        .addTag(CONCRETE_SLABS)
        .addTag(TERRACOTTA_SLABS)
        .addTag(CONCRETE_STAIRS)
        .addTag(TERRACOTTA_STAIRS)
        .addTag(CONCRETE_WALLS)
        .addTag(TERRACOTTA_WALLS)
        .addTag(CONCRETE_PRESSURE_PLATES)
        .addTag(TERRACOTTA_PRESSURE_PLATES)
        .addTag(CONCRETE_BUTTONS)
        .addTag(TERRACOTTA_BUTTONS);

    getOrCreateTagBuilder(BlockTags.DAMPENS_VIBRATIONS)
        .addTag(WOOL_SLABS)
        .addTag(WOOL_STAIRS);
  }
}
