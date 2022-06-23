fun main(){

    //?: this operator is called as Elvis Operator and it is used to avoid null pointer exception
    var name:String? = "Tejas"
    var n = name?.length

    println(n)

    name=null

    println(name?.length?:-1)

}