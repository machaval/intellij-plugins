// This is a generated file. Not intended for manual editing.
package org.mule.dfl.parser.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class DflVisitor extends PsiElementVisitor {

  public void visitArray(@NotNull DflArray o) {
    visitDataStructure(o);
  }

  public void visitAttributes(@NotNull DflAttributes o) {
    visitPsiElement(o);
  }

  public void visitComplexKey(@NotNull DflComplexKey o) {
    visitPsiElement(o);
  }

  public void visitComplexProp(@NotNull DflComplexProp o) {
    visitPsiElement(o);
  }

  public void visitDataStructure(@NotNull DflDataStructure o) {
    visitPsiElement(o);
  }

  public void visitObject(@NotNull DflObject o) {
    visitDataStructure(o);
  }

  public void visitSimpleKey(@NotNull DflSimpleKey o) {
    visitPsiElement(o);
  }

  public void visitSimpleProp(@NotNull DflSimpleProp o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
