package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SkaitmenuSuma18Test {

    @Test
    void randuSkaitmenuSuma() {
        assertEquals(15, SkaitmenuSuma18.randuSkaitmenuSuma(528));
    }
}