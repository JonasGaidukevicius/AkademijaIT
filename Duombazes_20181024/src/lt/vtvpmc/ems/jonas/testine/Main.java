package lt.vtvpmc.ems.jonas.testine;

public class Main {

    public static void main(String[] args) {
        DbEngage bandymas = new DbEngage();
        bandymas.query();
        System.out.println("----------------");
        bandymas.preparedQuery();
        System.out.println("----------------");
        bandymas.updateThroughResultSet();
    }

}
