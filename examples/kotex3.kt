
/*
* Author   : freeman
* Date     : 2019.05.27
* version  : 0.0.1
* website  : https://kotlinlang.org/docs/reference/classes.html
* desc     : Example of Kotlin OOP
*          : kotlinc hello.kt -d hello.jar
*          : kotlin -classpath hello.jar HelloKt
**********************************************************************/

// need to figure out the inheritance portion
class Mammal {

	private var isMammal: Boolean  = true

	init {
		isMammal = true
	}

	fun notMammal() {
		isMammal = false
	}
}


class Dog ( var fn: String, var ln: String, var page: Int ) {

	// kotlin has a built-in setters and getters
	// One can over write them as well
	var fname: String = ""
	var lname: String = ""
	var fullName : String = ""
		get() {
			return fname + " " + lname
		}

	var forbiddenName : String = ""
		private set

	var fullNameAge : String = ""
		get() {
			return fname + " " + lname + " " + age.toString()
		}

	var age :  Int = 0

	init {
		fname = fn.capitalize()
		lname = ln.capitalize()
		age = page
	}
}


fun main(args: Array<String>) {

	val yodaheim = Dog("john", "burk", 29)
	println("${yodaheim.fname}")
	println("${yodaheim.lname}")
	println("${yodaheim.age}")
	println("${yodaheim.fullName}")
	println("${yodaheim.fullNameAge}")
}
