import java.util.HashMap;
import java.util.Map;

public class CornDogDecorator extends FoodDecorator {
    public CornDogDecorator(Food decoratedFood) {
        super(decoratedFood);
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
