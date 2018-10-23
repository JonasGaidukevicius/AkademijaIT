package lt.vtvpmc.ems.akademijait.jonas.dekoratorius;

public class GreeterExclamationMarkDecorator implements Greeter {

    private Greeter original;

    public GreeterExclamationMarkDecorator(Greeter greeter){
        this.original = greeter;
    }

    @Override
    public String greet(String firstName, String lastName) {
        String modLastName = lastName + "!";
        return original.greet(firstName, modLastName);
    }
}
