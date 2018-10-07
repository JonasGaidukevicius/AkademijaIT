package lt.vtvpmc.ems.akademijait.jonas;

public class SkaitmenuSuma18 {
    public static void main(String[] args) {
        int duotasSkaicius = 528;
        System.out.println(randuSkaitmenuSuma(duotasSkaicius));

    }

    public static int randuSkaitmenuSuma(int duotasSkaicius) {
        int suma = 0;
        suma = duotasSkaicius / 100 + duotasSkaicius / 10 % 10 + duotasSkaicius % 10;
        return suma;
    }


}
