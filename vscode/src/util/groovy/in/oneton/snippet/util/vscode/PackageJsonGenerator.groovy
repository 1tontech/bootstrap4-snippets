package in.oneton.snippet.util.vscode

import org.apache.commons.io.IOUtils

import static java.nio.charset.Charset.defaultCharset

class PackageJsonGenerator {

    private final String version

    PackageJsonGenerator(String version) {
        this.version = version
    }

    void generate() {
        StringWriter readmeTemplate = new StringWriter()
        IOUtils.copy(getClass().getResourceAsStream("/package-template.json"), readmeTemplate, defaultCharset())
        String readmeContent = readmeTemplate.toString().replaceAll(/@@@VERSION@@@/, version)

        File readme = new File("package.json")
        IOUtils.write(readmeContent, new FileOutputStream(readme), defaultCharset())
        println "Regenerated package metadata. Saved to ${readme.absolutePath}"
    }

}
