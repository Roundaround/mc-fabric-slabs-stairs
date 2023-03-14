package me.roundaround.slabsstairs;

import com.google.common.collect.ImmutableList;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SlabsStairsBlocks {
  public static final Block WHITE_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE));
  public static final Block ORANGE_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE));
  public static final Block MAGENTA_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE));
  public static final Block LIGHT_BLUE_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE));
  public static final Block YELLOW_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE));
  public static final Block LIME_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE));
  public static final Block PINK_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE));
  public static final Block GRAY_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE));
  public static final Block LIGHT_GRAY_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE));
  public static final Block CYAN_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE));
  public static final Block PURPLE_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE));
  public static final Block BLUE_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE));
  public static final Block BROWN_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE));
  public static final Block GREEN_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE));
  public static final Block RED_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.RED_CONCRETE));
  public static final Block BLACK_CONCRETE_SLAB = new SlabBlock(
      AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));

  public static final Block WHITE_CONCRETE_STAIRS = new StairsBlock(
      Blocks.WHITE_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE));
  public static final Block ORANGE_CONCRETE_STAIRS = new StairsBlock(
      Blocks.ORANGE_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE));
  public static final Block MAGENTA_CONCRETE_STAIRS = new StairsBlock(
      Blocks.MAGENTA_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE));
  public static final Block LIGHT_BLUE_CONCRETE_STAIRS = new StairsBlock(
      Blocks.LIGHT_BLUE_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE));
  public static final Block YELLOW_CONCRETE_STAIRS = new StairsBlock(
      Blocks.YELLOW_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE));
  public static final Block LIME_CONCRETE_STAIRS = new StairsBlock(
      Blocks.LIME_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE));
  public static final Block PINK_CONCRETE_STAIRS = new StairsBlock(
      Blocks.PINK_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE));
  public static final Block GRAY_CONCRETE_STAIRS = new StairsBlock(
      Blocks.GRAY_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE));
  public static final Block LIGHT_GRAY_CONCRETE_STAIRS = new StairsBlock(
      Blocks.LIGHT_GRAY_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE));
  public static final Block CYAN_CONCRETE_STAIRS = new StairsBlock(
      Blocks.CYAN_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE));
  public static final Block PURPLE_CONCRETE_STAIRS = new StairsBlock(
      Blocks.PURPLE_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE));
  public static final Block BLUE_CONCRETE_STAIRS = new StairsBlock(
      Blocks.BLUE_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE));
  public static final Block BROWN_CONCRETE_STAIRS = new StairsBlock(
      Blocks.BROWN_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE));
  public static final Block GREEN_CONCRETE_STAIRS = new StairsBlock(
      Blocks.GREEN_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE));
  public static final Block RED_CONCRETE_STAIRS = new StairsBlock(
      Blocks.RED_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.RED_CONCRETE));
  public static final Block BLACK_CONCRETE_STAIRS = new StairsBlock(
      Blocks.BLACK_CONCRETE.getDefaultState(),
      AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));

  public static final Block WHITE_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE));
  public static final Block ORANGE_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE));
  public static final Block MAGENTA_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE));
  public static final Block LIGHT_BLUE_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE));
  public static final Block YELLOW_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE));
  public static final Block LIME_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE));
  public static final Block PINK_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE));
  public static final Block GRAY_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE));
  public static final Block LIGHT_GRAY_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE));
  public static final Block CYAN_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE));
  public static final Block PURPLE_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE));
  public static final Block BLUE_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE));
  public static final Block BROWN_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE));
  public static final Block GREEN_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE));
  public static final Block RED_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.RED_CONCRETE));
  public static final Block BLACK_CONCRETE_WALL = new WallBlock(
      AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE));

  public static final ImmutableList<SlabEntry> CONCRETE_SLABS = ImmutableList.of(
      new SlabEntry(WHITE_CONCRETE_SLAB, Blocks.WHITE_CONCRETE),
      new SlabEntry(ORANGE_CONCRETE_SLAB, Blocks.ORANGE_CONCRETE),
      new SlabEntry(MAGENTA_CONCRETE_SLAB, Blocks.MAGENTA_CONCRETE),
      new SlabEntry(LIGHT_BLUE_CONCRETE_SLAB, Blocks.LIGHT_BLUE_CONCRETE),
      new SlabEntry(YELLOW_CONCRETE_SLAB, Blocks.YELLOW_CONCRETE),
      new SlabEntry(LIME_CONCRETE_SLAB, Blocks.LIME_CONCRETE),
      new SlabEntry(PINK_CONCRETE_SLAB, Blocks.PINK_CONCRETE),
      new SlabEntry(GRAY_CONCRETE_SLAB, Blocks.GRAY_CONCRETE),
      new SlabEntry(LIGHT_GRAY_CONCRETE_SLAB, Blocks.LIGHT_GRAY_CONCRETE),
      new SlabEntry(CYAN_CONCRETE_SLAB, Blocks.CYAN_CONCRETE),
      new SlabEntry(PURPLE_CONCRETE_SLAB, Blocks.PURPLE_CONCRETE),
      new SlabEntry(BLUE_CONCRETE_SLAB, Blocks.BLUE_CONCRETE),
      new SlabEntry(BROWN_CONCRETE_SLAB, Blocks.BROWN_CONCRETE),
      new SlabEntry(GREEN_CONCRETE_SLAB, Blocks.GREEN_CONCRETE),
      new SlabEntry(RED_CONCRETE_SLAB, Blocks.RED_CONCRETE),
      new SlabEntry(BLACK_CONCRETE_SLAB, Blocks.BLACK_CONCRETE));

  public static final ImmutableList<StairsEntry> CONCRETE_STAIRS = ImmutableList.of(
      new StairsEntry(WHITE_CONCRETE_STAIRS, Blocks.WHITE_CONCRETE),
      new StairsEntry(ORANGE_CONCRETE_STAIRS, Blocks.ORANGE_CONCRETE),
      new StairsEntry(MAGENTA_CONCRETE_STAIRS, Blocks.MAGENTA_CONCRETE),
      new StairsEntry(LIGHT_BLUE_CONCRETE_STAIRS, Blocks.LIGHT_BLUE_CONCRETE),
      new StairsEntry(YELLOW_CONCRETE_STAIRS, Blocks.YELLOW_CONCRETE),
      new StairsEntry(LIME_CONCRETE_STAIRS, Blocks.LIME_CONCRETE),
      new StairsEntry(PINK_CONCRETE_STAIRS, Blocks.PINK_CONCRETE),
      new StairsEntry(GRAY_CONCRETE_STAIRS, Blocks.GRAY_CONCRETE),
      new StairsEntry(LIGHT_GRAY_CONCRETE_STAIRS, Blocks.LIGHT_GRAY_CONCRETE),
      new StairsEntry(CYAN_CONCRETE_STAIRS, Blocks.CYAN_CONCRETE),
      new StairsEntry(PURPLE_CONCRETE_STAIRS, Blocks.PURPLE_CONCRETE),
      new StairsEntry(BLUE_CONCRETE_STAIRS, Blocks.BLUE_CONCRETE),
      new StairsEntry(BROWN_CONCRETE_STAIRS, Blocks.BROWN_CONCRETE),
      new StairsEntry(GREEN_CONCRETE_STAIRS, Blocks.GREEN_CONCRETE),
      new StairsEntry(RED_CONCRETE_STAIRS, Blocks.RED_CONCRETE),
      new StairsEntry(BLACK_CONCRETE_STAIRS, Blocks.BLACK_CONCRETE));

  public static final ImmutableList<WallEntry> CONCRETE_WALLS = ImmutableList.of(
      new WallEntry(WHITE_CONCRETE_WALL, Blocks.WHITE_CONCRETE),
      new WallEntry(ORANGE_CONCRETE_WALL, Blocks.ORANGE_CONCRETE),
      new WallEntry(MAGENTA_CONCRETE_WALL, Blocks.MAGENTA_CONCRETE),
      new WallEntry(LIGHT_BLUE_CONCRETE_WALL, Blocks.LIGHT_BLUE_CONCRETE),
      new WallEntry(YELLOW_CONCRETE_WALL, Blocks.YELLOW_CONCRETE),
      new WallEntry(LIME_CONCRETE_WALL, Blocks.LIME_CONCRETE),
      new WallEntry(PINK_CONCRETE_WALL, Blocks.PINK_CONCRETE),
      new WallEntry(GRAY_CONCRETE_WALL, Blocks.GRAY_CONCRETE),
      new WallEntry(LIGHT_GRAY_CONCRETE_WALL, Blocks.LIGHT_GRAY_CONCRETE),
      new WallEntry(CYAN_CONCRETE_WALL, Blocks.CYAN_CONCRETE),
      new WallEntry(PURPLE_CONCRETE_WALL, Blocks.PURPLE_CONCRETE),
      new WallEntry(BLUE_CONCRETE_WALL, Blocks.BLUE_CONCRETE),
      new WallEntry(BROWN_CONCRETE_WALL, Blocks.BROWN_CONCRETE),
      new WallEntry(GREEN_CONCRETE_WALL, Blocks.GREEN_CONCRETE),
      new WallEntry(RED_CONCRETE_WALL, Blocks.RED_CONCRETE),
      new WallEntry(BLACK_CONCRETE_WALL, Blocks.BLACK_CONCRETE));

  public static final void registerBlocks() {
    registerBlock("white_concrete_slab", WHITE_CONCRETE_SLAB);
    registerBlock("orange_concrete_slab", ORANGE_CONCRETE_SLAB);
    registerBlock("magenta_concrete_slab", MAGENTA_CONCRETE_SLAB);
    registerBlock("light_blue_concrete_slab", LIGHT_BLUE_CONCRETE_SLAB);
    registerBlock("yellow_concrete_slab", YELLOW_CONCRETE_SLAB);
    registerBlock("lime_concrete_slab", LIME_CONCRETE_SLAB);
    registerBlock("pink_concrete_slab", PINK_CONCRETE_SLAB);
    registerBlock("gray_concrete_slab", GRAY_CONCRETE_SLAB);
    registerBlock("light_gray_concrete_slab", LIGHT_GRAY_CONCRETE_SLAB);
    registerBlock("cyan_concrete_slab", CYAN_CONCRETE_SLAB);
    registerBlock("purple_concrete_slab", PURPLE_CONCRETE_SLAB);
    registerBlock("blue_concrete_slab", BLUE_CONCRETE_SLAB);
    registerBlock("brown_concrete_slab", BROWN_CONCRETE_SLAB);
    registerBlock("green_concrete_slab", GREEN_CONCRETE_SLAB);
    registerBlock("red_concrete_slab", RED_CONCRETE_SLAB);
    registerBlock("black_concrete_slab", BLACK_CONCRETE_SLAB);

    registerBlock("white_concrete_stairs", WHITE_CONCRETE_STAIRS);
    registerBlock("orange_concrete_stairs", ORANGE_CONCRETE_STAIRS);
    registerBlock("magenta_concrete_stairs", MAGENTA_CONCRETE_STAIRS);
    registerBlock("light_blue_concrete_stairs", LIGHT_BLUE_CONCRETE_STAIRS);
    registerBlock("yellow_concrete_stairs", YELLOW_CONCRETE_STAIRS);
    registerBlock("lime_concrete_stairs", LIME_CONCRETE_STAIRS);
    registerBlock("pink_concrete_stairs", PINK_CONCRETE_STAIRS);
    registerBlock("gray_concrete_stairs", GRAY_CONCRETE_STAIRS);
    registerBlock("light_gray_concrete_stairs", LIGHT_GRAY_CONCRETE_STAIRS);
    registerBlock("cyan_concrete_stairs", CYAN_CONCRETE_STAIRS);
    registerBlock("purple_concrete_stairs", PURPLE_CONCRETE_STAIRS);
    registerBlock("blue_concrete_stairs", BLUE_CONCRETE_STAIRS);
    registerBlock("brown_concrete_stairs", BROWN_CONCRETE_STAIRS);
    registerBlock("green_concrete_stairs", GREEN_CONCRETE_STAIRS);
    registerBlock("red_concrete_stairs", RED_CONCRETE_STAIRS);
    registerBlock("black_concrete_stairs", BLACK_CONCRETE_STAIRS);

    registerBlock("white_concrete_wall", WHITE_CONCRETE_WALL);
    registerBlock("orange_concrete_wall", ORANGE_CONCRETE_WALL);
    registerBlock("magenta_concrete_wall", MAGENTA_CONCRETE_WALL);
    registerBlock("light_blue_concrete_wall", LIGHT_BLUE_CONCRETE_WALL);
    registerBlock("yellow_concrete_wall", YELLOW_CONCRETE_WALL);
    registerBlock("lime_concrete_wall", LIME_CONCRETE_WALL);
    registerBlock("pink_concrete_wall", PINK_CONCRETE_WALL);
    registerBlock("gray_concrete_wall", GRAY_CONCRETE_WALL);
    registerBlock("light_gray_concrete_wall", LIGHT_GRAY_CONCRETE_WALL);
    registerBlock("cyan_concrete_wall", CYAN_CONCRETE_WALL);
    registerBlock("purple_concrete_wall", PURPLE_CONCRETE_WALL);
    registerBlock("blue_concrete_wall", BLUE_CONCRETE_WALL);
    registerBlock("brown_concrete_wall", BROWN_CONCRETE_WALL);
    registerBlock("green_concrete_wall", GREEN_CONCRETE_WALL);
    registerBlock("red_concrete_wall", RED_CONCRETE_WALL);
    registerBlock("black_concrete_wall", BLACK_CONCRETE_WALL);
  }

  private static final void registerBlock(String name, Block block) {
    Registry.register(Registry.BLOCK, new Identifier(SlabsStairsMod.MOD_ID, name), block);
    Registry.register(Registry.ITEM, new Identifier(SlabsStairsMod.MOD_ID, name),
        new BlockItem(block, new Item.Settings().group(ItemGroup.BUILDING_BLOCKS)));
  }

  public static class SlabEntry {
    public final Block slab;
    public final Block source;

    public SlabEntry(Block slab, Block source) {
      this.slab = slab;
      this.source = source;
    }
  }

  public static class StairsEntry {
    public final Block stairs;
    public final Block source;

    public StairsEntry(Block stairs, Block source) {
      this.stairs = stairs;
      this.source = source;
    }
  }

  public static class WallEntry {
    public final Block wall;
    public final Block source;

    public WallEntry(Block wall, Block source) {
      this.wall = wall;
      this.source = source;
    }
  }
}
