import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
public class OnionToppingTest {
    @Test
    public void testOnionBurger(){
        OnionsTopping onionBurger = new OnionsTopping(new Hamburger());
        double expected = 10.00+0.50;
        double actual = onionBurger.calculateCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testOnionDog(){
        OnionsTopping onionDog = new OnionsTopping(new Hotdog());
        double expected = 8.00+0.50;
        double actual = onionDog.calculateCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testOnionFries(){
        OnionsTopping onionFries = new OnionsTopping(new Fries());
        double expected = 4.00+0.50;
        double actual = onionFries.calculateCost();
        assertEquals(expected, actual);
    }
}
