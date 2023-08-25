package module2.class11;

class TicketBooking implements Runnable {
    private int availableTickets;

    public TicketBooking(int availableTickets) {
        this.availableTickets = availableTickets;
    }

    public synchronized void bookTicket(int ticketsToBook) {
        if (availableTickets >= ticketsToBook) {
            System.out.println(Thread.currentThread().getName() + " booked " + ticketsToBook + " tickets.");
            availableTickets -= ticketsToBook;
        } else {
            System.out.println(Thread.currentThread().getName() + " couldn't book tickets. Not enough available.");
        }
    }

    public void run() {
        int ticketsToBook = 2; // Number of tickets each user wants to book
        bookTicket(ticketsToBook);
    }
}

public class TicketBookingSystem7 {
    public static void main(String[] args) {
        int totalAvailableTickets = 10; // Total available tickets
        TicketBooking ticketBooking = new TicketBooking(totalAvailableTickets);

        Thread user1 = new Thread(ticketBooking, "User 1");
        Thread user2 = new Thread(ticketBooking, "User 2");
        Thread user3 = new Thread(ticketBooking, "User 3");

        user1.start();
        user2.start();
        user3.start();
    }
}
