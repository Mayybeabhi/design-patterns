package strategy.goodcode;

public class EmployeeDiscount implements DiscountStrategy{
    @Override
    public double calculateDiscountedPrice(double price) {
        return price-(price*0.25);
    }
}
