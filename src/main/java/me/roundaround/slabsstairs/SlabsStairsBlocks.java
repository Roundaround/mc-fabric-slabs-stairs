package me.roundaround.slabsstairs;

import com.google.common.collect.ImmutableList;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.StoneButtonBlock;
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

  public static final Block WHITE_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.WHITE_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block ORANGE_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.ORANGE_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block MAGENTA_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.MAGENTA_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block LIGHT_BLUE_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.LIGHT_BLUE_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block YELLOW_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.YELLOW_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block LIME_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.LIME_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block PINK_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.PINK_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block GRAY_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.GRAY_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block LIGHT_GRAY_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.LIGHT_GRAY_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block CYAN_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.CYAN_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block PURPLE_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.PURPLE_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block BLUE_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.BLUE_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block BROWN_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.BROWN_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block GREEN_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.GREEN_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block RED_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.RED_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));
  public static final Block BLACK_CONCRETE_PRESSURE_PLATE = new PressurePlateBlock(
      PressurePlateBlock.ActivationRule.MOBS,
      AbstractBlock.Settings.copy(Blocks.BLACK_CONCRETE)
          .requiresTool()
          .noCollision()
          .strength(0.5f));

  public static final Block WHITE_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block ORANGE_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block MAGENTA_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block LIGHT_BLUE_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block YELLOW_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block LIME_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block PINK_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block GRAY_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block LIGHT_GRAY_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block CYAN_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block PURPLE_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block BLUE_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block BROWN_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block GREEN_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block RED_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));
  public static final Block BLACK_CONCRETE_BUTTON = new StoneButtonBlock(
      AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f));

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

  public static final ImmutableList<PressurePlateEntry> CONCRETE_PRESSURE_PLATES = ImmutableList.of(
      new PressurePlateEntry(WHITE_CONCRETE_PRESSURE_PLATE, Blocks.WHITE_CONCRETE),
      new PressurePlateEntry(ORANGE_CONCRETE_PRESSURE_PLATE, Blocks.ORANGE_CONCRETE),
      new PressurePlateEntry(MAGENTA_CONCRETE_PRESSURE_PLATE, Blocks.MAGENTA_CONCRETE),
      new PressurePlateEntry(LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, Blocks.LIGHT_BLUE_CONCRETE),
      new PressurePlateEntry(YELLOW_CONCRETE_PRESSURE_PLATE, Blocks.YELLOW_CONCRETE),
      new PressurePlateEntry(LIME_CONCRETE_PRESSURE_PLATE, Blocks.LIME_CONCRETE),
      new PressurePlateEntry(PINK_CONCRETE_PRESSURE_PLATE, Blocks.PINK_CONCRETE),
      new PressurePlateEntry(GRAY_CONCRETE_PRESSURE_PLATE, Blocks.GRAY_CONCRETE),
      new PressurePlateEntry(LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, Blocks.LIGHT_GRAY_CONCRETE),
      new PressurePlateEntry(CYAN_CONCRETE_PRESSURE_PLATE, Blocks.CYAN_CONCRETE),
      new PressurePlateEntry(PURPLE_CONCRETE_PRESSURE_PLATE, Blocks.PURPLE_CONCRETE),
      new PressurePlateEntry(BLUE_CONCRETE_PRESSURE_PLATE, Blocks.BLUE_CONCRETE),
      new PressurePlateEntry(BROWN_CONCRETE_PRESSURE_PLATE, Blocks.BROWN_CONCRETE),
      new PressurePlateEntry(GREEN_CONCRETE_PRESSURE_PLATE, Blocks.GREEN_CONCRETE),
      new PressurePlateEntry(RED_CONCRETE_PRESSURE_PLATE, Blocks.RED_CONCRETE),
      new PressurePlateEntry(BLACK_CONCRETE_PRESSURE_PLATE, Blocks.BLACK_CONCRETE));

  public static final ImmutableList<ButtonEntry> CONCRETE_BUTTONS = ImmutableList.of(
      new ButtonEntry(WHITE_CONCRETE_BUTTON, Blocks.WHITE_CONCRETE),
      new ButtonEntry(ORANGE_CONCRETE_BUTTON, Blocks.ORANGE_CONCRETE),
      new ButtonEntry(MAGENTA_CONCRETE_BUTTON, Blocks.MAGENTA_CONCRETE),
      new ButtonEntry(LIGHT_BLUE_CONCRETE_BUTTON, Blocks.LIGHT_BLUE_CONCRETE),
      new ButtonEntry(YELLOW_CONCRETE_BUTTON, Blocks.YELLOW_CONCRETE),
      new ButtonEntry(LIME_CONCRETE_BUTTON, Blocks.LIME_CONCRETE),
      new ButtonEntry(PINK_CONCRETE_BUTTON, Blocks.PINK_CONCRETE),
      new ButtonEntry(GRAY_CONCRETE_BUTTON, Blocks.GRAY_CONCRETE),
      new ButtonEntry(LIGHT_GRAY_CONCRETE_BUTTON, Blocks.LIGHT_GRAY_CONCRETE),
      new ButtonEntry(CYAN_CONCRETE_BUTTON, Blocks.CYAN_CONCRETE),
      new ButtonEntry(PURPLE_CONCRETE_BUTTON, Blocks.PURPLE_CONCRETE),
      new ButtonEntry(BLUE_CONCRETE_BUTTON, Blocks.BLUE_CONCRETE),
      new ButtonEntry(BROWN_CONCRETE_BUTTON, Blocks.BROWN_CONCRETE),
      new ButtonEntry(GREEN_CONCRETE_BUTTON, Blocks.GREEN_CONCRETE),
      new ButtonEntry(RED_CONCRETE_BUTTON, Blocks.RED_CONCRETE),
      new ButtonEntry(BLACK_CONCRETE_BUTTON, Blocks.BLACK_CONCRETE));

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

    registerBlock("white_concrete_pressure_plate", WHITE_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("orange_concrete_pressure_plate", ORANGE_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("magenta_concrete_pressure_plate", MAGENTA_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("light_blue_concrete_pressure_plate", LIGHT_BLUE_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("yellow_concrete_pressure_plate", YELLOW_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("lime_concrete_pressure_plate", LIME_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("pink_concrete_pressure_plate", PINK_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("gray_concrete_pressure_plate", GRAY_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("light_gray_concrete_pressure_plate", LIGHT_GRAY_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("cyan_concrete_pressure_plate", CYAN_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("purple_concrete_pressure_plate", PURPLE_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("blue_concrete_pressure_plate", BLUE_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("brown_concrete_pressure_plate", BROWN_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("green_concrete_pressure_plate", GREEN_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("red_concrete_pressure_plate", RED_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);
    registerBlock("black_concrete_pressure_plate", BLACK_CONCRETE_PRESSURE_PLATE, ItemGroup.REDSTONE);

    registerBlock("white_concrete_button", WHITE_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("orange_concrete_button", ORANGE_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("magenta_concrete_button", MAGENTA_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("light_blue_concrete_button", LIGHT_BLUE_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("yellow_concrete_button", YELLOW_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("lime_concrete_button", LIME_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("pink_concrete_button", PINK_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("gray_concrete_button", GRAY_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("light_gray_concrete_button", LIGHT_GRAY_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("cyan_concrete_button", CYAN_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("purple_concrete_button", PURPLE_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("blue_concrete_button", BLUE_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("brown_concrete_button", BROWN_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("green_concrete_button", GREEN_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("red_concrete_button", RED_CONCRETE_BUTTON, ItemGroup.REDSTONE);
    registerBlock("black_concrete_button", BLACK_CONCRETE_BUTTON, ItemGroup.REDSTONE);
  }

  private static final void registerBlock(String name, Block block) {
    registerBlock(name, block, ItemGroup.BUILDING_BLOCKS);
  }

  private static final void registerBlock(String name, Block block, ItemGroup group) {
    Registry.register(Registry.BLOCK, new Identifier(SlabsStairsMod.MOD_ID, name), block);
    Registry.register(Registry.ITEM, new Identifier(SlabsStairsMod.MOD_ID, name),
        new BlockItem(block, new Item.Settings().group(group)));
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

  public static class PressurePlateEntry {
    public final Block pressurePlate;
    public final Block source;

    public PressurePlateEntry(Block pressurePlate, Block source) {
      this.pressurePlate = pressurePlate;
      this.source = source;
    }
  }

  public static class ButtonEntry {
    public final Block button;
    public final Block source;

    public ButtonEntry(Block button, Block source) {
      this.button = button;
      this.source = source;
    }
  }
}
