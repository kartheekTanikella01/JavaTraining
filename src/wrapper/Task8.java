package wrapper;

public class Task8 {
    private String accountNumber;
    private Double balance;

    public Task8(String accountNumber, Double balance) {
        this.accountNumber = accountNumber;
        this.balance = (balance != null) ? balance : 0.0;
    }

    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient Balance.");
        }
    }

    public void showBalance() {
        System.out.println("Account: " + accountNumber + " | Balance: ₹" + balance);
    }

    public static void main(String[] args) {
        Task8 account = new Task8("123456", null);
        account.showBalance();
        account.deposit(5000);
        account.withdraw(2000);
        account.showBalance();
    }
}

