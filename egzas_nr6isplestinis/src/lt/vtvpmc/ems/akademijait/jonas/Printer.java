package lt.vtvpmc.ems.akademijait.jonas;

public class Printer {

    public void print(A a, B b){
        System.out.println("AB");
    }

    public void print(C c, A a){
        System.out.println("BC");
    }

    public void print(A a, C c){
        System.out.println("AC");
    }
}
