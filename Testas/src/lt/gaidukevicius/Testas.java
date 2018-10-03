package lt.gaidukevicius;

public class Testas {
   public static void main(String[] args){
       byte a = 100;
       printBinary(a, 8);
       byte b = 28;
       printBinary(b, 8);
       byte c = (byte)(a + b);
       System.out.println(c);
       printBinary(c, 8);
   }

    private static void printBinary(byte value, int size){
        for(int i = size - 1; i >= 0; i--){
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.print(result);

        }
        System.out.println();
    }
}
