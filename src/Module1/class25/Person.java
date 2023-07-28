package Module1.class25;

import java.io.Serializable;

public class Person implements Serializable {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Module1.class25.Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}