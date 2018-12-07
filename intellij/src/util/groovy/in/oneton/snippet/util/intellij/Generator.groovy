package in.oneton.snippet.util.intellij

import com.fasterxml.jackson.dataformat.xml.XmlMapper
import in.oneton.snippet.util.Match
import in.oneton.snippet.util.Snippet

import static com.fasterxml.jackson.databind.SerializationFeature.INDENT_OUTPUT
import static in.oneton.snippet.util.Util.*
import static java.util.regex.Pattern.compile
import static java.util.stream.Collectors.toList

class Generator {

    static LONG_FORM_PATTERN = compile(/\$\s*\{\s*(?<index>\d+)\s*:\s*(?<defaultValueOrChoices>[^}]*)\s*}/)
    static SHORT_FORM_PATTERN = compile(/\$\s*(?<index>\d+)/)

    static void generateAll(String snippetsRelPath) {
        String resourcesPath = 'src/main/resources'

        new File(resourcesPath).mkdirs()

        List<Snippet> snippets = bootstrapDescriptionToSnippet(snippetsRelPath + "/bootstrap")
        File snippetXml = persistSnippetsAsTemplateXml(snippets, 'Bootstrap 4', "${resourcesPath}/bootstrap.xml")
        println "Regenerated bootstrap template file. Saved to ${snippetXml.absolutePath}"

        snippets = fontAwesome4DescriptionToSnippet(snippetsRelPath + "/font-awesome4-icons.yml")
        snippetXml = persistSnippetsAsTemplateXml(snippets, 'Font Awesome 4', "${resourcesPath}/font-awesome4.xml")
        println "Regenerated Font Awesome 4 template file. Saved to ${snippetXml.absolutePath}"

        snippets = fontAwesome5FreeDescriptionToSnippet(snippetsRelPath + "/font-awesome5-icons-free.yml")
        snippetXml = persistSnippetsAsTemplateXml(snippets, 'Font Awesome 5 Free', "${resourcesPath}/font-awesome5-free.xml")
        println "Regenerated Font Awesome 5 Free template file. Saved to ${snippetXml.absolutePath}"

        snippets = fontAwesome5ProDescriptionToSnippet(snippetsRelPath + "/font-awesome5-icons-pro.yml")
        snippetXml = persistSnippetsAsTemplateXml(snippets, 'Font Awesome 5 Pro', "${resourcesPath}/font-awesome5-pro.xml")
        println "Regenerated Font Awesome 5 Pro template file. Saved to ${snippetXml.absolutePath}"
    }

    private static File persistSnippetsAsTemplateXml(List<Snippet> snippets, String groupName, String saveXmlTo) {
        List<Template> templates = new ArrayList<>()

        snippets.each { snippet ->
            def templateStr = snippet.template

            // replace each ${1:<text>} with $1$ & extract the variable name & text separately
            def matches = parseAndGetMatches(templateStr)
            def variables = matches.stream().map({ match ->
                templateStr = replaceWithVarFormat(templateStr, match.index)
                return TemplateVariable.from(match)
            }).collect(toList())

            def template = Template.builder()
                .name(snippet.trigger)
                .value(templateStr)
                .description(snippet.description)
                .toReformat(true)
                .variables(variables)
                .options(ContextOption.ALL)
                .build()

            templates.add(template)
        }

        XmlMapper xmlMapper = new XmlMapper();
        xmlMapper.enable(INDENT_OUTPUT);

        File snippetXml = new File(saveXmlTo)
        TemplateSet templateSet = TemplateSet.builder().group()
            .templates(templates).build()
        xmlMapper.writeValue(snippetXml, templateSet)
        snippetXml
    }

    private static String replaceWithVarFormat(String text, int index) {
        String modifiedText = replaceWithVarFormat(text, index, true)
        if (modifiedText == text) {
            return replaceWithVarFormat(text, index, false)
        }
        return modifiedText
    }

    private static String replaceWithVarFormat(String text, int index, boolean longForm) {
        if (longForm) {
            def pattern = compile(/\$\s*\{\s*/ + index + /\s*:\s*([^}]*)\s*}/)
            return text.replaceAll(pattern, /\$/ + index + /\$/)
        } else {
            def pattern = compile(/\$\s*/ + index)
            return text.replaceAll(pattern, /\$/ + index + /\$/)
        }
    }

    private static Set<Match> parseAndGetMatches(String text) {
        def matches = parseAndGetMatches(text, true)
        matches.addAll(parseAndGetMatches(text, false))
        return matches
    }

    private static Set<Match> parseAndGetMatches(String text, boolean longForm) {
        Set<Match> matches = new TreeSet<>()
        if (longForm) {
            def matcher = LONG_FORM_PATTERN.matcher(text)
            while (matcher.find()) {
                def index = Integer.parseInt(matcher.group("index"))
                def suggestion = matcher.group("defaultValueOrChoices")
                matches << Match.builder().index(index).suggestion(suggestion).build()
            }
        } else {
            def matcher = SHORT_FORM_PATTERN.matcher(text)
            while (matcher.find()) {
                def index = Integer.parseInt(matcher.group("index"))
                matches << Match.builder().index(index).build()
            }
        }
        return matches
    }
}
