class NoteMenu {
    fun menu(archive: Archive) {
        while (true) {
            println("Меню заметок:\n1. Создать заметку\n2. Открыть уже существующую заметку\n3. Выход")
            when (val input = scanner.nextLine().toIntOrNull()) {
                1 -> {
                    println("Введите имя новой заметки:")
                    val name = checkEmptyInput()
                    println("Введите текст новой заметки:")
                    val content = checkEmptyInput()
                    archive.putNote(Note(name, content))
                    println("Заметка создана")
                }

                2 -> {
                    val noteList = NoteList()
                    noteList.list(archive.getNotes())
                }

                3 -> return
                else -> checkWrongValue(input)
            }
        }
    }
}
