/**
 * @author Martin Ausmaa
 */
class Dog :Animal(name = "Dog") { // class Dog inherits from Class Animal ( Animal must be open Class)

//    init{
//        legsCount // we can use legsCount inside all animals (Animal Class)
//    }

//    fun bark() {
//        println("auhh!")  // we can use func bark() only inside a dog Class
//    }
    override fun makeSound() { // every subclass must implement this func if it is an abstract func in parent class
    println("auhh!")
    }
}