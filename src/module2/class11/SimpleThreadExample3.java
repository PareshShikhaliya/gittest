package module2.class11;

class SumCalculatorThread extends Thread {
    private int[] array;
    private int startIndex, endIndex;
    private long sum;

    public SumCalculatorThread(int[] array, int startIndex, int endIndex) {
        this.array = array;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public void run()
    {
        sum = 0;
        for (int i = startIndex; i <= endIndex; i++)
        {
            sum += array[i];
        }
    }

    public long getSum() {
        return sum;
    }
}

public class SimpleThreadExample3 {
    public static void main(String[] args) throws InterruptedException
    {
        int[] data = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        SumCalculatorThread thread1 = new SumCalculatorThread(data, 0, data.length / 2 - 1);
        SumCalculatorThread thread2 = new SumCalculatorThread(data, data.length / 2, data.length - 1);

        thread1.start(); // Start thread1
        thread2.start(); // Start thread2

        // Wait for thread1 and thread2 to finish before proceeding
        thread1.join(); // Main thread pauses and waits for thread1 to complete
        thread2.join(); // Main thread pauses and waits for thread2 to complete


        long totalSum = thread1.getSum() + thread2.getSum();
        System.out.println("Total Sum using Threads: " + totalSum);
    }
}
