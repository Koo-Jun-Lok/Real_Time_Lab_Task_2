
class NumberPrinter implements Runnable {
    private int threadId;
    public NumberPrinter(int id) {
        this.threadId = id;
    }
    @Override
    public void run() {
        try {
            for (int i = 0; i <= 5; i++) {
                System.out.println("Thread " + this.threadId + " is printing number: " + i + " from the list");
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            System.err.println("Thread " + this.threadId + " was interrupted.");
        }
    }
}

public class LabTask2 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Runnable task = new NumberPrinter(i);
            Thread thread = new Thread(task);
            thread.start();
        }
    }
}
