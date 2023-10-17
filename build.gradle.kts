// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id("com.android.application") version "8.2.0-alpha03" apply false
    id("org.jetbrains.kotlin.android") version "1.8.10" apply false
    id("org.sonarqube") version "4.2.1.3168"
}

sonar {
    properties {
        property("sonar.projectKey", "xmethos_BasicsCodelab_AYs_D4E-STckWwAXsmm1")
        property("sonar.projectName", "BasicsCodelab")
    }
}