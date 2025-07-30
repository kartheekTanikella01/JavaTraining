package multiThreading.task4;

public class Task4 {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            try {
                Thread.sleep(2000);
                System.out.println("Thread done.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });

        System.out.println("Before start: " + thread.isAlive());
        thread.start();
        System.out.println("After start: " + thread.isAlive());

        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("After join: " + thread.isAlive());
    }
}
