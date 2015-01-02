// This is a generated file. Not intended for manual editing.
package org.mule.dfl.parser;

import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import static org.mule.dfl.parser.psi.DflTypes.*;
import static com.intellij.lang.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class DflParser implements PsiParser {

  public ASTNode parse(IElementType t, PsiBuilder b) {
    parseLight(t, b);
    return b.getTreeBuilt();
  }

  public void parseLight(IElementType t, PsiBuilder b) {
    boolean r;
    b = adapt_builder_(t, b, this, EXTENDS_SETS_);
    Marker m = enter_section_(b, 0, _COLLAPSE_, null);
    if (t == ARRAY) {
      r = array(b, 0);
    }
    else if (t == ATTRIBUTES) {
      r = attributes(b, 0);
    }
    else if (t == COMPLEX_KEY) {
      r = complex_key(b, 0);
    }
    else if (t == COMPLEX_PROP) {
      r = complex_prop(b, 0);
    }
    else if (t == DATA_STRUCTURE) {
      r = data_structure(b, 0);
    }
    else if (t == OBJECT) {
      r = object(b, 0);
    }
    else if (t == SIMPLE_KEY) {
      r = simple_key(b, 0);
    }
    else if (t == SIMPLE_PROP) {
      r = simple_prop(b, 0);
    }
    else {
      r = parse_root_(t, b, 0);
    }
    exit_section_(b, 0, m, t, r, true, TRUE_CONDITION);
  }

  protected boolean parse_root_(IElementType t, PsiBuilder b, int l) {
    return document(b, l + 1);
  }

  public static final TokenSet[] EXTENDS_SETS_ = new TokenSet[] {
    create_token_set_(ARRAY, DATA_STRUCTURE, OBJECT),
  };

  /* ********************************************************** */
  // L_CURLY [!']' item (!']' COMMA item) *] R_CURLY
  public static boolean array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array")) return false;
    if (!nextTokenIs(b, L_CURLY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, L_CURLY);
    p = r; // pin = 1
    r = r && report_error_(b, array_1(b, l + 1));
    r = p && consumeToken(b, R_CURLY) && r;
    exit_section_(b, l, m, ARRAY, r, p, null);
    return r || p;
  }

  // [!']' item (!']' COMMA item) *]
  private static boolean array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1")) return false;
    array_1_0(b, l + 1);
    return true;
  }

  // !']' item (!']' COMMA item) *
  private static boolean array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = array_1_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, item(b, l + 1));
    r = p && array_1_0_2(b, l + 1) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // !']'
  private static boolean array_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, R_BRACKET);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // (!']' COMMA item) *
  private static boolean array_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!array_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "array_1_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // !']' COMMA item
  private static boolean array_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = array_1_0_2_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, COMMA));
    r = p && item(b, l + 1) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // !']'
  private static boolean array_1_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, R_BRACKET);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // "@(" [ !')' simple_prop ( !')' ',' simple_prop) * ] ')'
  public static boolean attributes(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<attributes>");
    r = consumeToken(b, "@(");
    r = r && attributes_1(b, l + 1);
    r = r && consumeToken(b, ")");
    exit_section_(b, l, m, ATTRIBUTES, r, false, null);
    return r;
  }

  // [ !')' simple_prop ( !')' ',' simple_prop) * ]
  private static boolean attributes_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_1")) return false;
    attributes_1_0(b, l + 1);
    return true;
  }

  // !')' simple_prop ( !')' ',' simple_prop) *
  private static boolean attributes_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attributes_1_0_0(b, l + 1);
    r = r && simple_prop(b, l + 1);
    r = r && attributes_1_0_2(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !')'
  private static boolean attributes_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, ")");
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // ( !')' ',' simple_prop) *
  private static boolean attributes_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_1_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!attributes_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "attributes_1_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // !')' ',' simple_prop
  private static boolean attributes_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_1_0_2_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attributes_1_0_2_0_0(b, l + 1);
    r = r && consumeToken(b, COMMA);
    r = r && simple_prop(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // !')'
  private static boolean attributes_1_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_1_0_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, ")");
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // DOUBLE_QUOTED_STRING (attributes)?
  public static boolean complex_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_key")) return false;
    if (!nextTokenIs(b, DOUBLE_QUOTED_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_QUOTED_STRING);
    r = r && complex_key_1(b, l + 1);
    exit_section_(b, m, COMPLEX_KEY, r);
    return r;
  }

  // (attributes)?
  private static boolean complex_key_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_key_1")) return false;
    complex_key_1_0(b, l + 1);
    return true;
  }

  // (attributes)
  private static boolean complex_key_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_key_1_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = attributes(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // '{' [ !'}' complex_prop ( !'}' COMMA complex_prop) * ] '}'
  static boolean complex_object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_object")) return false;
    if (!nextTokenIs(b, L_CURLY)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeToken(b, L_CURLY);
    p = r; // pin = 1
    r = r && report_error_(b, complex_object_1(b, l + 1));
    r = p && consumeToken(b, R_CURLY) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // [ !'}' complex_prop ( !'}' COMMA complex_prop) * ]
  private static boolean complex_object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_object_1")) return false;
    complex_object_1_0(b, l + 1);
    return true;
  }

  // !'}' complex_prop ( !'}' COMMA complex_prop) *
  private static boolean complex_object_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_object_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = complex_object_1_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, complex_prop(b, l + 1));
    r = p && complex_object_1_0_2(b, l + 1) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // !'}'
  private static boolean complex_object_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_object_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, R_CURLY);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // ( !'}' COMMA complex_prop) *
  private static boolean complex_object_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_object_1_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!complex_object_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "complex_object_1_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // !'}' COMMA complex_prop
  private static boolean complex_object_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_object_1_0_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = complex_object_1_0_2_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, COMMA));
    r = p && complex_prop(b, l + 1) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // !'}'
  private static boolean complex_object_1_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_object_1_0_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, R_CURLY);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // complex_key COLON value
  public static boolean complex_prop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_prop")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<complex prop>");
    r = complex_key(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, COLON));
    r = p && value(b, l + 1) && r;
    exit_section_(b, l, m, COMPLEX_PROP, r, p, recover_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // array | object | LINE_COMMENT
  public static boolean data_structure(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_structure")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _COLLAPSE_, "<data structure>");
    r = array(b, l + 1);
    if (!r) r = object(b, l + 1);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    exit_section_(b, l, m, DATA_STRUCTURE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // data_structure
  static boolean document(PsiBuilder b, int l) {
    return data_structure(b, l + 1);
  }

  /* ********************************************************** */
  // data_structure
  static boolean item(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "item")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = data_structure(b, l + 1);
    exit_section_(b, l, m, null, r, false, recover_parser_);
    return r;
  }

  /* ********************************************************** */
  // single_object | complex_object
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    if (!nextTokenIs(b, "<object>", L_CURLY, DOUBLE_QUOTED_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<object>");
    r = single_object(b, l + 1);
    if (!r) r = complex_object(b, l + 1);
    exit_section_(b, l, m, OBJECT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // !(',' | ']' | '}' | '[' | '{')
  static boolean recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !recover_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // ',' | ']' | '}' | '[' | '{'
  private static boolean recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, R_BRACKET);
    if (!r) r = consumeToken(b, R_CURLY);
    if (!r) r = consumeToken(b, L_BRACKET);
    if (!r) r = consumeToken(b, L_CURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // DOUBLE_QUOTED_STRING
  public static boolean simple_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_key")) return false;
    if (!nextTokenIs(b, DOUBLE_QUOTED_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, DOUBLE_QUOTED_STRING);
    exit_section_(b, m, SIMPLE_KEY, r);
    return r;
  }

  /* ********************************************************** */
  // DOUBLE_QUOTED_STRING COLON value
  public static boolean simple_prop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_prop")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<simple prop>");
    r = consumeTokens(b, 1, DOUBLE_QUOTED_STRING, COLON);
    p = r; // pin = 1
    r = r && value(b, l + 1);
    exit_section_(b, l, m, SIMPLE_PROP, r, p, recover_parser_);
    return r || p;
  }

  /* ********************************************************** */
  // complex_key
  static boolean single_object(PsiBuilder b, int l) {
    return complex_key(b, l + 1);
  }

  /* ********************************************************** */
  // DOUBLE_QUOTED_STRING | NUMBER | data_structure | LINE_COMMENT
  static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<value>");
    r = consumeToken(b, DOUBLE_QUOTED_STRING);
    if (!r) r = consumeToken(b, NUMBER);
    if (!r) r = data_structure(b, l + 1);
    if (!r) r = consumeToken(b, LINE_COMMENT);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  final static Parser recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return recover(b, l + 1);
    }
  };
}
