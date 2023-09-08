package module2.class15;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
    private int studentId;
    private String name;

    public Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", name='" + name + '\'' +
                '}';
    }
}

public class StudentSorting8 {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(101, "Alice"));
        students.add(new Student(103, "Bob"));
        students.add(new Student(102, "Charlie"));

        // Sorting by student ID without an anonymous inner class
        Collections.sort(students, new StudentIdComparator());

        // Printing sorted students
        System.out.println("Sorting without Anonymous Inner Class:");
        for (Student student : students) {
            System.out.println(student);
        }

        // Sorting by student ID using an anonymous inner class as a Comparator
        Collections.sort(students, new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return Integer.compare(student1.getStudentId(), student2.getStudentId());
            }
        });

        // Printing sorted students
        System.out.println("\nSorting with Anonymous Inner Class:");
        for (Student student : students) {
            System.out.println(student);
        }
    }
}

// Named Comparator class for sorting by student ID
class StudentIdComparator implements Comparator<Student> {
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getStudentId(), student2.getStudentId());
    }
}
