package oop

class Superuser(override var email:String,
            override var password:String) :Verification(email,password){
    var status ="Superuser"
    fun manageAdmins(){
        println("Yeah i can approve payments")
    }

}

fun main(args: Array<String>) {
    var userOne =Admin("letty@gmail.com","letty@123")
    userOne.register()
     println(userOne.status)
}