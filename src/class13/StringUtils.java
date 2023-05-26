package class13;

public class StringUtils {
    public static boolean isPalindrome(String word) {
        String reversedWord = new StringBuilder(word).reverse().toString();
        return word.equalsIgnoreCase(reversedWord);
    }

    public static void main(String[] args) {
        String word1 = "radar";
        String word2 = "hello";

        boolean isPalindrome1 = StringUtils.isPalindrome(word1);
        boolean isPalindrome2 = StringUtils.isPalindrome(word2);

        System.out.println(word1 + " is a palindrome? " + isPalindrome1);  // Output: radar is a palindrome? true
        System.out.println(word2 + " is a palindrome? " + isPalindrome2);  // Output: hello is a palindrome? false
    }
}
