package multiThreading.task7;

public class Task7 {
    static int counter = 0;
    static Object lock = new Object();

    public static void main(String[] args) throws InterruptedException {
        Runnable increment = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronized (lock) {
                    counter++;
                }
            }
        };

        Thread t1 = new Thread(increment);
        Thread t2 = new Thread(increment);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println("Final count (synchronized): " + counter);
    }
}

