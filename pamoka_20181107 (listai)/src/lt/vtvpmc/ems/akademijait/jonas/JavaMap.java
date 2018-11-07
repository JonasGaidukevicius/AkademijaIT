package lt.vtvpmc.ems.akademijait.jonas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class JavaMap {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        Map<Integer, String> treeMap = new TreeMap<>();

        testMap(hashMap);
        testMap(linkedHashMap);
        testMap(treeMap);
    }


    public static void testMap(Map<Integer, String> map){
        map.put(39, "Tomas");
        map.put(0, "Dovilė");
        map.put(17, "Karolis");
        map.put(245, "Dovydas");
        map.put(39, "Tomas");
        map.put(41, "Marija");
        map.put(7, "Petras");

        System.out.println(map);


    }
}
