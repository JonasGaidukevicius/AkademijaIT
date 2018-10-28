package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DrugsTest {

    @Test
    public void shouldAddProductName(){
        Drugs drugProduct = new Drugs("Vaistas", 10.0);
        //drugProduct.setName("Vaistas");
        assertEquals("Vaistas", drugProduct.getName());
    }

    @Test
    public void shouldSetBasePrice(){
        Drugs drugProduct = new Drugs("Vaistas", 10.0);
        //drugProduct.SetPriceWOVAT(10.0);
        assertEquals(10.0, drugProduct.GetPriceWOVAT());
    }

    @Test
    public void shouldAddVATToPriceWOVAT(){
        Drugs drugProduct = new Drugs("Vaistas", 10.0);
        //drugProduct.SetPriceWOVAT(10.0);
        assertEquals(10.5, drugProduct.addVATToPriceWOVAT());

    }

}