package lt.vtvpmc.ems.akademijait.jonas;

public class TeigiamasArNeigiamas {
    public static void main(String[] args) {
        int a = -5;
        int b = 5;
        if (arYraTeigiamas(b)) {
            System.out.println("Skaicius yra teigiamas");
        } else {
            System.out.println("Skaicius yra neigiamas");
        }
    }

    public static boolean arYraTeigiamas(int a) {
        if(a < 0){
            return false;
        } else {
            return true;
        }
    }
}
