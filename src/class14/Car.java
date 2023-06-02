package class14;

public class Car {
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public void startEngine() {
        System.out.println("Starting the engine of a " + make + " " + model);
    }

    public static void main(String[] args)
    {
        Car car1 = new Car("Toyota", "Camry", 2022);

        // Get the runtime class of the car object
        Class carClass = car1.getClass();

        System.out.println("Runtime class of car1: " + carClass);

        // Check if the car object is an instance of the Car class
        boolean isInstanceOfCar = carClass.equals(Car.class);
        System.out.println("car1 is an instance of Car: " + isInstanceOfCar);
    }
}
