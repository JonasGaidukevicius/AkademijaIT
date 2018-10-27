package lt.vtvpmc.ems.akademijait.jonas;

import java.util.Scanner;

public class FaktorialasPaprastas15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Kokio skaiciaus faktoriala paskaiciuoti? ");
        long skaicius = input.nextLong();
        System.out.println("Skaiciaus " + skaicius + " faktorialas yra " + skaiciuojuFaktoriala(skaicius));
    }

    public static long skaiciuojuFaktoriala(long skaicius) {
        long rezultatas = 1;
        if(skaicius == 0 || skaicius == 1){
            return rezultatas;
        } else {
            for(long x = 1; x <= skaicius; x++){
                rezultatas *= x;
            }
        }
        return rezultatas;
    }
}
