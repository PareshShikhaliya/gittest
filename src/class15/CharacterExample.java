package class15;

public class CharacterExample {
    public static void main(String[] args) {
        char ch = 'A';

        // Check if the character is an alphabetic character
        boolean isAlphabetic = Character.isAlphabetic(ch);
        System.out.println("Is '" + ch + "' alphabetic? " + isAlphabetic);

        // Check if the character is a letter
        boolean isLetter = Character.isLetter(ch);
        System.out.println("Is '" + ch + "' a letter? " + isLetter);

        // Check if the character is a digit
        boolean isDigit = Character.isDigit(ch);
        System.out.println("Is '" + ch + "' a digit? " + isDigit);

        // Check if the character is a space, line break, or page break
        boolean isSpaceChar = Character.isSpaceChar(ch);
        System.out.println("Is '" + ch + "' a space, line break, or page break? " + isSpaceChar);

        // Check if the character is whitespace
        boolean isWhitespace = Character.isWhitespace(ch);
        System.out.println("Is '" + ch + "' whitespace? " + isWhitespace);

        // Check if the character is lowercase
        boolean isLowerCase = Character.isLowerCase(ch);
        System.out.println("Is '" + ch + "' lowercase? " + isLowerCase);

        // Check if the character is uppercase
        boolean isUpperCase = Character.isUpperCase(ch);
        System.out.println("Is '" + ch + "' uppercase? " + isUpperCase);

        // Convert the character to lowercase
        char lowercaseCh = Character.toLowerCase(ch);
        System.out.println("Lowercase of '" + ch + "' is '" + lowercaseCh + "'");

        // Convert the character to uppercase
        char uppercaseCh = Character.toUpperCase(ch);
        System.out.println("Uppercase of '" + ch + "' is '" + uppercaseCh + "'");
    }
}
