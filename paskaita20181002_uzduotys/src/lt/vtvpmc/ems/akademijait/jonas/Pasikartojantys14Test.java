package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Pasikartojantys14Test {

    @Test
    void kiekVienoduRaidziu() {
        assertEquals(3, Pasikartojantys14.kiekVienoduRaidziu("Ar cia yra vienodu raidziu", 'a'));
    }
}