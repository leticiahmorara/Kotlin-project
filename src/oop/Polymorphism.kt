package oop

 open class ClassOne{
    fun ugali(){
        println("I hate ugali")
    }
    fun githeri(){
        println("I love githeri")
    }
}
open class ClassTwo:ClassOne(){

}
class ClassThree:ClassTwo(){

}

fun main(args: Array<String>) {
    var myObj =ClassThree()
    myObj.githeri()
}