package data

import java.io.File

class LocalFileStore: FileStore {
    override fun writeToFile(string: String) {
        val file = File("output/output.txt")
        file.createNewFile()
        file.writeText(string)
    }
}