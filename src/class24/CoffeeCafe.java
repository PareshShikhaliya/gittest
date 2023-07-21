package class24;

// Component interface
interface Coffee {
    double getCost();
    String getDescription();
}

// Concrete component
class SimpleCoffee implements Coffee {
    public double getCost() {
        return 2.0;
    }

    public String getDescription() {
        return "Simple Coffee";
    }
}

// Decorator
abstract class CoffeeDecorator implements Coffee {
    protected Coffee decoratedCoffee;

    public CoffeeDecorator(Coffee decoratedCoffee) {
        this.decoratedCoffee = decoratedCoffee;
    }

    public double getCost() {
        return decoratedCoffee.getCost();
    }

    public String getDescription() {
        return decoratedCoffee.getDescription();
    }
}

// Concrete decorators
class Milk extends CoffeeDecorator {
    public Milk(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 0.5;
    }

    public String getDescription() {
        return super.getDescription() + ", Milk";
    }
}

class Vanilla extends CoffeeDecorator {
    public Vanilla(Coffee decoratedCoffee) {
        super(decoratedCoffee);
    }

    public double getCost() {
        return super.getCost() + 1.0;
    }

    public String getDescription() {
        return super.getDescription() + ", Vanilla";
    }
}

// Client code
public class CoffeeCafe {
    public static void main(String[] args) {
        // Ordering a simple coffee
        Coffee coffee = new SimpleCoffee();
        System.out.println("Cost: $" + coffee.getCost());
        System.out.println("Description: " + coffee.getDescription());

        // Adding milk to the coffee
        Coffee coffeeWithMilk = new Milk(coffee);
        System.out.println("Cost: $" + coffeeWithMilk.getCost());
        System.out.println("Description: " + coffeeWithMilk.getDescription());

        // Adding vanilla to the coffee with milk
        Coffee coffeeWithMilkAndVanilla = new Vanilla(coffeeWithMilk);
        System.out.println("Cost: $" + coffeeWithMilkAndVanilla.getCost());
        System.out.println("Description: " + coffeeWithMilkAndVanilla.getDescription());
    }
}
