package lt.vtvpmc.ems.akademijait.rekursija;

public class SimpleRecursion {

    public static void main(String[] args) {
        System.out.println("Recursion start");
        recursionEcho(1);
    }

    public static void recursionEcho(int number) {
        System.out.println("First recursion echo" + number);
        simpleRecursionCounter(number);
        System.out.println("Second recursion echo " + number);
    }

    public static void simpleRecursionCounter(int number) {
        number ++;
        System.out.println("First recursion section " + number);
        if (number !=10) {
            simpleRecursionCounter(number);
        }
        System.out.println("Second recursion section" + number);
    }
}
