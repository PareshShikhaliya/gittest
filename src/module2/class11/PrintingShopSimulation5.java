package module2.class11;

class PrintJob implements Runnable {
    private String jobName;
    private int printingTime;

    public PrintJob(String jobName, int printingTime) {
        this.jobName = jobName;
        this.printingTime = printingTime;
    }

    public void run() {
        try {
            System.out.println(jobName + " is being printed...");
            Thread.sleep(printingTime); // Simulate printing time
            System.out.println(jobName + " is printed!");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class PrintingShopSimulation5 {
    public static void main(String[] args) {
        Thread job1 = new Thread(new PrintJob("Document A", 4000)); // Takes 4 seconds to print
        Thread job2 = new Thread(new PrintJob("Image B", 6000));    // Takes 6 seconds to print
        Thread job3 = new Thread(new PrintJob("Report C", 3000));   // Takes 3 seconds to print

        job1.start();
        job2.start();
        job3.start();
    }
}
