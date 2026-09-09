package strategy2.goodcode;

public class PaymentService {


   private final PaymentFactory paymentFactory;
   public PaymentService(PaymentFactory paymentFactory) {
       this.paymentFactory = paymentFactory;
   }



    public void pay(String paymentType, double amount){
      PaymentInterface paymentInterface= paymentFactory.getPaymentService(paymentType);
       paymentInterface.pay(amount);
    }
}
