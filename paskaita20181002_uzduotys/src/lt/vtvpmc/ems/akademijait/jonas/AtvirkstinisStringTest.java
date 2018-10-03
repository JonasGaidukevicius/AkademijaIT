package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtvirkstinisStringTest {

    @Test
    void generuojuAtvirkstiniString(){
        assertEquals("!agej samivamargorP", AtvirkstinisString.generuojuAtvirkstiniString("Programavimas jega!"));
    }

}