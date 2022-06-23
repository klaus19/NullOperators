
fun main(){
    var s1:String?="tEJAS"
    s1=null
    println(s1)

    val i = s1?.length
    println(i)

    var name:String? = "Tejas"
    var lastName:String? = "Jay"

    println(name?.toUpperCase())
    println(lastName?.length)

    //The lambda expression present inside the let is executed only if the variable is not null.

    var name_of_rabbit:String?=null
    var bo:String? = "mac"

    name_of_rabbit?.let {
        println(name_of_rabbit.toUpperCase())
    }

    bo?.let {
        println(bo.codePointAt(0))
    }

}