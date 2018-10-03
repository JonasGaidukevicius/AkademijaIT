package lt.vtvpmc.ems.akademijait.jonas;

public class Main {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(a++);
        System.out.println(++a);

        boolean bl = (a++ == ++a);
        System.out.println(bl);

        int b = 20;
        a = b++ + b++;
        System.out.println(a);

    }


}
