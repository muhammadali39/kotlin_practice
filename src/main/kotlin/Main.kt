val name = "Nate"
var greeting: String? = null



fun main(){
//  val name : String= "Nate" //read only once val cannot update value
 //   name = ""


//    println(name)
//    println(greeting)
//
//    greeting = null
//    greeting = "hello"
//
//
//    println(name)
//    println(greeting)

//    if(greeting!=null){
//        println(greeting)
//    }else{
//        println("Hi")
//    }

//    greeting = "hello"
//    when(greeting){
//        null-> println("hi")
//        else-> println(greeting)
//    }

//    greeting = "hello"
//    val greetingtoprint = if(greeting != null) greeting else "Hi"
//     println(greetingtoprint)


       greeting="hello"
    val greetingtoprint = when(greeting){
        null->"Hi"
        else->greeting
    }
    println(greetingtoprint)

    println(name)

}