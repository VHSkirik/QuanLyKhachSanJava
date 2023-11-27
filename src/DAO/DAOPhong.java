package DAO;

import DataBase.SqlManager;
import Model.Phong;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author @VHSkirik
 */
public class DAOPhong implements InterfaceDAO<Phong> {

    public static DAOPhong getInstance() {
        return new DAOPhong();
    }

    @Override
    public int insert(Phong p) {
        String query = "INSERT INTO phong VALUES('" + p.getMaphong() + "','" + p.getTenphong() + "','" + p.getMaloaiphong() + "'," + p.getTinhtrang() + ")";
        return SqlManager.updateData(query);
    }

    @Override
    public int delete(String maphong) {
        String query = "DELETE FROM phong WHERE maphong='" + maphong + "'";
        return SqlManager.updateData(query);
    }

    @Override
    public int update(Phong p) {
        String query = "UPDATE phong SET tenphong='" + p.getTenphong() + "', maloaiphong='" + p.getMaloaiphong() + "', tinhtrang=" + p.getTinhtrang() + " WHERE maphong='" + p.getMaphong() + "'";
        return SqlManager.updateData(query);
    }

    @Override
    public ArrayList<Phong> getAll() {
        ArrayList<Phong> dsPhong = new ArrayList<>();
        try {
            ResultSet rs = SqlManager.getDataTable("phong");
            while (rs.next()) {
                Phong p = new Phong(
                        rs.getString("maphong"),
                        rs.getString("tenphong"),
                        rs.getString("maloaiphong"),
                        rs.getInt("tinhtrang")
                );
                dsPhong.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsPhong;
    }

    @Override
    public Phong getByID(String maphong) {
        Phong p = null;
        try {
            ResultSet rs = SqlManager.getDataTable("phong WHERE maphong='" + maphong + "'");
            if (rs.next()) {
                p = new Phong(
                        rs.getString("maphong"),
                        rs.getString("tenphong"),
                        rs.getString("maloaiphong"),
                        rs.getInt("tinhtrang")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return p;
    }
    
    public int getSLThue(){
        int soluong = 0;
        try {
            String query = "SELECT COUNT(*) FROM phong WHERE tinhtrang=1";
            ResultSet rs = SqlManager.executeQuery(query);
            if (rs.next()){
                soluong = rs.getInt(1);
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return soluong;
    }
}
