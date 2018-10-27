package lt.gaidukevicius;

public class Paieska180926 {

    public static void main(String[] args){
        int[] masyvas = {10, 9, 15, 46, 99, 2, 26, 36, 47, 100};
        int rasti = 9;
        int indeksas = -1;
        for(int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] == rasti) {
                indeksas = i;
                break;
            }
        }
        if(indeksas >=0){
                System.out.println("Skaiciaus 9 indeksas yra " + indeksas);
            } else {
                System.out.println("Skaičiaus 9 masyve nėra");
            }
    }
}
