package strategy2.goodcode;

public class Main {
    public static void main(String[] args) {
        PaymentFactory paymentFactory = new PaymentFactory();
        PaymentService paymentService = new PaymentService(paymentFactory);
        paymentService.pay("UPI",1000);
        paymentService.pay("CreditCard",1000);
    }
}
