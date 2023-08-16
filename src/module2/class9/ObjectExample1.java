package module2.class9;

public class ObjectExample1 {
    public static void main(String[] args) {
        // Creating objects of different classes
        MyClass myObject = new MyClass();
        AnotherClass anotherObject = new AnotherClass();

        // Using methods from the Object class
        System.out.println("myObject hashCode: " + myObject.hashCode());
        System.out.println("anotherObject hashCode: " + anotherObject.hashCode());

        System.out.println("myObject toString: " + myObject.toString());
        System.out.println("anotherObject toString: " + anotherObject.toString());

        System.out.println("myObject equals anotherObject: " + myObject.equals(anotherObject));
    }
}

class MyClass
{
    // Class implementation
}

class AnotherClass
{
    // Class implementation
}
