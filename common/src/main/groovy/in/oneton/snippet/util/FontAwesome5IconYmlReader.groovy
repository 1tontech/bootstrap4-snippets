package in.oneton.snippet.util


import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.representer.Representer

class FontAwesome5IconYmlReader implements IconYmlReader {

  private final InputStream iconYmlInputStream

  FontAwesome5IconYmlReader(InputStream iconYmlInputStream) {
    this.iconYmlInputStream = iconYmlInputStream
  }

  @Override
  List<Icon> readSorted() {
    // lets ignore missing properties as we dont care about them
    Representer representer = new Representer()
    representer.getPropertyUtils().setSkipMissingProperties(true)

    Yaml yamlLoader = new Yaml(representer)
    Map<String, Object> yamlRoot = yamlLoader.load(iconYmlInputStream)
    // snakeyaml duck types all objects to map unless specified. so we can directly access map properties
    yamlRoot.collect { k, v ->
      Icon.builder().id(k).name(v.label).build()
    }.sort { a, b ->
      a.id <=> b.id
    }
  }

}
