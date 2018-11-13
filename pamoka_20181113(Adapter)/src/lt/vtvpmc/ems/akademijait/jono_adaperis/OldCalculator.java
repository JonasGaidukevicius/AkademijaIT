package lt.vtvpmc.ems.akademijait.jono_adaperis;

public class OldCalculator implements MakeCalculationInterface {
    @Override
    public int addingStringAndTwoIntegers(String text, int baseNumber, int additionalNUmber) {
        int result = 0;
        result = (baseNumber * additionalNUmber + text.length());
        return result;
    }
}
