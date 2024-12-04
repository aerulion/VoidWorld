import net.minecrell.pluginyml.bukkit.BukkitPluginDescription

plugins {
    `java-library`
    id("net.minecrell.plugin-yml.paper") version "0.6.0"
    id("maven-publish")
}

group = "net.aerulion"

java {
    toolchain.languageVersion.set(JavaLanguageVersion.of(21))
    withSourcesJar()
    withJavadocJar()
}

repositories {
    mavenLocal()
    maven {
        url = uri("https://papermc.io/repo/repository/maven-public/")
    }
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.21.3-R0.1-SNAPSHOT")
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
            "https://jd.papermc.io/paper/1.21.3/",
            "https://jd.advntr.dev/api/4.17.0/"
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
    apiVersion = "1.21.3"
}