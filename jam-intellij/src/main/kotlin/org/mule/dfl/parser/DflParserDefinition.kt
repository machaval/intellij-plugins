package org.mule.dfl.parser

import com.intellij.lang.ParserDefinition
import com.intellij.psi.tree.TokenSet
import com.intellij.psi.tree.IFileElementType
import com.intellij.openapi.project.Project
import com.intellij.lexer.Lexer
import com.intellij.lang.PsiParser
import com.intellij.lang.ASTNode
import com.intellij.psi.PsiElement
import com.intellij.psi.FileViewProvider
import com.intellij.psi.PsiFile
import com.intellij.psi.TokenType

import org.mule.dfl.lang.DflFile
import org.mule.dfl.lang.DflLanguage
import org.mule.dfl.parser.psi.DflTypes

class DflParserDefinition : ParserDefinition {

    val WHITE_SPACES: TokenSet = TokenSet.create(TokenType.WHITE_SPACE)
    val COMMENTS: TokenSet = TokenSet.create(DflTypes.LINE_COMMENT)
    val FILE: IFileElementType = IFileElementType(DflLanguage)

    override fun createLexer(p0: Project?): Lexer {
        return DflLexer()
    }

    override fun createParser(p0: Project?): PsiParser? {
        return DflParser()
    }

    override fun getFileNodeType(): IFileElementType? {
        return FILE
    }

    override fun getWhitespaceTokens(): TokenSet {
        return WHITE_SPACES;
    }

    override fun getCommentTokens(): TokenSet {
        return COMMENTS
    }

    override fun getStringLiteralElements(): TokenSet {
        return TokenSet.EMPTY
    }

    override fun createElement(astNode: ASTNode?): PsiElement {
        return DflTypes.Factory.createElement(astNode)
    }

    override fun createFile(viewProvider: FileViewProvider?): PsiFile? {
        if (viewProvider != null) {
            return DflFile(viewProvider);
        }
        else {
            throw RuntimeException("Invalid file viewer null!!!")
        }
    }

    override fun spaceExistanceTypeBetweenTokens(p0: ASTNode?, p1: ASTNode?): ParserDefinition.SpaceRequirements? {
        return ParserDefinition.SpaceRequirements.MAY;
    }
}