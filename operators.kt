

fun main(args: Array<String>) {
    var a = 2
    var b = 4
    var ans = a + b
    println(ans)

    var c = 21
    var d = 3
    var ans1 = c / d
    println(ans1)

    ans1++
    println(ans1)

    var ans2 = ans * ans1
    println(ans2)

    var ans3 = ans2 - (ans * ans1)
    println(ans3)

    var ans4 = ans3 == ans2 - (ans * ans1)
    println(ans4)
}