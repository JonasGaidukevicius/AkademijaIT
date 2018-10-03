package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    @Test
    void powerOfNumber(){
        assertEquals(64, Numbers.power(8, 2));
        assertEquals(18, Numbers.power(4,4));
    }
}