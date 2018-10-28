package acart;

public class SurasauZinias {
   /*
    STRATEGY

    Naudojama tada, kai reikia visiems skaiciavimamas pritaikyti kazkokia bendra strategija
    pvz., pritaikyti nuolaida.

    Yra interfeisas, su metodu.
    Metodas turi savo parametrus ir grazinama tipa
    Tas interfeisas skirtas tam, kad visi ji panaudotu ir pritaikytu kazkokia manipuliacija.
    */
   //INTERFEISAS
   public interface DiscountStrategy {
       public double applyDiscount(double totalPrice);

    }

   /*
    Strategijos igyvendinimui kuriamos klases, kurios implementuoja interfeisa ir igyvendina interfeiso metoda.
    Tas igyvendinimas yra kiekvienoje klaseje savitas.

    Tai gi, sukuriu klase, kuri implementuoja interfeisa, bet manipuliaciju neatlieka

    */

   //KLASE, KURI MANIPULIACIJU NEATLIEKA
   public class NoDiscountStrategy implements DiscountStrategy{
       public double applyDiscount(double totalPrice){
           return totalPrice;
       }
   }

   //KLASE, KURI ATLIEKA MANIPULIACIJAS
   public class TestDiscountStrategy implements DiscountStrategy{
       public double applyDiscount(double totalPrice){
           return totalPrice * 0.5;
       }
   }

   /*
   Tada yra klase, kurioje vyklsta visas veiksmas.
   Si klase turi:
   1) interfeiso tipo lauka;
   2) konstruktoriu be parametru;
   3) konstruktoriu, kurio parametras (bent jau vienas is ju) yra interfeiso tipo
    */

   //KLASE, KURIOJE VYKSTA VEIKSMAS
   public class ShoppingCart{
       private DiscountStrategy taikomaDiscountStrategy; //sis objektas turi buti sukurtas per tokia klase, kurios nuolaidos formule noriu pritaikyti
       private Item[] items = new Item[10];
       //... kiti laukai

       //konstruktorius be parametru
       public ShoppingCart(){
           this.taikomaDiscountStrategy = new NoDiscountStrategy();
       }

       //konstruktorius su parametru
       public ShoppingCart(DiscountStrategy taikomaDiscountStrategy){
           this.taikomaDiscountStrategy = taikomaDiscountStrategy;
       }

       //metodas, kuriame yra taikoma strategija
       public double getTotalPriceWithDiscount(){
           double totalPrice = 0;
           for (int i = 0; i < 10; i++) {
               totalPrice += items[i].getTotalPrice();
           }

           return taikomaDiscountStrategy.applyDiscount(totalPrice);
           //va cia as pritaikau manipuliacija, kai man reikia pritaikyti nuolaida gautai pirkiniu krepselio sumai
       }
       /*
       Teste kuriu pagrindines klases tipo objekta ir kaip parametra konstruktoriui paduodu mano norimo pritaikyti nuolaidos klases objekta.
        */
   }

}
