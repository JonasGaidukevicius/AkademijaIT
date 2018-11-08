package lt.vtvpmc.ems.akademijait.jonas;

import java.util.Arrays;

public class JavaEnums {
    public static void main(String[] args) {

        Planets planet;
        planet = Planets.Earth;
        System.out.println(planet.getClass().getSuperclass());

        if(planet == Planets.Earth){
            System.out.println("Vedęs ir turi vaikų");
        }

        switch (planet){
            case Mercury:
                System.out.println("Merkurijus");
                break;
            case Earth:
                System.out.println("Žemė");
                break;
            case Mars:
                System.out.println("Marsas");
                break;
            case Venus:
                System.out.println("Venera");
                break;
            default:
                System.out.println("Pataisyk kodą");
        }

        Planets solarSystem [] = Planets.values();
        System.out.println(Arrays.toString(solarSystem));

        String www = Planets.Earth.toString();
        System.out.println(www);

        planet = Planets.valueOf("Mars");
        System.out.println("Vedęs ir turi vaikų išsikraustė į " + planet);


        Planets pl1, pl2, pl3, pl4;

        for (Planets pl: Planets.values()) {
            System.out.println(pl + " " + pl.getPlanetNumber());
        }

        pl1 = Planets.Earth;
        pl2 = Planets.Mars;
        pl3 = Planets.Earth;
        pl4 = Planets.Venus;

        System.out.println("Comparing " + pl4.compareTo(pl1));


    }
}
