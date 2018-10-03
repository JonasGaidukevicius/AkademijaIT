package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MetodasTest {

    @Test
    void skaiciuojuVidurki(){
        assertEquals(4, Metodas.skaiciujuoVidurki(8, 5));

    }
}