// This is a generated file. Not intended for manual editing.
package org.mule.dfl.parser.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.mule.dfl.parser.DflElementType;
import org.mule.dfl.parser.DflTokenType;
import org.mule.dfl.parser.psi.impl.*;

public interface DflTypes {

  IElementType ARRAY = new DflElementType("ARRAY");
  IElementType ATTRIBUTES = new DflElementType("ATTRIBUTES");
  IElementType BOOL_EXPR = new DflElementType("BOOL_EXPR");
  IElementType COMMENT_EXPR = new DflElementType("COMMENT_EXPR");
  IElementType COMPLEX_KEY = new DflElementType("COMPLEX_KEY");
  IElementType COMPLEX_PROP = new DflElementType("COMPLEX_PROP");
  IElementType DATA_STRUCTURE = new DflElementType("DATA_STRUCTURE");
  IElementType DIV_EXPR = new DflElementType("DIV_EXPR");
  IElementType EXPRESSION = new DflElementType("EXPRESSION");
  IElementType HEADER = new DflElementType("HEADER");
  IElementType IDENTIFIER = new DflElementType("IDENTIFIER");
  IElementType MINUS_EXPR = new DflElementType("MINUS_EXPR");
  IElementType MUL_EXPR = new DflElementType("MUL_EXPR");
  IElementType NUMBER_EXPR = new DflElementType("NUMBER_EXPR");
  IElementType OBJECT = new DflElementType("OBJECT");
  IElementType PAREN_EXPR = new DflElementType("PAREN_EXPR");
  IElementType PLUS_EXPR = new DflElementType("PLUS_EXPR");
  IElementType REF_EXPR = new DflElementType("REF_EXPR");
  IElementType SIMPLE_KEY = new DflElementType("SIMPLE_KEY");
  IElementType SIMPLE_PROP = new DflElementType("SIMPLE_PROP");
  IElementType SIMPLE_REF_EXPR = new DflElementType("SIMPLE_REF_EXPR");
  IElementType SINGLE_OBJECT = new DflElementType("SINGLE_OBJECT");
  IElementType STRING_EXPR = new DflElementType("STRING_EXPR");
  IElementType UNARY_MIN_EXPR = new DflElementType("UNARY_MIN_EXPR");
  IElementType UNARY_PLUS_EXPR = new DflElementType("UNARY_PLUS_EXPR");
  IElementType VALUE = new DflElementType("VALUE");

