fun main()
// Программа написана Bazilevs Technology. 
{
    println("Вас приветствует программа Калькулятор 3.1.")
    print("Введите первое число:")
    var num1 = readLine().toString().toDouble()
    print("Введите второе число:")
    var num2 = readLine().toString().toDouble()
    print("Введите операцию:")
    var operation = readLine()

    when(operation)
    {
        "+" -> println(num1+num2)
        "-" -> println(num1-num2)
        "/" -> println(num1/num2)
        "*" -> println(num1*num2)
        ":" -> println(num1/num2)
        "х" -> println(num1*num2)
        "x" -> println(num1*num2)
        else -> println("Ошибка. Повторите попытку.")
    }

}
// Используйте IntelliJ IDEA от JetBrains.
// Язык программирования - Kotlin.
