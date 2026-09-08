package strategy.goodcode;

public class RegularDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscountedPrice(double price) {
        return price-(price*0.05);
    }

}
