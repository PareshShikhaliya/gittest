package Module1.class19;
 enum SingletonEnum {
    INSTANCE;

    // Example method
    public void showMessage() {
        System.out.println("Hello, I am a Singleton object.");
    }
}

public class SingltonWithEnum {
    public static void main(String[] args) {
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        singleton.showMessage();
    }
}
