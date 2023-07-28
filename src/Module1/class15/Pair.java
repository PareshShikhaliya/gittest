package Module1.class15;

public class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
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
        Pair<String, Integer> student = new Pair<>("John", 20);
        System.out.println("Name: " + student.getFirst());
        System.out.println("Age: " + student.getSecond());

        Pair<Double, String> product = new Pair<>(9.99, "Book");
        System.out.println("Price: $" + product.getFirst());
        System.out.println("Name: " + product.getSecond());

        Pair<String, String> name = new Pair<>("Paresh", "Shikhaliya");
        System.out.println("First Name: " + name.getFirst());
        System.out.println("Last Name: " + name.getSecond());
    }
}
