import java.util.Map;

public abstract class FoodDecorator implements Food {
    protected Food decoratedFood;

    public FoodDecorator(Food decoratedFood) {
        this.decoratedFood = decoratedFood;
    }

    public float basePrice() {
        return decoratedFood.basePrice();
    }
}
