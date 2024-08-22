data class Note(val name: String, private var content: String) {
    fun addContent(string: String) {
        content += "\n$string"
    }

    fun getContent(): String = content
}
