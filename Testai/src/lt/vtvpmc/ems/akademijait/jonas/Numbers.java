package lt.vtvpmc.ems.akademijait.jonas;

public class Numbers {

    public static double power(int number, int power) {
        int result = 1;
        for(int i = 1; i <= power; i++){
            result *= number;
        }
        return result;




    }
}
