// This is a generated file. Not intended for manual editing.
package org.mule.dfl.parser.psi.impl;

import java.util.List;
import org.jetbrains.annotations.*;
import com.intellij.lang.ASTNode;
import com.intellij.psi.PsiElement;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.util.PsiTreeUtil;
import static org.mule.dfl.parser.psi.DflTypes.*;
import org.mule.dfl.parser.psi.*;

public class DflRefExprImpl extends DflExpressionImpl implements DflRefExpr {

  public DflRefExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DflVisitor) ((DflVisitor)visitor).visitRefExpr(this);
    else super.accept(visitor);
  }

  @Override
  @NotNull
  public DflExpression getExpression() {
    return findNotNullChildByClass(DflExpression.class);
  }

  @Override
  @NotNull
  public DflIdentifier getIdentifier() {
    return findNotNullChildByClass(DflIdentifier.class);
  }

}
