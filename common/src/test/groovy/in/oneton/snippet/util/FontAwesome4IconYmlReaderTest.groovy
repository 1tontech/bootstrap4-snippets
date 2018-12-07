package in.oneton.snippet.util

import org.junit.jupiter.api.Test

import static org.assertj.core.api.Assertions.*

class FontAwesome4IconYmlReaderTest {
  @Test
  void testRead() {
    List<Icon> icons = new FontAwesome4IconYmlReader(getClass().getResourceAsStream("/font-awesome4-icons-sample.yml")).readSorted()
    assertThat(icons.size()).isEqualTo(3)
    assertThat(icons.get(0).getId()).isEqualTo("glass")
    assertThat(icons.get(0).getName()).isEqualTo("Glass")
    assertThat(icons.get(1).getId()).isEqualTo("music")
    assertThat(icons.get(1).getName()).isEqualTo("Music")
    assertThat(icons.get(2).getId()).isEqualTo("search")
    assertThat(icons.get(2).getName()).isEqualTo("Search")
  }
}
