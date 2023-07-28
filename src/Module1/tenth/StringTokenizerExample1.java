package Module1.tenth;

import java.util.StringTokenizer;

public class StringTokenizerExample1 {
    public static void main(String[] args) {
        String inputString = "Hello, world! How are you today?";
        StringTokenizer tokenizer = new StringTokenizer(inputString, ", !?");
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }
}
