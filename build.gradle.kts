import com.soywiz.korge.gradle.*

plugins {
	alias(libs.plugins.korge)
}



dependencies {
    add("commonMainApi", project(":deps"))
    //add("commonMainApi", project(":korge-dragonbones"))
}

apply<KorgeGradlePlugin>()
korge {
    id = "com.example.puzzle2048"
    name = "2048"
}
