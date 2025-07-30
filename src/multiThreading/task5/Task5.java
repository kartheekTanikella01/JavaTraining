package multiThreading.task5;

public class Task5 {
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> System.out.println("Thread1 running"));
        Thread t2 = new Thread(() -> System.out.println("Thread2 running"));
        Thread t3 = new Thread(() -> System.out.println("Thread3 running"));

        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.NORM_PRIORITY);
        t3.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Thread1 Priority: " + t1.getPriority());
        System.out.println("Thread2 Priority: " + t2.getPriority());
        System.out.println("Thread3 Priority: " + t3.getPriority());

        t1.start();
        t2.start();
        t3.start();
    }
}

