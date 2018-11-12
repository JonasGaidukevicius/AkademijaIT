package lt.vtvpmc.ems.akademijait.strategija;

public class Parrot {

    private Behavior behavior;

    public Parrot(Behavior behavior){
        this.behavior = behavior;
    }

    public String speak(String message){
        return "Poli " + behavior.answer(message);
    }
}
