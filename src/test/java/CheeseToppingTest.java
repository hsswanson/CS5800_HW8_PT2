import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CheeseToppingTest {
    @Test
    public void testCheeseburger(){
        CheeseTopping cheeseburger = new CheeseTopping(new Hamburger());
        double expected = 10.00+0.25;
        double actual = cheeseburger.calculateCost();
        assertEquals(expected, actual);


    }
    @Test
    public void testCheesedog(){
        CheeseTopping cheesedog = new CheeseTopping(new Hotdog());
        double expected = 8.00+0.25;
        double actual = cheesedog.calculateCost();
        assertEquals(expected, actual);

    }

    @Test
    public void testCheesefries(){
        CheeseTopping cheesefries = new CheeseTopping(new Fries());
        double expected = 4.00+0.25;
        double actual = cheesefries.calculateCost();
        assertEquals(expected, actual);

    }
}
