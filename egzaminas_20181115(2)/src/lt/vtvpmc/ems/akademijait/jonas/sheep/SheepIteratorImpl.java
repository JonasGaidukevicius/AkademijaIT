package lt.vtvpmc.ems.akademijait.jonas.sheep;

import lt.vtvpmc.sheep.Sheep;
import lt.vtvpmc.sheep.SheepColor;
import lt.vtvpmc.sheep.SheepIterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SheepIteratorImpl implements SheepIterator {

    private int iterator;
    private int position;

    private final static Logger logger = LoggerFactory.getLogger(SheepIteratorImpl.class);

    public SheepIteratorImpl(int i) {
        this.iterator = i;
    }

    @Override
    public boolean hasNext() {
        logger.info("There is a next position");
        return iterator > position;
    }

    @Override
    public Sheep next() {

        MySheep mySheep = null;

        while (hasNext()) {
            if (iterator == 0) {
                return mySheep;
            }

            if (position % 2 != 0) {
                mySheep = new MySheep(SheepColor.BLACK, "Jack");
                logger.info("Black sheep named Jack is created");
            } else {
                mySheep = new MySheep(SheepColor.WHITE, "Dolly");
                logger.info("White sheep named Dolly is created");
            }
            position++;
            return mySheep;
        }
        return mySheep;

    }
}
