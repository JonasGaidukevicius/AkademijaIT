package lt.vtvpmc.ems.akademijait.jonas;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OddNumberIteratorTest {

    @Test
    public void shoudPrintOddNumbers(){

        OddNumberIterator oddNumbers = new OddNumberIterator();
        while(oddNumbers.hasNext()){
            System.out.println(oddNumbers.next());
        }
    }

}