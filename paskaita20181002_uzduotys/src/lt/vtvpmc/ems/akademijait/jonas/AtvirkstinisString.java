package lt.vtvpmc.ems.akademijait.jonas;

public class AtvirkstinisString {
    public static void main(String[] args) {
        String tekstas = "Programavimas yra jega!";
        System.out.println(generuojuAtvirkstiniString(tekstas));

    }

    public static String generuojuAtvirkstiniString(String tekstas){
        char[] simboliai = tekstas.toCharArray();
        int pradzia = 0;
        int pabaiga = tekstas.length() - 1;
        char temp;
        while(pabaiga > pradzia){
            temp = simboliai[pradzia];
            simboliai[pradzia] = simboliai[pabaiga];
            simboliai[pabaiga] = temp;
            pradzia++;
            pabaiga--;
        }

        return new String(simboliai);
    }
}
