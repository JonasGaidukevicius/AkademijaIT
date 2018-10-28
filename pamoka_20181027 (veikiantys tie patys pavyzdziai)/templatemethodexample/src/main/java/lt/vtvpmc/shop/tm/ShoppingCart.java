package lt.vtvpmc.shop.tm;

import lt.vtvpmc.shop.strategy.Product;
import lt.vtvpmc.shop.strategy.VatStrategy;

import java.util.ArrayList;
import java.util.List;

public abstract class ShoppingCart {
    
    private List<Product> productList = new ArrayList<>();

    public ShoppingCart() { }

    public void add(lt.vtvpmc.shop.strategy.Product product) {
        this.productList.add(product);
    }

    public final double getTotalPrice() {
        double total = 0.0;

        for (Product product: productList) {
            total += product.getPrice();
        }

        return applyTaxes(total);
    }
    
    protected abstract double applyTaxes(double total);
}

/*
TEMPLATE
Template naudojama, kai turiu abstrakcia klase su abstrakciu metodu, kurio panaudojimas numatytas kitame is normaliu
metodu ir pagal ja kuriu vaikines klases, kur igyvendinu abstraktu metoda savaip.
 */

//ABSTRAKTI KLASE
public abstract class ShoppingCart {
    private List<Product> productList = new ArrayList<>();
    public ShoppingCart() { }

    public void add(Product product) {
        this.productList.add(product);
    }

    public final double getTotalPrice() {
        double total = 0.0;
        for (Product product: productList) {
            total += product.getPrice();
        }
        return applyTaxes(total);
    }

    protected abstract double applyTaxes(double total);
}

//VAIKINE KLASE, kur igyvendintas abstraktus metodas
public class ShoppingCartWithLithuanianVat extends ShoppingCart {
    @Override
    protected double applyTaxes(double total) {
        return total * 1.21;
    }
}
//Teste darau taip:
@Test
public void shouldCalculateTotalWithLTTaxesApplied() {
    ShoppingCartWithLithuanianVat shoppingCartWithLithuanianVat = new ShoppingCartWithLithuanianVat();

    shoppingCartWithLithuanianVat.add(new Product(1.0));
    shoppingCartWithLithuanianVat.add(new Product(2.0));

    assertEquals(3.63, shoppingCartWithLithuanianVat.getTotalPrice());
}
