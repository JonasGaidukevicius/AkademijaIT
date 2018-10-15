package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoodsTest {

    @Test
    public void shouldAddProductNameAndPrice(){
        Goods product = new Goods("Prekė", 10.0);
        //product.setName("Prekė");
        assertEquals("Prekė", product.getName());
        assertEquals(10.0, product.GetPriceWOVAT());
    }
/*
    @Test
    public void shouldSetBasePrice(){
        Goods product = new Goods("Prekė", 10.0);
        //product.SetPriceWOVAT(10.0);
        assertEquals(10.0, product.GetPriceWOVAT());
    }*/

    @Test
    public void shouldAddVATToPriceWOVAT(){
        Goods product = new Goods("Prekė", 10.0);
        //product.SetPriceWOVAT(10.0);
        assertEquals(12.1, product.addVATToPriceWOVAT());

    }




}