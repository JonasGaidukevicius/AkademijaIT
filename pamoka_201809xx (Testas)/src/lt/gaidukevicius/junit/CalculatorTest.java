package lt.gaidukevicius.junit;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoZeroes(){
        assertEquals(0, Calculator.add(0.0, 0.0));
    }
}