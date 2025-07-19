fun main() {
    val a = 7
    val b = 2

    println("a + b = ${a + b}")
    println("a - b = ${a - b}")
    println("a * b = ${a * b}")
    println("a / b = ${a / b}")
    println("a % b = ${a % b}")

    println("--------------------")

    var result = a + b

    result -= 3
    println("result = $result")

    result *= 2
    println("result = $result")

    println("result = ${result++}")
    println("result = ${++result}")
    println("result = ${result--}")
    println("result = ${--result}")

    println("--------------------")

    val isSunny = false
    if (isSunny)
        println("Let's go for a walk!")
    else
        println("Let's watch TV")

    println("--------------------")

    val points : Byte = 92
    if (points < 50) {
        println("Poor")
    } else if (points < 75) {
        println("Satisfactory")
    } else if (points < 90) {
        println("Good")
    } else {
        println("Excellent")
    }
}
