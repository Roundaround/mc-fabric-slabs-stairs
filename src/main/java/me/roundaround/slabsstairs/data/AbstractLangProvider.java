package me.roundaround.slabsstairs.data;

import java.nio.file.Path;
import java.util.HashMap;
import java.util.function.BiConsumer;

import com.google.gson.Gson;

import me.roundaround.slabsstairs.SlabsStairsMod;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.DataProvider;
import net.minecraft.data.DataWriter;
import net.minecraft.util.Identifier;

public abstract class AbstractLangProvider implements DataProvider {
  private final DataGenerator.PathResolver pathResolver;
  private final Gson gson = new Gson();

  protected AbstractLangProvider(DataGenerator generator) {
    this.pathResolver = generator.createPathResolver(DataGenerator.OutputType.RESOURCE_PACK, "lang");
  }

  @Override
  public String getName() {
    return "Internationalization (lang) definitions";
  }

  @Override
  public void run(DataWriter writer) {
    HashMap<String, String> map = new HashMap<>();

    addTranslations(map::put);

    try {
      Path path = this.pathResolver.resolveJson(new Identifier(SlabsStairsMod.MOD_ID, "en_us"));
      DataProvider.writeToPath(writer, gson.toJsonTree(map), path);
    } catch (Exception e) {
      SlabsStairsMod.LOGGER.error("Couldn't write lang file", e);
    }
  }

  protected abstract void addTranslations(BiConsumer<String, String> consumer);
}
