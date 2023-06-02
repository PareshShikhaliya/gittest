package class13;

public class Company {
    private String name;
    public static class Employee {
        private String name;
        private int age;

        public Employee(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }

    public Company(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }



    public static void main(String[] args) {
        Company company = new Company("ABC Company");

        // Creating employee instances using the static nested class
        Company.Employee employee1 = new Company.Employee("John Doe", 25);
        Employee employee2 = new Employee("Jane Smith", 30);

        // Accessing employee details
        System.out.println("Company Name: " + company.getName());
        System.out.println("Employee 1 Name: " + employee1.getName());
        System.out.println("Employee 1 Age: " + employee1.getAge());
        System.out.println("Employee 2 Name: " + employee2.getName());
        System.out.println("Employee 2 Age: " + employee2.getAge());
    }
}
