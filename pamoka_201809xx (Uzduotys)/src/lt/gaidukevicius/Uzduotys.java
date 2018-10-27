package lt.gaidukevicius;

public class Uzduotys {

    //4 uzduoties private kintamieji
    private int aa = 15;
    private static int bb = 25;

    public static void main(String[] args){

        //3 praktine uzduotis
        //1 dalis
        System.out.println("----1 dalis--------------------------");
        byte baitas = 0;
        int sveikas = 15;
        long ilgas = 250;
        double dablas = 15.3;
        String text = "Labas";
        boolean loginis = true;


        //2 dalis
        System.out.println("----2 dalis--------------------------");
        System.out.println("byte yra " + baitas);
        System.out.println("int yra " + sveikas);
        System.out.println("long yra " + ilgas);
        System.out.println("double yra " + dablas);
        System.out.println("String yra " + text);
        System.out.println("boolean yra " + loginis);

        System.out.println("byte maksimumas yra " + Byte.MAX_VALUE);
        System.out.println("byte minimumas yra " + Byte.MIN_VALUE);
        System.out.println("int maksimumas yra " + Integer.MAX_VALUE);
        System.out.println("int minimumas yra " + Integer.MIN_VALUE);
        System.out.println("long maksimumas yra " + Long.MAX_VALUE);
        System.out.println("long minimumas yra " + Long.MIN_VALUE);
        System.out.println("double maksimumas yra " + Double.MAX_VALUE);
        System.out.println("double minimumas yra " + Double.MIN_VALUE);



        //3 dalis
        System.out.println("----3 dalis--------------------------");
        byte rez1 = (byte)(baitas + 6);
        System.out.println("Baito rezultatas yra " + rez1);
        int rez2 = baitas + sveikas;
        System.out.println("int rezultatas yra " + rez2);
        long rez3 = rez2 + ilgas * 3;
        System.out.println("longas yra " + rez3);
        double rez4 = dablas * 15 + 106.15;
        System.out.println("double yra " + rez4);
        String rez5 = text + " ir viso gero";
        System.out.println("string yra " + rez5);
        System.out.println("5 daugiau 6 yra " + (5 > 6));


        //4 dalis
        System.out.println("----4 dalis--------------------------");
        Uzduotys objektoKintamasis = new Uzduotys();
        System.out.println(objektoKintamasis);
        System.out.println("Klases kintamasis bb yra " + bb);
        //vietiniai kintamieji jau panaudoti

        //5 dalis
        System.out.println("----5 dalis--------------------------");
        String tekstas = "Tekstas iki n\n ir tekstas po n";
        String tabuliacija = "Tekstas su \t tabuliacija";
        System.out.println("Tekstas yra " + tekstas);
        System.out.println("tabuliacija yra " + tabuliacija);
        System.out.println("------------------------------");

        //6 dalis
        System.out.println("----6 dalis--------------------------");
        int rezas1 = 1 + 5 * 3 + 6 / 2 - 16;
        System.out.println("1 + 5 * 3 + 6 / 2 - 16 rezultatas yra " + rezas1);

        int aax = 10;
        int aay = 0;
        aay += aax;
        System.out.println("aay yra " + aay + " o aax yra " + aax);
        aay = aax++;
        System.out.println("aay yra " + aay + " o aax yra " + aax);

        //7 dalis
        System.out.println("----7 dalis--------------------------");
        int pirmas = 15;
        String antras = "Labas";
        System.out.println("Viename reiskinyje int ir String yra " + (pirmas + antras));

        //8 dalis
        System.out.println("----8 dalis--------------------------");
        //jau daug ivairiu operatoriu ir panaudojau
    }
}
