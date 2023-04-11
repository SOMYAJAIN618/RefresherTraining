public class ThreadPriority {

    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            // print the thread name and priority
            System.out.println("Thread name: " + Thread.currentThread().getName());
            System.out.println("Thread priority: " + Thread.currentThread().getPriority());
        });

        // set the thread priority to maximum
        thread.setPriority(Thread.MAX_PRIORITY);

        // start the thread
        thread.start();
    }

}
