package strategy.goodcode;

public class DiscountService {
    private final DiscountStrategy discountStrategy;
    DiscountService(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }
    public double calculateDiscountedPrice(double price) {
       return discountStrategy.calculateDiscountedPrice(price);
    }
}
