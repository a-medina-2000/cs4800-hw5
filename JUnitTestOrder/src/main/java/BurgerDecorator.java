import java.util.HashMap;
import java.util.Map;

public class BurgerDecorator {
    public float basePrice() {
        return 10.00F;
    }

    public Map<String, Float> getAdditionalToppings() {
        return additionalToppings();
    }

    private Map<String, Float> additionalToppings() {
        Map<String, Float> additionalToppings =
                new HashMap<>();

        additionalToppings.put("Onions", 0.75F);
        additionalToppings.put("Extra Cheese", 0.50F);

        return additionalToppings;
    }
}
