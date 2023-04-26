package third;


public class IFEXample9 {
    public static void main(String[] args) {
        String str1 = "hello";
        String str2 = "hello";
        boolean isEqual = str1.equals(str2); // returns true
        boolean isSame = (str1 == str2); // returns true
        boolean isSame2 = (str1 == new String("hello")); // returns false

        System.out.println("isEqual: " + isEqual); // prints "isEqual: true"
        System.out.println("isSame: " + isSame); // prints "isSame: true"
        System.out.println("isSame2: " + isSame2); // prints "isSame2: false"
    }
}

