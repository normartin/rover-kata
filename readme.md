# Mars rover kata

This project implements Kotlin API to control a mars rover via simple command strings.
Ignoring unknown commands of now.

For sample usage see _src/main/kotlin/mm/kata/rover/marsrover/MarsRoverDemoApplication.kt_

## Requirements

- Java version >= 11 (check `java -version`)

## Build

```bash
./gradlew shadowJar
```

will create the application jar file in _build/libs/mars-rover-XXX-all.jar_

## Run

```bash
java -jar build/libs/mars-rover-0.0.1-SNAPSHOT-all.jar
```

This runs the application executing a demo scenario.

## Execute test with coverage

```bash
./gradlew jacocoTestCoverageVerification
```
## Develop

I recommend to use IntelliJ Idea.
Just open the directory containing the project and Idea should setup the project. 
