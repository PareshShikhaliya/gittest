package Module1.class27;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentManagementSystem {
    private List<Student> students;

    public StudentManagementSystem() {
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void removeStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                students.remove(student);
                System.out.println("Student with ID " + id + " removed successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void updateStudentDetails(int id, String newName, int newAge) {
        for (Student student : students) {
            if (student.getId() == id) {
                student.setName(newName);
                student.setAge(newAge);
                System.out.println("Student details updated successfully.");
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void searchStudent(int id) {
        for (Student student : students) {
            if (student.getId() == id) {
                System.out.println("Student Found:");
                System.out.println(student);
                return;
            }
        }
        System.out.println("Student with ID " + id + " not found.");
    }

    public void printStudents() {
        System.out.println("Student List:");
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void saveToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Student student : students) {
                writer.write(student.getId() + "," + student.getName() + "," + student.getAge() + "\n");
            }
            System.out.println("Data saved to file: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while saving data to file: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                int id = Integer.parseInt(parts[0]);
                String name = parts[1];
                int age = Integer.parseInt(parts[2]);
                Student student = new Student(id, name, age);
                students.add(student);
            }
            System.out.println("Data loaded from file: " + filename);
        } catch (IOException e) {
            System.out.println("An error occurred while loading data from file: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem sms = new StudentManagementSystem();

        while (true) {
            System.out.println("Student Management System");
            System.out.println("1. Add a student");
            System.out.println("2. Remove a student");
            System.out.println("3. Update student details");
            System.out.println("4. Search for a student");
            System.out.println("5. Print students");
            System.out.println("6. Save student data to a file");
            System.out.println("7. Load student data from a file");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Add a student");
                    System.out.print("Enter student ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter student name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter student age: ");
                    int age = scanner.nextInt();
                    Student student = new Student(id, name, age);
                    sms.addStudent(student);
                    System.out.println("Student added successfully.");
                    break;
                case 2:
                    System.out.println("Remove a student");
                    System.out.print("Enter student ID: ");
                    int removeId = scanner.nextInt();
                    sms.removeStudent(removeId);
                    break;
                case 3:
                    System.out.println("Update student details");
                    System.out.print("Enter student ID: ");
                    int updateId = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new age: ");
                    int newAge = scanner.nextInt();
                    sms.updateStudentDetails(updateId, newName, newAge);
                    break;
                case 4:
                    System.out.println("Search for a student");
                    System.out.print("Enter student ID: ");
                    int searchId = scanner.nextInt();
                    sms.searchStudent(searchId);
                    break;
                case 5:
                    sms.printStudents();
                    break;
                case 6:
                    System.out.println("Save student data to a file");
                    System.out.print("Enter filename: ");
                    String saveFilename = scanner.next();
                    sms.saveToFile(saveFilename);
                    break;
                case 7:
                    System.out.println("Load student data from a file");
                    System.out.print("Enter filename: ");
                    String loadFilename = scanner.next();
                    sms.loadFromFile(loadFilename);
                    break;
                case 8:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option. Please select a valid option from the menu.");
            }

            System.out.println();
        }
    }
}
