class NoteScreen {
    fun screen(note: Note) {
        while (true) {
            println("Экран заметки:\n1. Дополнить заметку\n2. Открыть заметку\n3. Выход")
            when (val input = Main.scanner.nextLine().toIntOrNull()) {
                1 -> {
                    println("Введите дополнение к заметке:")
                    val content = checkEmptyInput()
                    note.addContent(content)
                    println("Заметка дополнена")
                }

                2 -> println("Заметка: ${note.name}\nСодержание: ${note.getContent()}")
                3 -> return
                else -> checkWrongValue(input)
            }
        }
    }
}
