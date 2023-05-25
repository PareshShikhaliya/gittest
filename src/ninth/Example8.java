package ninth;



public class Example8 {
    public static void main(String[] args) {
        String str = "Hello, World!";

        // length()
        int length = str.length();
        System.out.println("Length of string: " + length);

        // charAt(int index)
        char ch = str.charAt(4);
        System.out.println("Character at index 4: " + ch);

        // substring(int beginIndex)
        String sub1 = str.substring(4);
        System.out.println("Substring from index 7: " + sub1);

        // substring(int beginIndex, int endIndex)
        String sub2 = str.substring(4, 5);
        System.out.println("Substring from index 0 to 5: " + sub2);

        // toUpperCase()
        String upperCaseStr = str.toUpperCase();
        System.out.println("Uppercase string: " + upperCaseStr);
        System.out.println("original string: " + str);
        // toLowerCase()
        String lowerCaseStr = str.toLowerCase();
        System.out.println("Lowercase string: " + lowerCaseStr);

        // trim()
        String trimmedStr = "   Hello, World!   ".trim();
        System.out.println("Trimmed string: " + trimmedStr);

        // equals(Object obj)
        String str2 = "Hello, World! fkjfkdjkf";
        boolean isEqual = str.equals(str2);
        System.out.println("Is str equal to str2? " + isEqual);

        // startsWith(String prefix)
        boolean startsWithHello = str.startsWith("Hello");
        System.out.println("Does str start with \"Hello\"? " + startsWithHello);

        // endsWith(String suffix)
        boolean endsWithWorld = str.endsWith("World!");
        System.out.println("Does str end with \"World!\"? " + endsWithWorld);
    }
}
