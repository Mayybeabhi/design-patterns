package strategy2.badcode;

public class Main {
    public static void main(String[] args){
        PaymentService paymentService=new PaymentService();
        paymentService.pay("UPI",1000);
        paymentService.pay("Credit-Card",1000);
    }
}
