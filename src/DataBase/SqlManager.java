package DataBase;

import java.sql.*;

/**
 *
 * @author @VHSkirik
 */
public class SqlManager {

    public static ResultSet getDataTable(String tbName) {
        ResultSet rs = null;
        try {
            Connection c = KetNoiData.getConnection();
            Statement stm = c.createStatement();
            rs = stm.executeQuery("SELECT * FROM " + tbName);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    public static int updateData(String query) {
        int kq = -1;
        try {
            Connection c = KetNoiData.getConnection();
            Statement stm = c.createStatement();
            kq = stm.executeUpdate(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kq;
    }
    
    public static ResultSet executeQuery(String query) {
        ResultSet rs = null;
        try {
            Connection c = KetNoiData.getConnection();
            Statement stm = c.createStatement();
            rs = stm.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }
}
