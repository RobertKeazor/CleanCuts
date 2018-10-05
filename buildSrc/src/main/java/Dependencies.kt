object Version {
    val appCompat = "1.0.0"
    val constraintLayout = "2.0.0-alpha2"
    val lifecycle = "2.0.0"

    val junit = "4.12"
    val testRunner = "1.1.0-alpha4"
    val espresso = "3.1.0-alpha4"
    val arrow = "0.7.3"
    val nav = "1.0.0-alpha06"

}

object Deps {
    val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Version.lifecycle}"
    val lifecycle_anonatate = "androidx.lifecycle:lifecycle-compiler:${Version.lifecycle}"
    val lifecycle_streams = "android.arch.lifecycle:reactivestreams:${Version.lifecycle}"
    val lifecycle_testing = "android.arch.core:core-testing:${Version.lifecycle}"
    val junit = "junit:junit:${Version.junit}"
    val testRunner = "androidx.test:runner:${Version.testRunner}"
    val espresso = "androidx.test.espresso:espresso-core:${Version.espresso}"
    val arrowCore = "io.arrow-kt:arrow-core:${Version.arrow}"
    val arrowTypeClass = "io.arrow-kt:arrow-typeclasses:${Version.arrow}"
    val arrowSyntax = "io.arrow-kt:arrow-syntax:${Version.arrow}"
    val arrowData = "io.arrow-kt:arrow-data:${Version.arrow}"
    val arrowInstanceCore = "io.arrow-kt:arrow-instances-core:${Version.arrow}"
    val arrowInstanceData = "io.arrow-kt:arrow-instances-data:${Version.arrow}"
    val arrowAnontations = "io.arrow-kt:arrow-annotations-processor:${Version.arrow}"
    val nav_fragment = "android.arch.navigation:navigation-fragment:${Version.nav}"
    val nav_ui = "android.arch.navigation:navigation-ui:${Version.nav}"
    val nav_testing = "android.arch.navigation:navigation-testing:${Version.nav}"
}
