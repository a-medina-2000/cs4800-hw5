import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class DecoratorTest {
    BurgerDecorator burger = new BurgerDecorator();
    FriesDecorator fries = new FriesDecorator();
    CornDogDecorator cornDog = new CornDogDecorator();
    OnionRingsDecorator onionRings = new OnionRingsDecorator();

    @Test
    public void testBurgerBasePrice() {
        float expected = 10.0F;
        float actual = burger.basePrice();

        assertEquals(expected, actual);
    }

    @Test
    public void testBurgerGetToppings() {
        Map<String, Float> expected = new HashMap<>();
        expected.put("Onions", 0.75F);
        expected.put("Extra Cheese", 0.5F);

        Map<String, Float> actual = burger.getAdditionalToppings();

        assertEquals(expected, actual);
    }

    @Test
    public void testFriesBasePrice() {
        float expected = 3.75F;
        float actual = fries.basePrice();

        assertEquals(expected, actual);
    }

    @Test
    public void testFriesGetToppings() {
        Map<String, Float> expected = new HashMap<>();
        expected.put("Chili", 2.0F);
        expected.put("Shredded Cheese", 0.8F);

        Map<String, Float> actual = fries.getAdditionalToppings();

        assertEquals(expected, actual);
    }

    @Test
    public void testCornDogBasePrice() {
        float expected = 2.50F;
        float actual = cornDog.basePrice();

        assertEquals(expected, actual);
    }

    @Test
    public void testCornDogGetToppings() {
        Map<String, Float> expected = new HashMap<>();
        expected.put("Ketchup", 0.35F);
        expected.put("Mustard", 0.35F);

        Map<String, Float> actual = cornDog.getAdditionalToppings();

        assertEquals(expected, actual);
    }

    @Test
    public void testOnionRingsBasePrice() {
        float expected = 5.00F;
        float actual = onionRings.basePrice();

        assertEquals(expected, actual);
    }

    @Test
    public void testOnionRingsGetToppings() {
        Map<String, Float> expected = new HashMap<>();
        expected.put("Garlic Mayonnaise", 1.0F);
        expected.put("Ranch", 0.75F);

        Map<String, Float> actual = onionRings.getAdditionalToppings();

        assertEquals(expected, actual);
    }

}
