package structured

fun main(args: Array<String>) {
    //IF EXPRESSION
    var marks =70
    var results =if (marks<40){
        "E"
    }else if (marks<50){
        "D"
    }else if (marks<60){
        "C"
    }else if (marks<70){
        "B"
    }else{
        "A"
    }
    println(results)
    //WHEN EXPRESSION
    var bettingNumber=3
    var betResult= when(bettingNumber){
        1->{
            "Sorry!! You lost!!1"
        }
        2->{
            "Sorry !!! yOU LOST!!!"
        }
        3->{
            "Congrats!!! You won!!"
        }else->{
            "Enter a number from 1-3 to bet"
        }
    }
    println(betResult)
}