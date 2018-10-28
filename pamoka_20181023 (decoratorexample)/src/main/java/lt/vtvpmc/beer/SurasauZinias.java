
package lt.vtvpmc.beer;

public class SurasauZinias {

/*
    DECORATOR
    Dekoratorius naudojamas tada, kai reikia modifikuoti paduodamu i metoda, igyvendinta is interfeiso, parametru
    reiksmes, bet pats originalusis metodas vis tiek yra ivykdomas
     */

    //INTERFEISAS
    public interface Brewery {
       int brewBeer(int waterInKg, int maltInKg, int hopsKg);
    }

    //KLASE, kuri implementuoja interfeisa ir igyvendina jo metoda
    public class BirzuBrewery implements Brewery {
        public int brewBeer(int waterInKg, int maltInKg, int hopsKg) {
            return Math.min(waterInKg, Math.min(maltInKg, hopsKg)) * 2;
        }
    }

    //DEKORATORIAUS KLASE, kuri modifikuoja paduodamu i metoda parametru reiksmes
    public class CubanBreweryDecorator implements Brewery {
        private Brewery original; //interfeiso tipo laukas
        //konstruktorius i kuri yra paduodamas originaliosios klases objektas (jis irgi yra interfeiso tipo, nes
        //yra implementaves interfeisa
        public CubanBreweryDecorator(Brewery brewery) {
            this.original = brewery;
        }
        //metodas is interfeiso. Cia jis igyvendintas taip, kad modifikuotu parametru reiksmes ir paskui iskviestu
        //originalu metoda
        @Override
        public int brewBeer(int waterInKg, int maltInKg, int hopsKg) {
            int maltTax = Math.max(1, maltInKg / 10);
            return original.brewBeer(waterInKg, maltInKg - maltTax, hopsKg);
        }
    }

    /*
    Teste sukuriu objekta pagal dekoratoroiaus klase ir tada paduodu jam kaip parametra jau esma klase, kuri yra
    implementavusi interfeisa ir igyvendinusi metoda is interfeiso
     */

    @Test
    public void shouldCorrectlyApplyCubanMaltTax() {
        Brewery cubanBirzuBrewery = new CubanBreweryDecorator(new BirzuBrewery());

        //bet turbut galima ir:
        CubanBreweryDecorator cubanBirzuBrewery1 = new CubanBreweryDecorator(new BirzuBrewery());
        int bottles = cubanBirzuBrewery.brewBeer(10, 10, 10);
        assertEquals(18, bottles);
    }
}
