import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    `java-library`
    id("de.eldoria.plugin-yml.paper") version "0.7.1"
    id("maven-publish")
}

// Version constants
val javaVersion = 21
val minecraftVersion = "1.21.7"
val adventureVersion = "4.23.0"

group = "net.aerulion"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(javaVersion))
    withSourcesJar()
    withJavadocJar()
}

repositories {
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:$minecraftVersion-R0.1-SNAPSHOT")
    compileOnly("org.jetbrains:annotations:26.0.1")
}

tasks {
    compileJava {
        options.encoding = Charsets.UTF_8.name()
        options.release.set(21)
    }
    javadoc {
        options.encoding = Charsets.UTF_8.name()
        (options as StandardJavadocDocletOptions).links(
            "https://jd.papermc.io/paper/$minecraftVersion/",
            "https://jd.advntr.dev/api/$adventureVersion/"
        )
    }
    processResources {
        filteringCharset = Charsets.UTF_8.name()
    }
    reckonTagCreate {
        dependsOn(check)
    }
    publish {
        dependsOn(reckonTagPush)
    }
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            groupId = "net.aerulion"
            artifactId = "voidworld"
            from(components["java"])
        }
    }
    repositories {
        maven {
            name = "GitHubPackages"
            url = uri("https://maven.pkg.github.com/aerulion/voidworld")
            credentials {
                username = System.getenv("GITHUB_ACTOR")
                password = System.getenv("GITHUB_TOKEN")
            }
        }
    }
}

paper {
    name = "VoidWorld"
    main = "net.aerulion.voidworld.VoidWorld"
    version = getVersion().toString()
    load = BukkitPluginDescription.PluginLoadOrder.STARTUP
    authors = listOf("aerulion")
    apiVersion = minecraftVersion
}