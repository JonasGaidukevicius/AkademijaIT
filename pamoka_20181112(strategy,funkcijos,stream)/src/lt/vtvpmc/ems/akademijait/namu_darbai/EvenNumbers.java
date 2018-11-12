package lt.vtvpmc.ems.akademijait.namu_darbai;

public class EvenNumbers {
    private int evenNumber;

    public EvenNumbers(int number){
        this.evenNumber = number;
    }

    public int getEvenNumber() {
        return evenNumber;
    }

    @Override
    public String toString() {
        return "EvenNumbers{" +
                "evenNumber=" + evenNumber +
                '}';
    }
}
