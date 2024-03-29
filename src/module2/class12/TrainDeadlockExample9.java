package module2.class12;

class Track {
    private String name;

    public Track(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

class Train implements Runnable {
    private Track trackA;
    private Track trackB;

    public Train(Track trackA, Track trackB) {
        this.trackA = trackA;
        this.trackB = trackB;
    }

    @Override
    public void run() {
        synchronized (trackA) {
            System.out.println(Thread.currentThread().getName() + " entered " + trackA.getName());

            try {
                Thread.sleep(100); // Simulating travel time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " waiting for " + trackB.getName());

            synchronized (trackB) {
                System.out.println(Thread.currentThread().getName() + " cleared " + trackB.getName());
            }
        }
    }
}

public class TrainDeadlockExample9 {
    public static void main(String[] args) {
        Track trackA = new Track("Track A");
        Track trackB = new Track("Track B");

        Train trainA = new Train(trackA, trackB);
        Train trainB = new Train(trackB, trackA);

        Thread threadA = new Thread(trainA, "Train A");
        Thread threadB = new Thread(trainB, "Train B");

        threadA.start();
        threadB.start();
    }
}
/*
class Train implements Runnable {
    private Track firstTrack;
    private Track secondTrack;

    public Train(Track firstTrack, Track secondTrack) {
        this.firstTrack = firstTrack;
        this.secondTrack = secondTrack;
    }

    @Override
    public void run() {
        // Acquire tracks in a fixed order to prevent circular dependency
        synchronized (firstTrack) {
            System.out.println(Thread.currentThread().getName() + " entered " + firstTrack.getName());

            try {
                Thread.sleep(100); // Simulating travel time
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println(Thread.currentThread().getName() + " waiting for " + secondTrack.getName());

            synchronized (secondTrack) {
                System.out.println(Thread.currentThread().getName() + " cleared " + secondTrack.getName());
            }
        }
    }
}

public class FixedDeadlockExample {
    public static void main(String[] args) {
        Track trackA = new Track("Track A");
        Track trackB = new Track("Track B");

        Train trainA = new Train(trackA, trackB);
        Train trainB = new Train(trackA, trackB); // Fix: Both trains use the same order

        Thread threadA = new Thread(trainA, "Train A");
        Thread threadB = new Thread(trainB, "Train B");

        threadA.start();
        threadB.start();
    }
}

 */
