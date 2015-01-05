// This is a generated file. Not intended for manual editing.
package org.mule.dfl.parser.psi;

import org.jetbrains.annotations.*;
import com.intellij.psi.PsiElementVisitor;
import com.intellij.psi.PsiElement;

public class DflVisitor extends PsiElementVisitor {

  public void visitArray(@NotNull DflArray o) {
    visitPsiElement(o);
  }

  public void visitAttributes(@NotNull DflAttributes o) {
    visitPsiElement(o);
  }

  public void visitBoolExpr(@NotNull DflBoolExpr o) {
    visitExpression(o);
  }

  public void visitCommentExpr(@NotNull DflCommentExpr o) {
    visitExpression(o);
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

  public void visitDivExpr(@NotNull DflDivExpr o) {
    visitExpression(o);
  }

  public void visitExpression(@NotNull DflExpression o) {
    visitPsiElement(o);
  }

  public void visitHeader(@NotNull DflHeader o) {
    visitPsiElement(o);
  }

  public void visitIdentifier(@NotNull DflIdentifier o) {
    visitPsiElement(o);
  }

  public void visitMinusExpr(@NotNull DflMinusExpr o) {
    visitExpression(o);
  }

  public void visitMulExpr(@NotNull DflMulExpr o) {
    visitExpression(o);
  }

  public void visitNumberExpr(@NotNull DflNumberExpr o) {
    visitExpression(o);
  }

  public void visitObject(@NotNull DflObject o) {
    visitPsiElement(o);
  }

  public void visitParenExpr(@NotNull DflParenExpr o) {
    visitExpression(o);
  }

  public void visitPlusExpr(@NotNull DflPlusExpr o) {
    visitExpression(o);
  }

  public void visitRefExpr(@NotNull DflRefExpr o) {
    visitExpression(o);
  }

  public void visitSimpleKey(@NotNull DflSimpleKey o) {
    visitPsiElement(o);
  }

  public void visitSimpleProp(@NotNull DflSimpleProp o) {
    visitPsiElement(o);
  }

  public void visitSimpleRefExpr(@NotNull DflSimpleRefExpr o) {
    visitExpression(o);
  }

  public void visitSingleObject(@NotNull DflSingleObject o) {
    visitPsiElement(o);
  }

  public void visitStringExpr(@NotNull DflStringExpr o) {
    visitExpression(o);
  }

  public void visitUnaryMinExpr(@NotNull DflUnaryMinExpr o) {
    visitExpression(o);
  }

  public void visitUnaryPlusExpr(@NotNull DflUnaryPlusExpr o) {
    visitExpression(o);
  }

  public void visitValue(@NotNull DflValue o) {
    visitPsiElement(o);
  }

  public void visitPsiElement(@NotNull PsiElement o) {
    visitElement(o);
  }

}
