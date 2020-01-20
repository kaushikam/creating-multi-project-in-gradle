plugins {
    java
    application
}

tasks.distZip {
    from(project(":docs").tasks["asciidoctor"]) {
        into("${project.name}-$version")
    }
}

tasks.distTar {
    from(project(":docs").tasks["asciidoctor"]) {
        into("${project.name}-$version")
    }
}

application {
    mainClassName="greeter.Greeter"
}

dependencies {
    compile(project(":greeting-library"))
}