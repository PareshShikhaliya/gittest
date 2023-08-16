package Module1.class15;

public class Pair14<T, U> {
    private T first;
    private U second;

    public Pair14(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public void setSecond(U second) {
        this.second = second;
    }

    public static void main(String[] args) {
        Pair14<String, Integer> student = new Pair14<>("John", 20);
        System.out.println("Name: " + student.getFirst());
        System.out.println("Age: " + student.getSecond());

        Pair14<Double, String> product = new Pair14<>(9.99, "Book");
        System.out.println("Price: $" + product.getFirst());
        System.out.println("Name: " + product.getSecond());

        Pair14<String, String> name = new Pair14<>("Paresh", "Shikhaliya");
        System.out.println("First Name: " + name.getFirst());
        System.out.println("Last Name: " + name.getSecond());
    }
}
