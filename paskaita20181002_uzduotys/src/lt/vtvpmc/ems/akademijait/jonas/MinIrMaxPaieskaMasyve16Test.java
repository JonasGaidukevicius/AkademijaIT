package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MinIrMaxPaieskaMasyve16Test {

    @Test
    void minimaliMasyvoReiksme() {
        double [] testinisMasyvas = {1.35, 2.45, 2.05, 1.20, 2.15, 1.70, 1.45, 1.95, 2.00, 1.65, 1.65, 2.05, 1.75, 1.25, 2.25, 1.40};
        assertEquals(1.2, MinIrMaxPaieskaMasyve16.minimaliMasyvoReiksme(testinisMasyvas));
    }

    @Test
    void maksimaliMasyvoReiksme() {
        double [] testinisMasyvas = {1.35, 2.45, 2.05, 1.20, 2.15, 1.70, 1.45, 1.95, 2.00, 1.65, 1.65, 2.05, 1.75, 1.25, 2.25, 1.40};
        assertEquals(2.45, MinIrMaxPaieskaMasyve16.maksimaliMasyvoReiksme(testinisMasyvas));
    }

    @Test
    void apskaiciuojuMasyvoAritmetiniVidurki() {
        double [] testinisMasyvas = {1.35, 2.45, 2.05, 1.20, 2.15, 1.70, 1.45, 1.95, 2.00, 1.65, 1.65, 2.05, 1.75, 1.25, 2.25, 1.40};
        assertEquals(1.7687499999999996, MinIrMaxPaieskaMasyve16.apskaiciuojuMasyvoAritmetiniVidurki(testinisMasyvas));
    }
}