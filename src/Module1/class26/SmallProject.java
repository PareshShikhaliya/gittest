package Module1.class26;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Event {
    private String eventName;
    private LocalDateTime eventDateTime;

    public Event(String eventName, LocalDateTime eventDateTime) {
        this.eventName = eventName;
        this.eventDateTime = eventDateTime;
    }

    public String getEventName() {
        return eventName;
    }

    public LocalDateTime getEventDateTime() {
        return eventDateTime;
    }

    public Duration getTimeRemaining() {
        return Duration.between(LocalDateTime.now(), eventDateTime);
    }
}

class EventReminder {
    public List<Event> events;

    public EventReminder() {
        events = new ArrayList<>();
    }

    public void addEvent(Event event) {
        events.add(event);
    }

    public void removeEvent(Event event) {
        events.remove(event);
    }

    public void displayUpcomingEvents() {
        System.out.println("Upcoming Events:\n");
        for (Event event : events) {
            System.out.println("Event Name: " + event.getEventName());
            System.out.println("Date: " + event.getEventDateTime().toLocalDate());
            System.out.println("Time: " + event.getEventDateTime().toLocalTime());
            Duration timeRemaining = event.getTimeRemaining();
            long days = timeRemaining.toDays();
            long hours = timeRemaining.toHoursPart();
            long minutes = timeRemaining.toMinutesPart();
            System.out.println("Time Remaining: " + days + " days, " + hours + " hours, " + minutes + " minutes\n");
        }
    }
}

public class SmallProject {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        EventReminder eventReminder = new EventReminder();

        while (true) {
            System.out.println("Welcome to Event Reminder!\n");
            System.out.println("1. Add Event");
            System.out.println("2. Remove Event");
            System.out.println("3. View Upcoming Events");
            System.out.println("4. Exit\n");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("\nEnter the event name: ");
                    String eventName = scanner.nextLine();
                    System.out.print("Enter the event date and time (yyyy-mm-dd HH:mm): ");
                    String dateTimeStr = scanner.nextLine();

                    LocalDateTime eventDateTime = LocalDateTime.parse(dateTimeStr,
                            DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));
                    Event event = new Event(eventName, eventDateTime);
                    eventReminder.addEvent(event);
                    System.out.println("\nEvent added successfully!\n");
                    break;
                case 2:
                    eventReminder.displayUpcomingEvents();
                    System.out.print("Enter the event index to remove: ");
                    int eventIndex = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    if (eventIndex >= 0 && eventIndex < eventReminder.events.size()) {
                        Event eventToRemove = eventReminder.events.get(eventIndex);
                        eventReminder.removeEvent(eventToRemove);
                        System.out.println("\nEvent removed successfully!\n");
                    } else {
                        System.out.println("\nInvalid event index!\n");
                    }
                    break;
                case 3:
                    eventReminder.displayUpcomingEvents();
                    break;
                case 4:
                    System.out.println("\nGoodbye!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("\nInvalid choice! Please try again.\n");
                    break;
            }
        }
    }
}
