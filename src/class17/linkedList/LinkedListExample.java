package class17.linkedList;

import java.util.LinkedList;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        // Adding elements to the linked list
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(50);

        // Displaying the linked list
        System.out.println("Linked List: " + linkedList);

        // Adding an element at the beginning
        linkedList.addFirst(5);
        System.out.println("Linked List after adding element at the beginning: " + linkedList);

        // Adding an element at the end
        linkedList.addLast(60);
        System.out.println("Linked List after adding element at the end: " + linkedList);

        // Adding an element at a specific position
        linkedList.add(2, 15);
        System.out.println("Linked List after adding element at index 2: " + linkedList);

        // Deleting an element from the linked list
        linkedList.removeFirstOccurrence(30);
        System.out.println("Linked List after deleting element 30: " + linkedList);
    }
}