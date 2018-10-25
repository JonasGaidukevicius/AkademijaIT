package lt.vtvpmc.ems.jonas.testine;

import java.sql.*;

public class DbEngage {

    Connection cn;
    Statement st;
    ResultSet rs;
    PreparedStatement pst;

    //konstruktorius
    public DbEngage(){
        try {
            Class.forName("org.h2.Driver");
            cn = DriverManager.getConnection("jdbc:h2:/home/jonas/db/manoduombaze.db", "sa", "");
            st = cn.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
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
