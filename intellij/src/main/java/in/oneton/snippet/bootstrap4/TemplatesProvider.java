package in.oneton.snippet.bootstrap4;

import com.intellij.codeInsight.template.impl.DefaultLiveTemplatesProvider;
import org.jetbrains.annotations.Nullable;

public class TemplatesProvider implements DefaultLiveTemplatesProvider {
  public String[] getDefaultLiveTemplateFiles() {
    return new String[] {"bootstrap", "font-awesome4", "font-awesome5-free", "font-awesome5-pro"};
  }

  @Nullable
  public String[] getHiddenLiveTemplateFiles() {
    return null;
  }
}
