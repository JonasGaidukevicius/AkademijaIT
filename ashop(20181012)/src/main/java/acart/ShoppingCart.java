package acart;

import ashop.Item;
import ashop.Medicine;
import ashop.Wine;

public class ShoppingCart {

    private Item[] items = new Item[10];
    private int itemCount = 0;

    public void add(Item item) {
        items[itemCount++] = item;
    }

    public int getItemCount() {
        return itemCount;
    }

    public double getTotalPrice() {
        double totalPrice = 0;
        
        for (int i = 0; i < itemCount; i++) {
            totalPrice += items[i].getTotalPrice();
        }
        
        return totalPrice;
    }
}
