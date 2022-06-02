import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.6.20"
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(project(":flarscript"))
}

tasks.getByName<Test>("test") {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	kotlinOptions.jvmTarget = "1.8"
}
