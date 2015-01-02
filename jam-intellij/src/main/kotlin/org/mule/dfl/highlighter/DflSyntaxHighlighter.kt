package org.mule.dfl.highlighter

import com.intellij.openapi.fileTypes.SyntaxHighlighterBase
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.psi.tree.IElementType
import com.intellij.lexer.Lexer
import com.intellij.openapi.editor.DefaultLanguageHighlighterColors

import org.mule.dfl.parser.DflLexer
import org.mule.dfl.parser.psi.DflTypes
import com.intellij.openapi.editor.colors.TextAttributesKey.createTextAttributesKey

object DflSyntaxHighlighter : SyntaxHighlighterBase() {


    val KEYWORD: TextAttributesKey = createTextAttributesKey("DFL_KEYWORD", DefaultLanguageHighlighterColors.KEYWORD);
    val STRING: TextAttributesKey = createTextAttributesKey("DFL_STRING", DefaultLanguageHighlighterColors.STRING);
    val COMMENT: TextAttributesKey = createTextAttributesKey("DFL_LINE_COMMENT", DefaultLanguageHighlighterColors.LINE_COMMENT);
    val NUMBER: TextAttributesKey = createTextAttributesKey("DFL_NUMBER", DefaultLanguageHighlighterColors.NUMBER);
    val COMMA: TextAttributesKey = createTextAttributesKey("DFL_COMMA", DefaultLanguageHighlighterColors.SEMICOLON);
    val VARIABLE: TextAttributesKey = createTextAttributesKey("DFL_VARIABLE", DefaultLanguageHighlighterColors.INSTANCE_FIELD);


    val keywordsToken: Array<IElementType> = array(DflTypes.WHERE, DflTypes.MAP, DflTypes.ORDER_BY, DflTypes.DISTINCT_BY, DflTypes.GROUP_BY)

    override fun getHighlightingLexer(): Lexer {
        return DflLexer()
    }

    override fun getTokenHighlights(tokenType: IElementType?): Array<out TextAttributesKey>? {
        if (tokenType == null) {
            return array()
        }
        else if (tokenType.equals(DflTypes.LINE_COMMENT)) {
            return array(COMMENT);
        }
        else if (tokenType.equals(DflTypes.VERSION) || tokenType.equals(DflTypes.OUTPUT) || tokenType.equals(DflTypes.DOCUMENT_SEPARATOR)  ) {
            return array(COMMENT);
        }
        else if (tokenType.equals(DflTypes.NUMBER)) {
            return array(NUMBER);
        }
        else if (tokenType.equals(DflTypes.COMMA) || tokenType.equals(DflTypes.COLON)) {
            return array(COMMA);
        }
        else if (tokenType.equals(DflTypes.TRUE) || tokenType.equals(DflTypes.FALSE) || keywordsToken.contains(tokenType)) {
            return array(KEYWORD);
        }
        else if (tokenType.equals(DflTypes.DOUBLE_QUOTED_STRING) || tokenType.equals(DflTypes.SINGLE_QUOTED_STRING) ) {
            return array(STRING);
        }
        else if (tokenType.equals(DflTypes.VARIABLE) ) {
            return array(VARIABLE);
        }
        else {
            return array()
        }
    }
}