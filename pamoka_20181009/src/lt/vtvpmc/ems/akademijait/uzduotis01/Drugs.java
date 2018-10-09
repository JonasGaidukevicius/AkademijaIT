package lt.vtvpmc.ems.akademijait.uzduotis01;

public class Drugs extends Item {

    public Drugs (String itemName, double itemPrice){
        super(itemName, itemPrice);
    }

    @Override
    public double getTotalPrice() {
        return this.itemPrice * 1.05;
    }


}
