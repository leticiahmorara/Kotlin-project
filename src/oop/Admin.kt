package oop

class Admin(override var email:String,
            override var password:String) :Verification(email,password){
     var status ="Admin"
    fun approvePayments(){
        println("Yeah i can approve payments")
    }

}

fun main(args: Array<String>) {
    var userOne =Admin("letty@gmail.com","letty@123")
    userOne.register()
    userOne.status
}