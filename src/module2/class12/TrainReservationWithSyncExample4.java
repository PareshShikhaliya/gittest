package module2.class12;

import java.util.ArrayList;
import java.util.List;

class TrainReservationWithSync {
    private int availableSeats;

    public TrainReservationWithSync(int totalSeats) {
        this.availableSeats = totalSeats;
    }

    public synchronized boolean reserveSeat(int numSeats) {
        if (numSeats <= availableSeats) {
            availableSeats -= numSeats;
            return true;
        }
        return false;
    }

    public synchronized int getAvailableSeats() {
        return availableSeats;
    }
}

class UserWithSync implements Runnable {
    private TrainReservationWithSync reservation;
    private int numSeats;

    public UserWithSync(TrainReservationWithSync reservation, int numSeats) {
        this.reservation = reservation;
        this.numSeats = numSeats;
    }

    @Override
    public void run() {
        if (reservation.reserveSeat(numSeats)) {
            System.out.println(Thread.currentThread().getName() + " reserved " + numSeats + " seat(s).");
        } else {
            System.out.println(Thread.currentThread().getName() + " could not reserve seats.");
        }
    }
}

public class TrainReservationWithSyncExample4 {
    public static void main(String[] args) throws InterruptedException {
        TrainReservationWithSync reservation = new TrainReservationWithSync(100);

        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= 90; i++) {
            threads.add(new Thread(new UserWithSync(reservation, 1)));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Available seats with synchronization: " + reservation.getAvailableSeats());
    }
}
