fun main(args: Array<String>) {
    var jack = 14
    var kenny = 27
    var gloria:Long = 52
    var entero = 100
    var boleano = jack < kenny

    var edad = jack + kenny
    edad += gloria.toInt()

    var lista = arrayOf(2, 4, 5, 7, 8)




    var fibonacci:Int = 0  //  5
    var antes = 1 // 2
    var result: Int //  3
    for (i in 1..100){
        result = antes + fibonacci
        antes = fibonacci
        fibonacci = result
        println(fibonacci)
    }
}