  IElementType AS = new DflTokenType("AS");
  IElementType COLON = new DflTokenType(": ");
  IElementType COMMA = new DflTokenType(",");
  IElementType CONTAINS = new DflTokenType("CONTAINS");
  IElementType DISTINCT_BY = new DflTokenType("DISTINCT_BY");
  IElementType DOCUMENT_SEPARATOR = new DflTokenType("---");
  IElementType DOT = new DflTokenType(".");
  IElementType DOUBLE_QUOTED_STRING = new DflTokenType("DOUBLE_QUOTED_STRING");
  IElementType ENDS_WITH = new DflTokenType("ENDS_WITH");
  IElementType EXP = new DflTokenType("exp");
  IElementType FALSE = new DflTokenType("FALSE");
  IElementType FIND = new DflTokenType("FIND");
  IElementType GROUP_BY = new DflTokenType("GROUP_BY");
  IElementType ID = new DflTokenType("ID");
  IElementType IS = new DflTokenType("IS");
  IElementType LINE_COMMENT = new DflTokenType("LINE_COMMENT");
  IElementType LOWER = new DflTokenType("LOWER");
  IElementType L_BRACKET = new DflTokenType("[");
  IElementType L_CURLY = new DflTokenType("{");
  IElementType L_PARREN = new DflTokenType("(");
  IElementType MAP = new DflTokenType("MAP");
  IElementType MATCH = new DflTokenType("MATCH");
  IElementType MATCHES = new DflTokenType("MATCHES");
  IElementType NULL = new DflTokenType("null");
  IElementType NUMBER = new DflTokenType("NUMBER");
  IElementType ORDER_BY = new DflTokenType("ORDER_BY");
  IElementType OTHERWISE = new DflTokenType("OTHERWISE");
  IElementType OUTPUT = new DflTokenType("OUTPUT");
  IElementType RESSION = new DflTokenType("ression");
  IElementType R_BRACKET = new DflTokenType("]");
  IElementType R_CURLY = new DflTokenType("}");
  IElementType R_PARREN = new DflTokenType(")");
  IElementType SCAN = new DflTokenType("SCAN");
  IElementType SINGLE_QUOTED_STRING = new DflTokenType("SINGLE_QUOTED_STRING");
  IElementType SIZE_OF = new DflTokenType("SIZE_OF");
  IElementType SPLIT = new DflTokenType("SPLIT");
  IElementType STARTS_WITH = new DflTokenType("STARTS_WITH");
  IElementType TRIM = new DflTokenType("TRIM");
  IElementType TRUE = new DflTokenType("TRUE");
  IElementType TYPE = new DflTokenType("TYPE");
  IElementType UPPER = new DflTokenType("UPPER");
  IElementType VARIABLE = new DflTokenType("VARIABLE");
  IElementType VARIABLE_DEF = new DflTokenType("VARIABLE_DEF");
  IElementType VERSION = new DflTokenType("VERSION");
  IElementType WHEN = new DflTokenType("WHEN");
  IElementType WHERE = new DflTokenType("WHERE");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARRAY) {
        return new DflArrayImpl(node);
      }
      else if (type == ATTRIBUTES) {
        return new DflAttributesImpl(node);
      }
      else if (type == BOOL_EXPR) {
        return new DflBoolExprImpl(node);
      }
      else if (type == COMMENT_EXPR) {
        return new DflCommentExprImpl(node);
      }
      else if (type == COMPLEX_KEY) {
        return new DflComplexKeyImpl(node);
      }
      else if (type == COMPLEX_PROP) {
        return new DflComplexPropImpl(node);
      }
      else if (type == DATA_STRUCTURE) {
        return new DflDataStructureImpl(node);
      }
      else if (type == DIV_EXPR) {
        return new DflDivExprImpl(node);
      }
      else if (type == EXPRESSION) {
        return new DflExpressionImpl(node);
      }
      else if (type == HEADER) {
        return new DflHeaderImpl(node);
      }
      else if (type == IDENTIFIER) {
        return new DflIdentifierImpl(node);
      }
      else if (type == MINUS_EXPR) {
        return new DflMinusExprImpl(node);
      }
      else if (type == MUL_EXPR) {
        return new DflMulExprImpl(node);
      }
      else if (type == NUMBER_EXPR) {
        return new DflNumberExprImpl(node);
      }
      else if (type == OBJECT) {
        return new DflObjectImpl(node);
      }
      else if (type == PAREN_EXPR) {
        return new DflParenExprImpl(node);
      }
      else if (type == PLUS_EXPR) {
        return new DflPlusExprImpl(node);
      }
      else if (type == REF_EXPR) {
        return new DflRefExprImpl(node);
      }
      else if (type == SIMPLE_KEY) {
        return new DflSimpleKeyImpl(node);
      }
      else if (type == SIMPLE_PROP) {
        return new DflSimplePropImpl(node);
      }
      else if (type == SIMPLE_REF_EXPR) {
        return new DflSimpleRefExprImpl(node);
      }
      else if (type == SINGLE_OBJECT) {
        return new DflSingleObjectImpl(node);
      }
      else if (type == STRING_EXPR) {
        return new DflStringExprImpl(node);
      }
      else if (type == UNARY_MIN_EXPR) {
        return new DflUnaryMinExprImpl(node);
      }
      else if (type == UNARY_PLUS_EXPR) {
        return new DflUnaryPlusExprImpl(node);
      }
      else if (type == VALUE) {
        return new DflValueImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
