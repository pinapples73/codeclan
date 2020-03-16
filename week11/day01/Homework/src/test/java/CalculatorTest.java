import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calc;

    @Test
    public void testAdd(){
        Calculator calc = new Calculator(2, 6);
        assertEquals(8, calc.add());
    }

    @Test
    public void testSubtract(){
        Calculator calc = new Calculator(5, 2);
        assertEquals(3, calc.subtract());
    }

    @Test
    public void testMultiply(){
        Calculator calc = new Calculator(10, 2);
        assertEquals(20, calc.multiply());
    }

    @Test
    public void testDivide(){
        Calculator calc = new Calculator(12, 3);
        assertEquals(4, calc.divide(), 0.1);
    }

}
