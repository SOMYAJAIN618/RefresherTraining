public class VolatileExample {

    private volatile boolean stop = false;

    public static void main(String[] args) throws InterruptedException {
        VolatileExample example = new VolatileExample();

        Thread thread1 = new Thread(() -> {
            while (!example.stop) {
                System.out.println("Thread 1 is running");
            }
            System.out.println("Thread 1 stopped running");
        });

        Thread thread2 = new Thread(() -> {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            example.stop = true;
            System.out.println("Thread 2 set stop flag to true");
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}