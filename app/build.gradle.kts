plugins {
    id("com.android.application")
    id("org.sonarqube") version "3.3"
}

android {
    namespace = "com.example.lab2_matvii_sovhirenko_v1"
    compileSdk = 33

    defaultConfig {
        applicationId = "com.example.lab2_matvii_sovhirenko_v1"
        minSdk = 24
        targetSdk = 33
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
}

dependencies {
    implementation("androidx.appcompat:appcompat:1.6.1")
    implementation("com.google.android.material:material:1.9.0")
    implementation("androidx.constraintlayout:constraintlayout:2.1.4")
    testImplementation("junit:junit:4.13.2")
    androidTestImplementation("androidx.test.ext:junit:1.1.5")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.5.1")


    androidTestImplementation("org.mockito:mockito-core:3.12.4")
    androidTestImplementation("org.mockito:mockito-android:3.12.4")

    implementation("fileTree(dir: 'libs', include: ['*.jar'])")
    implementation("androidx.appcompat:appcompat:1.0.2")
    implementation("androidx.constraintlayout:constraintlayout:1.1.3")

    testImplementation("junit:junit:4.12")
    testImplementation("project(path: ':app')")
    androidTestImplementation("androidx.test:runner:1.1.1")
    androidTestImplementation("androidx.test.espresso:espresso-core:3.6.0-alpha01")

    androidTestImplementation("com.android.support.test:rules:1.0.2")
    androidTestImplementation("androidx.test.ext:junit:1.2.0-alpha01")

}

sonarqube {
    properties {
        property("sonar.projectName", "TestingExample")
        property("sonar.projectKey", "TestingExample")
        property("sonar.sourceEncoding", "UTF-8")
        property("sonar.sources", "src/main/java")
        property("sonar.exclusions",
                """
            **/*Test*/**,
            *.json,
            **/*test*/**,
            **/.gradle/**,
            **/R.class
            """
        )
        property("sonar.tests", "src/test/java")
    }
}



