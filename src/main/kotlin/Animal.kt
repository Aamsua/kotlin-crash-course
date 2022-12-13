/**
 * @author Martin Ausmaa
 */
//open class Animal (
abstract class Animal ( //- abstract class - we can not make a second  Animal class (animal: Animal)
    val name:String,  // constructor
  val legsCount: Int=4
        ){
init {
    println("hello my name is $name") // init block - if a instance of Class is created then do smt
}
abstract fun makeSound()

}