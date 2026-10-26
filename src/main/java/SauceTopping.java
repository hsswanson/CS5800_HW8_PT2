public class SauceTopping extends ToppingItem{
    public SauceTopping(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    double getModifier() {
        return 0.10;
    }
}
