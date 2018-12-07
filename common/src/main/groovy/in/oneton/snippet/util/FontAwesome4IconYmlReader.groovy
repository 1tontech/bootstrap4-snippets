package in.oneton.snippet.util

import org.yaml.snakeyaml.TypeDescription
import org.yaml.snakeyaml.Yaml
import org.yaml.snakeyaml.constructor.Constructor
import org.yaml.snakeyaml.representer.Representer

import static java.util.stream.Collectors.toList

class FontAwesome4IconYmlReader implements IconYmlReader {

  private final InputStream iconYmlInputStream

  FontAwesome4IconYmlReader(InputStream iconYmlInputStream) {
    this.iconYmlInputStream = iconYmlInputStream
  }

  @Override
  List<Icon> readSorted() {
    Constructor constructor = new Constructor(FontAwesome4YamlRoot.class)
    TypeDescription iconsTypeDescription = new TypeDescription(FontAwesome4YamlRoot.class)

    iconsTypeDescription.addPropertyParameters("icons", Icon.class)
    constructor.addTypeDescription(iconsTypeDescription)

    // lets ignore missing properties as we dont care about them
    Representer representer = new Representer()
    representer.getPropertyUtils().setSkipMissingProperties(true)

    Yaml yamlLoader = new Yaml(constructor, representer)
    FontAwesome4YamlRoot yamlRoot = yamlLoader.load(iconYmlInputStream)
    yamlRoot.icons.sort { a, b ->
      a.id <=> b.id
    }
  }

}
