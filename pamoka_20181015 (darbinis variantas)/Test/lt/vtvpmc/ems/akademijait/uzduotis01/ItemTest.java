package lt.vtvpmc.ems.akademijait.uzduotis01;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemTest {

    @Test
    void getSomething() {
        System.out.println("Kažkoks metodas");
        Press testinis = new Press("dd", 10.0);

        try{
            assertEquals(2, testinis.getSomething(-41));
        } catch (KitaKlaida ex){
            System.out.println(ex.getMessage());
        }

    }
}