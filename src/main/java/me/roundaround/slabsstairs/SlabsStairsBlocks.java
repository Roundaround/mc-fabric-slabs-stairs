package me.roundaround.slabsstairs;

import com.google.common.collect.ImmutableList;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class SlabsStairsBlocks {
  private static final ImmutableList<Block> CONCRETE = ImmutableList.of(
      Blocks.WHITE_CONCRETE,
      Blocks.ORANGE_CONCRETE,
      Blocks.MAGENTA_CONCRETE,
      Blocks.LIGHT_BLUE_CONCRETE,
      Blocks.YELLOW_CONCRETE,
      Blocks.LIME_CONCRETE,
      Blocks.PINK_CONCRETE,
      Blocks.GRAY_CONCRETE,
      Blocks.LIGHT_GRAY_CONCRETE,
      Blocks.CYAN_CONCRETE,
      Blocks.PURPLE_CONCRETE,
      Blocks.BLUE_CONCRETE,
      Blocks.BROWN_CONCRETE,
      Blocks.GREEN_CONCRETE,
      Blocks.RED_CONCRETE,
      Blocks.BLACK_CONCRETE);

  private static final ImmutableList<Block> TERRACOTTA = ImmutableList.of(
      Blocks.TERRACOTTA,
      Blocks.WHITE_TERRACOTTA,
      Blocks.ORANGE_TERRACOTTA,
      Blocks.MAGENTA_TERRACOTTA,
      Blocks.LIGHT_BLUE_TERRACOTTA,
      Blocks.YELLOW_TERRACOTTA,
      Blocks.LIME_TERRACOTTA,
      Blocks.PINK_TERRACOTTA,
      Blocks.GRAY_TERRACOTTA,
      Blocks.LIGHT_GRAY_TERRACOTTA,
      Blocks.CYAN_TERRACOTTA,
      Blocks.PURPLE_TERRACOTTA,
      Blocks.BLUE_TERRACOTTA,
      Blocks.BROWN_TERRACOTTA,
      Blocks.GREEN_TERRACOTTA,
      Blocks.RED_TERRACOTTA,
      Blocks.BLACK_TERRACOTTA);

  private static final ImmutableList<Block> WOOL = ImmutableList.of(
      Blocks.WHITE_WOOL,
      Blocks.ORANGE_WOOL,
      Blocks.MAGENTA_WOOL,
      Blocks.LIGHT_BLUE_WOOL,
      Blocks.YELLOW_WOOL,
      Blocks.LIME_WOOL,
      Blocks.PINK_WOOL,
      Blocks.GRAY_WOOL,
      Blocks.LIGHT_GRAY_WOOL,
      Blocks.CYAN_WOOL,
      Blocks.PURPLE_WOOL,
      Blocks.BLUE_WOOL,
      Blocks.BROWN_WOOL,
      Blocks.GREEN_WOOL,
      Blocks.RED_WOOL,
      Blocks.BLACK_WOOL);

  public static final ImmutableList<ModBlock> CONCRETE_MOD_BLOCKS = CONCRETE.stream()
      .map(ModBlock::stoneLike)
      .collect(ImmutableList.toImmutableList());

  public static final ImmutableList<ModBlock> TERRACOTTA_MOD_BLOCKS = TERRACOTTA.stream()
      .map(ModBlock::stoneLike)
      .collect(ImmutableList.toImmutableList());

  public static final ImmutableList<ModBlock> WOOL_MOD_BLOCKS = WOOL.stream()
      .map(ModBlock::slabAndStairs)
      .collect(ImmutableList.toImmutableList());

  public static final ImmutableList<ModBlock> ALL_MOD_BLOCKS = ImmutableList.<ModBlock>builder()
      .addAll(CONCRETE_MOD_BLOCKS)
      .addAll(TERRACOTTA_MOD_BLOCKS)
      .addAll(WOOL_MOD_BLOCKS)
      .build();

  public static final void registerBlocks() {
    // Register all blocks, but grouped by block type
    ALL_MOD_BLOCKS.stream().filter(ModBlock::hasSlab).forEach(SlabsStairsBlocks::registerSlab);
    ALL_MOD_BLOCKS.stream().filter(ModBlock::hasStairs).forEach(SlabsStairsBlocks::registerStairs);
    ALL_MOD_BLOCKS.stream().filter(ModBlock::hasWall).forEach(SlabsStairsBlocks::registerWall);
    ALL_MOD_BLOCKS.stream().filter(ModBlock::hasPressurePlate).forEach(SlabsStairsBlocks::registerPressurePlate);
    ALL_MOD_BLOCKS.stream().filter(ModBlock::hasButton).forEach(SlabsStairsBlocks::registerButton);
  }

  private static final void registerSlab(ModBlock entry) {
    registerBlock(entry.getBaseId() + "_slab", entry.getSlab(), ItemGroup.BUILDING_BLOCKS);
  }

  private static final void registerStairs(ModBlock entry) {
    registerBlock(entry.getBaseId() + "_stairs", entry.getStairs(), ItemGroup.BUILDING_BLOCKS);
  }

  private static final void registerWall(ModBlock entry) {
    registerBlock(entry.getBaseId() + "_wall", entry.getWall(), ItemGroup.BUILDING_BLOCKS);
  }

  private static final void registerPressurePlate(ModBlock entry) {
    registerBlock(entry.getBaseId() + "_pressure_plate", entry.getPressurePlate(), ItemGroup.REDSTONE);
  }

  private static final void registerButton(ModBlock entry) {
    registerBlock(entry.getBaseId() + "_button", entry.getButton(), ItemGroup.REDSTONE);
  }

  private static final void registerBlock(String name, Block block, ItemGroup group) {
    Registry.register(Registry.BLOCK, new Identifier(SlabsStairsMod.MOD_ID, name), block);
    Registry.register(Registry.ITEM, new Identifier(SlabsStairsMod.MOD_ID, name),
        new BlockItem(block, new Item.Settings().group(group)));
  }
}
