package lt.vtvpmc.ems.akademijait.uzduotis01;

public abstract class Item {
    protected String itemName;
    protected double itemPrice;

    public Item(String itemName, double itemPrice){
        this.itemName = itemName;
        this.itemPrice = itemPrice;
    }


    public abstract double getTotalPrice();

}
