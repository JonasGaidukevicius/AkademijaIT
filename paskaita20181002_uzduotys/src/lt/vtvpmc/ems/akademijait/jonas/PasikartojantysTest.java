package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasikartojantysTest {

    @Test
    void kiekVienoduRaidziu() {
        assertEquals(3, Pasikartojantys.kiekVienoduRaidziu("Ar cia yra vienodu raidziu", 'a'));
    }
}