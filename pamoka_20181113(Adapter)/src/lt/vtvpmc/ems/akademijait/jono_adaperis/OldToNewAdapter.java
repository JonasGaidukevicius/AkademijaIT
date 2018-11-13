package lt.vtvpmc.ems.akademijait.jono_adaperis;

public class OldToNewAdapter implements MakeCalculationInterface {
    private NewCalculator newCalculator;

    public OldToNewAdapter(NewCalculator newCalculator){
        this.newCalculator = newCalculator;
    }

    @Override
    public int addingStringAndTwoIntegers(String text, int baseNumber, int additionalNUmber) {
        long parameter1 = baseNumber;
        long parameter2 = additionalNUmber;
        int result;
        result = this.newCalculator.addingNumbersInNewWay(text, parameter1,parameter2);

        return result;
    }
}
