package org.mule.dfl.highlighter

import com.intellij.openapi.options.colors.ColorSettingsPage
import com.intellij.util.xml.reflect.CustomDomChildrenDescription
import javax.swing.Icon
import com.intellij.openapi.fileTypes.SyntaxHighlighter
import com.intellij.openapi.editor.colors.TextAttributesKey
import com.intellij.openapi.options.colors.AttributesDescriptor
import com.intellij.openapi.options.colors.ColorDescriptor
import org.mule.dfl.lang.DflIcons

class DflColorSettingsPage : ColorSettingsPage {

    val DESCRIPTORS: Array<out AttributesDescriptor> = array(AttributesDescriptor("Keywords", DflSyntaxHighlighter.KEYWORD),
                                                             AttributesDescriptor("Separator", DflSyntaxHighlighter.COMMA),
                                                             AttributesDescriptor("Variable", DflSyntaxHighlighter.VARIABLE),
                                                             AttributesDescriptor("Number", DflSyntaxHighlighter.NUMBER),
                                                             AttributesDescriptor("String", DflSyntaxHighlighter.STRING))

    override fun getIcon(): Icon? {
        return DflIcons.FILE
    }

    override fun getHighlighter(): SyntaxHighlighter {
        return DflSyntaxHighlighter
    }

    override fun getDemoText(): String {
        return "%dfl0.1\n" + "%output xml\n" + "---\n" + "{\n" + "  a: \$a.b.c.d?,\n" + "  b: \$a['b']['c']['d']?,\n" + "  c: \$a['b'].c['d'].e?,\n" + "  d: \$a.b[0][1]?,\n" + "  e: ['Mariano'][0]?\n}"
    }

    override fun getAdditionalHighlightingTagToDescriptorMap(): MutableMap<String, TextAttributesKey>? {
        return hashMapOf()
    }

    override fun getAttributeDescriptors(): Array<out AttributesDescriptor>? {
        return DESCRIPTORS;
    }

    override fun getColorDescriptors(): Array<out ColorDescriptor>? {
        return ColorDescriptor.EMPTY_ARRAY;
    }

    override fun getDisplayName(): String {
        return "Dfl"
    }
}