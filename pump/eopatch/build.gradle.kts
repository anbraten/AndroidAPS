plugins {
    alias(libs.plugins.android.library)
    id("kotlin-android")
    id("kotlin-kapt")
    id("android-module-dependencies")
    id("test-module-dependencies")
    id("jacoco-module-dependencies")
}

android {
    namespace = "info.nightscout.androidaps.plugins.pump.eopatch"
    buildFeatures {
        dataBinding = true
    }
}

dependencies {
    implementation(project(":core:data"))
    implementation(project(":core:interfaces"))
    implementation(project(":core:libraries"))
    implementation(project(":core:utils"))
    implementation(project(":core:ui"))
    implementation(project(":pump:eopatch-core"))

    api(libs.com.google.guava)

    //RxAndroidBle
    api(libs.io.reactivex.rxjava3.rxandroid)
    api(Libs.rxandroidBle)
    api(Libs.rx3ReplayingShare)

    kapt(libs.com.google.dagger.compiler)
    kapt(libs.com.google.dagger.android.processor)
}