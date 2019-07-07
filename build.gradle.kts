import org.asciidoctor.gradle.jvm.AsciidoctorTask

plugins {
    id("org.asciidoctor.jvm.base") version "2.0.0"
    id("org.asciidoctor.jvm.convert") version "2.0.0"
}

version = "0.0.1"

repositories {
    mavenLocal()
    jcenter()
}

tasks {
    "asciidoctor"(AsciidoctorTask::class) {
        asciidoctorj {
            setDiagramVersion("1.5.16")
        }

        outputOptions {
            setBackends(setOf("html5"))
        }
        setSourceDir(file("docs"))
    }
}

defaultTasks("clean", "asciidoctor")
