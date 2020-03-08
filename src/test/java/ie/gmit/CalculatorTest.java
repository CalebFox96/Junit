package ie.gmit;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator myCalc;
    @BeforeEach
    void setup(){
        myCalc = new Calculator();
    }
    @Test
    void testAdd(){
        assertEquals(10,myCalc.add(5,5));
    }
    @Test
    void testDelete(){
        assertEquals(5,myCalc.delete(10,5));
    }
}
