package lt.vtvpmc.ems.akademijait.uzduotis01;

import lt.vtvpmc.ems.akademijait.Uzduotis01_Cart.NeigiamaKaina;

public abstract class Item {
    protected String itemName;
    protected double itemPrice;

    public Item(String itemName, double itemPrice) throws NeigiamaKaina
        {
        this.itemName = itemName;
        if(itemPrice < 0) {
            throw new NeigiamaKaina("Ivesta neigiama kaina");
        }

        //senas kodas
        if(itemPrice < 0){
            throw new NeigiamaKaina("Ivesta neigiama kaina");
        } else {
            this.itemPrice = itemPrice;
        }

    }


    public abstract double getTotalPrice();



    public int getSomething(int i) throws KitaKlaida{
        if(i < 0){
            throw new KitaKlaida("Kita klaida");
        }
        return 2;
    }

}
