package strategy2.goodcode;

public class CreditCardPayment implements PaymentInterface{
    @Override
    public void pay(double amount) {
        System.out.println("Processing Credit-Card payment of Rs "+amount);
    }
}
