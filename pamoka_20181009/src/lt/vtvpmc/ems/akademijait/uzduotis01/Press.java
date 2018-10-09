package lt.vtvpmc.ems.akademijait.uzduotis01;

public class Press extends Item {

    public Press (String itemName, double itemPrice){
        super(itemName, itemPrice);
    }

    @Override
    public double getTotalPrice() {
        return this.itemPrice * 1.09;
    }


}
