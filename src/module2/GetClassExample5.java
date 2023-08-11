package module2;

class Vehicle {
    // Some attributes and methods specific to vehicles
}

class Car extends Vehicle {
    // Additional attributes and methods specific to cars
}

class Bike extends Vehicle {
    // Additional attributes and methods specific to bikes
}

public class GetClassExample5 {
    public static void main(String[] args) {
        Vehicle vehicle = new Car(); // Creating an instance of Car

        // Get the runtime class of the object
        Class<? extends Vehicle> vehicleClass = vehicle.getClass();

        System.out.println("Object belongs to class: " + vehicleClass.getName());

        if (vehicleClass == Car.class) {
            System.out.println("It's a Car!");
        } else if (vehicleClass == Bike.class) {
            System.out.println("It's a Bike!");
        } else if (vehicleClass == Vehicle.class) {
            System.out.println("It's a Vehicle!");
        } else {
            System.out.println("It's an unknown class.");
        }
    }
}
