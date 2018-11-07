package lt.vtvpmc.ems.akademijait.jonas;

import java.util.*;

public class JavaSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();


        hashSet.add("Tomas");
        hashSet.add("Daina");
        hashSet.add("Vytas");
        hashSet.add("Eglė");
        hashSet.add("Timi");

        System.out.println(hashSet);

        linkedSet.add("Tomas");
        linkedSet.add("Daina");
        linkedSet.add("Vytas");
        linkedSet.add("Eglė");
        linkedSet.add("Timi");

        System.out.println(linkedSet);

        treeSet.add("Tomas1");
        treeSet.add("Daina1");
        treeSet.add("Vytas1");
        treeSet.add("Eglė1");
        treeSet.add("Timi1");

        System.out.println(treeSet);

        System.out.println(treeSet.contains("Tomas1"));

        int[] intArray = {1,2,3,4,0,5,6,7,8,9,0};

        //List< Integer > list = Arrays.asList((Integer) intArray);
       // Set<Integer> integerSet = new TreeSet<Integer>(list);




    }





}
