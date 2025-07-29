package exceptionHandling.abstraction.RealworldScenario1;

public class CreditCard extends PaymentSystem
{
    private Long CreditCardNumber;
    private Long Amount;

    public CreditCard(Long creditCardNumber, Long amount) {
        CreditCardNumber = creditCardNumber;
        Amount = amount;
    }

    public Long getCreditCardNumber() {
        return CreditCardNumber;
    }

    public void setCreditCardNumber(Long creditCardNumber) {
        CreditCardNumber = creditCardNumber;
    }

    public Long getAmount() {
        return Amount;
    }

    public void setAmount(Long amount) {
        Amount = amount;
    }

    @Override
    public void paymentMethod() {
        System.out.println("the amount is: "+ Amount);
        System.out.println("the card number is: "+ CreditCardNumber);
    }
}
