/*


kotlinc kotex1.kt -include-runtime -d kotex1.jar
java -jar kotex1.jar

*/

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
}
