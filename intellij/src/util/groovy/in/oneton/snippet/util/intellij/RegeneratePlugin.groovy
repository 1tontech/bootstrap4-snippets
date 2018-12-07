package in.oneton.snippet.util.intellij

import in.oneton.snippet.util.readme.ReadmeGenerator

import static java.nio.charset.Charset.defaultCharset
import static org.apache.commons.io.IOUtils.readLines

class RegeneratePlugin {
    static void main(String[] args) {
        String version = readLines(new FileInputStream(new File('.version')), defaultCharset()).get(0)
        String snippetsDirRelPath = '../snippets'

        new Generator().generateAll(snippetsDirRelPath)
        new ReadmeGenerator().generate(new File('README.md'), snippetsDirRelPath, false, version)
        new PluginXmlGenerator(version).generate()
        new GradleBuildVersionUpdater(version).generate()
    }
}
