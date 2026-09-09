package strategy2.goodcode;

import java.util.HashMap;
import java.util.Map;

public class PaymentFactory {
    Map<String,PaymentInterface> paymentMap=new HashMap<>();
    public PaymentFactory(){
        paymentMap.put("UPI", new UPIPayment());
        paymentMap.put("CreditCard",new CreditCardPayment());
    }

    public PaymentInterface getPaymentService(String paymentType){
       return paymentMap.get(paymentType);
    }
}
