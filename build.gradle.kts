buildscript {
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:1.5.21")
        classpath("com.vanniktech:gradle-maven-publish-plugin:0.17.0")
    }
}

allprojects {
    repositories {
        google()
        mavenCentral()
        mavenLocal()
    }
}
