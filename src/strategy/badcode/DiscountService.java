package strategy.badcode;

public class DiscountService {
    public double calculateDiscountedPrice(String customerType, double price){
        if("regular".equals(customerType))
            return price-(price*0.05);
        else if("member".equals(customerType))
            return price-(price*0.15);
        else if("employee".equals(customerType))
            return price-(price*0.25);
        return price;

    }
}
