package lt.vtvpmc.ems.akademijait.jonas;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class JavaHashEqualsSetMap {
    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        Set<Integer> set = new HashSet<>();

        map.put(1, "Tomas");
        map.put(1, "Kitas Tomas");

        set.add(15);
        set.add(15);

        System.out.println(map);
        System.out.println(set);

        System.out.println(map.hashCode());
        System.out.println(set.hashCode());

        String name = "Karvė";
        System.out.println(name.hashCode());
        String name1 = "Kitas";
        System.out.println(name1.hashCode());


    }
}
