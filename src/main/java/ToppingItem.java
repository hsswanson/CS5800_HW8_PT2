public abstract class ToppingItem extends FoodItem {
    private FoodItem foodItem;
    public ToppingItem(FoodItem foodItem){
        this.foodItem = foodItem;
    }
    abstract double getModifier();
    @Override
    public double calculateCost(){
        return getModifier()+ foodItem.calculateCost();
    }

}
