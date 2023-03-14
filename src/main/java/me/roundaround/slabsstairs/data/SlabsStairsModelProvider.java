package me.roundaround.slabsstairs.data;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

import com.google.gson.JsonElement;

import me.roundaround.slabsstairs.SlabsStairsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.block.Block;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.BlockStateSupplier;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.ModelIds;
import net.minecraft.data.client.Models;
import net.minecraft.data.client.TexturedModel;
import net.minecraft.util.Identifier;

public class SlabsStairsModelProvider extends FabricModelProvider {
  public SlabsStairsModelProvider(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
    SlabsStairsBlocks.CONCRETE_SLABS.forEach((entry) -> {
      registerSlab(entry.slab, entry.source, blockStateModelGenerator);
    });

    SlabsStairsBlocks.CONCRETE_STAIRS.forEach((entry) -> {
      registerStairs(entry.stairs, entry.source, blockStateModelGenerator);
    });

    SlabsStairsBlocks.CONCRETE_WALLS.forEach((entry) -> {
      registerWall(entry.wall, entry.source, blockStateModelGenerator);
    });

    SlabsStairsBlocks.CONCRETE_PRESSURE_PLATES.forEach((entry) -> {
      registerPressurePlate(entry.pressurePlate, entry.source, blockStateModelGenerator);
    });

    SlabsStairsBlocks.CONCRETE_BUTTONS.forEach((entry) -> {
      registerButton(entry.button, entry.source, blockStateModelGenerator);
    });
  }

  @Override
  public void generateItemModels(ItemModelGenerator itemModelGenerator) {
  }

  private void registerSlab(
      Block slab,
      Block full,
      BlockStateModelGenerator blockStateModelGenerator) {
    Consumer<BlockStateSupplier> blockStateCollector = blockStateModelGenerator.blockStateCollector;
    BiConsumer<Identifier, Supplier<JsonElement>> modelCollector = blockStateModelGenerator.modelCollector;

    TexturedModel texturedModel = TexturedModel.CUBE_ALL.get(full);
    Identifier slabId = Models.SLAB.upload(slab, texturedModel.getTextures(), modelCollector);
    Identifier slabTopId = Models.SLAB_TOP.upload(slab, texturedModel.getTextures(), modelCollector);
    blockStateCollector.accept(BlockStateModelGenerator.createSlabBlockState(
        slab,
        slabId,
        slabTopId,
        ModelIds.getBlockModelId(full)));

    blockStateModelGenerator.registerParentedItemModel(slab, slabId);
  }

  private void registerStairs(
      Block stairs,
      Block full,
      BlockStateModelGenerator blockStateModelGenerator) {
    Consumer<BlockStateSupplier> blockStateCollector = blockStateModelGenerator.blockStateCollector;
    BiConsumer<Identifier, Supplier<JsonElement>> modelCollector = blockStateModelGenerator.modelCollector;

    TexturedModel texturedModel = TexturedModel.CUBE_ALL.get(full);
    Identifier stairsId = Models.STAIRS.upload(stairs, texturedModel.getTextures(), modelCollector);
    Identifier stairsInnerId = Models.INNER_STAIRS.upload(stairs, texturedModel.getTextures(), modelCollector);
    Identifier stairsOuterId = Models.OUTER_STAIRS.upload(stairs, texturedModel.getTextures(), modelCollector);
    blockStateCollector.accept(BlockStateModelGenerator.createStairsBlockState(
        stairs,
        stairsInnerId,
        stairsId,
        stairsOuterId));

    blockStateModelGenerator.registerParentedItemModel(stairs, stairsId);
  }

  private void registerWall(
      Block wall,
      Block full,
      BlockStateModelGenerator blockStateModelGenerator) {
    Consumer<BlockStateSupplier> blockStateCollector = blockStateModelGenerator.blockStateCollector;
    BiConsumer<Identifier, Supplier<JsonElement>> modelCollector = blockStateModelGenerator.modelCollector;

    TexturedModel texturedModel = TexturedModel.CUBE_ALL.get(full);
    Identifier wallPostId = Models.TEMPLATE_WALL_POST.upload(wall, texturedModel.getTextures(), modelCollector);
    Identifier wallLowId = Models.TEMPLATE_WALL_SIDE.upload(wall, texturedModel.getTextures(), modelCollector);
    Identifier wallTallId = Models.TEMPLATE_WALL_SIDE_TALL.upload(wall, texturedModel.getTextures(), modelCollector);
    blockStateCollector.accept(BlockStateModelGenerator.createWallBlockState(
        wall,
        wallPostId,
        wallLowId,
        wallTallId));

    Identifier inventoryId = Models.WALL_INVENTORY.upload(wall, texturedModel.getTextures(), modelCollector);
    blockStateModelGenerator.registerParentedItemModel(wall, inventoryId);
  }

  private void registerPressurePlate(
      Block pressurePlate,
      Block full,
      BlockStateModelGenerator blockStateModelGenerator) {
    Consumer<BlockStateSupplier> blockStateCollector = blockStateModelGenerator.blockStateCollector;
    BiConsumer<Identifier, Supplier<JsonElement>> modelCollector = blockStateModelGenerator.modelCollector;

    TexturedModel texturedModel = TexturedModel.CUBE_ALL.get(full);
    Identifier pressurePlateUpId = Models.PRESSURE_PLATE_UP.upload(pressurePlate, texturedModel.getTextures(),
        modelCollector);
    Identifier pressurePlateDownId = Models.PRESSURE_PLATE_DOWN.upload(pressurePlate, texturedModel.getTextures(),
        modelCollector);
    blockStateCollector.accept(BlockStateModelGenerator.createPressurePlateBlockState(
        pressurePlate,
        pressurePlateUpId,
        pressurePlateDownId));
  }

  private void registerButton(Block button, Block full, BlockStateModelGenerator blockStateModelGenerator) {
    Consumer<BlockStateSupplier> blockStateCollector = blockStateModelGenerator.blockStateCollector;
    BiConsumer<Identifier, Supplier<JsonElement>> modelCollector = blockStateModelGenerator.modelCollector;

    TexturedModel texturedModel = TexturedModel.CUBE_ALL.get(full);
    Identifier buttonId = Models.BUTTON.upload(button, texturedModel.getTextures(), modelCollector);
    Identifier buttonPressedId = Models.BUTTON_PRESSED.upload(button, texturedModel.getTextures(), modelCollector);
    blockStateCollector.accept(BlockStateModelGenerator.createButtonBlockState(
        button,
        buttonId,
        buttonPressedId));

    Identifier inventoryId = Models.BUTTON_INVENTORY.upload(button, texturedModel.getTextures(), modelCollector);
    blockStateModelGenerator.registerParentedItemModel(button, inventoryId);
  }
}
