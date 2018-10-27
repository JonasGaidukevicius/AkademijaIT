package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FaktorialasPaprastas15Test {

    @Test
    void skaiciuojuFaktoriala() {
        assertEquals(120, FaktorialasPaprastas15.skaiciuojuFaktoriala(5));
    }
}