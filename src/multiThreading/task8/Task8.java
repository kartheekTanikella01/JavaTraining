package multiThreading.task8;

class BankAccount {
    private int balance = 1000;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out.println("Remaining balance: " + balance);
        } else {
            System.out.println("Insufficient balance for " + Thread.currentThread().getName());
        }
    }
}

public class Task8 {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        Runnable user = () -> {
            for (int i = 0; i < 3; i++) {
                account.withdraw(400);
            }
        };

        Thread t1 = new Thread(user, "User1");
        Thread t2 = new Thread(user, "User2");

        t1.start();
        t2.start();
    }
}

