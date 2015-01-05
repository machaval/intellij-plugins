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
TRUE=[ \t\n\x0B\f\r]true[ \t\n\x0B\f\r]
FALSE=[ \t\n\x0B\f\r]false[ \t\n\x0B\f\r]
NULL=[ \t\n\x0B\f\r]null[ \t\n\x0B\f\r]
MAP=[ \t\n\x0B\f\r]map[ \t\n\x0B\f\r]
ORDER_BY=[ \t\n\x0B\f\r]orderBy[ \t\n\x0B\f\r]
GROUP_BY=[ \t\n\x0B\f\r]groupBy[ \t\n\x0B\f\r]
WHERE=[ \t\n\x0B\f\r]where[ \t\n\x0B\f\r]
DISTINCT_BY=[ \t\n\x0B\f\r]distinctBy[ \t\n\x0B\f\r]
WHEN=[ \t\n\x0B\f\r]when[ \t\n\x0B\f\r]
OTHERWISE=[ \t\n\x0B\f\r]otherwise[ \t\n\x0B\f\r]
AS=[ \t\n\x0B\f\r]as[ \t\n\x0B\f\r]
IS=[ \t\n\x0B\f\r]is[ \t\n\x0B\f\r]
STARTS_WITH=[ \t\n\x0B\f\r]startsWith[ \t\n\x0B\f\r]
ENDS_WITH=[ \t\n\x0B\f\r]endsWith[ \t\n\x0B\f\r]
MATCHES=[ \t\n\x0B\f\r]matches[ \t\n\x0B\f\r]
CONTAINS=[ \t\n\x0B\f\r]contains[ \t\n\x0B\f\r]
LOWER=lower[ \t\n\x0B\f\r]
UPPER=upper[ \t\n\x0B\f\r]
SPLIT=split[ \t\n\x0B\f\r]
TRIM=trim[ \t\n\x0B\f\r]
MATCH=[ \t\n\x0B\f\r]match[ \t\n\x0B\f\r]
SIZE_OF=sizeOf[ \t\n\x0B\f\r]
FIND=[ \t\n\x0B\f\r]find[ \t\n\x0B\f\r]
SCAN=[ \t\n\x0B\f\r]scan[ \t\n\x0B\f\r]
VERSION=%dfl[0-9]+\.[0-9]+
OUTPUT=%output[ a-z]+
VARIABLE=\$[a-z0-9A-Z_-]*
VARIABLE_DEF=\&[a-z0-9A-Z_-]+
TYPE=:[a-z0-9A-Z_-]+
ID=[a-z0-9A-Z_-]+

%%
<YYINITIAL> {
  {WHITE_SPACE}               { return com.intellij.psi.TokenType.WHITE_SPACE; }

  "("                         { return L_PARREN; }
  ")"                         { return R_PARREN; }
  "{"                         { return L_CURLY; }
  "}"                         { return R_CURLY; }
  "["                         { return L_BRACKET; }
  "]"                         { return R_BRACKET; }
  "."                         { return DOT; }
  ","                         { return COMMA; }
  ": "                        { return COLON; }
  "null"                      { return NULL; }
  "---"                       { return DOCUMENT_SEPARATOR; }
  "exp"                       { return EXP; }
  "ression"                   { return RESSION; }

  {LINE_COMMENT}              { return LINE_COMMENT; }
  {DOUBLE_QUOTED_STRING}      { return DOUBLE_QUOTED_STRING; }
  {SINGLE_QUOTED_STRING}      { return SINGLE_QUOTED_STRING; }
  {NUMBER}                    { return NUMBER; }
  {TRUE}                      { return TRUE; }
  {FALSE}                     { return FALSE; }
  {NULL}                      { return NULL; }
  {MAP}                       { return MAP; }
  {ORDER_BY}                  { return ORDER_BY; }
  {GROUP_BY}                  { return GROUP_BY; }
  {WHERE}                     { return WHERE; }
  {DISTINCT_BY}               { return DISTINCT_BY; }
  {WHEN}                      { return WHEN; }
  {OTHERWISE}                 { return OTHERWISE; }
  {AS}                        { return AS; }
  {IS}                        { return IS; }
  {STARTS_WITH}               { return STARTS_WITH; }
  {ENDS_WITH}                 { return ENDS_WITH; }
  {MATCHES}                   { return MATCHES; }
  {CONTAINS}                  { return CONTAINS; }
  {LOWER}                     { return LOWER; }
  {UPPER}                     { return UPPER; }
  {SPLIT}                     { return SPLIT; }
  {TRIM}                      { return TRIM; }
  {MATCH}                     { return MATCH; }
  {SIZE_OF}                   { return SIZE_OF; }
  {FIND}                      { return FIND; }
  {SCAN}                      { return SCAN; }
  {VERSION}                   { return VERSION; }
  {OUTPUT}                    { return OUTPUT; }
  {VARIABLE}                  { return VARIABLE; }
  {VARIABLE_DEF}              { return VARIABLE_DEF; }
  {TYPE}                      { return TYPE; }
  {ID}                        { return ID; }

  [^] { return com.intellij.psi.TokenType.BAD_CHARACTER; }
}
