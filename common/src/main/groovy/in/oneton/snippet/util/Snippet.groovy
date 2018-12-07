package in.oneton.snippet.util

import com.fasterxml.jackson.annotation.JsonProperty
import groovy.transform.builder.Builder

@Builder
class Snippet {
    @JsonProperty("prefix")
    String trigger
    @JsonProperty("body")
    String template
    String description
    String scope
}
