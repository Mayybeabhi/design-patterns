package strategy.goodcode;

public class MemberDiscount implements DiscountStrategy {
    @Override
    public double calculateDiscountedPrice(double price) {
        return price-(price*0.15);
    }
}
