package lt.vtvpmc.ems.jonas;

public class Main2 {

    public static void main(String[] args) {
        Greeter greeter = (name) -> "Labas, " + name;



        //Greeter greeter1 = (name) -> System.out.println(name); // cia reikia, kad void metodas interfeiso butu
        String greeting = greeter.greetingFor("Jonas");
        System.out.println(greeting);
    }

    public String greetingEveryone(Greeter greeter){
        System.out.println(greeter.greetingFor("Jonas"));
        return "Jonas";
    }
}
