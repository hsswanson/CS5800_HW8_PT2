public class OnionsTopping extends ToppingItem{
    public OnionsTopping(FoodItem foodItem) {
        super(foodItem);
    }

    @Override
    double getModifier() {
        return 0.50;
    }
}
