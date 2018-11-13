package lt.vtvpmc.ems.akademijait.kolekcijos;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Elephant> elephants = new HashSet<>();

        elephants.add(new Elephant("Jonas", 900.00));
        elephants.add(new Elephant("Onutė", 700.00));

        System.out.println(elephants.contains(new Elephant("Jonas", 800.00)));

        System.out.println("----------TREE SET------");
        Set<Elephant> elephants1 = new TreeSet<>(
                (elephantleft, elephantright) -> elephantleft.getName().compareTo(elephantright.getName()));
        //Čia yra įdėtas Comparatarius, kad zinotu kaip lyginti objektus
        elephants1.add(new Elephant("Jonas", 900.00));
        elephants1.add(new Elephant("Onutė", 700.00));





        System.out.println(elephants1.contains(new Elephant("Jonas", 800.00)));

        System.out.println("------ antras tree set-------");
        Set<Elephant> elephants2 = new TreeSet<>();
        elephants1.add(new Elephant("Jonas", 900.00));
        elephants1.add(new Elephant("Onutė", 700.00));

        System.out.println(elephants2.contains(new Elephant("Jonas", 800.00)));


        System.out.println("------------- MAP-----------------");

        Map<String, Elephant> elephantMap = new HashMap<>();
        elephantMap.put("Jonas", new Elephant("Jonas", 900.0));
        elephantMap.put("Onutė", new Elephant("Onutė", 800.0));

        System.out.println(elephantMap.get("Onutė"));

    }
}
