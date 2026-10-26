public class CheeseTopping extends ToppingItem{
    public CheeseTopping(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    double getModifier() {
        return 0.25;
    }
}
