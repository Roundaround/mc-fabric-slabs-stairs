package me.roundaround.slabsstairs;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.block.PressurePlateBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.StoneButtonBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.util.registry.Registry;

public class ModBlock {
  private final String baseId;
  private final Block source;
  private final Block slab;
  private final Block stairs;
  private final Block wall;
  private final Block pressurePlate;
  private final Block button;

  private ModBlock(
      Block source,
      Block slab,
      Block stairs,
      Block wall,
      Block pressurePlate,
      Block button) {
    this.baseId = Registry.BLOCK.getId(source).getPath();
    this.source = source;
    this.slab = slab;
    this.stairs = stairs;
    this.wall = wall;
    this.pressurePlate = pressurePlate;
    this.button = button;
  }

  public static ModBlock everything(Block source) {
    return new ModBlock(
        source,
        new SlabBlock(AbstractBlock.Settings.copy(source)),
        new StairsBlock(source.getDefaultState(), AbstractBlock.Settings.copy(source)),
        new WallBlock(AbstractBlock.Settings.copy(source)),
        new PressurePlateBlock(PressurePlateBlock.ActivationRule.MOBS,
            AbstractBlock.Settings.copy(source)
                .requiresTool()
                .noCollision()
                .strength(0.5f)),
        new StoneButtonBlock(AbstractBlock.Settings.of(Material.DECORATION).noCollision().strength(0.5f)));
  }

  public String getBaseId() {
    return baseId;
  }

  public Block getSource() {
    return source;
  }

  public boolean hasSlab() {
    return slab != null;
  }

  public Block getSlab() {
    return slab;
  }

  public boolean hasStairs() {
    return stairs != null;
  }

  public Block getStairs() {
    return stairs;
  }

  public boolean hasWall() {
    return wall != null;
  }

  public Block getWall() {
    return wall;
  }

  public boolean hasPressurePlate() {
    return pressurePlate != null;
  }

  public Block getPressurePlate() {
    return pressurePlate;
  }

  public boolean hasButton() {
    return button != null;
  }

  public Block getButton() {
    return button;
  }
}
