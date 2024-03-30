import java.util.HashMap;
import java.util.Map;

public class CornDogDecorator {
    public float basePrice() {
        return 2.50F;
    }


    public Map<String, Float> getAdditionalToppings() {
        return additionalToppings();
    }

    private Map<String, Float> additionalToppings() {
        Map<String, Float> additionalToppings =
                new HashMap<>();

        additionalToppings.put("Ketchup", 0.35F);
        additionalToppings.put("Mustard", 0.35F);

        return additionalToppings;
    }
}
