package lt.vtvpmc.ems.akademijait.spausdinimas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SpausdinimasTest {

    @Test
    void shouldGetTotalUsedToner() {
        Spausdinimas darbuEile = new Spausdinimas();
        darbuEile.addFigure(new Circle("Skritulys", 10.0));
        darbuEile.addFigure((new Rectangle("Staciakampis", 20.0)));
        assertEquals(1.5, darbuEile.getUsedTonerAmount());

    }

    //Šitas yra geras, nes čia tonerio sąnaudos nėra prie figūros aprašytos
    @Test
    void newShouldGetTotalUsedToner() {
        Spausdinimas darbuEile = new Spausdinimas();
        darbuEile.addFigure(new Circle("Skritulys", 10.0));
        darbuEile.addFigure((new Rectangle("Staciakampis", 20.0)));
        assertEquals(1.5, darbuEile.getNewTonerAmount());

    }
}