package Module1.class17.map;

import java.util.Hashtable;

public class HashTableExample {
    public static void main(String[] args) {
        // Create a Hashtable
        Hashtable<String, Integer> hashtable = new Hashtable<>();

        // Add key-value pairs to the hashtable
        hashtable.put("John", 25);
        hashtable.put("Emily", 30);
        hashtable.put("Michael", 35);

        // Retrieve values from the hashtable
        int johnAge = hashtable.get("John");
        int emilyAge = hashtable.get("Emily");
        int michaelAge = hashtable.get("Michael");

        System.out.println("John's age: " + johnAge);
        System.out.println("Emily's age: " + emilyAge);
        System.out.println("Michael's age: " + michaelAge);
    }
}
