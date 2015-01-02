package org.mule.dfl.lang

import com.intellij.psi.FileViewProvider
import com.intellij.extapi.psi.PsiFileBase
import com.intellij.openapi.fileTypes.FileType
import org.mule.dfl

class DflFile(viewProvider: FileViewProvider) : PsiFileBase(viewProvider, DflLanguage) {
    override fun getFileType(): FileType {
        return DflFileType
    }
}