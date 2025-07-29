package exceptionHandling.abstraction.RealworldScenario1;

public class UPI extends PaymentSystem{
    private Long Number;
    private  Long Amount;

    public UPI(Long number,Long amount) {
        Number = number;
        Amount=amount;
    }

    @Override
    public void paymentMethod() {
        System.out.println("the upi number is:" + Number);
        System.out.println("The amount is: "+ Amount);

    }

    public Long getNumber() {
        return Number;
    }

    public void setNumber(Long number) {
        Number = number;
    }

    public Long getAmount() {
        return Amount;
    }

    public void setAmount(Long amount) {
        Amount = amount;
    }
}
