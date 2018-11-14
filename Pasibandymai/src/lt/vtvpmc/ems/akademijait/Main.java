package lt.vtvpmc.ems.akademijait;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String [] args) {
        B b = new B();

        A a11 = new B();
        a11.p

        boolean b1 = ((3 == 3) && false || (5 == 7) && (1+2 == 3));

        char aaa = 'a';
        int bbb = aaa % 2;
        System.out.println("bbb yra " + bbb);


        System.out.println(b);

        int i =010;
        int j = 07;

        System.out.println(i+j);


        int[] masyvas = {5,9};
      byte x = 47;
      char y = (char) x;

      Integer[] arr = {6,4,5,2};
      Set<Integer> set = new TreeSet<Integer>(Arrays.asList(arr));
      set.add(8);
      for(Integer value : set){
          System.out.print(value + ",");
      }


    }

}
