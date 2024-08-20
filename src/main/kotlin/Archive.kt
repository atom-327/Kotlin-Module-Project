class Archive(val name: String) {
    private val notes: MutableList<Note> = mutableListOf()
    fun putNote(note: Note) {
        notes.add(note)
    }

    fun getNotes(): MutableList<Note> = notes
}
