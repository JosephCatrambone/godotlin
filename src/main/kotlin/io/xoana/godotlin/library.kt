package io.xoana.godotlin

fun exportMethod() {
	println("This prints a string to stdout!");
}

fun returnAnInteger(): Int {
	return 17;
}

fun isIntegerBiggerThanTen(x:Int): Boolean {
	return x > 10
}

fun main(args: Array<String>) {
	println("This should not run.")
}
