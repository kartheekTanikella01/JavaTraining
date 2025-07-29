package exceptionHandling.abstraction.RealworldScenario1;

public class Cash extends PaymentSystem{

    private  Long Amount;

    public Cash(Long amount) {
        Amount = amount;
    }

    @Override
    public void paymentMethod() {
        System.out.println("The  amount is: "+ Amount );

    }

    public Long getAmount() {
        return Amount;
    }

    public void setAmount(Long amount) {
        Amount = amount;
    }
}
