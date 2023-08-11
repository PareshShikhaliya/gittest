package module2.class7;

class Address {
    public String street;
    public String city;

    public Address(String street, String city) {
        this.street = street;
        this.city = city;
    }

    @Override
    public String toString() {
        return street + ", " + city;
    }
}

class Person implements Cloneable {
    public String name;
    public Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        // Shallow copy
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }
}

public class CopyExample3 {
    public static void main(String[] args) throws CloneNotSupportedException {
        Address address = new Address("123 Main St", "Cityville");
        Person originalPerson = new Person("Alice", address);

        // Shallow copy
        Person shallowCopyPerson = (Person) originalPerson.clone();

        // Deep copy using copy constructors
        Person deepCopyPerson = new Person(originalPerson.name, new Address(originalPerson.address.street, originalPerson.address.city));

        System.out.println("Original person: before " + originalPerson);



        // Modify copied persons
        shallowCopyPerson.name = "Bob";
        shallowCopyPerson.address.city = "Mumbai";
        deepCopyPerson.name = "Charlie";
        deepCopyPerson.address.city = "Villageville";

        // Print original and copied persons
        System.out.println("Original person after " + originalPerson);
        System.out.println("Shallow copy person: " + shallowCopyPerson);
        System.out.println("Deep copy person: " + deepCopyPerson);

        System.out.println("Original person after " + originalPerson.hashCode());
        System.out.println("Shallow copy person: " + shallowCopyPerson.hashCode());
        System.out.println("Deep copy person: " + deepCopyPerson.hashCode());


    }
}
