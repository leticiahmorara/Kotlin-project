package oop

class User {
    var name:String
    var email:String
    var password:String
    var repeatpassword:String

    constructor(name: String, email: String, password: String, repeatpassword: String) {
        this.name = name
        this.email = email
        this.password = password
        this.repeatpassword = repeatpassword
    }
    fun login(){
        if (!password.equals(repeatpassword)){
            println("password don't match")
        }else if (password.length <4){
            println("password must be more than 3 characters")
        }else if(email.equals("King@gmail.com")&& password.equals("King")){
            println("Welcome home $name")
    }else{
        println("Wrong password or email")
        }

    fun register(){
        println("Registered $name using email $email and password $password")
    }
}}

fun main(args: Array<String>) {
    var userOne = User(
        "king", "king@gmail.com", "King",
        "King"
    )
    var userTwo = User(
        "Letty", "letty@gmail.com",
        "Letty", "Letty123"
    )
    var userThree = User(
        "Purity", "purity@gmail.com",
        "purity", "purity"
    )

    userOne.login()
    userTwo.login()
    userThree.login()

}
