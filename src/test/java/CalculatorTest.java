import com.codebase.Calculator;
import org.junit.Test;
import org.junit.Before;
import  static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;
    @Before
    public void before(){
        calculator = new Calculator ();

    }
    @Test
    public void canAdd(){
        assertEquals(100, calculator.add(50, 50));
    }
    @Test
    public void canSubtract(){
        assertEquals(10, calculator.subtract(20, 10));
    }
    @Test
    public void canMultiply(){
        assertEquals(25, calculator.multiply(5, 5));
    }
    @Test
    public void canDivide(){
        assertEquals(6, calculator.divide(12, 2), 0.0);
    }



}
