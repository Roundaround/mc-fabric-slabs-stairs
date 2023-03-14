package me.roundaround.slabsstairs.data;

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
  public static final TagKey<Block> CONCRETE = TagKey.of(
      Registry.BLOCK_KEY,
      new Identifier(SlabsStairsMod.MOD_ID, "concrete"));
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

  public SlabsStairsBlockTagProvider(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateTags() {
    getOrCreateTagBuilder(CONCRETE)
        .add(SlabsStairsBlocks.CONCRETE_SLABS
            .stream()
            .map(entry -> entry.source)
            .toArray(Block[]::new));

    getOrCreateTagBuilder(CONCRETE_SLABS)
        .add(SlabsStairsBlocks.CONCRETE_SLABS
            .stream()
            .map(entry -> entry.slab)
            .toArray(Block[]::new));

    getOrCreateTagBuilder(CONCRETE_STAIRS)
        .add(SlabsStairsBlocks.CONCRETE_STAIRS
            .stream()
            .map(entry -> entry.stairs)
            .toArray(Block[]::new));

    getOrCreateTagBuilder(CONCRETE_WALLS)
        .add(SlabsStairsBlocks.CONCRETE_WALLS
            .stream()
            .map(entry -> entry.wall)
            .toArray(Block[]::new));

    getOrCreateTagBuilder(CONCRETE_PRESSURE_PLATES)
        .add(SlabsStairsBlocks.CONCRETE_PRESSURE_PLATES
            .stream()
            .map(entry -> entry.pressurePlate)
            .toArray(Block[]::new));

    getOrCreateTagBuilder(CONCRETE_BUTTONS)
        .add(SlabsStairsBlocks.CONCRETE_BUTTONS
            .stream()
            .map(entry -> entry.button)
            .toArray(Block[]::new));

    getOrCreateTagBuilder(BlockTags.SLABS).addTag(CONCRETE_SLABS);
    getOrCreateTagBuilder(BlockTags.STAIRS).addTag(CONCRETE_STAIRS);
    getOrCreateTagBuilder(BlockTags.WALLS).addTag(CONCRETE_WALLS);
    getOrCreateTagBuilder(BlockTags.PRESSURE_PLATES).addTag(CONCRETE_PRESSURE_PLATES);
    getOrCreateTagBuilder(BlockTags.BUTTONS).addTag(CONCRETE_BUTTONS);

    getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
        .addTag(CONCRETE_SLABS)
        .addTag(CONCRETE_STAIRS)
        .addTag(CONCRETE_WALLS)
        .addTag(CONCRETE_PRESSURE_PLATES);
  }
}
