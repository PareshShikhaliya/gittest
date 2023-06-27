package class17.map;

import java.util.*;

class Employee implements Comparable<Employee> {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    @Override
    public int compareTo(Employee other) {
        // Compare employees based on their employee IDs
        return Integer.compare(this.employeeId, other.employeeId);
    }
}

public class TreeMapEmployeeExample {
    public static void main(String[] args) {
        // Create a TreeMap to store employees sorted by their IDs
        TreeMap<Employee, String> employeeMap = new TreeMap<>();

        // Add employees to the TreeMap
        employeeMap.put(new Employee("Jane Smith", 1003), "Senior Developer");
        employeeMap.put(new Employee("Mike Johnson", 1004), "Junior Developer");
        employeeMap.put(new Employee("John Doe", 1001), "CEO");

        employeeMap.put(new Employee("Emily Davis", 1002), "HR Coordinator");
        employeeMap.put(new Employee("David Brown", 1005), "Sales Associate");

        // Print all employees sorted by their IDs
        System.out.println("Employees Sorted by Employee ID:");
        for (Map.Entry<Employee, String> entry : employeeMap.entrySet()) {
            Employee employee = entry.getKey();
            String designation = entry.getValue();
            System.out.println(employee.getName() + " (ID: " + employee.getEmployeeId() + ") - " + designation);
        }
    }
}
