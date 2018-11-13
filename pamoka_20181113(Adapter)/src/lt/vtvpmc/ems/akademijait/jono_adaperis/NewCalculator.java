package lt.vtvpmc.ems.akademijait.jono_adaperis;

public class NewCalculator {
    public int addingNumbersInNewWay(String text, long parameter1, long parameter2){
        int result = 0;
        result = (int)(parameter1 * parameter2 + text.length());
        return result;
    }

}
