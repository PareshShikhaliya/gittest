package tenth;

public class StringVsStringBuilderExample {
    public static void main(String[] args) {
        // Using String
        long startString = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < 1000000; i++) {
            str += "hello";
        }
        long endString = System.currentTimeMillis();
        System.out.println("Using String: " + (endString - startString) + "ms");

        // Using StringBuilder
        long startStringBuilder = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 1000000; i++) {
            sb.append("hello");
        }
        long endStringBuilder = System.currentTimeMillis();
        System.out.println("Using StringBuilder: " + (endStringBuilder - startStringBuilder) + "ms");
    }
}
