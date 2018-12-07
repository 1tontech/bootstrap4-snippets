package in.oneton.snippet.util.vscode

import com.fasterxml.jackson.databind.ObjectMapper
import in.oneton.snippet.util.Snippet

import java.util.function.Function
import java.util.stream.Collectors

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT
import static in.oneton.snippet.util.Util.*

class SnippetGenerator {

    static void generateAll(String snippetsRelPath, Function<String, String> templateStrTransformer) {
        List<Snippet> snippets = bootstrapDescriptionToSnippet(snippetsRelPath + "/bootstrap/", templateStrTransformer)

        // Font Awesome 4
        snippets.addAll(fontAwesome4DescriptionToSnippet(snippetsRelPath + "/font-awesome4-icons.yml", templateStrTransformer))

        // Font Awesome 5 Free
        snippets.addAll(fontAwesome5FreeDescriptionToSnippet(snippetsRelPath + "/font-awesome5-icons-free.yml", templateStrTransformer))

        // Font Awesome 5 Pro
        snippets.addAll(fontAwesome5ProDescriptionToSnippet(snippetsRelPath + "/font-awesome5-icons-pro.yml", templateStrTransformer))

        Map<String, Snippet> snippetTriggerToSnippet = snippets.stream().collect(Collectors.toMap({snippet -> snippet.trigger}, {it}))

        ObjectMapper mapper = new ObjectMapper()
        mapper.enable(INDENT_OUTPUT)
        File file = new File("snippets.json")

        mapper.writeValue(file, snippetTriggerToSnippet)
        println "Regenerated snippets. Saved to ${file.absolutePath}"
    }

}
