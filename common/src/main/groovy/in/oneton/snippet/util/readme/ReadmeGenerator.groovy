package in.oneton.snippet.util.readme

import in.oneton.snippet.util.Snippet
import org.apache.commons.io.IOUtils

import java.util.function.Function
import java.util.regex.Matcher

import static in.oneton.snippet.util.Util.*
import static java.nio.charset.Charset.defaultCharset
import static java.util.regex.Pattern.compile

class ReadmeGenerator {

    static SNIPPET_PATTERN = compile(/(?<triggerPrefix>[^-]+)-(?<actual>.+)/)

    static void generate(File saveTo, String snippetsRelPath, boolean targetsVscode, String version, Function<String, String> templateStrTransformer = { val -> val }) {
        StringWriter readmeContentWriter = new StringWriter()
        IOUtils.copy(getClass().getResourceAsStream("/readme-template.md"), readmeContentWriter, defaultCharset())
        String readmeContent = readmeContentWriter.toString()

        if (targetsVscode) {
            readmeContent = readmeContent.replaceAll(/help\.gif/, "https://github.com/1tontech/bootstrap4-snippets/raw/vscode-${version}/vscode/help.gif")
        } else {
            readmeContent = readmeContent.replaceAll(/help\.gif/, "https://github.com/1tontech/bootstrap4-snippets/raw/intellij-${version}/intellij/help.gif")
        }

        // lets replace bootstrap 4 placeholder
        readmeContent = replacePlaceholderWithSnippets(readmeContent, /@@@GENERATED_BOOTSTRAP_SNIPPETS@@@/, getSnippetResources("${snippetsRelPath}/bootstrap"), false, 'b4')

        // lets replace fontawesome 4 placeholder
        List<Snippet> fontAwesome4Snippets = fontAwesome4DescriptionToSnippet(snippetsRelPath + "/font-awesome4-icons.yml", templateStrTransformer)
        readmeContent = applyDescriptionToSnippet(fontAwesome4Snippets, readmeContent, /@@@GENERATED_FONT_AWESOME4_ICON_SNIPPETS@@@/)

        // lets replace fontawesome 5 free placeholder
        List<Snippet> fontAwesome5FreeSnippets = fontAwesome5FreeDescriptionToSnippet(snippetsRelPath + "/font-awesome5-icons-free.yml", templateStrTransformer)
        readmeContent = applyDescriptionToSnippet(fontAwesome5FreeSnippets, readmeContent, /@@@GENERATED_FONT_AWESOME5_FREE_ICON_SNIPPETS@@@/)

        // lets replace fontawesome 5 pro placeholder
        List<Snippet> fontAwesome5ProSnippets = fontAwesome5ProDescriptionToSnippet(snippetsRelPath + "/font-awesome5-icons-pro.yml", templateStrTransformer)
        readmeContent = applyDescriptionToSnippet(fontAwesome5ProSnippets, readmeContent, /@@@GENERATED_FONT_AWESOME5_PRO_ICON_SNIPPETS@@@/)

        saveTo.text = readmeContent
        println "Regenerated readme file. Saved to ${saveTo.absolutePath}"
    }

    private static String applyDescriptionToSnippet(List<Snippet> snippets, String readmeContent, String regex) {
        StringBuilder builder = new StringBuilder()
        builder << "\n"
        builder << "Trigger | Description\n"
        builder << "--- | ---\n"

        snippets.forEach({ snippet ->
            Matcher matcher = SNIPPET_PATTERN.matcher(snippet.trigger)
            matcher.find()
            builder << "${matcher.group("triggerPrefix")}-**${matcher.group("actual")}** | ${snippet.description}\n"
        })
        // if the snippet has `$` character in it, java treats it as a regex replacement. So lets just escape it
        readmeContent = readmeContent.replaceAll(regex, builder.toString().replaceAll("\\\$", "\\\\\\\$"))
        readmeContent
    }

    static String replacePlaceholderWithSnippets(String readmeContent, String placeholderToReplace, List<File> snippetResources, boolean skipParentDirNameFromTrigger, String prefix) {
        Map<String, List<SnippetHelp>> folderToSnippets = new LinkedHashMap<>()
        snippetResources.each { snippetResource ->
            String fileBaseName = snippetResource.name.take(snippetResource.name.lastIndexOf('.'))
            String parentDirName = snippetResource.parent.substring(snippetResource.parent.lastIndexOf('/') + 1)
            String sectionName = parentDirName.replaceAll(/-/, ' ').capitalize()

            def snippetHelpBuilder = SnippetHelp.builder()
                    .description(nameToDescription(sectionName, fileBaseName))

            def triggerNameDetail = triggerName(prefix, parentDirName, fileBaseName, skipParentDirNameFromTrigger)
            snippetHelpBuilder.trigger("${triggerNameDetail.computedPrefix}**${(triggerNameDetail.name - triggerNameDetail.computedPrefix).replaceAll('\\*', '\\\\\\\\*')}**")

            List<SnippetHelp> helps = folderToSnippets.get(sectionName)
            if (!helps) {
                helps = new ArrayList<>()
            }
            helps.add(snippetHelpBuilder.build())
            folderToSnippets.put(sectionName, helps)
        }

        StringBuilder builder = new StringBuilder()

        folderToSnippets.forEach({ String folderName, List<SnippetHelp> snippetHelps ->
            builder << "\n"
            builder << "#### ${folderName}\n\n"
            builder << "Trigger | Description\n"
            builder << "--- | ---\n"
            snippetHelps.forEach({snippetHelp ->
                builder << "${snippetHelp}\n"
            })
        })

        readmeContent.replaceAll(placeholderToReplace, builder.toString().replace('\$', '\\$'))
    }

}
