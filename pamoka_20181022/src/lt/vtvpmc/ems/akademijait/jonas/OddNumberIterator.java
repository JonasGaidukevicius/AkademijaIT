package lt.vtvpmc.ems.akademijait.jonas;

public class OddNumberIterator implements IntIterator{

    private int position = 1;

    @Override
    public boolean hasNext() {
        return this.position < 40; //jeigu mažiau 40, grąžins true, kitu atveju grąžins false
    }

    @Override
    public int next() {
        int number = this.position;
        this.position +=2;
        return number;
    }
}
