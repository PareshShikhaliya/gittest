package class26;

import java.time.LocalDate;

public class LocalDateExample9 {
    public static void main(String[] args) {
        // Get the current date
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current Date: " + currentDate);

        // Create a specific date
        LocalDate specificDate = LocalDate.of(2023, 1, 31);
        System.out.println("Specific Date: " + specificDate);

        // Add 30 days to the specific date
        LocalDate updatedDate = specificDate.plusDays(30);
        System.out.println("Updated Date: " + updatedDate);

        // Subtract 2 weeks from the updated date
        LocalDate finalDate = updatedDate.minusWeeks(2);
        System.out.println("Final Date: " + finalDate);
    }
}

