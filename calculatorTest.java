import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

  
    Calculator calc = new Calculator();

   
    @Test
    public void testAddition() {
        assertEquals(15, calc.add(10, 5)); // Assuming 'add' takes two integers
    }

 
    @Test
    public void testSubtraction() {
        assertEquals(5, calc.subtract(10, 5)); // Assuming 'subtract' takes two integers
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, calc.multiply(10, 5)); // Assuming 'multiply' takes two integers
    }

    
    @Test
    public void testDivision() {
        assertEquals(2, calc.divide(10, 5)); // Assuming 'divide' takes two integers
    }
}

