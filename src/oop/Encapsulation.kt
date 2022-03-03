package oop

class Flower{
   private var name:String =""
   private var color:String =""
   private  var price :Double=0.0

    fun setFlowerName(name:String){
        this.name =name
    }

    fun setFlowercolor(color:String){
        this.color =color

}
    fun setFlowerprice(price:Double){
        this.price =price

    }

    fun getFlowerName():String{
        return this.name
    }

    fun getFlowercolor():String{
        return this.color
    }

    fun getFlowerprice():Double{
        return this.price
    }

}

fun main(args: Array<String>) {
    var flower =Flower()
    flower.setFlowerName("Rose")
    flower.setFlowercolor("white")
    flower.setFlowerprice(500.50)
    println(flower.getFlowerName())

}