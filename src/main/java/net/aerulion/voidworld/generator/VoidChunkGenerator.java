/*
 * Copyright (c) 2024. aerulion
 * All rights reserved.
 */

package net.aerulion.voidworld.generator;

import java.util.Random;
import net.aerulion.voidworld.biome.VoidBiomeProvider;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.generator.WorldInfo;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * A simple {@link ChunkGenerator} for generating an empty world.
 */
@SuppressWarnings("RedundantMethodOverride")
public class VoidChunkGenerator extends ChunkGenerator {

  public static final @NotNull VoidChunkGenerator INSTANCE = new VoidChunkGenerator();

  @Override
  public @Nullable BiomeProvider getDefaultBiomeProvider(final @NotNull WorldInfo worldInfo) {
    return VoidBiomeProvider.INSTANCE;
  }

  @Override
  public boolean shouldGenerateNoise() {
    return false;
  }

  @Override
  public boolean shouldGenerateNoise(final @NotNull WorldInfo worldInfo, final @NotNull Random random, final int chunkX,
      final int chunkZ) {
    return false;
  }

  @Override
  public boolean shouldGenerateSurface() {
    return false;
  }

  @Override
  public boolean shouldGenerateSurface(final @NotNull WorldInfo worldInfo, final @NotNull Random random,
      final int chunkX, final int chunkZ) {
    return false;
  }

  @Override
  public boolean shouldGenerateCaves() {
    return false;
  }

  @Override
  public boolean shouldGenerateCaves(final @NotNull WorldInfo worldInfo, final @NotNull Random random, final int chunkX,
      final int chunkZ) {
    return false;
  }

  @Override
  public boolean shouldGenerateDecorations() {
    return false;
  }

  @Override
  public boolean shouldGenerateDecorations(final @NotNull WorldInfo worldInfo, final @NotNull Random random,
      final int chunkX, final int chunkZ) {
    return false;
  }

  @Override
  public boolean shouldGenerateMobs() {
    return false;
  }

  @Override
  public boolean shouldGenerateMobs(final @NotNull WorldInfo worldInfo, final @NotNull Random random, final int chunkX,
      final int chunkZ) {
    return false;
  }

  @Override
  public boolean shouldGenerateStructures() {
    return false;
  }

  @Override
  public boolean shouldGenerateStructures(final @NotNull WorldInfo worldInfo, final @NotNull Random random,
      final int chunkX, final int chunkZ) {
    return false;
  }

}