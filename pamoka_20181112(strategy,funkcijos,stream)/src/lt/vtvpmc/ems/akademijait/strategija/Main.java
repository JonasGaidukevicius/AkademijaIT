package lt.vtvpmc.ems.akademijait.strategija;

public class Main {

    public static void main(String[] args) {
        //Papuga papuga1 = new Papuga(new GerasPapugosElgesys("Labas"));

        //papuga1.papugaKalba();

        Parrot parrot1 = new Parrot(new GoodBehavior());
        System.out.println(parrot1.speak("Labas"));
        System.out.println(parrot1.speak("Viso"));
        System.out.println(parrot1.speak("Labuks"));

        Parrot parrot2 = new Parrot(new BadBehavior());
        System.out.println(parrot2.speak("Labas"));
        System.out.println(parrot2.speak("sausainis"));
        System.out.println(parrot2.speak("Labuks"));



    }




}
