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

  public static final ImmutableList<ModBlock> CONCRETE_MOD_BLOCKS = CONCRETE.stream()
      .map(ModBlock::everything)
      .collect(ImmutableList.toImmutableList());

  public static final ImmutableList<ModBlock> TERRACOTTA_MOD_BLOCKS = TERRACOTTA.stream()
      .map(ModBlock::everything)
      .collect(ImmutableList.toImmutableList());

  public static final ImmutableList<ModBlock> ALL_MOD_BLOCKS = ImmutableList.<ModBlock>builder()
      .addAll(CONCRETE_MOD_BLOCKS)
      .addAll(TERRACOTTA_MOD_BLOCKS)
      .build();

  public static final void registerBlocks() {
    ALL_MOD_BLOCKS.forEach(SlabsStairsBlocks::registerModBlock);
  }

  private static final void registerModBlock(ModBlock entry) {
    String baseName = entry.getBaseId();

    if (entry.hasSlab()) {
      registerBlock(baseName + "_slab", entry.getSlab());
    }
    if (entry.hasStairs()) {
      registerBlock(baseName + "_stairs", entry.getStairs());
    }
    if (entry.hasWall()) {
      registerBlock(baseName + "_wall", entry.getWall());
    }
    if (entry.hasPressurePlate()) {
      registerBlock(baseName + "_pressure_plate", entry.getPressurePlate(), ItemGroup.REDSTONE);
    }
    if (entry.hasButton()) {
      registerBlock(baseName + "_button", entry.getButton(), ItemGroup.REDSTONE);
    }
  }

  private static final void registerBlock(String name, Block block) {
    registerBlock(name, block, ItemGroup.BUILDING_BLOCKS);
  }

  private static final void registerBlock(String name, Block block, ItemGroup group) {
    Registry.register(Registry.BLOCK, new Identifier(SlabsStairsMod.MOD_ID, name), block);
    Registry.register(Registry.ITEM, new Identifier(SlabsStairsMod.MOD_ID, name),
        new BlockItem(block, new Item.Settings().group(group)));
  }
}
