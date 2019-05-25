/*


kotlinc kotex1.kt -include-runtime -d kotex1.jar
java -jar kotex1.jar

*/

fun getValue() {
	print("Enter a string value? ")
	var mess = readLine()!!
	println("Your input is: $mess")
}

fun prtMess(mess: String) {

	println(mess)
}

fun add(x: Int, y: Int): Int {
	var sum : Int = x + y
	return sum
}

fun mul(x: Int, y: Int) : Int {
	var sum: Int = x * y
	return sum
}

fun main(args: Array<String>) {

	println("Hello planet")
	prtMess("what is meaning of life? ")
	getValue()
}
