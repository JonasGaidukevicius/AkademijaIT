package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ChangerTest {

    @Test
    void changeTwoNumbers() {
        assertEquals(20, Changer.changeTwoNumbers(-10, 20));
    }

    @Test
    void changeTwoNumbersVersionTwo(){
        assertEquals(20.00, Changer.changeTwoNumbersVersionTwo(10.0, 20.0));
    }

    @Test
    void changeTwoNumbersVersionThree(){
        assertEquals(20, Changer.changeTwoNumbersVersionThree(10, 20));
    }
}