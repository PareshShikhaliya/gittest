package Module1.class16;

import java.util.HashSet;
import java.util.Set;

class Student {
    private int studentID;
    private String name;
    private int age;
    private String course;

    public Student(int studentID, String name, int age, String course) {
        this.studentID = studentID;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentID=" + studentID +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", course='" + course + '\'' +
                '}';
    }
}

class EnrollmentSystem {
    private Set<Student> enrolledStudents;

    public EnrollmentSystem() {
        enrolledStudents = new HashSet<>();
    }

    public void enrollStudent(Student student) {
        enrolledStudents.add(student);
    }

    public void removeStudent(int studentID) {
        enrolledStudents.removeIf(student -> student.getStudentID() == studentID);
    }

    public void listEnrolledStudents() {
        System.out.println("Enrolled Students:");
        for (Student student : enrolledStudents) {
            System.out.println(student);
        }
    }
}

public class StudentEnrollmentApp8 {
    public static void main(String[] args) {
        EnrollmentSystem enrollmentSystem = new EnrollmentSystem();

        Student student1 = new Student(101, "Alice", 20, "Computer Science");
        Student student2 = new Student(102, "Bob", 21, "Engineering");
        Student student3 = new Student(103, "Carol", 19, "Mathematics");

        enrollmentSystem.enrollStudent(student1);
        enrollmentSystem.enrollStudent(student2);
        enrollmentSystem.enrollStudent(student3);

        enrollmentSystem.listEnrolledStudents();

        enrollmentSystem.removeStudent(102);

        enrollmentSystem.listEnrolledStudents();
    }
}
