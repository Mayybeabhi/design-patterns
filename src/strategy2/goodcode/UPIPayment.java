package strategy2.goodcode;

public class UPIPayment implements PaymentInterface {
    @Override
    public void pay(double amount) {
        System.out.println("Processing UPI payment of Rs "+amount);
    }
}
