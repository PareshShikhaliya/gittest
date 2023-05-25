package tenth;

import java.util.StringTokenizer;

import java.util.StringTokenizer;

public class StringTokenizerExample3 {
    public static void main(String[] args) {
        String inputString = "The quick brown fox jumps over the lazy dog";
        StringTokenizer tokenizer = new StringTokenizer(inputString);
        int tokenCount = tokenizer.countTokens();
        System.out.println("The input string contains " + tokenCount + " tokens.");
    }
}
