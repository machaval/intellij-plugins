package org.mule.dfl

import com.intellij.lang.Commenter

/**
 * Created by machaval on 1/1/15.
 */
class DflCommenter : Commenter {
    override fun getLineCommentPrefix(): String? {
        return "#";
    }

    override fun getBlockCommentPrefix(): String? {
        return "#";
    }

    override fun getBlockCommentSuffix(): String? {
        return "";
    }

    override fun getCommentedBlockCommentPrefix(): String? {
        return "#";
    }

    override fun getCommentedBlockCommentSuffix(): String? {
        return "";
    }
}