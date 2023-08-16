package Module1.class15;

public class GenericExample13<T, U> {
    private T first;
    private U second;

    public GenericExample13(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public static void main(String[] args) {
        GenericExample13<String, Integer> example1 = new GenericExample13<>("Hello", 123);
        System.out.println("First: " + example1.getFirst());
        System.out.println("Second: " + example1.getSecond());

        GenericExample13<Double, String> example2 = new GenericExample13<>(3.14, "World");
        System.out.println("First: " + example2.getFirst());
        System.out.println("Second: " + example2.getSecond());
    }
}
