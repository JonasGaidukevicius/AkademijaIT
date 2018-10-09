package lt.vtvpmc.ems.akademijait.jonas;

public class Goods {

    protected String goodsName;
    protected double priceWOVAT;
    private static final double VAT_NORMAL = 1.21;

    //konstruktorius
    public Goods(String goodsName, double priceWOVAT){
        this.goodsName = goodsName;
        this.priceWOVAT = priceWOVAT;
    }

    //kiti metodai
    public void setName(String preke) {
        this.goodsName = preke;
    }


    public String getName() {
        return this.goodsName;
    }


    public void SetPriceWOVAT(double price) {
        this.priceWOVAT = price;
    }

    public double GetPriceWOVAT() {
        return this.priceWOVAT;
    }

    public double addVATToPriceWOVAT() {
        return this.priceWOVAT * VAT_NORMAL;
    }
}
