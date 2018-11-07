package namu_darbai;

import java.util.*;

public class MyArrayList {
    public static void main(String[] args) {
        String[] myArray = {"Jonas", "Petras", "Tadas", "Ramunas", "Arunas", "Gediminas"};
        System.out.println("What format You would like to convert Your array to: ");
        System.out.println("ArrayList (1), LinkedList (2), HashSet (3), TreeSet (4), HashMap (5), TreeMap (6)");
        Scanner input = new Scanner(System.in);
        int choice = input.nextInt();
        switch(choice){
            case 1:
                List< String > arrayList = Arrays.asList(myArray);
                System.out.println(arrayList);
                break;
            case 2:
                List<String> linkedList = Arrays.asList(myArray);
                System.out.println(linkedList);
                break;
            case 3:
                Set<String> hashSet = new HashSet<>();
                Collections.addAll(hashSet, myArray);
                System.out.println(hashSet);
                break;
            case 4:
                Set<String> treeSet = new TreeSet<>();
                Collections.addAll(treeSet, myArray);
                System.out.println(treeSet);
                break;
            case 5:
                Map<Integer, String> hashMap = new HashMap<>();
                for(int i = 0; i < myArray.length; i++){
                    hashMap.put(i, myArray[i]);
                }
                System.out.println(hashMap);
                break;
            case 6:
                Map<Integer, String> treeMap = new TreeMap<>();
                for(int i = 0; i < myArray.length; i++){
                    treeMap.put(i, myArray[i]);
                }
                System.out.println(treeMap);
        }

    }

}
