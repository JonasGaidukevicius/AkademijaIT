package lt.vtvpmc.ems.akademijait.jonas;

import java.util.ArrayList;
import java.util.Iterator;



public class Listai {
    public static void main(String [] args) {
        int x1 = 5_2;
        System.out.println(x1);
        double amount = 0xE;
        System.out.println(amount);

        byte x = 5;
        byte y = 10;
        double z = x + y;
        short rr = 10;
        short tt = 20;
        //short ll = rr + tt;

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Java");
        arrayList.add("C#");
        arrayList.add("HTML5");

        System.out.println("Ar sarase yra \"Java\" - " + arrayList.contains("Java"));
        System.out.println(arrayList);
        System.out.println("1-asis listo narys yra " + arrayList.get(1));
        System.out.println("\"Java\" iraso indeksas sarase yra " + arrayList.indexOf("Java"));
        System.out.println("Listo dydis yra " + arrayList.size());
        arrayList.remove("C#");
        System.out.println(arrayList);

        String[] masyvas = new String[arrayList.size()];
        masyvas = arrayList.toArray(masyvas);
        System.out.println("Ar saras yra tuscias? - " + arrayList.isEmpty());

        Iterator<String> itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }



    }
}
