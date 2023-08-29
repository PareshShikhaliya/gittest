package module2.class12;

import java.util.ArrayList;
import java.util.List;

class TrainReservationWithoutSync {
    private int availableSeats;

    public TrainReservationWithoutSync(int totalSeats) {
        this.availableSeats = totalSeats;
    }

    public boolean reserveSeat(int numSeats) {
        if (numSeats <= availableSeats) {
            availableSeats -= numSeats;
            return true;
        }
        return false;
    }

    public int getAvailableSeats() {
        return availableSeats;
    }
}

class UserWithoutSync implements Runnable {
    private TrainReservationWithoutSync reservation;
    private int numSeats;

    public UserWithoutSync(TrainReservationWithoutSync reservation, int numSeats) {
        this.reservation = reservation;
        this.numSeats = numSeats;
    }

    @Override
    public void run() {
        if (reservation.reserveSeat(numSeats)) {
            System.out.println(Thread.currentThread().getName() + " reserved " + numSeats + " seat(s).");
        } else {
            //System.out.println(Thread.currentThread().getName() + " could not reserve seats.");
        }
    }
}

public class TrainReservationWithoutSyncExample3 {
    public static void main(String[] args) throws InterruptedException {
        TrainReservationWithoutSync reservation = new TrainReservationWithoutSync(100);

        List<Thread> threads = new ArrayList<>();

        for (int i = 1; i <= 90; i++) {
            threads.add(new Thread(new UserWithoutSync(reservation, 1)));
        }

        for (Thread thread : threads) {
            thread.start();
        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("Available seats without synchronization: " + reservation.getAvailableSeats());
    }
}
