package module2.class7;

import java.lang.reflect.Method;
import java.util.List;

public class ReflectionExample8 {
    public static void main(String[] args) throws Exception {
        // Get a list of class objects for interfaces of the List class
        Class[] interfaces = List.class.getInterfaces();
        System.out.println("Interfaces implemented by List class:");
        for (Class intf : interfaces) {
            System.out.println(intf.getName());
        }
        System.out.println();

        // Get a class object of a parent class for the String class
        Class parent = String.class.getSuperclass();
        System.out.println("Parent class of String class:");
        System.out.println(parent.getName());
        System.out.println();

        // Get a list of methods of the List class
        Method[] methods = List.class.getMethods();
        System.out.println("Methods in the List class:");
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println();

        // Create a new String class object using newInstance
        String s = String.class.newInstance();
        System.out.println("New instance of String class:");
        System.out.println(s.getClass().getName());
        System.out.println();

        // Create a new String class object using constructor
        String s2 = new String();
        System.out.println("New instance of String class (alternative way):");
        System.out.println(s2.getClass().getName());
        System.out.println();

        // Get the "length" method of String class and invoke it on a string
        Method m = String.class.getMethod("length");
        String text = "Hello, Reflection!";
        int length = (int) m.invoke(text);
        System.out.println("Length of the string: " + length);
    }
}
