// This is a generated file. Not intended for manual editing.
package org.mule.dfl.parser.psi;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElement;

public interface DflComplexProp extends PsiElement {

  @NotNull
  DflComplexKey getComplexKey();

  @Nullable
  DflDataStructure getDataStructure();

  @Nullable
  PsiElement getDoubleQuotedString();

  @Nullable
  PsiElement getLineComment();

  @Nullable
  PsiElement getNumber();

}
