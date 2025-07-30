package multiThreading.task6;

    public class Task6 {
        static int counter = 0;

        public static void main(String[] args) throws InterruptedException {
            Runnable increment = () -> {
                for (int i = 0; i < 1000; i++) {
                    counter++;
                }
            };

            Thread t1 = new Thread(increment);
            Thread t2 = new Thread(increment);

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.println("Final count: " + counter);
        }
    }


