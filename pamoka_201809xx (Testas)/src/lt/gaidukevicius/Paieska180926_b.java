package lt.gaidukevicius;

public class Paieska180926_b {

    public static void main(String[] args){
        int[] masyvas = {10, 9, 15, 46, 99, 2, 9, 36, 9, 100};
        int rasti = 9;
        int indeksas = -1;
        for(int i = 0; i < masyvas.length; i++) {
            if (masyvas[i] == rasti) {
                indeksas = i;
                System.out.println("Skaiciaus 9 indeksas yra " + indeksas);
            }
        }
        if(indeksas ==-1){
                System.out.println("Skaičiaus 9 masyve nėra");
            }
    }
}
