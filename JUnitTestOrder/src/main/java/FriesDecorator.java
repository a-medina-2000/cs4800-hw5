import java.util.HashMap;
import java.util.Map;

public class FriesDecorator {
    public float basePrice() {
        return 3.75F;
    }

    public Map<String, Float> getAdditionalToppings() {
        return additionalToppings();
    }

    private Map<String, Float> additionalToppings() {
        Map<String, Float> additionalToppings =
                new HashMap<>();

        additionalToppings.put("Chili", 2.0F);
        additionalToppings.put("Shredded Cheese", 0.80F);

        return additionalToppings;
    }
}