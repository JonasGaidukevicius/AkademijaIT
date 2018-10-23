package lt.vtvpmc.ems.akademijait.jonas.dekoratorius;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreeterUpperCaseDecoratorTest {

    @Test
    public void shouldGreetInUpperCase(){
        GreeterUpperCaseDecorator greeting = new GreeterUpperCaseDecorator(new GreeterImpl());

        //String greetingText = greeting.greet("Petras", "Petraitis");

        assertEquals("Hello, PETRAS PETRAITIS", greeting.greet("Petras", "Petraitis"));
    }

}