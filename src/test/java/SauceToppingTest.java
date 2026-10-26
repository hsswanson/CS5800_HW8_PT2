import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SauceToppingTest {
    @Test
    public void testSaucyBurger(){
        SauceTopping saucyBurger = new SauceTopping(new Hamburger());
        double expected = 10.00+0.10;
        double actual = saucyBurger.calculateCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testSaucyDog() {
        SauceTopping saucyDog = new SauceTopping(new Hotdog());
        double expected = 8.00 + 0.10;
        double actual = saucyDog.calculateCost();
        assertEquals(expected, actual);
    }

    @Test
    public void testSaucyFries(){
        SauceTopping saucyDog = new SauceTopping(new Fries());
        double expected = 4.00+0.10;
        double actual = saucyDog.calculateCost();
        assertEquals(expected, actual);
    }
}
