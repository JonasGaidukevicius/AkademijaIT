package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DidziausiasSkaiciusTest {

    @Test
    void ieskauDidziausioSkaiciaus(){
        int[] masyvas = {10, 2, 6, 15, 48, 1};
        assertEquals(48, DidziausiasSkaicius.ieskauDidziausioSkaiciaus(masyvas));
    }
}