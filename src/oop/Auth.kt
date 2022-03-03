package oop

class Auth {
    var email:String
    var password:String
    constructor(email:String,password :String){
        this.email=email
        this.password=password
    }
    fun register(){
        if (password.length<4){
            println("The password must have 4 or more characters")
        }else{
            println("Registered with email>&$email and $password")
        }
    }
}