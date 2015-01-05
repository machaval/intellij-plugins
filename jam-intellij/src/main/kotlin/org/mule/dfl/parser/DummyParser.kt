package org.mule.dfl.parser

import com.intellij.lang.PsiParser
import com.intellij.psi.tree.IElementType
import com.intellij.lang.PsiBuilder
import com.intellij.lang.ASTNode

/**
 * Created by machaval on 1/4/15.
 */
public class DummyParser : PsiParser {
    override fun parse(element: IElementType?, builder: PsiBuilder?): ASTNode {
        if (builder != null && element != null) {
            builder.advanceLexer()
            val marker: PsiBuilder.Marker? = builder.mark()
            return builder.getTreeBuilt()
        }
        else {
            throw RuntimeException("Invalid state")
        }
    }
}