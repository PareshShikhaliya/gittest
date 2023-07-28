package module2.class3;

// CPU class (Part of Composition)
class CPU {
    public void executeInstructions() {
        System.out.println("CPU executing instructions.");
    }
}

// RAM class (Part of Composition)
class RAM {
    public void storeData() {
        System.out.println("RAM storing data.");
    }
}

// HardDisk class (Part of Composition)
class HardDisk {
    public void readData() {
        System.out.println("HardDisk reading data.");
    }
}

// Computer class (Container with Composition)
class Computer {
    private CPU cpu;
    private RAM ram;
    private HardDisk hardDisk;

    public Computer() {
        cpu = new CPU();
        ram = new RAM();
        hardDisk = new HardDisk();
    }

    public void boot() {
        cpu.executeInstructions();
        ram.storeData();
        hardDisk.readData();
        System.out.println("Computer booted successfully.");
    }
}

public class CompositionComputerExample4 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.boot();
    }
}
