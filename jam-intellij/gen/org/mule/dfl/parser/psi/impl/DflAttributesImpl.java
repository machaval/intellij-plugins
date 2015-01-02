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

public class DflAttributesImpl extends ASTWrapperPsiElement implements DflAttributes {

  public DflAttributesImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DflVisitor) ((DflVisitor)visitor).visitAttributes(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public List<DflSimpleProp> getSimplePropList() {
    return PsiTreeUtil.getChildrenOfTypeAsList(this, DflSimpleProp.class);
  }

}
