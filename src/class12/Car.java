package class12;

public class Car {
    private String make;
    private String model;
    private int year;

    // Constructor with all parameters
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Getter for make
    public String getMake() {
        return make;
    }

    // Setter for make
    public void setMake(String make) {
        this.make = make;
    }

    // Getter for model
    public String getModel() {
        return model;
    }

    // Setter for model
    public void setModel(String model) {
        this.model = model;
    }

    // Getter for year
    public int getYear() {
        return year;
    }

    // Setter for year
    public void setYear(int year) {
        this.year = year;
    }

    public static void main(String[] args) {
        // Create a Car object
        Car car = new Car("Toyota", "Camry", 2021);

        // Accessing object properties using getters
        System.out.println("Make: " + car.getMake());
        System.out.println("Model: " + car.getModel());
        System.out.println("Year: " + car.getYear());

        // Modifying object properties using setters
        car.setMake("Honda");
        car.setModel("Accord");
        car.setYear(2022);

        // Accessing modified object properties again
        System.out.println("Modified Make: " + car.getMake());
        System.out.println("Modified Model: " + car.getModel());
        System.out.println("Modified Year: " + car.getYear());
    }
}

