package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaktorialasPaprastasTest {

    @Test
    void skaiciuojuFaktoriala() {
        assertEquals(120, FaktorialasPaprastas.skaiciuojuFaktoriala(5));
    }
}