package me.roundaround.slabsstairs.data;

import java.util.function.Consumer;

import me.roundaround.slabsstairs.SlabsStairsBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.RecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.Ingredient;

public class SlabsStairsRecipeProvider extends FabricRecipeProvider {
  public SlabsStairsRecipeProvider(FabricDataGenerator dataGenerator) {
    super(dataGenerator);
  }

  @Override
  protected void generateRecipes(Consumer<RecipeJsonProvider> exporter) {
    SlabsStairsBlocks.CONCRETE_SLABS.forEach((entry) -> {
      RecipeProvider.createSlabRecipe(entry.slab, Ingredient.ofItems(entry.source))
          .criterion(RecipeProvider.hasItem(entry.source), RecipeProvider.conditionsFromItem(entry.source))
          .offerTo(exporter);
      RecipeProvider.offerStonecuttingRecipe(exporter, entry.slab, entry.source, 2);
    });

    SlabsStairsBlocks.CONCRETE_STAIRS.forEach((entry) -> {
      RecipeProvider.createStairsRecipe(entry.stairs, Ingredient.ofItems(entry.source))
          .criterion(RecipeProvider.hasItem(entry.source), RecipeProvider.conditionsFromItem(entry.source))
          .offerTo(exporter);
      RecipeProvider.offerStonecuttingRecipe(exporter, entry.stairs, entry.source);
    });

    SlabsStairsBlocks.CONCRETE_WALLS.forEach((entry) -> {
      RecipeProvider.offerWallRecipe(exporter, entry.wall, entry.source);
      RecipeProvider.offerStonecuttingRecipe(exporter, entry.wall, entry.source);
    });

    SlabsStairsBlocks.CONCRETE_PRESSURE_PLATES.forEach((entry) -> {
      RecipeProvider.offerPressurePlateRecipe(exporter, entry.pressurePlate, entry.source);
    });

    SlabsStairsBlocks.CONCRETE_BUTTONS.forEach((entry) -> {
      RecipeProvider.createTransmutationRecipe(entry.button, Ingredient.ofItems(entry.source))
          .criterion(RecipeProvider.hasItem(entry.source), RecipeProvider.conditionsFromItem(entry.source))
          .offerTo(exporter);
    });
  }
}
