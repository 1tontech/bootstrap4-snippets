package in.oneton.snippet.util

import java.nio.file.Files
import java.nio.file.Paths
import java.util.function.Function

import static java.util.stream.Collectors.toList
import static org.apache.commons.lang3.StringEscapeUtils.escapeXml11

final class Util {
    private Util() {
    }

    static List<Snippet> fontAwesome5ProDescriptionToSnippet(String ymlRelPath, Function<String, String> templateStrTransformer = { val -> val }) {
        List<Snippet> snippets = []

        addSnippet(snippets, 'fa5p-\$-js', '<script defer src="\$1"></script>\$END\$', 'Font Awesome 5 Pro js link', templateStrTransformer)
        addSnippet(snippets, 'fa5p-\$-css', '<link href="\$1" rel="stylesheet">\$END\$', 'Font Awesome 5 Pro CSS link', templateStrTransformer)

        List<Icon> icons = new FontAwesome5IconYmlReader(new FileInputStream(new File(ymlRelPath))).readSorted()
        icons.forEach({ icon ->
            addSnippet(snippets, "fa5p-${icon.id}", "<i class=\"\${1:fas|far|fal|fab} fa-${icon.id} \${2: |fa-xs|fa-sm|fa-lg|fa-2x|fa-3x|fa-4x|fa-5x|fa-6x|fa-7x|fa-8x|fa-9x|fa-10x} \${3: |fa-fw}\$4\"></i>\$END\$", icon.name, templateStrTransformer)
        })

        // additional classes font awesome 5 provides
        addSnippet(snippets, '@fa5p-ul', 'fa-ul', 'Unordered list. Apply on ul element', templateStrTransformer)
        addSnippet(snippets, '@fa5p-li', 'fa-li', 'List item. Apply on span element inside li element', templateStrTransformer)
        addSnippet(snippets, '@fa5p-border', 'fa-border', 'Icon with border', templateStrTransformer)
        addSnippet(snippets, '@fa5p-pull-right', 'fa-pull-right', 'Pull icon to right', templateStrTransformer)
        addSnippet(snippets, '@fa5p-pull-left', 'fa-pull-left', 'Pull icon to left', templateStrTransformer)
        addSnippet(snippets, '@fa5p-spin', 'fa-spin', 'Animates continuously rotating icon', templateStrTransformer)
        addSnippet(snippets, '@fa5p-pulse', 'fa-pulse', 'Animates 8 step rotating icon', templateStrTransformer)
        addSnippet(snippets, '@fa5p-rotate-90', 'fa-rotate-90', 'Rotates icon by 90 degrees', templateStrTransformer)
        addSnippet(snippets, '@fa5p-rotate-180', 'fa-rotate-180', 'Rotates icon by 180 degrees', templateStrTransformer)
        addSnippet(snippets, '@fa5p-rotate-270', 'fa-rotate-270', 'Rotates icon by 270 degrees', templateStrTransformer)
        addSnippet(snippets, '@fa5p-flip-horizontal', 'fa-flip-horizontal', 'Flips icon horizontally', templateStrTransformer)
        addSnippet(snippets, '@fa5p-flip-vertical', 'fa-flip-vertical', 'Flips icon vertically', templateStrTransformer)
        addSnippet(snippets, '@fa5p-stack', 'fa-stack', 'Stacks multiple icons. Apply on parent', templateStrTransformer)
        addSnippet(snippets, '@fa5p-stack-1x', 'fa-stack-1x', 'Regular sized stacked icon', templateStrTransformer)
        addSnippet(snippets, '@fa5p-stack-2x', 'fa-stack-2x', 'Larger sized stacked icon', templateStrTransformer)
        addSnippet(snippets, '@fa5p-inverse', 'fa-inverse', 'Alternative colored icon', templateStrTransformer)

        snippets
    }

