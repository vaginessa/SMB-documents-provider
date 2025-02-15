plugins {
    id(Deps.App.libraryPlugin)
    id(Deps.App.kotlinAndroidPlugin)
}

android {
    compileSdk = Deps.compileSdkVersion

    defaultConfig {
        minSdk = Deps.minSdkVersion
        targetSdk = Deps.targetSdkVersion

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
        consumerProguardFiles("consumer-rules.pro")
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
}

dependencies {
    implementation(Deps.Util.timber)
}