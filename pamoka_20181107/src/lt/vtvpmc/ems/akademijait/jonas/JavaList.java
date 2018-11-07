package lt.vtvpmc.ems.akademijait.jonas;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class JavaList {


    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        //arrayList.add(10);
        //System.out.println(arrayList.get(1));

        //Linked list
        List<Integer> linkedList = new LinkedList<>();

        //elementAddTime(arrayList);
        //elementAddTime(linkedList);

        //elementAddByIndexTime(arrayList);
        //elementAddByIndexTime(linkedList);

        //elementGetTime(arrayList);
        //elementGetTime(linkedList);

        elementDeleteTime(arrayList);
        elementDeleteTime(linkedList);
    }

    public static void elementAddTime(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            list.add(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Praėjo laiko (ms) - " + (end - start));
    }

    public static void elementAddByIndexTime(List<Integer> list){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            list.add(0, i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Praėjo laiko (ms) - " + (end - start));
    }

    public static void elementGetTime(List<Integer> list){

        for (int i = 0; i < 1000000; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++){
            list.get(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Praėjo laiko (ms) - " + (end - start));
    }

    public static void elementDeleteTime(List<Integer> list){

        for (int i = 0; i < 100000; i++){
            list.add(i);
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++){
            list.remove(i);
        }
        long end = System.currentTimeMillis();
        System.out.println("Praėjo laiko (ms) - " + (end - start));
    }
}
