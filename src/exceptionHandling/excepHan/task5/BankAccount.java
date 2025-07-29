package exceptionHandling.excepHan.task5;

public class BankAccount {
    private double balance;

    public BankAccount(double balance) throws InvalidAccountException {
        if(balance<0){
            throw  new InvalidAccountException("account must must be greater than 0");
        }
        this.balance = balance;
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        try{
            BankAccount bankAccount=new BankAccount(0);
        }catch(InvalidAccountException exception){
            System.out.println("Exception caught: "+ exception.getMessage());
        }
    }
}
