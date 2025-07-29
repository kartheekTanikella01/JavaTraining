package exceptionHandling.excepHan.realworldScenario;

public class BankingApp {
     private double balance;
     private static final double MINIMUM_BALANCE = 1000.0;

     public BankingApp(double initialBalance) throws MinimumBalanceException {
          if (initialBalance < MINIMUM_BALANCE) {
               throw new MinimumBalanceException("Initial balance should be at least ₹1000");
          }
          this.balance = initialBalance;
     }

     public void withdraw(double amount) throws MinimumBalanceException {
          if (balance - amount < MINIMUM_BALANCE) {
               throw new MinimumBalanceException("Withdrawal denied! Balance cannot go below ₹1000");
          }
          balance -= amount;
          System.out.println("Withdrawal successful. Current balance: ₹" + balance);
     }

     public void displayBalance() {
          System.out.println("Current balance: ₹" + balance);
     }

     public static void main(String[] args) {
          try {
               BankingApp account = new BankingApp(2000);
               account.displayBalance();

               account.withdraw(500);

          } catch (MinimumBalanceException e) {
               System.out.println("Exception: " + e.getMessage());
          }
     }
}
