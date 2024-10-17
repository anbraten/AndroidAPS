plugins {
    alias(libs.plugins.android.library)
    id("kotlin-android")
    id("android-module-dependencies")
}

android {
    namespace = "app.aaps.core.ui"
    defaultConfig {
        minSdk = Versions.wearMinSdk
    }
}

dependencies {
    api(Libs.AndroidX.core)
    api(Libs.AndroidX.appCompat)
    api(Libs.AndroidX.preference)
    api(Libs.AndroidX.gridLayout)


    api(libs.com.google.android.material)

    api(libs.com.google.dagger.android)
    api(libs.com.google.dagger.android.support)
}