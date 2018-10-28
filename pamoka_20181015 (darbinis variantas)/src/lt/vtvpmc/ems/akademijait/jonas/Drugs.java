package lt.vtvpmc.ems.akademijait.jonas;

public class Drugs extends Goods {
    private static final double VAT_DRUGS = 1.05;

    public Drugs(String goodsName, double priceWOVAT){
        super(goodsName, priceWOVAT);
    }


    public double addVATToPriceWOVAT() {
        return this.priceWOVAT * VAT_DRUGS;
    }


}
