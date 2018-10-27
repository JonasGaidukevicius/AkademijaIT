package lt.gaidukevicius;

import java.sql.Time;
import java.util.Arrays;
import java.util.Random;

public class Kitos_uzduotys08 {
    public static void main(String[] args) {
        Random rand = new Random();

        //1 dalis
        System.out.println("-------1 dalis-------------");
        int[] masyvas = new int[100];
        for (int i = 0; i < masyvas.length; i++) {
            masyvas[i] = rand.nextInt(101);
        }
        //atspausdinu pirmini masyva
        for (int j : masyvas) {
            System.out.print(j + " ");
        }
        System.out.println();

        //Rusiavimas
        for (int i = 0; i < masyvas.length; i++) {
            int mazesnis = masyvas[i]; //pradzioje prilyginu 0 masyvo elementa maziausiam
            int indeksas = i; //pradinis indeksas, nuo kurio pradedu imti elementus palyginimui
            for (int j = i; j < masyvas.length; j++) {
                int kitas = masyvas[j];
                if (kitas < mazesnis) {
                    mazesnis = kitas;
                    indeksas = j; //nustatau kurioje pozicijoje yra mazesnis skaicius
                }
            }
            masyvas[indeksas] = masyvas[i]; //toje pozicijoje, kurioje yra mazesnis skaicius irasau palyginta skaiciu
            masyvas[i] = mazesnis; //esamoje pozicijoje irasau rasta mazesni skaiciu
        }

        //atspausdinu surusiuota masyva
        for (int j : masyvas) {
            System.out.print(j + " ");
        }

        //2 dalis padaryta kitame projekte

        //3 dalis
        System.out.println();
        System.out.println("------3 dalis--------");
        int[] masyvasA = new int[20];
        int[] masyvasB = new int[15];

        int maxMasyvasA = 0;
        int maxMasyvasB = 0;

        for (int i = 0; i < masyvasA.length; i++) {
            masyvasA[i] = rand.nextInt(101);
        }
        for (int i = 0; i < masyvasB.length; i++) {
            masyvasB[i] = rand.nextInt(101);
        }

        for (int i = 0; i < masyvasA.length; i++) {
            if (masyvasA[i] > maxMasyvasA) {
                maxMasyvasA = masyvasA[i];
            }
        }
        for (int i = 0; i < masyvasB.length; i++) {
            if (masyvasB[i] > maxMasyvasB) {
                maxMasyvasB = masyvasB[i];
            }
        }
        System.out.print("Pirmas masyvas: ");
        for (int i : masyvasA) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.print("Antras masyvas: ");
        for (int i : masyvasB) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Pirmojo masyvo maksimali reiksme yra " + maxMasyvasA);
        System.out.println("Antrojo masyvo maksimali reiksme yra " + maxMasyvasB);
        System.out.println("Maksimaliu masyvu reiksmiu aritmetinis vidurkis yra " + ((maxMasyvasA + maxMasyvasB) / 2));


        //4 dalis
        System.out.println();
        System.out.println("------4 dalis--------");

        String[] miestuMasyvas = {"Vilnius", "Kaunas", "Klaipeda", "Siauliai", "Panevezys", "Utena", "Alytus", "Mazeikiai", "Jurbarkas", "Anyksciai"};
        System.out.println("Pirminis masyvas:");
        for (String i : miestuMasyvas) {
            System.out.print(i + " ");
        }
        System.out.println();

        Arrays.sort(miestuMasyvas);
        System.out.println("Masyvas po rusiavimo:");
        for (String i : miestuMasyvas) {
            System.out.print(i + " ");
        }
        System.out.println();

        //5 dalis
        System.out.println();
        System.out.println("------5 dalis--------");

        long[] longoMasyvas = new long[50000];
        for (int i = 0; i < longoMasyvas.length; i++) {
            longoMasyvas[i] = rand.nextLong();
            //System.out.println(i);
        }
        //System.out.println(longoMasyvas[47000]);
        //System.out.println(longoMasyvas[49990]);

        for (long i : longoMasyvas) {
            System.out.print(i + " ");
        }
        /*
        System.out.println();
        long startTime = System.currentTimeMillis();
        Arrays.sort(longoMasyvas);
        long endTime = System.currentTimeMillis();
        System.out.println("Rusiavimas atliktas per " + (endTime - startTime));
        */

        //pakvieciu rusiavimo metoda
        long startTime = System.currentTimeMillis();
        quickSort(longoMasyvas, 0, 49999);
        long endTime = System.currentTimeMillis();
        System.out.println("Rusiavimas per metoda atliktas per " + (endTime - startTime));

    }


    //Metodai 5 daliai
    //nuoroda yra - http://www.algolist.net/Algorithms/Sorting/Quicksort
    public static int partition(long arr[], int left, int right) {

        int i = left, j = right;
        long tmp;
        long pivot = arr[(left + right) / 2];
        while (i <= j) {
            while (arr[i] < pivot)
                i++;
            while (arr[j] > pivot)
                j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        }
        ;
        return i;
    }

    public static void quickSort(long arr[], int left, int right) {
        int index = partition(arr, left, right);
        if (left < index - 1)
            quickSort(arr, left, index - 1);
        if (index < right)
            quickSort(arr, index, right);
    }
}
