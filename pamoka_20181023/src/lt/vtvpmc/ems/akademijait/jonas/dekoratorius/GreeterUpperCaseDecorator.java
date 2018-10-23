package lt.vtvpmc.ems.akademijait.jonas.dekoratorius;

public class GreeterUpperCaseDecorator implements Greeter{

    private Greeter original;

    public GreeterUpperCaseDecorator(Greeter greeter){
        this.original = greeter;
    }

    @Override
    public String greet(String firstName, String lastName) {
        String modFirstName = firstName.toUpperCase();
        String modLastName = lastName.toUpperCase();
        return original.greet(modFirstName, modLastName);
    }
}
