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
  IElementType COMPLEX_KEY = new DflElementType("COMPLEX_KEY");
  IElementType COMPLEX_PROP = new DflElementType("COMPLEX_PROP");
  IElementType DATA_STRUCTURE = new DflElementType("DATA_STRUCTURE");
  IElementType OBJECT = new DflElementType("OBJECT");
  IElementType SIMPLE_KEY = new DflElementType("SIMPLE_KEY");
  IElementType SIMPLE_PROP = new DflElementType("SIMPLE_PROP");

  IElementType COLON = new DflTokenType(":");
  IElementType COMMA = new DflTokenType(",");
  IElementType DISTINCT_BY = new DflTokenType("distinctBy");
  IElementType DOCUMENT_SEPARATOR = new DflTokenType("---");
  IElementType DOT = new DflTokenType(".");
  IElementType DOUBLE_QUOTED_STRING = new DflTokenType("DOUBLE_QUOTED_STRING");
  IElementType FALSE = new DflTokenType("false");
  IElementType GROUP_BY = new DflTokenType("groupBy");
  IElementType LINE_COMMENT = new DflTokenType("LINE_COMMENT");
  IElementType L_BRACKET = new DflTokenType("[");
  IElementType L_CURLY = new DflTokenType("{");
  IElementType MAP = new DflTokenType("map");
  IElementType NULL = new DflTokenType("null");
  IElementType NUMBER = new DflTokenType("NUMBER");
  IElementType ORDER_BY = new DflTokenType("orderBy");
  IElementType OTHERWISE = new DflTokenType("otherwise");
  IElementType OUTPUT = new DflTokenType("OUTPUT");
  IElementType R_BRACKET = new DflTokenType("]");
  IElementType R_CURLY = new DflTokenType("}");
  IElementType SINGLE_QUOTED_STRING = new DflTokenType("SINGLE_QUOTED_STRING");
  IElementType TRUE = new DflTokenType("true");
  IElementType VARIABLE = new DflTokenType("VARIABLE");
  IElementType VERSION = new DflTokenType("VERSION");
  IElementType WHEN = new DflTokenType("when");
  IElementType WHERE = new DflTokenType("where");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == ARRAY) {
        return new DflArrayImpl(node);
      }
      else if (type == ATTRIBUTES) {
        return new DflAttributesImpl(node);
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
      else if (type == OBJECT) {
        return new DflObjectImpl(node);
      }
      else if (type == SIMPLE_KEY) {
        return new DflSimpleKeyImpl(node);
      }
      else if (type == SIMPLE_PROP) {
        return new DflSimplePropImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
