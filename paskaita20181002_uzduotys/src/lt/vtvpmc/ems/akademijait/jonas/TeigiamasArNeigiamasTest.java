package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeigiamasArNeigiamasTest {

    @Test
    void arYraTeigiamas() {
        assertEquals(false, TeigiamasArNeigiamas.arYraTeigiamas(-5));
    }
}