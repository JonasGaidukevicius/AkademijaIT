package lt.vtvpmc.ems.akademijait.jonas;

public class MinIrMaxPaieskaMasyve16 {
    public static void main(String[] args) {
        double[] x = {1.35, 2.45, 2.05, 1.20, 2.15, 1.70, 1.45, 1.95, 2.00, 1.65, 1.65, 2.05, 1.75, 1.25, 2.25, 1.40};
        //rasti min, max ir masyvo aritmetini vidurki
        System.out.println("Maziausias skaicius - " + minimaliMasyvoReiksme(x));
        System.out.println("Didziausias skaicius - " + maksimaliMasyvoReiksme(x));
        System.out.println("Aritmetinis vidurkis - " + apskaiciuojuMasyvoAritmetiniVidurki(x));
    }

    public static double minimaliMasyvoReiksme(double[] masyvas){
        double min = masyvas[0];
        for (double sk: masyvas) {
            if(min > sk){
                min = sk;
            }

        }
        return min;
    }

    public static double maksimaliMasyvoReiksme(double[] masyvas){
        double max = masyvas[0];
        for(double sk: masyvas){
            if(max < sk){
                max = sk;
            }
        }
        return max;
    }

    public static double apskaiciuojuMasyvoAritmetiniVidurki(double[] masyvas){
        double suma = 0;
        double vidurkis = 0;
        for(double sk: masyvas){
            suma += sk;
        }
        vidurkis = suma / masyvas.length;
        return vidurkis;
    }

}
