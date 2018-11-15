package lt.vtvpmc.ems.akademijait.jonas.sheep;

import lt.vtvpmc.sheep.SheepColor;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SheepIteratorImplTest {

    @Test
    void methodHasNextShouldReturnFalseIfThereIsNoNextItem() {
        SheepIteratorImpl mySheepIteratorImpl = new SheepIteratorImpl(20);
        mySheepIteratorImpl.setPosition(mySheepIteratorImpl.getIterator());
        boolean isNext = mySheepIteratorImpl.hasNext();
        assertFalse(isNext);

    }

    @Test
    void methodNextShouldReturnWhiteSheepObject() {
        SheepIteratorImpl mySheepIteratorImpl = new SheepIteratorImpl(1);
        MySheep testSheep = new MySheep(SheepColor.WHITE, "Dolly");
        assertEquals(testSheep.getColor(), mySheepIteratorImpl.next().getColor());

    }

    @Test
    void methodNextShouldReturnWhiteAndBlackSheepsObjects() {
        SheepIteratorImpl mySheepIteratorImpl = new SheepIteratorImpl(2);
        MySheep testSheep1 = new MySheep(SheepColor.WHITE, "Dolly");
        MySheep testSheep2 = new MySheep(SheepColor.BLACK, "Jack");
        assertEquals(testSheep1.getColor(), mySheepIteratorImpl.next().getColor());
        assertEquals(testSheep2.getColor(), mySheepIteratorImpl.next().getColor());

    }
}