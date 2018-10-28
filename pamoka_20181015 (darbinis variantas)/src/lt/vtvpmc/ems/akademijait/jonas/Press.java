package lt.vtvpmc.ems.akademijait.jonas;

public class Press extends Goods {
    private static final double VAT_PRESS = 1.09;

    public Press(String goodsName, double priceWOVAT) {
        super(goodsName, priceWOVAT);
    }

    public double addVATToPriceWOVAT() {
        return this.priceWOVAT * VAT_PRESS;
    }
}
