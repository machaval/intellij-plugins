package org.mule.dfl

import com.intellij.lang.PairedBraceMatcher
import com.intellij.lang.BracePair
import com.intellij.psi.tree.IElementType
import com.intellij.psi.PsiFile
import org.mule.dfl.parser.psi.DflTypes


class DflPairedBraceMatcher : PairedBraceMatcher {
    override fun getPairs(): Array<out BracePair>? {
        return array(BracePair(DflTypes.L_BRACKET, DflTypes.R_BRACKET, true), BracePair(DflTypes.L_CURLY, DflTypes.R_CURLY, true))
    }

    override fun isPairedBracesAllowedBeforeType(p0: IElementType, p1: IElementType?): Boolean {
        return true
    }

    override fun getCodeConstructStart(p0: PsiFile?, openingBraceOffset: Int): Int {
        return openingBraceOffset
    }
}