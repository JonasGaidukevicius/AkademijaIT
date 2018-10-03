package lt.gaidukevicius;

import java.util.Arrays;
import java.util.Random;

public class Kitos_uzduotys05 {

    //5 uzduotis

    public static void main(String[] args){
        // 1 dalis
        System.out.println("--- 1 dalis ---");
        String tekstas1 = "Labas";
        String tekstas2 = "Viso gero";
        String tekstas3 = "Super";

        // 2 dalis
        System.out.println("--- 2 dalis ---");
        System.out.println(tekstas1);
        System.out.println(tekstas2);
        System.out.println(tekstas3);

        //3 dalis
        System.out.println("--- 3 dalis ---");
        System.out.println(tekstas1 + " " + tekstas2);
        String naujas = tekstas2 + " " + tekstas3;
        System.out.println(naujas);

        //4 dalis
        System.out.println("--- 4 dalis ---");
        String spec1 = "Tekstas su tabuliacija -> \tgalas.";
        System.out.println(spec1);
        String spec2 = "Tekstas su enter -> \rgalas.";
        System.out.println(spec2); //iki enter atspausdintas tekstas buna uzdengtas tolimesnuio teksto
        String spec3 = "Tekstas su nauja linija -> \ngalas.";
        System.out.println(spec3);
        String spec4 = "Tekstas su dviguba kabute -> \"galas.";
        System.out.println(spec4);
        String spec5 = "Tekstas su vienguba kabute -> \'galas.";
        System.out.println(spec5);
        String spec6 = "Tekstas su sliashu -> \\galas.";
        System.out.println(spec6);

        //5 dalis
        System.out.println("--- 5 dalis ---");
        int[] masyvas = new int[10];
        int[] masyvas1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};

        //6 dalis
        System.out.println("--- 6 dalis ---");
        for(int i: masyvas1){
            System.out.print(i + " ");
        }
        System.out.println();

        //7 dalis
        System.out.println("--- 7 dalis ---");
        char[][] tekstas = {{'A','n',' ','a','r','r','a','y',' ','i','s',' ', 'a', ' ', 'c'},
                            {'o','n','t','a','i','n','e','r', ' ', 'o','b','j','e','c','t'}};

        //8 dalis
        System.out.println("--- 8 dalis ---");
        for(char[] x: tekstas){
            for(char y : x){
                System.out.print(y);
            }
        }
        System.out.println();
        System.out.println("------------------");

        //9 dalis
        System.out.println("--- 9 dalis ---");

        Random rand = new Random();
        int[] atsitiktinis = new int[10];
        for(int i = 0; i < atsitiktinis.length; i++){
            atsitiktinis[i] = rand.nextInt(101);
        }

        for(int j: atsitiktinis){
            System.out.print(j + " ");
        }
        System.out.println();

        //10 dalis
        System.out.println("--- 10 dalis ---");

        int[][] pirmas = {{1, 1, 1, 1, 1},{2, 2, 2, 2, 2}};
        int[][] antras = {{4, 4, 4, 4, 4},{3, 3, 3, 3, 3}};
        int[][] trecias = new int[2][5];


        for(int i = 0; i < pirmas.length; i++){
            for(int j = 0; j < pirmas[i].length; j++){
                trecias[i][j] = pirmas[i][j] + antras[i][j];
            }
        }
        System.out.println(Arrays.deepToString(trecias));
    }
}
