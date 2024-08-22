import java.util.Scanner

fun main(args: Array<String>) {
    val archiveMenu = ArchiveMenu()
    archiveMenu.menu()
}

val scanner = Scanner(System.`in`)
val archives: MutableList<Archive> = mutableListOf()

fun checkEmptyInput(): String {
    var input: String
    while (true) {
        input = scanner.nextLine().trim()
        if (input.isNotEmpty()) return input else println("Вы ничего не ввели. Повторите ввод")
    }
}

fun checkWrongValue(input: Int?) {
    if (input !is Int) {
        println("Ввод должен быть целым числом")
    } else {
        println("Такого пункта в меню нет. Введите существующий")
    }
}
