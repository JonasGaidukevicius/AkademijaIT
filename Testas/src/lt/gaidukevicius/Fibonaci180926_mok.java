package lt.gaidukevicius;

import java.util.Scanner;

public class Fibonaci180926_mok {


        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Kelinta Fibonacci skaiciu atspausdinti: ");
            int fib0 = input.nextInt();
            long startTime = System.currentTimeMillis();
            System.out.println(fibo(fib0));
            long endTime = System.currentTimeMillis();
            System.out.println(endTime - startTime);

            //fibonacci0(fib0);
            input.close();
        }

        public static int fibo(int n){
            if (n < 2){
                return n;
            }
            return fibo(n-1) + fibo (n-2);
        }

       /* private static void fibonacci0(int fib) {
            double a = 1.0;
            double b = 1.0;
            double c = 0;
            if (fib == 0) {
                System.out.println(fib + "-as Fibonacci skaicius yra 0");
            } else if (fib == 1 || fib == 2) {
                System.out.println(fib + "-as Fibonacci skaicius yra 1");
            } else {
                for (int i = 3; i <= fib; i++) {
                    c = a + b;
                    a = b;
                    b = c;
                }

            }
            System.out.println(fib + "-as Fibonacci skaicius yra " + c);
        }*/
}
