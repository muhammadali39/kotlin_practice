val name = "Nate"
var greeting: String? = null



fun main(){
//  val name : String= "Nate" //read only once val cannot update value
 //   name = ""


    println(name)
    println(greeting)

    greeting = null
    greeting = "hello"


    println(name)
    println(greeting)

}