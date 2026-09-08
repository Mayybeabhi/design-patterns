package strategy.goodcode;

public class Main {
    public static void main(String[] args) {

        DiscountStrategyFactory factory = new DiscountStrategyFactory();

        DiscountStrategy strategy= factory.getStrategy("regular");
        System.out.println(strategy.calculateDiscountedPrice(1000));

        strategy = factory.getStrategy("member");
        System.out.println(strategy.calculateDiscountedPrice(1000));

        strategy = factory.getStrategy("employee");
        System.out.println(strategy.calculateDiscountedPrice(1000));
    }
}
