package oop

 abstract class FirstClass (open var name:String,open var age:Int){
     abstract fun motto()
     abstract fun mission()
}

class SecondClass(override var name: String,
                  override var age: Int):FirstClass(name,age){
    override fun motto() {
        println("Education is the key")
    }

    override fun mission() {
        println("To educate the world")
    }
                  }
class ThirdClass(override var name: String,
                  override var age: Int):FirstClass(name,age){
    override fun motto() {
        println("Education of better life")
    }

    override fun mission() {
        println("To be future queens")
    }
}

fun main(args: Array<String>) {
    var xyz=ThirdClass("letty",100)
    xyz.motto()
}
//From Auth class,on register and login methods respectively
//validate any users email and password if the user has an email and password
//If the user has an email and password of your liking,calculate the BMI
//of the same user from Auth child class called Bmicalc
//Ensure all credentials are provided by the user through the scanner