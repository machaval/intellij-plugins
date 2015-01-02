package org.mule.dfl.lang

import com.intellij.openapi.fileTypes.LanguageFileType
import javax.swing.Icon
import org.mule.dfl

object DflFileType : LanguageFileType(DflLanguage) {
    override fun getName(): String {
        return "Dfl"
    }

    override fun getDescription(): String {
        return "Dfl File"
    }

    override fun getDefaultExtension(): String {
        return "dfl"
    }

    override fun getIcon(): Icon? {
        return DflIcons.FILE
    }
}