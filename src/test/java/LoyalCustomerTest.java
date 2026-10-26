import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoyalCustomerTest {
    @Test
    public void testLoyalCustomer(){
        LoyalCustomer goliath = new LoyalCustomer(new Customer());
        goliath.addItem(new Hamburger());
        goliath.addItem(new Fries());
        double expected = 12.60;
        double actual = goliath.calculateCost();
        assertEquals(expected, actual);
    }
}
