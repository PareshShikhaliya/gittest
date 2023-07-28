package Module1.class17.stack;

import java.util.Stack;

public class BrowserStack {
    private Stack<String> backStack;

    public BrowserStack() {
        backStack = new Stack<>();
    }

    public void visitPage(String url) {
        backStack.push(url);
        System.out.println("Visited page: " + url);
    }

    public void goBack() {
        if (!backStack.isEmpty()) {
            String previousPage = backStack.pop();
            System.out.println("Navigating back to page: " + previousPage);
        } else {
            System.out.println("No more pages to go back");
        }
    }

    public static void main(String[] args) {
        BrowserStack browser = new BrowserStack();

        browser.visitPage("https://www.example.com/page1");
        browser.visitPage("https://www.example.com/page2");
        browser.visitPage("https://www.example.com/page3");

        browser.goBack();  // Navigates back to page2
        browser.goBack();  // Navigates back to page1
        browser.goBack();  // No more pages to go back
    }
}
