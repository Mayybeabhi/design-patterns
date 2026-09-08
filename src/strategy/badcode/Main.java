package strategy.badcode;

public class Main {
    public static void main(String[] args) {
        DiscountService discountService= new DiscountService();
        System.out.println(discountService.calculateDiscountedPrice("regular", 1000));
        System.out.println(discountService.calculateDiscountedPrice("member", 1000));
        System.out.println(discountService.calculateDiscountedPrice("employee", 1000));
    }
}