    static List<Snippet> fontAwesome5FreeDescriptionToSnippet(String ymlRelPath, Function<String, String> templateStrTransformer = { val -> val }) {
        List<Snippet> snippets = []

        addSnippet(snippets, 'fa5-\$-js', '<script defer src="https://use.fontawesome.com/releases/v5.1.1/js/all.js" integrity="sha384-BtvRZcyfv4r0x/phJt9Y9HhnN5ur1Z+kZbKVgzVBAlQZX4jvAuImlIz+bG7TS00a" crossorigin="anonymous"></script>\$END\$', 'Font Awesome 5 Free JS link', templateStrTransformer)
        addSnippet(snippets, 'fa5-\$-css', '<link rel="stylesheet" href="https://use.fontawesome.com/releases/v5.1.1/css/all.css" integrity="sha384-O8whS3fhG2OnA5Kas0Y9l3cfpmYjapjI0E4theH4iuMD+pLhbf6JI0jIMfYcK3yZ" crossorigin="anonymous">\$END\$', 'Font Awesome 5 Free CSS link', templateStrTransformer)

        List<Icon> icons = new FontAwesome5IconYmlReader(new FileInputStream(new File(ymlRelPath))).readSorted()
        icons.forEach({ icon ->
            addSnippet(snippets, "fa5-${icon.id}", "<i class=\"\${1:fas|fab} fa-${icon.id} \${2: |fa-xs|fa-sm|fa-lg|fa-2x|fa-3x|fa-4x|fa-5x|fa-6x|fa-7x|fa-8x|fa-9x|fa-10x} \${3: |fa-fw}\$4\"></i>\$END\$", icon.name, templateStrTransformer)
        })

        // additional classes font awesome5 provides
        addSnippet(snippets, '@fa5-ul', 'fa-ul', 'Unordered list. Apply on ul element', templateStrTransformer)
        addSnippet(snippets, '@fa5-li', 'fa-li', 'List item. Apply on span element inside li element', templateStrTransformer)
        addSnippet(snippets, '@fa5-border', 'fa-border', 'Icon with border', templateStrTransformer)
        addSnippet(snippets, '@fa5-pull-right', 'fa-pull-right', 'Pull icon to right', templateStrTransformer)
        addSnippet(snippets, '@fa5-pull-left', 'fa-pull-left', 'Pull icon to left', templateStrTransformer)
        addSnippet(snippets, '@fa5-spin', 'fa-spin', 'Animates continuously rotating icon', templateStrTransformer)
        addSnippet(snippets, '@fa5-pulse', 'fa-pulse', 'Animates 8 step rotating icon', templateStrTransformer)
        addSnippet(snippets, '@fa5-rotate-90', 'fa-rotate-90', 'Rotates icon by 90 degrees', templateStrTransformer)
        addSnippet(snippets, '@fa5-rotate-180', 'fa-rotate-180', 'Rotates icon by 180 degrees', templateStrTransformer)
        addSnippet(snippets, '@fa5-rotate-270', 'fa-rotate-270', 'Rotates icon by 270 degrees', templateStrTransformer)
        addSnippet(snippets, '@fa5-flip-horizontal', 'fa-flip-horizontal', 'Flips icon horizontally', templateStrTransformer)
        addSnippet(snippets, '@fa5-flip-vertical', 'fa-flip-vertical', 'Flips icon vertically', templateStrTransformer)
        addSnippet(snippets, '@fa5-stack', 'fa-stack', 'Stacks multiple icons. Apply on parent', templateStrTransformer)
        addSnippet(snippets, '@fa5-stack-1x', 'fa-stack-1x', 'Regular sized stacked icon', templateStrTransformer)
        addSnippet(snippets, '@fa5-stack-2x', 'fa-stack-2x', 'Larger sized stacked icon', templateStrTransformer)
        addSnippet(snippets, '@fa5-inverse', 'fa-inverse', 'Alternative colored icon', templateStrTransformer)

        snippets
    }

    static List<Snippet> fontAwesome4DescriptionToSnippet(String ymlRelPath, Function<String, String> templateStrTransformer = { val -> val }) {
        List<Snippet> snippets = []

        addSnippet(snippets, 'fa4-\$', '<link rel="stylesheet" href="${1:https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css}">\$END\$', 'Font awesome 4 css link', templateStrTransformer)

        List<Icon> icons = new FontAwesome4IconYmlReader(new FileInputStream(new File(ymlRelPath))).readSorted()
        icons.forEach({ icon ->
            addSnippet(snippets, "fa4-${icon.id}", "<i class=\"fa fa-${icon.id}\$1\" aria-hidden=\"true\"></i>\$END\$", icon.name, templateStrTransformer)
        })

        snippets
    }

    static List<Snippet> bootstrapDescriptionToSnippet(String bootstrapSnippetDirRelPath, Function<String, String> templateStrTransformer = { val -> val }) {
        List<Snippet> snippets = []

        def templateStr
        def triggerPattern
        def helpMsg

        // Bootstrap
        getSnippetResources(bootstrapSnippetDirRelPath).forEach({ snippetResource ->
            String contentUntouched = snippetResource.text

            String fileParent = new File(snippetResource.parent).name
            String fileBaseName = snippetResource.name.take(snippetResource.name.lastIndexOf('.'))

            templateStr = contentUntouched

            triggerPattern = fileBaseName != '$' ? "b4-${fileParent}-${fileBaseName}" : 'b4-$'
            helpMsg = fileBaseName != '$' ? "${fileParent} ${fileBaseName}".replace(/-/, ' ') : 'Bootstrap master template'

            def snippet = Snippet.builder().trigger(triggerPattern).template(templateStrTransformer.apply(templateStr.contains('$END$') ? templateStr.trim() : "${templateStr.trim()}\$END\$")).description(helpMsg).scope('').build()
            snippets << snippet
        })

        snippets
    }

