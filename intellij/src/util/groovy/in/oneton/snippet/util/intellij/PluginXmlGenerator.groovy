package in.oneton.snippet.util.intellij

import com.vladsch.flexmark.ast.Document
import com.vladsch.flexmark.html.HtmlRenderer
import com.vladsch.flexmark.parser.Parser
import org.apache.commons.io.IOUtils

import static java.nio.charset.Charset.defaultCharset

import static org.apache.commons.io.IOUtils.readLines

class PluginXmlGenerator {

    private final String version

    PluginXmlGenerator(String version) {
        this.version = version
    }

    void generate() {
        String metadataInfoFolderPath = 'src/main/resources/META-INF'

        StringWriter readmeTemplate = new StringWriter()
        IOUtils.copy(getClass().getResourceAsStream('/plugin-template.xml'), readmeTemplate, defaultCharset())
        String readmeContent = readmeTemplate.toString().replaceAll(/@@@VERSION@@@/, version)

        Parser parser = Parser.builder().build()
        Document document = parser.parse(new File('CHANGELOG.md').text)
        HtmlRenderer renderer = HtmlRenderer.builder().build()
        readmeContent = readmeContent.replaceAll(/@@@CHANGELOG@@@/, renderer.render(document))

        new File(metadataInfoFolderPath).mkdirs()
        File readme = new File("${metadataInfoFolderPath}/plugin.xml")
        IOUtils.write(readmeContent, new FileOutputStream(readme), defaultCharset())
        println "Regenerated plugin xml. Saved to ${readme.absolutePath}"
    }

}
