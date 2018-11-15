package lt.vtvpmc.ems.akademijait.jonas.sheep;

import lt.vtvpmc.sheep.Sheep;
import lt.vtvpmc.sheep.SheepColor;
import lt.vtvpmc.sheep.SheepIterator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author jonas
 * @version 1.0
 */
public class SheepIteratorImpl implements SheepIterator {

    /**
     * iterator - the number of total wanted sheeps
     * position - the number indicating at what position is iterator
     * logger - logs important events executing the program
     */
    private int iterator;
    private int position;

    private final static Logger logger = LoggerFactory.getLogger(SheepIteratorImpl.class);

    public SheepIteratorImpl(int i) {
        this.iterator = i;
    }

    /**
     * Checks whether there is one more item
     *
     * @return - false if there is no next item
     */
    @Override
    public boolean hasNext() {
        logger.info("There is a next position");
        return iterator > position;
    }

    /**
     * Creates a new MySheep object.
     * If number of position is odd, then sheep's color is white and its name is "Dolly"
     * If number of position is even, then sheep's color is black and its name is "Jack"
     *
     * @return - MySheep object
     */
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

    /**
     * Sets value of field position to provided number
     *
     * @param position - number indication at what position is iterator
     */
    public void setPosition(int position) {
        this.position = position;
    }

    /**
     * Gets the number of total needed items
     *
     * @return - the value of field iterator
     */
    public int getIterator() {
        return iterator;
    }
}
