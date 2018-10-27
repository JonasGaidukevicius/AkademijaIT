package lt.vtvpmc.ems.akademijait.jonas;

public class Changer {

    public static void main(String[] args){
        changeTwoNumbersVersionTwo(10.0, 20.0);
        printBinaryDouble(-10.5);
    }
    // 2 kintamuju reiksmiu sukeitimas panaudojant papildomą kintamaji
    public static int changeTwoNumbers (int numberOne, int numberTwo){
        int tmp = numberOne;
        numberOne = numberTwo;
        numberTwo = tmp;
        return numberOne;
    }

    //2 kintamujku reiksmiu sukeitimas panaudojant sumos metoda
    public static double changeTwoNumbersVersionTwo (double numberOne, double numberTwo){

        numberOne = numberOne + numberTwo;
        numberTwo = numberOne - numberTwo;
        numberOne = numberOne - numberTwo;

        return numberOne;
    }

    //3 budas
    //2 kintamuju reiksmiu sukeitimas panaudojant XOR bitine operacija
    public static int changeTwoNumbersVersionThree (int numberOne, int numberTwo){
        numberOne = numberOne ^ numberTwo;
        numberTwo = numberOne ^ numberTwo;
        numberOne = numberOne ^ numberTwo;

        return numberOne;
    }


    public static void printBinaryDouble(double number){
        long bits = Double.doubleToLongBits(number);
        for(int i = 63; i >= 0; --i){
            System.out.print((bits & (1 << i)) == 0 ? "0" : "1");
        }
    }
}
