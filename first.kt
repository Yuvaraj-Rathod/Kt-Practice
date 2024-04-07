// fun main(){
//     var count:Int =10
//     val myName: String = when{
//         count ==15-> "values is 15"
//         count > 5->"value is greater than 5 and satish is gay"
//         else -> "answer eludes me"
//     }
//     println(myName)
//     println(myName.uppercase())
// }

// fun toUpper(name: String?): String {
//     val upper: String = name?.uppercase() ?: "" 
//     return upper
// }

// fun main() {
//     println("Please enter your name:")
//     val name: String? = readLine() 
//     val case: String = toUpper(name)
//     println(case)
// }
//-------------------------------------------------Reading User Input
// fun main() {
//     // Reading a string
//     print("Enter your name: ")
//     val name: String? = readLine()
//     println("You entered: $name")

//     // Reading an integer
//     print("Enter your age: ")
//     val age: Int? = readLine()?.toIntOrNull() ?:0
//     println("You entered: $age")

//     // Reading a double
//     print("Enter your height: ")
//     val height: Double? = readLine()?.toDoubleOrNull() ?:130.8
//     println("You entered: $height")
// }

//------------------------------------Functions
// fun generateAnswerString(countThreshold: Int): String {
//     return if (count > countThreshold) {
//         "I have the answer."
//     } else {
//         "The answer eludes me."
//     }
// }

// fun generateAnswerString(countThreshold: Int): String = if (count > countThreshold) {
//     "I have the answer"
// } else {
//     "The answer eludes me"
// }
      
//-------------------------------------------Anonymous Functions or Lamda Functions
// fun lenght1(str : String) : Int {
// return str.length
// }

// val length: (String) -> Int ={
//     input-> input.length
// }
// fun main(){
//     val str: String = "Kotlin"
//     val len: Int =length("my ")
//     println("lenght of the string entered is $len")
//     val len2: Int = lenght1(str)
//     println("second sentence len is $len2")
// }

