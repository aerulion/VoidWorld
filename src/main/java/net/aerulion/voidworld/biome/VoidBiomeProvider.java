/*
 * Copyright (c) 2024. aerulion
 * All rights reserved.
 */

package net.aerulion.voidworld.biome;

import java.util.List;
import org.bukkit.block.Biome;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.WorldInfo;
import org.jetbrains.annotations.NotNull;

/**
 * A simple {@link BiomeProvider} for just providing the {@link Biome#THE_VOID}.
 */
public class VoidBiomeProvider extends BiomeProvider {

  public static final @NotNull VoidBiomeProvider INSTANCE = new VoidBiomeProvider();

  @Override
  public @NotNull Biome getBiome(final @NotNull WorldInfo worldInfo, final int x, final int y, final int z) {
    return Biome.THE_VOID;
  }

  @Override
  public @NotNull List<Biome> getBiomes(final @NotNull WorldInfo worldInfo) {
    return List.of(Biome.THE_VOID);
  }

}