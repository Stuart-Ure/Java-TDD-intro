import com.codebase.WaterBottle;
import org.junit.Test;
import org.junit.Before;
import  static org.junit.Assert.assertEquals;

public class WaterBottleTest {
    private WaterBottle waterBottle;
    @Before

    public void before(){
        waterBottle = new WaterBottle ();
    }

    @Test
    public void hasVolume() {
        assertEquals(100, waterBottle.getVolume());
    }

    @Test
    public void drink10Volume() {
        waterBottle.drink();
        assertEquals(90, waterBottle.getVolume());
    }

    @Test
    public void emptyVolume() {
        waterBottle.empty();
        assertEquals(0, waterBottle.getVolume());
    }

    @Test
    public void fillVolume() {
        waterBottle.empty();
        waterBottle.fill();
        assertEquals(100, waterBottle.getVolume());
    }
}