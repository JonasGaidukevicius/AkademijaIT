package lt.gaidukevicius;

public class Testas3 {
    public static void main(String[] args){
        int a = 1;
        printBinary(a, 32);
        int b = 2;
        printBinary(b, 32);
        int c = a << b;
        System.out.println(c);
        printBinary(c, 32);
    }

    private static void printBinary(int value, int size){
        for(int i = size - 1; i >= 0; i--){
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.print(result);

        }
        System.out.println();
    }
}
