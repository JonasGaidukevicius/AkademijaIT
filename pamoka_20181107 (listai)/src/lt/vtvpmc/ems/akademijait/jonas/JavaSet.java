package lt.vtvpmc.ems.akademijait.jonas;

import java.util.*;

public class JavaSet {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        Set<String> linkedSet = new LinkedHashSet<>();
        Set<String> treeSet = new TreeSet<>();


        String ll = "Labas";
        System.out.println(ll.codePointAt(1));
        System.out.println(ll.charAt(1));

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

    }
}
