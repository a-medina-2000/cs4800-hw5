import java.util.HashMap;
import java.util.Map;

public class OnionRingsDecorator {

    public float basePrice() {
        return 5.00F;
    }

    public Map<String, Float> getAdditionalToppings() {
        return additionalToppings();
    }

    private Map<String, Float> additionalToppings() {
        Map<String, Float> additionalToppings =
                new HashMap<>();

        additionalToppings.put("Ranch", 0.75F);
        additionalToppings.put("Garlic Mayonnaise", 1.0F);

        return additionalToppings;
    }
}
