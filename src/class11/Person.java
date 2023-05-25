package class11;


import java.util.Scanner;

public class Person {
    private String name;
    private int age;


    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce()
    {
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        // Creating an object of the Person class
        Person person1 = new Person("John", 25);
        Person person3 = new Person("Virat", 36);


        // Creating a reference to the person1 object
        Person person2 = person1;
        person2.introduce();



        // Modifying the age using person2 reference
        person2.age = 30;

        // Calling the introduce() method using person1 reference
        person1.introduce();  // Output: My name is John and I am 30 years old.

        person1.age = 35;

        // Calling the introduce() method using person1 reference
        person2.introduce();  // Out


        String s = new String("Hello");
        String name = "Paresh";
        Scanner scanner = new Scanner("");
    }
}
