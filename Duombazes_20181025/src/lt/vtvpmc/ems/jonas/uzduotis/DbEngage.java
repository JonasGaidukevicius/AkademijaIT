package lt.vtvpmc.ems.jonas.uzduotis;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DbEngage {

    Connection cn;
    Statement st;
    ResultSet rs;
    PreparedStatement pst;
    List<String> lines = new ArrayList<>();

    //konstruktorius
    public DbEngage(){
        try {
            Class.forName("org.h2.Driver");
            cn = DriverManager.getConnection("jdbc:h2:/home/jonas/db/darbas", "sa", "");
            st = cn.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
    //duomenu nuskaitymas is failo ir įrašymas į DB

    public void nuskaitymasIrIrasymas() throws SQLException{
        try {
            lines = Files.readAllLines(Paths.get("/home/jonas/AkademijaIT/AkademijaIT/Duombazes_20101025/Failai/Projektai.txt"), Charset.defaultCharset());

        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            cn.setAutoCommit(false);

            // SQL užklausos
            //nepabaigta
            st.executeUpdate("INSERT INTO PROJEKTAI" + "VALUES (1001, lines.get    'Simpson', 'Mr.', 'Springfield', 2001)");
            cn.commit();
        } catch (SQLException ex) {
            cn.rollback(); // Klaidos atveju atšaukiame pakeitimus
        } finally {
            cn.setAutoCommit(true);
        }
    }


























    //paprastas duomenų nuskaitymas
    public void query(){

        try {
            rs = st.executeQuery("select id, name from lentele");
            while(rs.next()){
                System.out.println("ID: " + rs.getInt("ID") + " name: " + rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    //duomenų nuskaitymas per preparedQuery
    public void preparedQuery(){
        try {
            pst = cn.prepareStatement("SELECT * FROM lentele WHERE name = ?");
            pst.setString(1, "Petras");
            rs = pst.executeQuery();
            while(rs.next()){
                System.out.println("name: " + rs.getString("name"));
            }
            pst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    //duomenų atnaujinimas per rezultatų setą
    public void updateThroughResultSet(){
        try {
            st = cn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
            rs = st.executeQuery("SELECT * FROM lentele");
            while(rs.next()){

                rs.updateString("name", rs.getString("name").toUpperCase());
                rs.updateRow();
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
