package in.oneton.snippet.util.vscode

import in.oneton.snippet.util.readme.ReadmeGenerator

import java.util.function.Function

import static java.nio.charset.Charset.defaultCharset
import static org.apache.commons.io.IOUtils.readLines

class RegeneratePlugin {
    static void main(String[] args) {
        String version = readLines(new FileInputStream(new File('.version')), defaultCharset()).get(0)
        String snippetsDirRelPath = '../snippets'

        Function<String, String> templateStrTransformer = { val ->
            // converting ${3:primary|accent|warn} => ${3|primary,accent,warn|} which is vscode format for choices
            val = val.replaceAll(/\$\{(\d+):((?=([^}]+?\|)+[^}]+?)([^}]+?\|)+[^}]+?)\}/) { matches -> "\${${matches[1]}|${matches[2].replaceAll(/\|/, ',')}|}" }
            // replacing $END$ (intellij version of wghere the final cursor should be) with $0 (vscode version)
            return val.contains("\$END\$") ? val.trim().replaceAll("\\\$END\\\$", '\\\$0') : "${val.trim()}\$0"
        }

        SnippetGenerator.generateAll(snippetsDirRelPath, templateStrTransformer)
        new ReadmeGenerator().generate(new File('README.md'), snippetsDirRelPath, true, version, templateStrTransformer)
        new PackageJsonGenerator(version).generate()
    }
}
