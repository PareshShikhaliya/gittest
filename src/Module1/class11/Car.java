package Module1.class11;

public class Car {
    private String brand;
    private String model;
    private int year;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void start() {
        System.out.println("The " + brand + " " + model + " is starting.");
    }

    public void accelerate() {
        System.out.println("The " + brand + " " + model + " is accelerating.");
    }

    public static void main(String[] args) {
        // Creating objects of the Car class
        Car car1 = new Car("Toyota", "Camry", 2021);
        Car car2 = new Car("Honda", "Civic", 2022);

        // Accessing the properties and methods of the car objects
        String brand1 = car1.getBrand();
        String model2 = car2.getModel();
        car1.start();
        car2.accelerate();

        // Printing the results
        System.out.println("Car 1: Brand: " + brand1 + ", Year: " + car1.getYear());
        System.out.println("Car 2: Model: " + model2 + ", Year: " + car2.getYear());
    }
}
