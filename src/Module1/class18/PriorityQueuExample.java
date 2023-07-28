package Module1.class18;

import java.util.PriorityQueue;

class Task implements Comparable<Task> {
    private String name;
    private int priority;

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    public String getName() {
        return name;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public int compareTo(Task other) {
        // Compare tasks based on their priority
        return Integer.compare(this.priority, other.priority);
    }
}

public class PriorityQueuExample {
    public static void main(String[] args) {
        // Create an empty priority queue
        PriorityQueue<Task> priorityQueue = new PriorityQueue<>();

        // Enqueue tasks
        Task task1 = new Task("Task 1", 3);
        Task task2 = new Task("Task 2", 1);
        Task task3 = new Task("Task 3", 2);

        priorityQueue.add(task1);
        priorityQueue.add(task2);
        priorityQueue.add(task3);

        // Dequeue tasks in priority order
        while (!priorityQueue.isEmpty()) {
            Task task = priorityQueue.poll();
            System.out.println("Processing task: " + task.getName());
        }
    }
}
