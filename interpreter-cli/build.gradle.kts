import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	kotlin("jvm") version "1.6.20"
}

repositories {
	mavenCentral()
}

dependencies {
	implementation(kotlin("stdlib-jdk8"))

	implementation(project(":flarscript"))
}

tasks.jar {
	dependsOn(":flarscript:jar")
	dependsOn(":grammar:jar")

	duplicatesStrategy = DuplicatesStrategy.EXCLUDE

	manifest {
		attributes["Main-Class"] = "flarscript.cli.LauncherKt"
	}

	from(*configurations.runtimeClasspath.files.map { if (it.isDirectory()) it else zipTree(it) }.toTypedArray())

}

tasks.getByName<Test>("test") {
	useJUnitPlatform()
}

tasks.withType<KotlinCompile> {
	dependsOn(":flarscript:compileKotlin")
	kotlinOptions.jvmTarget = "1.8"
}
