package org.mule.dfl

import com.intellij.codeInsight.editorActions.QuoteHandler
import com.intellij.codeInsight.editorActions.SimpleTokenSetQuoteHandler
import com.intellij.psi.tree.TokenSet
import org.mule.dfl.parser.psi.DflTypes

class DflQuoteHandler : SimpleTokenSetQuoteHandler(TokenSet.create(DflTypes.DOUBLE_QUOTED_STRING, DflTypes.SINGLE_QUOTED_STRING))