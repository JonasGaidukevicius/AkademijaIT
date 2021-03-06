import lt.vtvpmc.beer.BirzuBrewery;
import lt.vtvpmc.beer.BottleBoxTaxDecorator;
import lt.vtvpmc.beer.Brewery;
import lt.vtvpmc.beer.CubanBreweryDecorator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CubanBirzuBreweryTest {
    
    @Test
    public void shouldCorrectlyApplyCubanMaltTax() {
        Brewery cubanBirzuBrewery = new CubanBreweryDecorator(new BirzuBrewery());
        
        int bottles = cubanBirzuBrewery.brewBeer(10, 10, 10);
        
        assertEquals(18, bottles);

        //o kaip veiks, jeigu sukursiu objekta ne interfeiso tipo, o dekoratoriaus tipo?
        CubanBreweryDecorator kubietiska = new CubanBreweryDecorator(new BirzuBrewery());
        int bottles1 = cubanBirzuBrewery.brewBeer(10, 10, 10);
        assertEquals(18, bottles1);
    }
    
    @Test
    public void shouldBePOsibleToApplyMaltAndBottleTax() {
        Brewery cubanBirzuBreweryMinusBottle = new BottleBoxTaxDecorator(new CubanBreweryDecorator(new BirzuBrewery()));
        
        int bottles = cubanBirzuBreweryMinusBottle.brewBeer(
                10, 10, 10
        );
        
        assertEquals(17, bottles);
    }
    
}
