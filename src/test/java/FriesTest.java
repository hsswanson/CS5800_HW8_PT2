import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FriesTest {

    @Test
    public void test(){
        Fries fries = new Fries();
        double expected = 4.00;
        double actual = fries.calculateCost();
        assertEquals(expected, actual);
    }

}
