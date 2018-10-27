package lt.gaidukevicius;

import java.math.BigInteger;
import java.util.Scanner;

public class Fibonaci180926_mok_greitis {


    public static void main(String[] args) {
            /*
            Scanner input = new Scanner(System.in);
            System.out.println("Kelinta Fibonacci skaiciu atspausdinti: ");
            int fib0 = input.nextInt();
            */
        int n = 120;
        BigInteger m = new BigInteger("120");
        BigInteger a = new BigInteger("0");
        BigInteger b = new BigInteger("1");
        BigInteger c = new BigInteger("0");
        System.out.println(fibo(m));
        long startTime = System.currentTimeMillis();
        //System.out.println(fibo(n));

        for (int i = 2; i <= n; i++) {
            c = a.add(b);
            a = b;
            b = c;
        }
        System.out.println(c);


        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);


    }

    public static BigInteger fibo(BigInteger n){
        return fibo(n.subtract(BigInteger.valueOf(1l))).add(fibo (n.subtract(BigInteger.valueOf(2l))));
        }
    // Cia kazkas negerai
    }



