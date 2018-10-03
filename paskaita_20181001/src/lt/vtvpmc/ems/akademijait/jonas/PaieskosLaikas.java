package lt.vtvpmc.ems.akademijait.jonas;

import java.util.Arrays;

public class PaieskosLaikas {
    public static void main(String[] args) {
        int[] masyvas = generuojuMasyva(100000);
        System.out.println(Arrays.toString(masyvas));
        long startTime = System.currentTimeMillis();
        randuMaksimuma(masyvas);
        long endTime = System.currentTimeMillis();
        System.out.println("Paieskos laikas yra " + (endTime - startTime));

        startTime = System.currentTimeMillis();
        randuMaksimumaKitaip(masyvas);
        endTime = System.currentTimeMillis();
        System.out.println("Rusiuojant paieskos laikas yra " + (endTime - startTime));


        startTime = System.currentTimeMillis();
        randuMaksimumaVersija2(masyvas);
        endTime = System.currentTimeMillis();
        System.out.println("Rusiuojant paieskos laikas yra " + (endTime - startTime));
    }

    public static int[] generuojuMasyva (int ilgis){
        int[] masyvas = new int[ilgis];
        for (int i = 0; i < ilgis; i++){
            masyvas[i] = (int) (Math.random() * 100);
        }
        return masyvas;
    }

    public static void randuMaksimuma(int[] masyvas){
        int max = 0;
        int min = 100000;
        for(int skaicius : masyvas){
            if (max < skaicius){
                max = skaicius;
            }
            if(min > skaicius){
                min = skaicius;
            }
        }
    }

    public static void randuMaksimumaKitaip(int[] masyvas){
        int max = 0;
        int min = 100000;
        for(int i = 0; i < masyvas.length; i++){
            if (max < masyvas[i]){
                max = masyvas[i];
            }
            if(min > masyvas[i]){
                min = masyvas[i];
            }
        }
    }

    //cia isrusiuoju ir paimu paskutini elementa
    public static int randuMaksimumaVersija2(int[] masyvas){
        Arrays.sort(masyvas);
        return masyvas[masyvas.length-1];
        // System.out.println(Arrays.toString(masyvas));
    }



}
