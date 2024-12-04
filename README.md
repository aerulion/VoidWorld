[![Release](https://github.com/aerulion/VoidWorld/actions/workflows/release.yml/badge.svg?branch=master)](https://github.com/aerulion/VoidWorld/actions/workflows/release.yml)
![GitHub Latest Release](https://img.shields.io/github/v/release/aerulion/VoidWorld?logo=github)
# VoidWorld
**VoidWorld** is a simple and lightweight world generator plugin for [Paper](https://github.com/PaperMC/Paper). It creates completely empty worlds using the vanilla `the_void` biome, perfect for server hubs, creative builds, or custom maps. To use VoidWorld, adjust your bukkit.yml to specify it as the generator for a world or pair it with a plugin like Multiverse. No extra configuration — just a clean, blank canvas for your projects!

### Configuring the bukkit.yml File

To ensure VoidWorld handles the generation of your void worlds, it is required to update your `bukkit.yml` file. Open the file in your server directory and add the following lines at the end. Replace `world_1` and `world_2` with the names of the worlds you want to use VoidWorld for. You can list as many worlds as you need by adding more entries:
```yaml
worlds:
  world_1:
    generator: VoidWorld
  world_2:
    generator: VoidWorld
```