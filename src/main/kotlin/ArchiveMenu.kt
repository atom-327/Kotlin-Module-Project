class ArchiveMenu {
    fun menu() {
        while (true) {
            println("Меню архивов:\n1. Создать архив\n2. Открыть уже существующий архив\n3. Выход")
            when (val input = scanner.nextLine().toIntOrNull()) {
                1 -> {
                    println("Введите имя нового архива:")
                    val name = checkEmptyInput()
                    archives.add(Archive(name))
                    println("Архив создан")
                }

                2 -> {
                    val archiveList = ArchiveList()
                    archiveList.list(archives)
                }

                3 -> break
                else -> checkWrongValue(input)
            }
        }
    }
}
