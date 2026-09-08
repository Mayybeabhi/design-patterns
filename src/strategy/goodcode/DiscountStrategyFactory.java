package strategy.goodcode;

import java.util.HashMap;
import java.util.Map;

public class DiscountStrategyFactory {

        private final Map<String,DiscountStrategy> strategyMap=new HashMap<>();
       public DiscountStrategyFactory(){
           strategyMap.put("regular", new RegularDiscount());
           strategyMap.put("member", new MemberDiscount());
           strategyMap.put("employee", new EmployeeDiscount());
        }

    public DiscountStrategy getStrategy(String customerType){
       return strategyMap.get(customerType);
    }
}
