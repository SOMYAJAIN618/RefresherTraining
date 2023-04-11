public class ThreadInterrupt {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyRunnable());
        thread.start();

        // Let the thread run for a while
        Thread.sleep(5000);

        // Interrupt the thread
        thread.interrupt();
    }
    static class MyRunnable implements Runnable {
        public void run() {
            try {
                while (!Thread.currentThread().isInterrupted()) {
                    System.out.println("Thread is running...");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                // Thread was interrupted
                System.out.println("Thread was interrupted!");
            }
        }
    }
}