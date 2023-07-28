package Module1.class12;

public class Person {
    private String name = "unknown";
    private int age = 0;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and setters...

    // Without overriding hashCode() and equals() methods
    public static void main(String[] args) {
        Person person1 = new Person("John Doe", 30);
        Person person2 = new Person("John Doe", 30);

        System.out.println("person1 hash code: " + person1.hashCode());
        System.out.println("person2 hash code: " + person2.hashCode());

        System.out.println("Are person1 and person2 equal? " + person1.equals(person2));
    }
}
