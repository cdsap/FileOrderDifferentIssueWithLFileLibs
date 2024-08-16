pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {

    repositories {
        google()
        mavenCentral()
    }
}

rootProject.name = "My Application"

plugins {
    id("com.gradle.develocity") version "3.17.4"
}

develocity {
    server = "http://ge.solutions-team.gradle.com"
    allowUntrustedServer = true
    buildScan {
        uploadInBackground.set(false)
        publishing { true}
    }
}
include(":app")
