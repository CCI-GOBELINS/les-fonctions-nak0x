import kotlin.math.sqrt

fun even(num: Int): List<Int> {
  val sequence = mutableListOf(0)
  for (i in 2..num) {
    if (i % 2 == 0) {
      sequence.add(i)
    }
  }
  return sequence
}

fun fibo(x: Int): List<Int> {
    val fibSequence = mutableListOf(0, 1)
    for (i in 2 until x) {
        val nextNumber = fibSequence[i - 1] + fibSequence[i - 2]
        fibSequence.add(nextNumber)
    }
    return fibSequence.take(x)
}

fun facto(x: Int = 10): Int {
  var result = 1
  for (i in x downTo 1) {
    result = result * i
  }
  return result
}

fun isPrime(number: Int): Boolean {
    if (number <= 1) return false
    if (number == 2 || number == 3) return true
    if (number % 2 == 0 || number % 3 == 0) return false

    var i = 5
    while (i * i <= number) {
        if (number % i == 0 || number % (i + 2) == 0) return false
        i += 6
    }
    return true
}

fun prime(x: Int): List<Int> {
  val sequence = mutableListOf(1)
  for (num in 1..x) {
    if(isPrime(num)) {
      sequence.add(num)
    }
  }
  return sequence
}

even(6)
fibo(20)
facto()
prime(20)
