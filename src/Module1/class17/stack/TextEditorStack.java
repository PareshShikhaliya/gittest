package Module1.class17.stack;

import java.util.Stack;

class TextEditorStack {
    private Stack<String> undoStack;

    public TextEditorStack() {
        undoStack = new Stack<>();
    }

    public void performAction(String action) {
        undoStack.push(action);
        System.out.println("Performed action: " + action);
    }

    public void undo() {
        if (!undoStack.isEmpty()) {
            String lastAction = undoStack.pop();
            String undoAction = reverseAction(lastAction);
            System.out.println("Undoing action: " + undoAction);
        } else {
            System.out.println("No more actions to undo");
        }
    }

    private String reverseAction(String action) {
        // Logic to reverse the action
        // This is just a simple example, the actual logic will depend on the application
        return new StringBuilder(action).reverse().toString();
    }

    public static void main(String[] args) {
        TextEditorStack textEditor = new TextEditorStack();

        textEditor.performAction("Type 'Hello'");
        textEditor.performAction("Delete word");
        textEditor.performAction("Copy selected text");
        textEditor.performAction("Paste text");

        textEditor.undo();  // Undo paste
        textEditor.undo();  // Undo copy
        textEditor.undo();  // Undo delete
        textEditor.undo();  // Undo type
        textEditor.undo();  // No more actions to undo
    }
}
