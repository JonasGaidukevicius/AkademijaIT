package acart;

import ashop.Medicine;
import ashop.Wine;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartTest {
    
    @Test
    public void medicineCanBeAddedToCart() {
        ShoppingCart shoppingCart = new ShoppingCart();
        
        shoppingCart.add(new Medicine("Test", 5.0));
    
        assertEquals(1, shoppingCart.getItemCount()); 
    }

    @Test
    public void wineCanBeAddedToCart() {
        ShoppingCart shoppingCart = new ShoppingCart();

        shoppingCart.add(new Wine("Test", 5.0, 1.0));

        assertEquals(1, shoppingCart.getItemCount());
    }

    @Test
    public void shouldReportFinalPrice() {
        ShoppingCart shoppingCart = new ShoppingCart();
        
        shoppingCart.add(new Medicine("Ibuprofen", 1.0));
        shoppingCart.add(new Medicine("Aspirin", 2.0));
        shoppingCart.add(new Wine("Voruta", 5.0, 1.0));
        
        assertEquals(11.2, shoppingCart.getTotalPrice(), 0.01);
    }
}