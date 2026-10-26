

public class Main {
    public static void main(String[] args){

        System.out.println("David wants a cheeseburger and onion fries.");
        Customer customer = new Customer();
        customer.addItem(new OnionsTopping(new Fries()));
        customer.addItem(new CheeseTopping(new Hamburger()));
        System.out.println("It will cost:"+customer.calculateCost());

        System.out.println("Mark, a loyal customer, wants 2 cheesedogs");
        customer = new LoyalCustomer(new Customer());
        customer.addItem(new CheeseTopping(new Hotdog()));
        customer.addItem(new CheeseTopping(new Hotdog()));
        System.out.println("It will cost:"+customer.calculateCost());

        System.out.println("Carl wants a hamburger will all the fixings.");
        customer = new Customer();
        customer.addItem(new OnionsTopping(new CheeseTopping(new SauceTopping(new Hamburger()))));
        System.out.println("It will cost:"+customer.calculateCost());
    }
}
