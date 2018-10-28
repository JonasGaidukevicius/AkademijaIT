package lt.vtvpmc.iterator;

public class SurasauZinias {

    /*
    ITERATOR
    Naudojamas tada, kai reikia pereiti per koki nors masyva, lista ar panasiai - tai, kas turi daug elementu.
     */

    //INTERFEISAS
    public interface IntIterator {
        boolean hasNext(); //ziuri ar pozicija nera daugiau uz masyvo ilgi
        int next(); //grazina elemento, kur dabar yra pozicija, reiksme
    }

    //ITERATORIAUS KLASE, kuri implementuoja interfeisa ir igyvendina metodus
    public class IntArrayIterator implements IntIterator {

        private int[] ints;     //masyvas int tipo
        private int position;   //pozicija, kuris elementas dabar isrinktas

        //konstruktorius, kurio parametras yra masyvas int tipo
        public IntArrayIterator(int[] ints) {
            this.ints = ints;
        }
        //igyvendinamas metodas, kuris patikrina ar esama pozicija nera didesne uz masyvo ilgi
        public boolean hasNext() {
            return ints.length > position;
        }
        //igyvendinamas metodas, kuris grazina reiksme elemento, kur dabar yra pozicija
        public int next() {
            int result = ints[position];
            position++;
            return result;
        }
    }

    //Cia yra testas, kuris sudeda visu masyvo elemntu reiksmes
    @Test
    public void shouldIterateAllArrayElements() {
        IntIterator intArrayIterator = new IntArrayIterator(new int[] { 1, 2, 3 });
        int sum = 0;
        while (intArrayIterator.hasNext()) {
            sum += intArrayIterator.next();
        }
        assertEquals(6, sum);
    }
    //--------------------------------------------------------
    //O dar galima sukurti klase, kuri turi metoda, kurio parametras yra Iteratoriaus klase
    public class FiveFinder {
        public boolean hasFive(IntIterator intIterator) {
            while (intIterator.hasNext()) {
                int number = intIterator.next();
                if (number == 5) {
                    return true;
                }
            }
            return false;
        }
    }
    //sitas metodas paima atsiusta masyva ir paziuri ar kuri nors reiksme yra lygi 5. Ir jeigu taip, grazina true.
    //kitu atveju grazina false
    //Teste taip si klase panaufojama:
    @Test
    public void shouldFindFiveWhenOneExists() {
        IntArrayIterator intArrayIterator = new IntArrayIterator(new int[] { 2, 4, 5, 6, 7 });
        FiveFinder fiveFinder = new FiveFinder();
        assertTrue(fiveFinder.hasFive(intArrayIterator)); //va cia paciame assert sakinyje iskvieciu FiveFinder klases
        // objekto metoda, kuris iesko 5 masyve.
    }
}
