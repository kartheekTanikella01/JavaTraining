package multiThreading.task11;

public class Task11 {
    public static void main(String[] args) {
        Runnable runner = () -> {
            for (int i = 0; i < 5; i++) {
                System.out.println(Thread.currentThread().getName() + " running...");
                try {
                    Thread.sleep((int)(Math.random() * 1000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        new Thread(runner, "Tortoise").start();
        new Thread(runner, "Rabbit").start();
        new Thread(runner, "Dog").start();
    }
}

