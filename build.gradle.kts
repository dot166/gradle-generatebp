/*
 * SPDX-FileCopyrightText: 2023-2024 The LineageOS Project 2024 ._______166
 * SPDX-License-Identifier: Apache-2.0
 */

group = "org.lineageos"
version = "1.13.1 - MOD"

plugins {
    `kotlin-dsl`
    `maven-publish`
}

repositories {
    mavenCentral()
}

kotlin {
    jvmToolchain(17)
}

publishing {
    publications {
        create<MavenPublication>("pluginMaven") {
            pom {
                name.set(rootProject.name)
                url.set("https://github.com/dot166/gradle-generatebp")

                licenses {
                    license {
                        name.set("The Apache Software License, Version 2.0")
                        url.set("http://www.apache.org/licenses/LICENSE-2.0.txt")
                    }
                }

                developers {
                    developer {
                        name.set("The LineageOS Project")
                        url.set("https://lineageos.org")
                    }
                    developer {
                        name.set("._______166")
                        url.set("https://dot166.github.io")
                    }
                }
            }
        }
    }
}

tasks.withType<AbstractArchiveTask>().configureEach {
    isPreserveFileTimestamps = false
    isReproducibleFileOrder = true
}
