import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class WaterBottleTest {

    @Test
    public void testDrink() {
        WaterBottle waterBottle = new WaterBottle();
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void testEmpty() {
        WaterBottle waterBottle = new WaterBottle();
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void testFill() {
        WaterBottle waterBottle = new WaterBottle();
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}
