package lt.vtvpmc.ems.akademijait.jonas;

import java.util.Scanner;

public class AsciiKodas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Iveskite simboli: ");
        String eilute = input.nextLine();
        char simbolis = eilute.charAt(0);
        int kodas = simbolis;
        System.out.println(kodas);
    }
}
