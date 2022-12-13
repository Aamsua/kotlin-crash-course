/**
 * @author Martin Ausmaa
 */
class Cat: Animal("Cat") {

    override fun makeSound() {
        println("Mjääääuuuu!")
    }

//    fun mjäu() {
//        println("Mjääääuuuu!") // every subclass must implement this func if it is an abstract func in parent class
//    }
}