package multiThreading.Task2;

public class RunnableCounter implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("this is through runnable method..!");
        }

    }

    public static void main(String[] args) {
        RunnableCounter runnableCounter=new RunnableCounter();
        Thread thread=new Thread(runnableCounter);
        thread.start();
    }
}
