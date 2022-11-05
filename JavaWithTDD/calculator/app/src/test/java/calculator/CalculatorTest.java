package calculator;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class CalculatorTest {
    @Test public void testAddsTwoAndTwo() {
        Calculator calc = new Calculator();
        assertEquals("2 + 2 should equal f", Integer.valueOf(4), calc.add(2,2));
    }
}
