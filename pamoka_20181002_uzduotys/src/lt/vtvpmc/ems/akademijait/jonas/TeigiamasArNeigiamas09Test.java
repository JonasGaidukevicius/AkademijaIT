package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TeigiamasArNeigiamas09Test {

    @Test
    void arYraTeigiamas() {
        assertEquals(false, TeigiamasArNeigiamas09.arYraTeigiamas(-5));
    }
}