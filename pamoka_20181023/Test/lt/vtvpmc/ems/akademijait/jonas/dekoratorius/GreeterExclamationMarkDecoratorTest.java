package lt.vtvpmc.ems.akademijait.jonas.dekoratorius;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterExclamationMarkDecoratorTest {

    @Test
    public void shouldGreetWithExclamationMark(){
        GreeterExclamationMarkDecorator greeting = new GreeterExclamationMarkDecorator(new GreeterImpl());

        assertEquals("Hello, Petras Petraitis!", greeting.greet("Petras", "Petraitis"));
    }

}