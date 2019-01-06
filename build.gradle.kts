import com.google.protobuf.gradle.*
import groovy.lang.GroovyObject
import org.jetbrains.kotlin.gradle.dsl.KotlinCompile
import org.jfrog.gradle.plugin.artifactory.dsl.PublisherConfig

plugins {
    idea
    java
    `java-library`
    `maven-publish`
    kotlin("jvm") version "1.3.10"
    id("com.google.protobuf") version "0.8.7"
    id("io.spring.dependency-management") version "1.0.6.RELEASE"
    id("com.jfrog.artifactory") version "4.8.1"
    id("com.gradle.build-scan") version "1.16"
}

buildScan {
    setTermsOfServiceUrl("https://gradle.com/terms-of-service")
    setTermsOfServiceAgree("yes")
    publishAlways()
}

group = "io.imulab.x"
version = "0.2.5"

repositories {
    maven(url = "https://artifactory.imulab.io/artifactory/gradle-dev-local/")
    jcenter()
    mavenCentral()
}

tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile>().all {
    kotlinOptions {
        jvmTarget = "1.8"
        sourceCompatibility = "1.8"
        targetCompatibility = "1.8"
        freeCompilerArgs = listOf()
    }
}

tasks.register<Jar>("sourcesJar") {
    from(sourceSets["main"].allSource)
    classifier = "sources"
}

tasks.withType<Test>().all {
    useJUnitPlatform()
}

protobuf.protobuf.run {
    protoc {
        artifact = "com.google.protobuf:protoc:3.6.1"
    }
    plugins {
        id("grpc") {
            artifact = "io.grpc:protoc-gen-grpc-java:1.15.1"
        }
    }
    generateProtoTasks {
        ofSourceSet("main").forEach {
            it.plugins {
                id("grpc")
            }
        }
    }
    generatedFilesBaseDir = "$projectDir/src/generated"
}

publishing {
    publications {
        create<MavenPublication>("astrea-commons") {
            groupId = project.group.toString()
            artifactId = project.name
            version = project.version.toString()
            from(components["java"])
            artifact(tasks["sourcesJar"])
            pom {
                name.set(artifactId)
                developers {
                    developer {
                        id.set("imulab")
                        name.set("Weinan Qiu")
                        email.set("davidiamyou@gmail.com")
                    }
                }
            }
        }
    }
}

artifactory {
    setContextUrl(System.getenv("ARTIFACTORY_CONTEXT_URL") ?: "https://artifactory.imulab.io/artifactory")
    publish(delegateClosureOf<PublisherConfig> {
        repository(delegateClosureOf<GroovyObject> {
            setProperty("repoKey", System.getenv("ARTIFACTORY_REPO") ?: "gradle-dev-local")
            setProperty("username", System.getenv("ARTIFACTORY_USERNAME") ?: "imulab")
            setProperty("password", System.getenv("ARTIFACTORY_PASSWORD") ?: "changeme")
            setProperty("maven", true)
        })
        defaults(delegateClosureOf<GroovyObject> {
            invokeMethod("publications", "astrea-commons")
        })
    })
}

dependencyManagement {
    imports {
        mavenBom("io.imulab.x:astrea-dependencies:4")
    }
}

dependencies {
    implementation(kotlin("stdlib-jdk8"))
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core")
    api("io.imulab.x:oidc-sdk:0.2.0")
    implementation("com.google.protobuf:protobuf-java")
    implementation("io.grpc:grpc-stub")
    implementation("io.grpc:grpc-protobuf")
    implementation("io.github.resilience4j:resilience4j-circuitbreaker")
    implementation("io.github.resilience4j:resilience4j-retry")
    implementation("org.slf4j:slf4j-api")
    implementation("com.github.ben-manes.caffeine:caffeine")

    testImplementation("io.kotlintest:kotlintest-runner-junit5")
    testImplementation("com.nhaarman.mockitokotlin2:mockito-kotlin")
    testRuntime("org.apache.logging.log4j:log4j-api")
    testRuntime("org.apache.logging.log4j:log4j-core")
    testRuntime("org.apache.logging.log4j:log4j-slf4j-impl")
}