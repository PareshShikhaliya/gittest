package Module1.class12;


public class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }


//    @Override
//    public int hashCode() {
//        return id;
//    }
//
//    @Override
//    public boolean equals(Object obj) {
//        if (this == obj)
//            return true;
//        if (obj == null || getClass() != obj.getClass())
//            return false;
//        Student other = (Student) obj;
//        return id == other.id;
//    }

    public static void main(String[] args) {
        Student student1 = new Student(1, "John Doe");
        Student student2 = new Student(1, "John Kohli");

        System.out.println("Does studentMap contain student2? " + student1.hashCode());
        System.out.println("Does studentMap contain student2? " + student2.hashCode());
    }
}
