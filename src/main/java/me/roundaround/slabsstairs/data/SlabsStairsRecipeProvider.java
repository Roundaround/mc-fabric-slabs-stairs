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
    SlabsStairsBlocks.ALL_MOD_BLOCKS.forEach((entry) -> {
      if (entry.hasSlab()) {
        RecipeProvider.createSlabRecipe(entry.getSlab(), Ingredient.ofItems(entry.getSource()))
            .criterion(RecipeProvider.hasItem(entry.getSource()), RecipeProvider.conditionsFromItem(entry.getSource()))
            .offerTo(exporter);
        RecipeProvider.offerStonecuttingRecipe(exporter, entry.getSlab(), entry.getSource(), 2);
      }
      if (entry.hasStairs()) {
        RecipeProvider.createStairsRecipe(entry.getStairs(), Ingredient.ofItems(entry.getSource()))
            .criterion(RecipeProvider.hasItem(entry.getSource()), RecipeProvider.conditionsFromItem(entry.getSource()))
            .offerTo(exporter);
        RecipeProvider.offerStonecuttingRecipe(exporter, entry.getStairs(), entry.getSource());
      }
      if (entry.hasWall()) {
        RecipeProvider.offerWallRecipe(exporter, entry.getWall(), entry.getSource());
        RecipeProvider.offerStonecuttingRecipe(exporter, entry.getWall(), entry.getSource());
      }
      if (entry.hasPressurePlate()) {
        RecipeProvider.offerPressurePlateRecipe(exporter, entry.getPressurePlate(), entry.getSource());
      }
      if (entry.hasButton()) {
        RecipeProvider.createTransmutationRecipe(entry.getButton(), Ingredient.ofItems(entry.getSource()))
            .criterion(RecipeProvider.hasItem(entry.getSource()), RecipeProvider.conditionsFromItem(entry.getSource()))
            .offerTo(exporter);
      }
    });
  }
}
