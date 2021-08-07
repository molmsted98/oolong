plugins {
    kotlin("multiplatform")
    id("com.vanniktech.maven.publish")
}

kotlin {
    jvm()

    js {
        browser()
        nodejs()
    }

    ios()
    tvos()
    watchos()

    linuxX64()
    macosX64()
    mingwX64()

    sourceSets {
        val commonMain by getting {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:1.5.1-native-mt") {
                    version {
                        strictly("1.5.1-native-mt")
                    }
                }
            }
        }
    }
}

tasks.withType(Sign::class) {
    enabled = false
}
