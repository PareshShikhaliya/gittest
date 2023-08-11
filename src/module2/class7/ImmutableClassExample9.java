package module2.class7;

final class PersonIMM {
    private final String name;
    private final int age;

    public PersonIMM(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}

public class ImmutableClassExample9 {
    public static void main(String[] args) {
        PersonIMM person = new PersonIMM("Alice", 30);
        System.out.println(person.getName() + " is " + person.getAge() + " years old");

        // Cannot modify the person's attributes
        // person.setName("Alicia"); // This would result in a compilation error
        PersonIMM person2 = new PersonIMM("Alice", 30);
        person=person2;
    }
}
/*
final class MathUtils {
    private MathUtils() {
        // Private constructor to prevent instantiation
    }

    static final double PI = 3.141592653589793;

    static int add(int a, int b) {
        return a + b;
    }

    // Other static methods...
}

 */