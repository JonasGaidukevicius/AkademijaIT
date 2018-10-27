package lt.gaidukevicius;

public class Kitos_uzduotys {

    public static void main(String[] args){
        //4 uzduotis

        boolean a = true;
        boolean b = true;
        boolean c = true;
        System.out.println(booleanExpression(a, b, c));

        int aa = 100;
        int bb = 50;
        int cc = 10;
        System.out.println(longExpression(aa, bb, cc));
        //System.out.println(aa );
        long dd = ((100_000_000_000L % aa) >> bb) | (100 / cc);

        System.out.println("---Cia flib bit funkcija---");
        System.out.println(flipBit(10, 4));


    }

    //1 dalis

    public static boolean booleanExpression(boolean a, boolean b, boolean c){
        return (c & secretFunction()) | (a^b);
    }

    /*
    Sitas metodas priima 3 loginius kintamuosius ir turi 2 dalis.
    Pirmoje dalyje patikrinama ar kintamojo c reiksme ir secretFunction gr1=inamas rezultatas yra true.
    Antroje dalyje paziuri ar kazkuris is a ir b kintamuju yra true.
    Jeigu kurioje nors is pusiu yra true, grazina true, jeigu ne, tai tada grazina false.
     */

    //2 dalis
    public static long longExpression(int a, int b, int c){
        return ((100_000_000_000L % a) >> b) | (100 / c);

        /*
        Sitas metodas gauna 3 int kintamuosius.
        Apskaiciuoja liekana nuo 100 milijardu padalinus ji is a.
        Tada atlieka liekanos bit SHIFTRIGHT operacija per b poziciju.
        Tada 100 padalina is kintamojo c. paima tik sveika dali.
        O tada su transformuota liekana atlieka bit OR operacija. 0 ir 0 =0, 1 ir 0 = 1, 1 ir 1 =1.
        Gauta reiksme grazina
         */
    }

    //3 dalis
    public boolean doubleExpression(double a, double b, double c){
        return (Math.abs(c - (a + b)) <= 1E-4);
    }

    /*
    Sitas metodas gauna 3 double reiksmes.
    is trcio skaiciaus atima pirmu dvieju suma ir pavercia teigiama reiksme.
    Ir tada palygina ar gautas skaicius yra maziau arba lygu 1 x 10 ^ -4 (vienas kart 10 pakeltas laipsniu -4)
    jeigu mazesnis arba lygu, tada grazina true, kitaip grazina false.
     */

    //4 dalis
    public static int flipBit(int value, int bitIndex){
        int x = bitIndex - 1;
        int y = 1 << x;
        return value ^ y;
    }

    /*
    Sitas metodas gauna skaiciu ir bito indeksa.
    Tada perstumia skaiciaus 1 bitus per (indeksas - 1) ir rezultata iraso i y.
    tada paima gauta skaicius ir daro bitu XOR operacija su skaiciumi y.
    jeigu 0 ir 0, tada 0, jeigu 0 ir 1, tada 1 ir jeigu 1 ir 1, tada 0.
    Ir gazina gauta skaiciu
     */

    public static boolean secretFunction(){
        return true;
    }

}
