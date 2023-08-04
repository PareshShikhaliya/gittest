package module2.class5;

public class GenericPairExample5 {
    public static void main(String[] args) {
        // Creating a Pair of Integer and String
        Pair<Integer, String> pair1 = new Pair<>(1, "One");
        int key1 = pair1.getKey();
        String value1 = pair1.getValue();
        System.out.println("Key: " + key1 + ", Value: " + value1);

        // Creating a Pair of String and Double
        Pair<String, Double> pair2 = new Pair<>("PI", 3.14);
        String key2 = pair2.getKey();
        double value2 = pair2.getValue();
        System.out.println("Key: " + key2 + ", Value: " + value2);

        // Creating a Pair of Boolean and Character
        Pair<Boolean, Character> pair3 = new Pair<>(true, 'X');
        boolean key3 = pair3.getKey();
        char value3 = pair3.getValue();
        System.out.println("Key: " + key3 + ", Value: " + value3);
    }
}

// Generic Pair Class (Outer Class)
class Pair<K, V> {
    private K key;
    private V value;

    public Pair(K key, V value) {
        this.key = key;
        this.value = value;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public void setValue(V value) {
        this.value = value;
    }
}
