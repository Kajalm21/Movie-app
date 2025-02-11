plugins {
    id("com.android.application")
    id("org.jetbrains.kotlin.android")
}

android {
    namespace = "com.example.movieapp" // Change to your app's package name
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.movieapp"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"
    }

    // ✅ Enable Jetpack Compose
    buildFeatures {
        compose = true
    }

    // ✅ Set Compose Compiler Version
    composeOptions {
        kotlinCompilerExtensionVersion = "1.5.4"
    }

    // ✅ Java & Kotlin Compatibility Options
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_17
        targetCompatibility = JavaVersion.VERSION_17
    }

    kotlinOptions {
        jvmTarget = "17"
    }
}

dependencies {
    // Core Android libraries
    implementation("androidx.core:core-ktx:1.12.0")
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")

    // ✅ Jetpack Compose
    implementation("androidx.activity:activity-compose:1.8.2")
    implementation("androidx.compose.ui:ui:1.5.4")
    implementation("androidx.compose.ui:ui-tooling-preview:1.5.4")
    implementation("androidx.compose.material3:material3:1.2.0")

    // ✅ Navigation for Compose
    implementation("androidx.navigation:navigation-compose:2.7.7")

    // ✅ Dependency Injection (Koin)
    implementation("io.insert-koin:koin-android:3.5.3")
    implementation("io.insert-koin:koin-androidx-compose:3.5.3")

    // ✅ Networking (Retrofit & Gson)
    implementation("com.squareup.retrofit2:retrofit:2.9.0")
    implementation("com.squareup.retrofit2:converter-gson:2.9.0")

    // ✅ RxKotlin for API calls
    implementation("io.reactivex.rxjava3:rxkotlin:3.0.1")

    // ✅ Image Loading (Coil)
    implementation("io.coil-kt:coil-compose:2.5.0")

    // ✅ Testing Dependencies
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
}
