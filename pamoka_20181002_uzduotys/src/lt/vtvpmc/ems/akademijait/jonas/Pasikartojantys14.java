package lt.vtvpmc.ems.akademijait.jonas;

public class Pasikartojantys14 {
    public static void main(String[] args) {
        String eilute = "Ar cia yra vienodu raidziu";
        System.out.println(kiekVienoduRaidziu(eilute, 'a'));

    }

    public static int kiekVienoduRaidziu(String eilute, char raide) {
        int skaitliukas = 0;
        for(int i = 0; i < eilute.length(); i++){
            if(raide == eilute.charAt(i)){
                skaitliukas++;
            }
        }
        return skaitliukas;
    }


}
