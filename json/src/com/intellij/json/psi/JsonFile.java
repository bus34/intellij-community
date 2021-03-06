package com.intellij.json.psi;

import com.intellij.psi.PsiFile;
import org.jetbrains.annotations.Nullable;

/**
 * @author Mikhail Golubev
 */
public interface JsonFile extends JsonElement, PsiFile {
  /**
   * Returns {@link JsonArray} or {@link JsonObject} value according to JSON standard.
   *
   * @return top-level JSON element if any or {@code null} otherwise
   */
  @Nullable
  JsonValue getTopLevelValue();
}
