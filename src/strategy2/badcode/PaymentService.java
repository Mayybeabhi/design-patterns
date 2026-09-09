package strategy2.badcode;

public class PaymentService {
    public void pay(String paymentMethod,double amount){
        if("UPI".equals(paymentMethod))
            System.out.println("Processing UPI payment of Rs "+amount);
        else if ("Credit-Card".equals(paymentMethod))
            System.out.println("Processing Credit-card payment of Rs "+amount);
    }
}
