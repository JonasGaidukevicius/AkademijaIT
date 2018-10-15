package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PressTest {

    @Test
    public void shouldAddProductName(){
        Press pressProduct = new Press("Spauda", 10.0);
        //pressProduct.setName("Spauda");
        assertEquals("Spauda", pressProduct.getName());
    }

    @Test
    public void shouldSetBasePrice(){
        Press pressProduct = new Press("Spauda", 10.0);
        //pressProduct.SetPriceWOVAT(10.0);
        assertEquals(10.0, pressProduct.GetPriceWOVAT());
    }

    @Test
    public void shouldAddVATToPriceWOVAT(){
        Press pressProduct = new Press("Spauda", 10.0);
        //pressProduct.SetPriceWOVAT(10.0);
        assertEquals(10.9, pressProduct.addVATToPriceWOVAT());
    }

}