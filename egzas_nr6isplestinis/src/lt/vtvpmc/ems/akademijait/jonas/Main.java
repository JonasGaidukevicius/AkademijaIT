package lt.vtvpmc.ems.akademijait.jonas;

import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Printer p = new Printer();
        //p.(new B, new C);

        Stream.of(1,2,3,4,5)
                .filter(e-> e%3 ==1)
                .forEach(System.out::println);


        Stream.of(10,20,30)
                .map(e-> e*e)
                .forEach(System.out::println);
    }


    public static void OPEN_WINDOW(){

    }

}
