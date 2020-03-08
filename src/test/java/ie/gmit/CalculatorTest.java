package ie.gmit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;
@Test
    void testAdd(){
        myCalc = new Calculator();
        assertEquals(10,myCalc.add(5,5));
    }
}
