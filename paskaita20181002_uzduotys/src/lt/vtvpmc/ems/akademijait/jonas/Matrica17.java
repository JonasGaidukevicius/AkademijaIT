package lt.vtvpmc.ems.akademijait.jonas;

public class Matrica17 {
    public static void main(String[] args) {
        int[][] masyvas = new int [10][10];
        generuojuMasyva(masyvas);
        System.out.println(apskaiciuojuPirmuDviejuStulpeliuSuma(masyvas));

    }


    public static int[][] generuojuMasyva(int[][] masyvas){
        for(int i = 0; i < masyvas.length; i++){
            for(int j = 0; j < masyvas[0].length; j++){
                if(j == 0){
                    masyvas[i][j] = i;
                } else if(j == 1){
                    masyvas[i][j] = masyvas[i][j-1] * masyvas[i][j-1];
                } else {
                    masyvas[i][j] = 0;
                }
            }
        }
        return masyvas;
    }

    public static int apskaiciuojuPirmuDviejuStulpeliuSuma(int[][] masyvas) {
        int suma = 0;
        for (int i = 0; i < masyvas.length; i++){
            for(int j = 0; j < masyvas[0].length; j++){
                System.out.printf("%2s ", masyvas[i][j]);
                if(j == 0 || j == 1){
                    suma += masyvas[i][j];
                }

            }
            System.out.println();
        }
        return suma;
    }
}
