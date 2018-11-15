package lt.vtvpmc.ems.akademijait.jonas.sheep;

import lt.vtvpmc.sheep.AbstractSheepIteratorTest;
import lt.vtvpmc.sheep.SheepIterator;

public class MySheepIteratorTest extends AbstractSheepIteratorTest {

    @Override
    public SheepIterator getSheepIterator(int i) {
        return new SheepIteratorImpl(i);
    }
}
