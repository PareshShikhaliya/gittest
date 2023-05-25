package class11;
// Base class: Animal
class Animal {
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Derived class: Dog (inherits from Animal)
class Dog extends Animal {
    public void makeSound() {
        System.out.println("The dog barks.");
    }
}

// Derived class: Cat (inherits from Animal)
class Cat extends Animal {
    public void makeSound() {
        System.out.println("The cat meows.");
    }
}

// Usage example
public class PolymorphismExample {
    public static void main(String[] args) {
        // Create Animal objects
        Animal animal1 = new Animal();
        animal1.makeSound(); // Output: The animal makes a sound.

        animal1 = new Dog();
        animal1.makeSound(); // Output: The animal makes a sound.

        animal1 = new Cat();
        animal1.makeSound(); // Output: The animal makes a sound.


    }
}