    static void addSnippet(List<Snippet> descriptionToSnippetTarget, String triggerPattern, String templateStr, String helpMsg, Function<String, String> templateStrTransformer) {
        descriptionToSnippetTarget << Snippet.builder().trigger(triggerPattern).template(templateStrTransformer.apply(templateStr.contains('$END$') ? templateStr.trim() : "${templateStr.trim()}\$END\$")).description(helpMsg).scope('').build()
    }

    static List<File> getSnippetResources(String rootPath) {
        return Files.walk(Paths.get(rootPath))
                .filter({ path -> path.fileName ==~ /.*.html$/ })
                .sorted()
                .map({ path -> path.toFile() })
                .collect(toList())
    }

    static TriggerNameDetail triggerName(CharSequence prefix, CharSequence fileParent, CharSequence fileBaseName, boolean skipParentDirNameFromTrigger = false) {
        String computedPrefix
        String name
        if (skipParentDirNameFromTrigger) {
            if (fileBaseName.startsWith("@")) {
                computedPrefix = "@${prefix}"
                name = fileBaseName.startsWith("@${prefix}") ? fileBaseName : "@${prefix}${(fileBaseName - '@').capitalize()}"
            } else {
                computedPrefix = "${prefix}-"
                name = "${prefix}-${fileBaseName.capitalize()}"
            }
        } else {
            if (fileBaseName.startsWith("@")) {
                computedPrefix = "@${prefix}"
                name = "@${prefix}${fileParent.replaceAll(/-([a-z])/, {matchGroup -> matchGroup[1].toUpperCase() }).capitalize()}" + (fileBaseName ? (fileBaseName - '@').replaceAll(/-(!?)([a-z])/, {matchGroup ->  matchGroup[1] ?  '!' + matchGroup[2].toUpperCase() : matchGroup[2].toUpperCase() }).capitalize() : '')
            } else {
                def returnVal = fileParent + (fileBaseName ? ((fileBaseName ==~ /^:.+$/ || fileBaseName ==~ /^\$.*$/) ? fileBaseName : '-' + fileBaseName) : '')
                computedPrefix = "${prefix}-"
                name = "${prefix}-${returnVal}"
            }
        }
        return TriggerNameDetail.builder().name(name).computedPrefix(computedPrefix).build()
    }

    static String nameToDescription(CharSequence fileParent, CharSequence fileBaseName) {
        def description
        if ((fileBaseName ==~ /^:.*$/  || fileBaseName ==~ /^\$.*$/)) {
            description = "${fileParent}${fileBaseName}".trim()
        } else if (fileBaseName ==~ /^@.*$/) {
            description = "@ ${fileParent} ${fileBaseName - '@'}".trim()
        } else {
            description = "${fileParent}-${fileBaseName}".trim()
        }

        if (description ==~ /.*\+.*/) {
            description = description.replaceAll(/\+/, ' with responsive variations')
        }
        if (description ==~ /^.*:\*\*$/) {
            description = description.replaceAll(/:\*\*/, ' + more variations')
        }
        if (description ==~ /^.*:\?$/) {
            description = description.replaceAll(/:\?/, ' help')
        }
        if (description ==~ /^.*-\*.*$/) {
            description = description.replaceAll(/-\*/, ' *forEach flavor')
        }
        if (description ==~ /^.*@.*$/) {
            description = description.replaceAll(/@/, 'attribute directive ')
        }
        if (description ==~ /^.*_([^\W]+?)?\b.*$/) {
            description = description.replaceAll(/_([^\W]+?)?\b/, /$1 snippet/)
        }
        if (description ==~ /^.*:([a-z ]+)$/) {
            description = description.replaceAll(/:([a-z ]+)$/, / + $1 variation/)
        }
        if (description ==~ /.*-a\b.*/) {
            description = description.replaceAll(/-a\b/, ' with link')
        }
        if (fileBaseName ==~ /^\$.*/) {
            description = 'Reactive form variation of ' + description.replaceAll(/\$/, '')
        } else if (description ==~ /.*\$.*/) {
            description = description.replaceAll(/\$/, ' with observable variation')
        }
        escapeXml11(description.replace(/-/, ' ')).trim()
    }
}
