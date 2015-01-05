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

public class DflParenExprImpl extends DflExpressionImpl implements DflParenExpr {

  public DflParenExprImpl(ASTNode node) {
    super(node);
  }

  public void accept(@NotNull PsiElementVisitor visitor) {
    if (visitor instanceof DflVisitor) ((DflVisitor)visitor).visitParenExpr(this);
    else super.accept(visitor);
  }

  @Override
  @Nullable
  public DflExpression getExpression() {
    return findChildByClass(DflExpression.class);
  }

}
