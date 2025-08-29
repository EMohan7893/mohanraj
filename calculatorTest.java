import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class calculatorTest
  {

  
    calculator calc = new calculator();

   
    @Test public void testAddition() 
  {
        assert Equals(15, calc.add(10, 5)); 
    }

 
    @Test public void testSubtraction() {
        assert Equals(5, calc.subtract(10, 5));
    }

    @Test public void testMultiplication() {
        assert Equals(50, calc.multiply(10, 5)); 
    }

    
    @Test public void testDivision() 
  {
        assert Equals(2, calc.divide(10, 5)); 
}
  }
