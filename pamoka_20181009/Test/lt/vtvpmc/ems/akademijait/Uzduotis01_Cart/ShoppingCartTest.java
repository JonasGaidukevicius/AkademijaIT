package lt.vtvpmc.ems.akademijait.Uzduotis01_Cart;

//import lt.vtvpmc.ems.akademijait.uzduotis01.Drugs; (originali eilute)
import lt.vtvpmc.ems.akademijait.uzduotis01.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {

    @Test

    public void shoudGetTotalPrice(){
        ShoppingCart myFirstShoppingCart = new ShoppingCart();
        myFirstShoppingCart.addItem(new Press("Spauda", 10.0));
        myFirstShoppingCart.addItem(new Drugs("Vaistai", 10.0));

        assertEquals(21.4, myFirstShoppingCart.getTotalPrice());

    }

}