fun main(){
nameArray("Nancy","John","Warren","Christopher")
    numbers()
    println( capital())
    println( identity("Rice","Beans","Fish"))
}
//1.Create a function that takes in 4 strings and creates an array out of them then
//prints out the array (2 points)
fun nameArray(name1:String,name2:String,name3:String,name4:String){
    var name= arrayOf(name1,name2,name3,name4)
    println(name.contentToString())
}
//2. Create a function that given an array below:
//var cities = arrayOf(“harare”, “mumbai”, “dodoma”, “jakarta”)
//prints out the names of the cities in the correct grammatical case. (2 points)
 fun capital(){
    var capital= arrayOf("harare", "mumbai","dodoma","jakarta")
    capital.forEach { capital-> println(capital.capitalize()) }
}
//3. Create one function that given the below array:
//var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
//(i) prints out the sum of the second and fifth elements (1 point)
fun numbers(){
    var numbers = arrayOf(32, 17,4,213,78,43,90,31,3,73,11,158,62)
    println(numbers.get (1)+numbers.get(4))
    //(ii) prints out the index of 158 (1 point)
    println(numbers.indexOf(158))
    //(iii) prints out the elements in ascending order (2 points)
     numbers.sort()
    println(numbers.contentToString())
}
//4. Create a function that takes in 3 names and returns a string array containing
//all 3 names.
fun identity(name1: String,name2: String,name3: String):String{
    var them=(arrayOf(name1,name2,name3))
     return them.contentToString()

}