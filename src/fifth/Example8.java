package fifth;

import java.util.ArrayList;
        import java.util.Scanner;

public class Example8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<String> tasks = new ArrayList<String>();
        String task;
        boolean addAnotherTask;

        do {
            System.out.print("Enter a task: ");
            task = input.nextLine();
            tasks.add(task);

            System.out.print("Add another task? (yes or no) ");
            String answer = input.nextLine();
            addAnotherTask = answer.equalsIgnoreCase("yes");
        } while (addAnotherTask);

        System.out.println("Task list:");
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i+1) + ". " + tasks.get(i));
        }
    }
}
