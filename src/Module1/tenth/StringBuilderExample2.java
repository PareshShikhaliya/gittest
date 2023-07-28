package Module1.tenth;

public class StringBuilderExample2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java StringBuilder");

        // Append method
        sb.append(" is easy to use!");
        System.out.println("Append: " + sb.toString());

        // Insert method
        sb.insert(5, "able ");
        System.out.println("Insert: " + sb.toString());

        // Replace method
        sb.replace(0, 4, "Scala");
        System.out.println("Replace: " + sb.toString());

        // DeleteCharAt method
        sb.deleteCharAt(11);
        System.out.println("DeleteCharAt: " + sb.toString());

        // Delete method
        sb.delete(4, 9);
        System.out.println("Delete: " + sb.toString());

        // IndexOf method
        int index1 = sb.indexOf("Paresh");
        System.out.println("IndexOf: " + index1);

        // LastIndexOf method
        int index2 = sb.lastIndexOf("i");
        System.out.println("LastIndexOf: " + index2);

        // CharAt method
        char ch = sb.charAt(5);
        System.out.println("CharAt: " + ch);

        // Substring method
        String sub = sb.substring(0, 5);
        System.out.println("Substring: " + sub);

        // Reverse method
        sb.reverse();
        System.out.println("Reverse: " + sb.toString());

        // SetCharAt method
        sb.setCharAt(0, 'J');
        System.out.println("SetCharAt: " + sb.toString());

        // Length method
        int len = sb.length();
        System.out.println("Length: " + len);
    }
}

