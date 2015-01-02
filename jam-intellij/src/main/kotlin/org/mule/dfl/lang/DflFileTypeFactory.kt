package org.mule.dfl.lang

import com.intellij.openapi.fileTypes.FileTypeFactory
import com.intellij.openapi.fileTypes.FileTypeConsumer

class DflFileTypeFactory : FileTypeFactory() {
    override fun createFileTypes(fileTypeConsumer: FileTypeConsumer) {
        fileTypeConsumer.consume(DflFileType, "dfl");
    }
}