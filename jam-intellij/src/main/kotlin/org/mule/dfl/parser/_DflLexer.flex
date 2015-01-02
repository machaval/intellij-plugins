package org.mule.dfl.parser;
import com.intellij.lexer.*;
import com.intellij.psi.tree.IElementType;
import static org.mule.dfl.parser.psi.DflTypes.*;

%%

%{
  public _DflLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _DflLexer
%implements FlexLexer
%function advance
%type IElementType
%unicode

EOL="\r"|"\n"|"\r\n"
LINE_WS=[\ \t\f]
WHITE_SPACE=({LINE_WS}|{EOL})+

LINE_COMMENT=#.*
DOUBLE_QUOTED_STRING=\"([^\\\"\r\n]|\\[^\r\n])*\"?
SINGLE_QUOTED_STRING='([^\\'\r\n]|\\[^\r\n])*'?
NUMBER=-?(0|[1-9][0-9]*)(\.[0-9]+)?([eE][+-]?[0-9]*)?
VERSION=%dfl[0-9]+\.[0-9]+
OUTPUT=%output [a-z]+
VARIABLE=\$[a-z]*

%%
<YYINITIAL> {
  {WHITE_SPACE}               { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "{"                         { return L_CURLY; }
  "}"                         { return R_CURLY; }
  "["                         { return L_BRACKET; }
  "]"                         { return R_BRACKET; }
  "."                         { return DOT; }
  ","                         { return COMMA; }
  ":"                         { return COLON; }
  "true"                      { return TRUE; }
  "false"                     { return FALSE; }
  "map"                       { return MAP; }
  "orderBy"                   { return ORDER_BY; }
  "groupBy"                   { return GROUP_BY; }
  "where"                     { return WHERE; }
  "distinctBy"                { return DISTINCT_BY; }
  "when"                      { return WHEN; }
  "otherwise"                 { return OTHERWISE; }
  "null"                      { return NULL; }
  "---"                       { return DOCUMENT_SEPARATOR; }

  {LINE_COMMENT}              { return LINE_COMMENT; }
  {DOUBLE_QUOTED_STRING}      { return DOUBLE_QUOTED_STRING; }
  {SINGLE_QUOTED_STRING}      { return SINGLE_QUOTED_STRING; }
  {NUMBER}                    { return NUMBER; }
  {VERSION}                   { return VERSION; }
  {OUTPUT}                    { return OUTPUT; }
  {VARIABLE}                  { return VARIABLE; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
