import java.util.Scanner

fun main(args: Array<String>) {
    val archiveMenu = ArchiveMenu()
    archiveMenu.menu()
}

class Main() {
    companion object {
        val scanner = Scanner(System.`in`)
        val archives: MutableList<Archive> = mutableListOf()
    }
}

fun checkEmptyInput(): String {
    var input: String
    while (true) {
        input = Main.scanner.nextLine()
        if (input.isNotEmpty()) return input
        println("Вы ничего не ввели. Повторите ввод")
    }
}

fun checkWrongValue(input: Int?) {
    if (input !is Int) {
        println("Ввод должен быть целым числом")
    } else {
        println("Такого пункта в меню нет. Введите существующий")
    }
}
