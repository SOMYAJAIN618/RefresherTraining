
public class SynchronizedExample {
    private static int counter = 0;

    public static void main(String[] args) throws InterruptedException {

        Thread t1 = new MyThread();
        Thread t2 = new MyThread();

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final counter value: " + counter);
    }

    // synchronized method to increment counter
     public static synchronized void incrementCounter() {

        counter++;
    }
    static class MyThread extends Thread {
        public void run() {
            for (int i = 0; i < 10; i++) {
                SynchronizedExample.incrementCounter();
            }
        }
    }
}
