package in.oneton.snippet.util.intellij

import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlElementWrapper
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlRootElement
import groovy.transform.builder.Builder

@Builder
@JacksonXmlRootElement(localName = "templateSet")
class TemplateSet {

    @JacksonXmlProperty(isAttribute = true)
    String group

    @JacksonXmlProperty(localName = "template")
    @JacksonXmlElementWrapper(useWrapping = false)
    List<Template> templates

}
