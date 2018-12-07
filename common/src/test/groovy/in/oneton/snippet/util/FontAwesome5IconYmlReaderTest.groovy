package in.oneton.snippet.util

import org.junit.jupiter.api.Test

import static org.assertj.core.api.Assertions.assertThat

class FontAwesome5IconYmlReaderTest {
  @Test
  void testRead() {
    List<Icon> icons = new FontAwesome5IconYmlReader(getClass().getResourceAsStream("/font-awesome5-icons-sample.yml")).readSorted()
    assertThat(icons.size()).isEqualTo(3)
    assertThat(icons.get(0).getId()).isEqualTo("500px")
    assertThat(icons.get(0).getName()).isEqualTo("500px")
    assertThat(icons.get(1).getId()).isEqualTo("accessible-icon")
    assertThat(icons.get(1).getName()).isEqualTo("Accessible Icon")
    assertThat(icons.get(2).getId()).isEqualTo("accusoft")
    assertThat(icons.get(2).getName()).isEqualTo("Accusoft")
  }
}
