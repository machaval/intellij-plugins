// This is a generated file. Not intended for manual editing.
package org.mule.dfl.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.mule.dfl.parser.psi.DflTypes.*;
import com.intellij.extapi.psi.ASTWrapperPsiElement;
import org.mule.dfl.parser.psi.*;

public class DflComplexPropImpl extends ASTWrapperPsiElement implements DflComplexProp {

  public DflComplexPropImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DflVisitor) ((DflVisitor)visitor).visitComplexProp(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DflComplexKey getComplexKey() {
    return findNotNullChildByClass(DflComplexKey.class);
  }

  @Override
  @NotNull
  public DflValue getValue() {
    return findNotNullChildByClass(DflValue.class);
  }

}
