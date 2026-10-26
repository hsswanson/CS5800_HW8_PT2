import org.junit.jupiter.api.Test;

public class HotdogTest {
    @Test
    public void test(){
        Hotdog hotdog = new Hotdog();
        double expected = 8.00;
        double actual = hotdog.calculateCost();
    }

}
