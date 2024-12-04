pluginManagement {
    repositories {
        gradlePluginPortal()
        maven("https://papermc.io/repo/repository/maven-public/")
    }
}

plugins {
    id("org.ajoberstar.reckon.settings") version "0.19.1"
}

rootProject.name = "VoidWorld"

var reckon = (extensions.getByName("reckon") as org.ajoberstar.reckon.gradle.ReckonExtension)
reckon.snapshots()
reckon.setScopeCalc(reckon.calcScopeFromProp().or(reckon.calcScopeFromCommitMessages()))
reckon.setStageCalc(reckon.calcStageFromProp())
reckon.setDefaultInferredScope("minor")
reckon.setTagWriter { version: org.ajoberstar.reckon.core.Version? -> "v$version" }