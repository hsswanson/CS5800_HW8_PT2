import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HamburgerTest {
    @Test
    public void test(){
        Hamburger hamburger = new Hamburger();
        double expected = 10.00;
        double actual = hamburger.calculateCost();
        assertEquals(expected, actual);
    }
}
