package lt.vtvpmc.ems.akademijait.jonas;

import java.util.LinkedList;
import java.util.Queue;

public class JavaQueue {

    public static void main(String[] args) {
        Personos personos1 = new Personos(1);
        Personos personos2 = new Personos(2);
        Personos personos3 = new Personos(3);
        Personos personos4 = new Personos(4);

        Queue<Personos> eilutePasGydytoja = new LinkedList<>();

        eilutePasGydytoja.add(personos2);
        eilutePasGydytoja.add(personos1);
        eilutePasGydytoja.add(personos4);
        eilutePasGydytoja.add(personos3);

        System.out.println(eilutePasGydytoja);

        System.out.println(eilutePasGydytoja.remove());
        System.out.println(eilutePasGydytoja);

        System.out.println(eilutePasGydytoja.peek());
        System.out.println(eilutePasGydytoja);

        System.out.println(eilutePasGydytoja.remove());
        System.out.println(eilutePasGydytoja);

    }
}
