1. Run `in.oneton.snippet.util.intellij.RegeneratePlugin` with `<path>/bootstrap4-snippets/intellij` as the working directory in order to trigger plugin regenration
2. Launch test instance of intellij with plugin by running `./gradlew :intellij:clean :intellij:regenerate :intellij:buildPlugin :intellij:runIde` for testing locally
