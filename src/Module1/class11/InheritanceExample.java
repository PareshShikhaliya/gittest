package Module1.class11;
// Base class: Bird
class Bird {
    protected String species;

    public Bird(String species) {
        this.species = species;
    }

    public void eat() {
        System.out.println(species + " is eating.");
    }

    public void sleep() {
        System.out.println(species + " is sleeping.");
    }
}

// Derived class: FlyingBird (inherits from Bird)
class FlyingBird extends Bird {
    public FlyingBird(String species) {
        super(species);
    }

    public void fly() {
        System.out.println(species + " is flying.");
    }
    public void eat() {
        System.out.println(species + " is eating.");
    }

    public void sleep() {
        System.out.println(species + " is sleeping.");
    }
}

// Derived class: SwimmingBird (inherits from Bird)
class SwimmingBird extends Bird {
    public SwimmingBird(String species) {
        super(species);
    }

    public void swim() {
        System.out.println(species + " is swimming.");
    }
}

// Usage example
public class InheritanceExample {
    public static void main(String[] args) {
        // Create a FlyingBird object
        FlyingBird eagle = new FlyingBird("Eagle");
        eagle.eat();   // Accessing base class method
        eagle.sleep(); // Accessing base class method
        eagle.fly();   // Accessing derived class method

        // Create a SwimmingBird object
        SwimmingBird penguin = new SwimmingBird("Penguin");
        penguin.eat();   // Accessing base class method
        penguin.sleep(); // Accessing base class method
        penguin.swim();  // Accessing derived class method
    }
}
