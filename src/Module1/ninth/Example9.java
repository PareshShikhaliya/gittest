package Module1.ninth;


public class Example9 {
    public static void main(String[] args) {
        String str1 = "Java is awesome";
        String str2 = "java is awesome";
        String str3 = "Java is fun";

        // compareTo(String anotherString)
        int compareResult1 = str1.compareTo(str2);
        System.out.println("Compare result 1: " + compareResult1);
        int compareResult2 = str1.compareTo(str3);
        System.out.println("Compare result 2: " + compareResult2);

        // indexOf(String str)
        int indexOfIs = str1.indexOf("is");
        System.out.println("Index of Module1.first \"is\": " + indexOfIs);

        // lastIndexOf(String str)
        int lastIndexOfAwe = str1.lastIndexOf("awe");
        System.out.println("Last index of \"awe\": " + lastIndexOfAwe);

        // replace(char oldChar, char newChar)
        String replacedStr = str1.replace('a', 'A');
        System.out.println("Replaced string: " + replacedStr);
        System.out.println("original string: " + str1);

        // split(String regex)
        String[] words = str1.split(" ");
        for (String word : words) {
            System.out.println(word);
        }

        // concat(String str)
        String concatenatedStr = str1.concat(" and Java is versatile");
        System.out.println("Concatenated string: " + concatenatedStr);

        // valueOf(int i)
        int i = 42;
        String iStr = String.valueOf(i);
        System.out.println("String representation of i: " + iStr);
    }
}
