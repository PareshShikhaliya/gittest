package class19;
 class Singleton {
    private static Singleton instance;

    private Singleton() {
        System.out.println("Singleton instance created.");
    }

    public static Singleton getInstance() {
        if (instance == null) {
             instance = new Singleton();
        }
        return instance;
    }
}

public class SingltonMain {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        Singleton singleton3 = Singleton.getInstance();
    }
}
