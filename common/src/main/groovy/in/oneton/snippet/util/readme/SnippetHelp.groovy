package in.oneton.snippet.util.readme

import groovy.transform.builder.Builder

@Builder
class SnippetHelp {
    String trigger
    String description

    @Override
    String toString() {
        return "$trigger | $description"
    }
}
