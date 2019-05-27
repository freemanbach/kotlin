
/*
* Author   : freeman
* Date     : 2019.05.27
* version  : 0.0.2
* website  : https://kotlinlang.org/docs/tutorials/command-line.html
* desc     : kotlinc hello.kt -d hello.jar
*          : kotlin -classpath hello.jar HelloKt
**********************************************************************/

fun sub(x: Float, y: Float): Float  {
	var ans : Float = x - y
	return ans
}


fun div(x: Float, y: Float): Float {
	var ans : Float = x / y
	return ans
}


fun add(x: Float, y: Float): Float {
	var ans : Float = x + y
	return ans
}


fun mul(x: Float, y: Float) : Float {
	var ans: Float= x * y
	return ans
}


fun fib(n : Float): Float {
	if (n <= 1) {
		return n
	}
	else { 
		return fib(n - 1) + fib(n-2) 
	}
}
