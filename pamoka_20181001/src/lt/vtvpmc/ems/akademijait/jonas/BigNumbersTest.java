package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.*;

class BigNumbersTest {

    @Test
    void returnBigInteger (){
        assertEquals(new BigInteger("1000000000000000"), BigNumbers.addTwoBigIntegerNumbers(new BigInteger("1000000000000000"), new BigInteger("0")));
    }

    @Test
    void addTwoBigIntegerNumbers() {
        //assertEquals();
    }
}