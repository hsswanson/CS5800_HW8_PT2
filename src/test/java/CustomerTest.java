import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {
    @Test
    public void testCustomer(){
        Customer dave = new Customer();
        dave.addItem(new Hamburger());
        double actual = dave.calculateCost();
        double expected = 10.00;
        assertEquals(expected, actual);

        dave.addItem(new SauceTopping(new Hotdog()));
        actual = dave.calculateCost();
        expected = 10.00+8.10;
        assertEquals(expected, actual);

        dave.addItem(new OnionsTopping(new CheeseTopping(new Fries())));
        actual = dave.calculateCost();
        expected = 10.00+8.10+4.75;
        assertEquals(expected, actual);
    }
}
