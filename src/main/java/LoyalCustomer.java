public class LoyalCustomer extends Customer{
    private Customer loyal;
    public LoyalCustomer(Customer loyal){
        this.loyal = loyal;
    }
    public double calculateCost(){
        return 0.90*loyal.calculateCost();

    }
    public void addItem(FoodItem foodItem){
        loyal.addItem(foodItem);
    }
}
