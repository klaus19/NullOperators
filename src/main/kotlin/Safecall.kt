
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

    // the run() method operates only when we use this reference instead of a function parameter:

    //creates a list of names

    var stringlist:List<String?> = listOf("Zack","mac","gjf",null)

    //create a new list

    var newList = listOf<String?>()

    for (item in stringlist){
        //executes for non-nullable values
        item?.run { newList = newList.plus(this)  }
        item?.also { it-> println(it) }
    }


}