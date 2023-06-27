package class21;

public class StackTraceExample2 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();

            System.out.println("========== Stack Trace Details ==========");
            StackTraceElement[] stackTrace = e.getStackTrace();
            for (StackTraceElement element : stackTrace) {
                System.out.println("Class Name: " + element.getClassName());
                System.out.println("Method Name: " + element.getMethodName());
                System.out.println("File Name: " + element.getFileName());
                System.out.println("Line Number: " + element.getLineNumber());
                System.out.println("----------------------------------------");
            }
        }
    }

    public static void method1() {
        method2();
    }

    public static void method2() {
        method3();
    }

    public static void method3() {
        throw new RuntimeException("Custom Exception");
    }
}
