package module2.class9;

public class Person2 {
    private String name;
    private int age;

    public Person2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public int hashCode() {
        // Custom hash code calculation based on name and age
        return name.hashCode() + age;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Person2 otherPerson = (Person2) obj;
        return this.age == otherPerson.age && this.name.equals(otherPerson.name);
    }

    @Override
    public String toString()
    {
        return "Person2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person2 person1 = new Person2("Alice", 30);
        Person2 person2 = new Person2("Bob", 25);
        Person2 person3 = new Person2("Alice", 30);

        System.out.println(person1); // Output: Person2{name='Alice', age=30}
        System.out.println(person2); // Output: Person2{name='Bob', age=25}
        System.out.println(person3); // Output: Person2{name='Alice', age=30}

        System.out.println("person1 hashCode: " + person1.hashCode());
        System.out.println("person2 hashCode: " + person2.hashCode());
        System.out.println("person3 hashCode: " + person3.hashCode());


        System.out.println("person1 equals person2: " + person1.equals(person2));
        System.out.println("person1 equals person3: " + person1.equals(person3));
    }
}
