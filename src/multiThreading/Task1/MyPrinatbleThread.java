package multiThreading.Task1;

public class MyPrinatbleThread extends Thread{
    public  void run(){
        for (int i = 0; i <5 ; i++) {
            System.out.println("hello from thread");
            try{
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("thread interrupted");
            }

        }
        System.out.println("hello from thread");
    }

    public static void main(String[] args) {
        MyPrinatbleThread thread=new MyPrinatbleThread();
        thread.start();
    }
}
