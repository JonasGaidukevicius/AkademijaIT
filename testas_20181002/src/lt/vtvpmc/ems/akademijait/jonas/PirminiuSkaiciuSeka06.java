package lt.vtvpmc.ems.akademijait.jonas;

import java.util.Scanner;

public class PirminiuSkaiciuSeka06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Kiek pirminiu skaiciu atspausdinti? ");
        int n = input.nextInt();
        //long skaicius = 1;

        int i = 1;
        long skaicius = 2;
        while( i <= n){
            if(arPirminis(skaicius)) {
                System.out.print(skaicius + " ");
                i++;
            }
            skaicius++;
        }


    }

    public static boolean arPirminis(long skaicius){
        int skaitliukas = 0;
        for (long x = skaicius; x > 0; x--){
            if(skaicius % x == 0){
                skaitliukas++;
            }
        }
        if(skaitliukas <= 2){
            return true;
        } else {
            return false;
        }
    }
}
