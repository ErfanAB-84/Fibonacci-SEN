fun Fibonacci(n : Int) : Int{
    if(n == 1) {return 1}
    if (n == 2){return 2}

    return Fibonacci(n - 1) + Fibonacci(n - 2)
}
fun main(){
    var sum : Int = 0
    for (n in 1 until 1000000){
        val fib = Fibonacci(n)
        if (fib % 2 == 0) {
            sum += fib
        }
        if (fib >= 4000000){
            break
        }
        println(sum)
    }
}