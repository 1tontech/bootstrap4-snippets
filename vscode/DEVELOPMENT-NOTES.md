1. Run `in.oneton.snippet.util.vscode.RegeneratePlugin` with `<path>/bootstrap4-snippets/vscode` as the working directory in order to trigger plugin regenration
2. Actual extension `*.vsix` can be created by running `./gradlew :vscode:clean :vscode:regenerate && cd vscode && vsce package && cd ..`
