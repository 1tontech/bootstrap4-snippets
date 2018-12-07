package in.oneton.snippet.util.intellij

class GradleBuildVersionUpdater {

    private final String version

    GradleBuildVersionUpdater(String version) {
        this.version = version
    }

    void generate() {
        File buildFile = new File('build.gradle')
        String updateBuildFileContent = buildFile.text.replaceAll(/version '\d+.\d+.\d+'/, "version '${version}'")
        buildFile.text = updateBuildFileContent
        println "Updated version within build.gradle"
    }

}
