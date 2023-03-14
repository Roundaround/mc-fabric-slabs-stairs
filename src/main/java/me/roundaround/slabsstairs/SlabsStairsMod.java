package me.roundaround.slabsstairs;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import net.fabricmc.api.ModInitializer;

public final class SlabsStairsMod implements ModInitializer {
  public static final String MOD_ID = "slabsstairs";
  public static final Logger LOGGER = LogManager.getLogger(MOD_ID);

  @Override
  public void onInitialize() {
    SlabsStairsBlocks.registerBlocks();
  }
}
