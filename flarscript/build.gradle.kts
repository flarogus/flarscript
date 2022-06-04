import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.6.20"
}

group = "com.github.mnemotechnician"
version = "1.0-SNAPSHOT"

repositories {
	mavenCentral()
}

dependencies {
	// for some reason, it is ignored by the kotlin compiler
	compileOnly("org.antlr:antlr4-runtime:4.10.1")

	implementation(project(":grammar"))

	testImplementation(project(":grammar"))
	testImplementation(kotlin("test"))
}

tasks.test {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	dependsOn(":grammar:compileJava")
	kotlinOptions.jvmTarget = "1.8"
}
