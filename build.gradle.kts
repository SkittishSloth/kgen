plugins {
  java
  id("org.jetbrains.kotlin.jvm") version "1.3.72" apply false
}

subprojects {
  apply<JavaPlugin>()
  apply(plugin = "org.jetbrains.kotlin.jvm")

  repositories {
    // Use jcenter for resolving dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    mavenCentral()
    maven(url = "https://jitpack.io")
  }

  dependencies {
    // Align versions of all Kotlin components
    implementation(platform("org.jetbrains.kotlin:kotlin-bom"))

    // Use the Kotlin JDK 8 standard library.
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")

    // Kotlin coroutine-based event bus.
    implementation("com.github.adrielcafe.broker:broker-core:1.1.0")

    // Use the Kotlin test library.
    testImplementation("org.jetbrains.kotlin:kotlin-test")

    // Use the Kotlin JUnit integration.
    testImplementation("org.jetbrains.kotlin:kotlin-test-junit")
  }
}