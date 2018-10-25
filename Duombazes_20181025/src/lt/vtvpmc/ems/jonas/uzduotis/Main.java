package lt.vtvpmc.ems.jonas.uzduotis;

import java.sql.SQLException;

public class Main {

    public static void main(String[] args) {
        DbEngage bandymas = new DbEngage();
        try {
            bandymas.nuskaitymasIrIrasymas();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
