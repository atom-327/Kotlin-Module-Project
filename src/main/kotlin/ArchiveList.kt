class ArchiveList {
    fun list(archives: MutableList<Archive>) {
        while (true) {
            println("Список архивов:")
            for (archive in archives) {
                println("${archives.indexOf(archive) + 1}. ${archive.name}")
            }
            println("${archives.size + 1}. Выход")
            when (val input = Main.scanner.nextLine().toIntOrNull()) {
                in 1..archives.size -> {
                    val noteMenu = NoteMenu()
                    noteMenu.menu(archives[input!! - 1])
                }

                archives.size + 1 -> return
                else -> checkWrongValue(input)
            }
        }
    }
}
