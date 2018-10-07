package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AtvirkstinisString08Test {

    @Test
    void generuojuAtvirkstiniString(){
        assertEquals("!agej samivamargorP", AtvirkstinisString08.generuojuAtvirkstiniString("Programavimas jega!"));
    }

}