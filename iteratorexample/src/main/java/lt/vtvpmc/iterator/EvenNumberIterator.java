package lt.vtvpmc.iterator;

public class EvenNumberIterator implements IntIterator {
    
    private int position;


    public boolean hasNext() {
        return position < 40;
    }

    public int next() {
        int number = position * 2;
        position++;
        return number;
    }
}
