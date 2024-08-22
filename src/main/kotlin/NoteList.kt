class NoteList {
    fun list(notes: List<Note>) {
        while (true) {
            println("Список заметок:")
            for (note in notes) {
                println("${notes.indexOf(note) + 1}. ${note.name}")
            }
            println("${notes.size + 1}. Выход")
            when (val input = scanner.nextLine().toIntOrNull()) {
                in 1..notes.size -> {
                    val noteScreen = NoteScreen()
                    noteScreen.screen(notes[input!! - 1])
                }

                notes.size + 1 -> return
                else -> checkWrongValue(input)
            }
        }
    }
}
