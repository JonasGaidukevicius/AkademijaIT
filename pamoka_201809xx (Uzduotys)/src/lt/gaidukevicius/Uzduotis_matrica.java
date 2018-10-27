package lt.gaidukevicius;

import java.util.Arrays;

public class Uzduotis_matrica {
    public static void main(String[] args) {

        //int[][] matrica = new int[10][10];
        int[][] matrica = uzpildauMatrica(new int[10][10]);
        //System.out.println(Arrays.deepToString(matrica));
        atspausdinuMatrica(matrica);
        int[][] modifikuotaMatrica = modifikuojuMatrica(matrica);
        atspausdinuMatrica(modifikuotaMatrica);
        int suma = apskaiciuojuMatricosIstrizainesSuma(matrica);
        System.out.println("Matricos istrizaines suma yra " + suma);
    }




    public static int[][] uzpildauMatrica(int[][] matrica){

        for(int i = 0; i < matrica.length; i++){
            for(int j = 0; j < matrica[0].length; j++){
                matrica[i][j] = (int) (Math.random() * 0);
            }
        }
        return matrica;
    }

    public static void atspausdinuMatrica(int[][] matrica){
        for(int i = 0; i < matrica.length; i++){
            for(int j = 0; j < matrica[0].length; j++){
                System.out.print(matrica[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[][] modifikuojuMatrica(int[][] matrica) {
        for (int i = 0; i < matrica.length; i++) {
            matrica[i][i] = 1;
        }
        System.out.println("--------------------");
        return matrica;
    }

    public static int apskaiciuojuMatricosIstrizainesSuma(int[][] matrica) {
        int suma = 0;
        for (int i = 0; i < matrica.length; i++) {
            suma += matrica[i][i];
        }
        return suma;
    }
}
