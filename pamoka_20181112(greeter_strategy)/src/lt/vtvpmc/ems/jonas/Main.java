package lt.vtvpmc.ems.jonas;

public class Main {

    public static void main(String[] args) {
        Greeter greeter = (name) -> "Labas, " + name;
        //Greeter greeter1 = (name) -> System.out.println(name); // cia reikia, kad void metodas interfeiso butu
        String greeting = greeter.greetingFor("Jonas");
        System.out.println(greeting);
    }
}