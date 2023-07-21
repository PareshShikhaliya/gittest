package module2.class1;

// Abstraction example with electronic devices

abstract class ElectronicDevice {
    private String brand;

    // Constructor to set the device's brand
    public ElectronicDevice(String brand) {
        this.brand = brand;
    }

    // Abstract methods for common actions
    public abstract void turnOn();
    public abstract void turnOff();
    public abstract void adjustVolume();

    // Common method to get the device's brand
    public String getBrand() {
        return brand;
    }
}

// Step 2: Create subclasses 'TV' and 'DVDPlayer' that inherit from 'ElectronicDevice'
class TV extends ElectronicDevice {
    public TV(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " TV: Turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " TV: Turning off.");
    }

    @Override
    public void adjustVolume() {
        System.out.println(getBrand() + " TV: Adjusting volume.");
    }
}

class DVDPlayer extends ElectronicDevice {
    public DVDPlayer(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println(getBrand() + " DVD Player: Turning on.");
    }

    @Override
    public void turnOff() {
        System.out.println(getBrand() + " DVD Player: Turning off.");
    }

    @Override
    public void adjustVolume() {
        System.out.println(getBrand() + " DVD Player: Volume cannot be adjusted.");
    }
}

// Main class to create and interact with electronic devices
public class Abstraction {
    public static void main(String[] args) {
        // Create a TV and a DVD player
        ElectronicDevice samsungTV = new TV("Samsung");
        ElectronicDevice sonyDVDPlayer = new DVDPlayer("Sony");

        // Interact with the electronic devices
        samsungTV.turnOn();
        samsungTV.adjustVolume();
        samsungTV.turnOff();

        sonyDVDPlayer.turnOn();
        sonyDVDPlayer.adjustVolume();
        sonyDVDPlayer.turnOff();
    }
}
/*
In this cool electronic device program, we have different types of devices, like TVs and DVD players. Each device can do some common things,
 like turning on, turning off, and adjusting the volume. But, just like with our previous examples, TVs and DVD players do these actions differently!

To keep things organized, we use a special technique called "abstraction." We start by creating a base class called ElectronicDevice, which contains
the common actions that all electronic devices can do. But we don't specify exactly how each action is done because it can be different for each device.
 */