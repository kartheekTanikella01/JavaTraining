package OOPsTasks.Task3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BankAccount {
    private long AccountNumber;
    private double AccountBalance;

    public BankAccount() {
    }

    public BankAccount(long accountNumber, double accountBalance) {
        this.AccountNumber = accountNumber;
        this.AccountBalance = accountBalance;
    }

    public long getAccountNumber() {
        return AccountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        AccountNumber = accountNumber;
    }

    public double getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        AccountBalance = accountBalance;
    }

    public double deposit(int amount){
        if (amount > 0) {
            AccountBalance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Updated Balance: " + AccountBalance);
        } else {
            System.out.println("Amount should be greater than zero.");
        }
        return AccountBalance;
    }

    public double withdraw(int amount){
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
        } else if (amount > AccountBalance) {
            System.out.println("Insufficient balance.");
        } else {
            AccountBalance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Remaining Balance: " + AccountBalance);
        }
        return AccountBalance;
    }

    public double balance(){
        System.out.println("Current Balance: " + AccountBalance);
        return AccountBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "AccountNumber=" + AccountNumber +
                ", AccountBalance=" + AccountBalance +
                '}';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<BankAccount> accounts = new ArrayList<>();

        for (int i = 0; i < 2; i++) {
            BankAccount account = new BankAccount();
            System.out.println("Enter account number for account " + (i + 1) + ":");
            account.setAccountNumber(sc.nextLong());

            System.out.println("Enter initial balance:");
            account.setAccountBalance(sc.nextDouble());

            accounts.add(account);
        }

        for (BankAccount acc : accounts) {
            System.out.println(acc);
        }

        BankAccount acc1 = accounts.get(0);
        acc1.deposit(5000);
        acc1.withdraw(100);
        acc1.balance();
    }
}
