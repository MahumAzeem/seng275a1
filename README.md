# SENG 275 Te(s)tris Game - University of Victoria

This project is part of the seng 275 course at UVic and for the first assignment, the task was to add unit tests to test specific functionality and find bugs. 

## Working and Building Te(s)tris

There are various commands to help you develop your Testris game.

### Building

To create a jar SNAPSHOT, you can run:  
`./gradlew build` or, `./gradlew buildJar` (they are equivalent)

To create a versioned jar, run:  
`./gradlew releaseCurrVersion`

If you'd like to increment the version number and build a new jar, run one of:  
`./gradlew releasePatchVersion`  
`./gradlew releaseMinorVersion`  
`./gradlew releaseMajorVersion`

To read up on how semantic versioning works, check out [this source](https://semver.org/).

### Running

While developing you can use:  
`./gradlew run`  
to run the program with your current state of code.

If you already have a jar built, you can run:  
`java -jar <path_to_jar>`  
to run the prebuilt code

