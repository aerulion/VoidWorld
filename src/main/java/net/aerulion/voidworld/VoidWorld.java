/*
 * Copyright (c) 2024. aerulion
 * All rights reserved.
 */

package net.aerulion.voidworld;

import net.aerulion.voidworld.generator.VoidChunkGenerator;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * The main class of the void world plugin.
 */
public final class VoidWorld extends JavaPlugin {

  @Override
  @Contract(pure = true)
  public @NotNull ChunkGenerator getDefaultWorldGenerator(final @NotNull String worldName, final @Nullable String id) {
    return VoidChunkGenerator.INSTANCE;
  }

}