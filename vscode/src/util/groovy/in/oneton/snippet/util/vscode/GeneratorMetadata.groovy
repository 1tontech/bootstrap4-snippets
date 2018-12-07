package in.oneton.snippet.util.vscode

import groovy.transform.builder.Builder
import in.oneton.snippet.util.ParentAndBasenameTransformer

@Builder
class GeneratorMetadata {
  String templateRootPath
  ParentAndBasenameTransformer triggerNameGenerator
  ParentAndBasenameTransformer descriptionGenerator
}
