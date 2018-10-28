package lt.vtvpmc.ems.akademijait.Uzduotis01_Cart;

import lt.vtvpmc.ems.akademijait.uzduotis01.*;

public class ShoppingCart {
    private Item[] cart = new Item[10];
    private int count = 0;

    public void addItem(Item item){
        cart[count++] = item;
    }

    public double getTotalPrice(){
        double sum =0;
        for (int i = 0; i < count; i++){
            sum+= this.cart[i].getTotalPrice();
        }
        return sum;
    }

}
