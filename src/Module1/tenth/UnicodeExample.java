package Module1.tenth;

public class UnicodeExample {
    public static void main(String[] args) {
        char c1 = '\u0042'; // represents the letter 'A'
        char c2 = '\u00A9'; // represents the copyright symbol
        String s1 = "Hello, \u0041\u00A9";
        System.out.println(c1); // output: A
        System.out.println(c2); // output: ©
        System.out.println(s1); // output: Hello, A©

    }
}
