import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.5.5"
	id("io.spring.dependency-management") version "1.0.11.RELEASE"
	kotlin("jvm") version "1.5.31"
	kotlin("plugin.spring") version "1.5.31"
}

group = "com.diogobotas"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_11

repositories {
	mavenCentral()
}

// TODO separate dependencies by package, sort them
dependencies {
	// TODO uncomment when MongoDB is set up
	// implementation("org.springframework.boot:spring-boot-starter-data-mongodb-reactive:2.5.4")
	implementation("org.springframework.boot:spring-boot-starter-webflux:2.5.5")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin:2.12.5")
	implementation("io.projectreactor.kotlin:reactor-kotlin-extensions:1.1.4")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	implementation("org.jetbrains.kotlinx:kotlinx-coroutines-reactor:1.5.2-native-mt")
	implementation("org.springframework.boot:spring-boot-gradle-plugin:2.5.5")

	testImplementation("org.springframework.boot:spring-boot-starter-test:2.5.5")
	testImplementation("io.projectreactor:reactor-test:3.4.10")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "11"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
