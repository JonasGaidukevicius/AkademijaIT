package lt.vtvpmc.ems.akademijait.jonas.dekoratorius;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterImplTest {

    @Test
    public void shouldGreetAPerson(){
        GreeterImpl greeting = new GreeterImpl();


        String greetingText = greeting.greet("Petras", "Petraitis");

        assertEquals(greetingText, greeting.greet("Petras", "Petraitis"));

    }

}