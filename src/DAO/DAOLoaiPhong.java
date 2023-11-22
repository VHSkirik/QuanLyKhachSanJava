package DAO;

import DataBase.SqlManager;
import Model.LoaiPhong;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author @VHSkirik
 */
public class DAOLoaiPhong implements InterfaceDAO<LoaiPhong> {

    public static DAOLoaiPhong getInstance() {
        return new DAOLoaiPhong();
    }

    @Override
    public int insert(LoaiPhong lp) {
        String query = "INSERT INTO loaiphong VALUES('" + lp.getMaloaiphong() + "','" + lp.getTenloaiphong() + "'," + lp.getGiaphong() + ",'" + lp.getMota() + "')";
        return SqlManager.updateData(query);
    }

    @Override
    public int delete(LoaiPhong lp) {
        String query = "DELETE FROM loaiphong WHERE maloaiphong='" + lp.getMaloaiphong() + "'";
        return SqlManager.updateData(query);
    }

    @Override
    public int update(LoaiPhong lp) {
        String query = "UPDATE loaiphong SET tenloaiphong='" + lp.getTenloaiphong() + "', giaphong=" + lp.getGiaphong() + ", mota='" + lp.getMota() + "' WHERE maloaiphong='" + lp.getMaloaiphong() + "'";
        return SqlManager.updateData(query);
    }

    @Override
    public ArrayList<LoaiPhong> getAll() {
        ArrayList<LoaiPhong> dsLoaiPhong = new ArrayList<>();
        try {
            ResultSet rs = SqlManager.getDataTable("loaiphong");
            while (rs.next()) {
                LoaiPhong lp = new LoaiPhong(
                        rs.getString("maloaiphong"),
                        rs.getString("tenloaiphong"),
                        rs.getInt("giaphong"),
                        rs.getString("mota")
                );
                dsLoaiPhong.add(lp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsLoaiPhong;
    }

    @Override
    public LoaiPhong getByID(String id) {
        LoaiPhong lp = null;
        try {
            ResultSet rs = SqlManager.getDataTable("loaiphong WHERE maloaiphong='" + id + "'");
            if (rs.next()) {
                lp = new LoaiPhong(
                        rs.getString("maloaiphong"),
                        rs.getString("tenloaiphong"),
                        rs.getInt("giaphong"),
                        rs.getString("mota")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lp;
    }
}
