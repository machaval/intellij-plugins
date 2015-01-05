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
    else if (t == BOOL_EXPR) {
      r = bool_expr(b, 0);
    }
    else if (t == COMMENT_EXPR) {
      r = comment_expr(b, 0);
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
    else if (t == DIV_EXPR) {
      r = expression(b, 0, 0);
    }
    else if (t == EXPRESSION) {
      r = expression(b, 0, -1);
    }
    else if (t == HEADER) {
      r = header(b, 0);
    }
    else if (t == IDENTIFIER) {
      r = identifier(b, 0);
    }
    else if (t == MINUS_EXPR) {
      r = expression(b, 0, -1);
    }
    else if (t == MUL_EXPR) {
      r = expression(b, 0, 0);
    }
    else if (t == NUMBER_EXPR) {
      r = number_expr(b, 0);
    }
    else if (t == OBJECT) {
      r = object(b, 0);
    }
    else if (t == PAREN_EXPR) {
      r = paren_expr(b, 0);
    }
    else if (t == PLUS_EXPR) {
      r = expression(b, 0, -1);
    }
    else if (t == REF_EXPR) {
      r = expression(b, 0, 2);
    }
    else if (t == SIMPLE_KEY) {
      r = simple_key(b, 0);
    }
    else if (t == SIMPLE_PROP) {
      r = simple_prop(b, 0);
    }
    else if (t == SIMPLE_REF_EXPR) {
      r = simple_ref_expr(b, 0);
    }
    else if (t == SINGLE_OBJECT) {
      r = single_object(b, 0);
    }
    else if (t == STRING_EXPR) {
      r = string_expr(b, 0);
    }
    else if (t == UNARY_MIN_EXPR) {
      r = unary_min_expr(b, 0);
    }
    else if (t == UNARY_PLUS_EXPR) {
      r = unary_plus_expr(b, 0);
    }
    else if (t == VALUE) {
      r = value(b, 0);
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
    create_token_set_(BOOL_EXPR, COMMENT_EXPR, DIV_EXPR, EXPRESSION,
      MINUS_EXPR, MUL_EXPR, NUMBER_EXPR, PAREN_EXPR,
      PLUS_EXPR, REF_EXPR, SIMPLE_REF_EXPR, STRING_EXPR,
      UNARY_MIN_EXPR, UNARY_PLUS_EXPR),
  };

  /* ********************************************************** */
  // L_BRACKET [!']' value (!']' "," value) *] R_BRACKET
  public static boolean array(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<Array>");
    r = consumeToken(b, L_BRACKET);
    p = r; // pin = 1
    r = r && report_error_(b, array_1(b, l + 1));
    r = p && consumeToken(b, R_BRACKET) && r;
    exit_section_(b, l, m, ARRAY, r, p, recover_parser_);
    return r || p;
  }

  // [!']' value (!']' "," value) *]
  private static boolean array_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1")) return false;
    array_1_0(b, l + 1);
    return true;
  }

  // !']' value (!']' "," value) *
  private static boolean array_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = array_1_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, value(b, l + 1));
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

  // (!']' "," value) *
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

  // !']' "," value
  private static boolean array_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "array_1_0_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = array_1_0_2_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, COMMA));
    r = p && value(b, l + 1) && r;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<attributes>");
    r = consumeToken(b, "@(");
    p = r; // pin = 1
    r = r && report_error_(b, attributes_1(b, l + 1));
    r = p && consumeToken(b, R_PARREN) && r;
    exit_section_(b, l, m, ATTRIBUTES, r, p, null);
    return r || p;
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = attributes_1_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, simple_prop(b, l + 1));
    r = p && attributes_1_0_2(b, l + 1) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // !')'
  private static boolean attributes_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, R_PARREN);
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
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = attributes_1_0_2_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, COMMA));
    r = p && simple_prop(b, l + 1) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // !')'
  private static boolean attributes_1_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "attributes_1_0_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, R_PARREN);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // primary_group [attributes]
  public static boolean complex_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_key")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<Key>");
    r = expression(b, l + 1, -2);
    r = r && complex_key_1(b, l + 1);
    exit_section_(b, l, m, COMPLEX_KEY, r, false, null);
    return r;
  }

  // [attributes]
  private static boolean complex_key_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_key_1")) return false;
    attributes(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // complex_key COLON value
  public static boolean complex_prop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "complex_prop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<complex prop>");
    r = complex_key(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, COMPLEX_PROP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // array | object_group
  public static boolean data_structure(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "data_structure")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<Data Structure>");
    r = array(b, l + 1);
    if (!r) r = object_group(b, l + 1);
    exit_section_(b, l, m, DATA_STRUCTURE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // [header] value | comment_expr
  static boolean document(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "document")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = document_0(b, l + 1);
    if (!r) r = comment_expr(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [header] value
  private static boolean document_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "document_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = document_0_0(b, l + 1);
    r = r && value(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // [header]
  private static boolean document_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "document_0_0")) return false;
    header(b, l + 1);
    return true;
  }

  /* ********************************************************** */
  // (comment_expr | VERSION | OUTPUT)+ DOCUMENT_SEPARATOR
  public static boolean header(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<Header>");
    r = header_0(b, l + 1);
    r = r && consumeToken(b, DOCUMENT_SEPARATOR);
    exit_section_(b, l, m, HEADER, r, false, null);
    return r;
  }

  // (comment_expr | VERSION | OUTPUT)+
  private static boolean header_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = header_0_0(b, l + 1);
    int c = current_position_(b);
    while (r) {
      if (!header_0_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "header_0", c)) break;
      c = current_position_(b);
    }
    exit_section_(b, m, null, r);
    return r;
  }

  // comment_expr | VERSION | OUTPUT
  private static boolean header_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "header_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = comment_expr(b, l + 1);
    if (!r) r = consumeToken(b, VERSION);
    if (!r) r = consumeToken(b, OUTPUT);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // ID
  public static boolean identifier(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "identifier")) return false;
    if (!nextTokenIs(b, ID)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, ID);
    exit_section_(b, m, IDENTIFIER, r);
    return r;
  }

  /* ********************************************************** */
  // L_CURLY [!'}' complex_prop (!'}' ',' complex_prop) *] R_CURLY
  public static boolean object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<Object>");
    r = consumeToken(b, L_CURLY);
    p = r; // pin = 1
    r = r && report_error_(b, object_1(b, l + 1));
    r = p && consumeToken(b, R_CURLY) && r;
    exit_section_(b, l, m, OBJECT, r, p, recover_parser_);
    return r || p;
  }

  // [!'}' complex_prop (!'}' ',' complex_prop) *]
  private static boolean object_1(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1")) return false;
    object_1_0(b, l + 1);
    return true;
  }

  // !'}' complex_prop (!'}' ',' complex_prop) *
  private static boolean object_1_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = object_1_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, complex_prop(b, l + 1));
    r = p && object_1_0_2(b, l + 1) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // !'}'
  private static boolean object_1_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, R_CURLY);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // (!'}' ',' complex_prop) *
  private static boolean object_1_0_2(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_0_2")) return false;
    int c = current_position_(b);
    while (true) {
      if (!object_1_0_2_0(b, l + 1)) break;
      if (!empty_element_parsed_guard_(b, "object_1_0_2", c)) break;
      c = current_position_(b);
    }
    return true;
  }

  // !'}' ',' complex_prop
  private static boolean object_1_0_2_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_0_2_0")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = object_1_0_2_0_0(b, l + 1);
    p = r; // pin = 1
    r = r && report_error_(b, consumeToken(b, COMMA));
    r = p && complex_prop(b, l + 1) && r;
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  // !'}'
  private static boolean object_1_0_2_0_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_1_0_2_0_0")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !consumeToken(b, R_CURLY);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // single_object | object
  static boolean object_group(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "object_group")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = single_object(b, l + 1);
    if (!r) r = object(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // !(',' |')' | '(' | ']' | '}' | '[' | '{')
  static boolean recover(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NOT_, null);
    r = !recover_0(b, l + 1);
    exit_section_(b, l, m, null, r, false, null);
    return r;
  }

  // ',' |')' | '(' | ']' | '}' | '[' | '{'
  private static boolean recover_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "recover_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeToken(b, COMMA);
    if (!r) r = consumeToken(b, R_PARREN);
    if (!r) r = consumeToken(b, L_PARREN);
    if (!r) r = consumeToken(b, R_BRACKET);
    if (!r) r = consumeToken(b, R_CURLY);
    if (!r) r = consumeToken(b, L_BRACKET);
    if (!r) r = consumeToken(b, L_CURLY);
    exit_section_(b, m, null, r);
    return r;
  }

  /* ********************************************************** */
  // primary_group
  public static boolean simple_key(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_key")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<Key>");
    r = expression(b, l + 1, -2);
    exit_section_(b, l, m, SIMPLE_KEY, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // simple_key COLON value
  public static boolean simple_prop(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_prop")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<simple prop>");
    r = simple_key(b, l + 1);
    r = r && consumeToken(b, COLON);
    r = r && value(b, l + 1);
    exit_section_(b, l, m, SIMPLE_PROP, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // complex_prop
  public static boolean single_object(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "single_object")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<Object>");
    r = complex_prop(b, l + 1);
    exit_section_(b, l, m, SINGLE_OBJECT, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // expression | data_structure
  public static boolean value(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "value")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<value>");
    r = expression(b, l + 1, -1);
    if (!r) r = data_structure(b, l + 1);
    exit_section_(b, l, m, VALUE, r, false, null);
    return r;
  }

  /* ********************************************************** */
  // Expression root: expression
  // Operator priority table:
  // 0: BINARY(plus_expr) BINARY(minus_expr)
  // 1: BINARY(mul_expr) BINARY(div_expr)
  // 2: PREFIX(unary_plus_expr) ATOM(unary_min_expr)
  // 3: POSTFIX(ref_expr)
  // 4: ATOM(simple_ref_expr) PREFIX(paren_expr)
  // 5: ATOM(string_expr) ATOM(bool_expr) ATOM(number_expr)
  // 6: ATOM(comment_expr)
  public static boolean expression(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression")) return false;
    addVariant(b, "<expression>");
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, "<expression>");
    r = unary_plus_expr(b, l + 1);
    if (!r) r = unary_min_expr(b, l + 1);
    if (!r) r = simple_ref_expr(b, l + 1);
    if (!r) r = string_expr(b, l + 1);
    if (!r) r = bool_expr(b, l + 1);
    if (!r) r = number_expr(b, l + 1);
    if (!r) r = paren_expr(b, l + 1);
    if (!r) r = comment_expr(b, l + 1);
    p = r;
    r = r && expression_0(b, l + 1, g);
    exit_section_(b, l, m, null, r, p, null);
    return r || p;
  }

  public static boolean expression_0(PsiBuilder b, int l, int g) {
    if (!recursion_guard_(b, l, "expression_0")) return false;
    boolean r = true;
    while (true) {
      Marker m = enter_section_(b, l, _LEFT_, null);
      if (g < 0 && consumeTokenSmart(b, "+")) {
        r = expression(b, l, 0);
        exit_section_(b, l, m, PLUS_EXPR, r, true, null);
      }
      else if (g < 0 && consumeTokenSmart(b, "-")) {
        r = expression(b, l, 0);
        exit_section_(b, l, m, MINUS_EXPR, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, "*")) {
        r = expression(b, l, 1);
        exit_section_(b, l, m, MUL_EXPR, r, true, null);
      }
      else if (g < 1 && consumeTokenSmart(b, "/")) {
        r = expression(b, l, 1);
        exit_section_(b, l, m, DIV_EXPR, r, true, null);
      }
      else if (g < 3 && ref_expr_0(b, l + 1)) {
        r = true;
        exit_section_(b, l, m, REF_EXPR, r, true, null);
      }
      else {
        exit_section_(b, l, m, null, false, false, null);
        break;
      }
    }
    return r;
  }

  public static boolean unary_plus_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_plus_expr")) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, "+");
    p = r;
    r = p && expression(b, l, 2);
    exit_section_(b, l, m, UNARY_PLUS_EXPR, r, p, null);
    return r || p;
  }

  // '-' exp  ression
  public static boolean unary_min_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "unary_min_expr")) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<unary min expr>");
    r = consumeTokenSmart(b, "-");
    r = r && consumeTokens(b, 0, EXP, RESSION);
    exit_section_(b, l, m, UNARY_MIN_EXPR, r, false, null);
    return r;
  }

  // '.' identifier
  private static boolean ref_expr_0(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "ref_expr_0")) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, DOT);
    r = r && identifier(b, l + 1);
    exit_section_(b, m, null, r);
    return r;
  }

  // VARIABLE
  public static boolean simple_ref_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "simple_ref_expr")) return false;
    if (!nextTokenIsFast(b, VARIABLE)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, VARIABLE);
    exit_section_(b, m, SIMPLE_REF_EXPR, r);
    return r;
  }

  // DOUBLE_QUOTED_STRING | SINGLE_QUOTED_STRING
  public static boolean string_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "string_expr")) return false;
    if (!nextTokenIsFast(b, DOUBLE_QUOTED_STRING, SINGLE_QUOTED_STRING)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<string expr>");
    r = consumeTokenSmart(b, DOUBLE_QUOTED_STRING);
    if (!r) r = consumeTokenSmart(b, SINGLE_QUOTED_STRING);
    exit_section_(b, l, m, STRING_EXPR, r, false, null);
    return r;
  }

  // TRUE | FALSE
  public static boolean bool_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "bool_expr")) return false;
    if (!nextTokenIsFast(b, FALSE, TRUE)) return false;
    boolean r;
    Marker m = enter_section_(b, l, _NONE_, "<bool expr>");
    r = consumeTokenSmart(b, TRUE);
    if (!r) r = consumeTokenSmart(b, FALSE);
    exit_section_(b, l, m, BOOL_EXPR, r, false, null);
    return r;
  }

  // NUMBER
  public static boolean number_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "number_expr")) return false;
    if (!nextTokenIsFast(b, NUMBER)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, NUMBER);
    exit_section_(b, m, NUMBER_EXPR, r);
    return r;
  }

  public static boolean paren_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "paren_expr")) return false;
    if (!nextTokenIsFast(b, L_PARREN)) return false;
    boolean r, p;
    Marker m = enter_section_(b, l, _NONE_, null);
    r = consumeTokenSmart(b, L_PARREN);
    p = r;
    r = p && expression(b, l, 4);
    r = p && report_error_(b, consumeToken(b, R_PARREN)) && r;
    exit_section_(b, l, m, PAREN_EXPR, r, p, null);
    return r || p;
  }

  // LINE_COMMENT
  public static boolean comment_expr(PsiBuilder b, int l) {
    if (!recursion_guard_(b, l, "comment_expr")) return false;
    if (!nextTokenIsFast(b, LINE_COMMENT)) return false;
    boolean r;
    Marker m = enter_section_(b);
    r = consumeTokenSmart(b, LINE_COMMENT);
    exit_section_(b, m, COMMENT_EXPR, r);
    return r;
  }

  final static Parser recover_parser_ = new Parser() {
    public boolean parse(PsiBuilder b, int l) {
      return recover(b, l + 1);
    }
  };
}
