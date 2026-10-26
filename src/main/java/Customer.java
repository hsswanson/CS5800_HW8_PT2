import java.util.ArrayList;

public class Customer {
    private ArrayList<FoodItem> order;

    public Customer(){
        order = new ArrayList<FoodItem>();
    }
    public void addItem(FoodItem foodItem){
        order.add(foodItem);
    }
    public double calculateCost(){
        double cost = 0.00;
        for(FoodItem i:order){
            cost=cost+i.calculateCost();
        }
        return cost;
    }
}
