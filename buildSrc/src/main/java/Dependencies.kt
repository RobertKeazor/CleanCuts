object Version {
    val appCompat = "1.0.0"
    val constraintLayout = "2.0.0-alpha2"
    val lifecycle = "2.0.0"
    val junit = "4.12"
    val testRunner = "1.1.0-alpha4"
    val espresso = "3.1.0-alpha4"
    val arrow = "0.7.3"

}

object Deps {
    val appCompat = "androidx.appcompat:appcompat:${Version.appCompat}"
    val constraintLayout = "androidx.constraintlayout:constraintlayout:${Version.constraintLayout}"
    val lifecycle = "androidx.lifecycle:lifecycle-extensions:${Version.lifecycle}"
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

}
