package DAO;

import DataBase.SqlManager;
import Model.ChiTietHoaDon;
import Model.HoaDon;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author @VHSkirik
 */
public class DAOChiTietHoaDon {

    public static DAOChiTietHoaDon getInstance() {
        return new DAOChiTietHoaDon();
    }

    public int insert(ChiTietHoaDon cthd) {
        String query;
        query = "INSERT INTO chitiethoadon VALUES('" + cthd.getMahd() + "','" + cthd.getMadichvu() + "'," + cthd.getDongia() + "," + cthd.getSoluong() + ")";
        return SqlManager.updateData(query);
    }

    public int delete(String mahd, String madv) {
        String query = "DELETE FROM chitiethoadon WHERE mahd='" + mahd + "' AND madichvu='" + madv + "'";
        return SqlManager.updateData(query);
    }

    public int deleteByMahd(String mahd) {
        String query = "DELETE FROM chitiethoadon WHERE mahd='" + mahd + "'";
        return SqlManager.updateData(query);
    }

    public int update(ChiTietHoaDon cthd) {
        String query = "UPDATE chitiethoadon SET dongia=" + cthd.getDongia() + ", soluong=" + cthd.getSoluong() + " WHERE mahd='" + cthd.getMahd() + "' AND madichvu='" + cthd.getMadichvu() + "'";
        return SqlManager.updateData(query);
    }

    public ArrayList<ChiTietHoaDon> getAll() {
        ArrayList<ChiTietHoaDon> dsChiTietHoaDon = new ArrayList<>();
        try {
            ResultSet rs = SqlManager.getDataTable("chitiethoadon");
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon(
                        rs.getString("mahd"),
                        rs.getString("madichvu"),
                        rs.getInt("dongia"),
                        rs.getInt("soluong")
                );
                dsChiTietHoaDon.add(cthd);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsChiTietHoaDon;
    }

    public ChiTietHoaDon getByID(String mahd, String madv) {
        ChiTietHoaDon cthd = null;
        try {
            ResultSet rs = SqlManager.getDataTable("chitiethoadon WHERE mahd='" + mahd + "' AND madichvu='" + madv + "'");
            if (rs.next()) {
                cthd = new ChiTietHoaDon(
                        rs.getString("mahd"),
                        rs.getString("madichvu"),
                        rs.getInt("dongia"),
                        rs.getInt("soluong"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cthd;
    }

    public ArrayList<ChiTietHoaDon> getAllbyMahd(String mahd) {
        ArrayList<ChiTietHoaDon> dsCTHD = DAOChiTietHoaDon.getInstance().getAll();
        ArrayList<ChiTietHoaDon> dsKetQua = new ArrayList<>();
        try {
            ResultSet rs = SqlManager.getDataTable("chitiethoadon WHERE mahd='" + mahd + "'");
            while (rs.next()) {
                ChiTietHoaDon cthd = new ChiTietHoaDon(
                        rs.getString("mahd"),
                        rs.getString("madichvu"),
                        rs.getInt("dongia"),
                        rs.getInt("soluong"));
                dsKetQua.add(cthd);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsKetQua;
    }
}
