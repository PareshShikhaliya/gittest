package Module1.class19;

import java.util.Scanner;

enum Role {
    ADMIN, MANAGER, EMPLOYEE
}

public class Organization {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee role (ADMIN, MANAGER, EMPLOYEE): ");
        String roleStr = scanner.nextLine();

        Role role = Role.valueOf(roleStr.toUpperCase());

        switch (role) {
            case ADMIN:
                System.out.println(name + " is an Administrator.");
                break;
            case MANAGER:
                System.out.println(name + " is a Manager.");
                break;
            case EMPLOYEE:
                System.out.println(name + " is an Employee.");
                break;
            default:
                System.out.println(name + " has an unknown role.");
        }

        scanner.close();
    }
}
