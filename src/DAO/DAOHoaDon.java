package DAO;

import DataBase.SqlManager;
import Model.HoaDon;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author @VHSkirik
 */
public class DAOHoaDon implements InterfaceDAO<HoaDon> {

    public static DAOHoaDon getInstance() {
        return new DAOHoaDon();
    }

    @Override
    public int insert(HoaDon hd) {
        String ngaytra;
        if (hd.getNgaytra() != null) {
            ngaytra = hd.getNgaytra().isBlank() ? null : ("'" + hd.getNgaytra() + "'");
        } else {
            ngaytra = null;
        }
        String query = "INSERT INTO hoadon VALUES ('" + hd.getMahd() + "','" + hd.getMakh() + "','" + hd.getManv() + "','" + hd.getMaphong() + "','" + hd.getGiaphong() + "','" + hd.getNgaythue() + "'," + ngaytra + ",'" + hd.getThanhtien() + "','" + hd.getDathanhtoan() + "')";
        return SqlManager.updateData(query);
    }

    @Override
    public int delete(String id) {
        String query = "DELETE FROM hoadon WHERE mahd='" + id + "'";
        return SqlManager.updateData(query);
    }

    @Override
    public int update(HoaDon hd) {
        String ngaytra;
        if (hd.getNgaytra() != null) {
            ngaytra = hd.getNgaytra().isBlank() ? null : ("'" + hd.getNgaytra() + "'");
        } else {
            ngaytra = null;
        }
        String query = "UPDATE hoadon SET makh='" + hd.getMakh() + "', manv='" + hd.getManv() + "', maphong='" + hd.getMaphong() + "', giaphong='" + hd.getGiaphong() + "', ngaythue='" + hd.getNgaythue() + "', ngaytra=" + ngaytra + ", thanhtien='" + hd.getThanhtien() + "', dathanhtoan='" + hd.getDathanhtoan() + "' WHERE mahd='" + hd.getMahd() + "'";
        return SqlManager.updateData(query);
    }

    @Override
    public ArrayList<HoaDon> getAll() {
        ArrayList<HoaDon> dsHoadon = new ArrayList<>();
        try {
            ResultSet rs = SqlManager.getDataTable("hoadon");
            while (rs.next()) {
                HoaDon hd = new HoaDon(
                        rs.getString("mahd"),
                        rs.getString("makh"),
                        rs.getString("manv"),
                        rs.getString("maphong"),
                        rs.getInt("giaphong"),
                        rs.getString("ngaythue"),
                        rs.getString("ngaytra"),
                        rs.getInt("thanhtien"),
                        rs.getInt("dathanhtoan"));
                dsHoadon.add(hd);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsHoadon;
    }

    @Override
    public HoaDon getByID(String mahd) {
        HoaDon hd = null;
        try {
            ResultSet rs = SqlManager.getDataTable("hoadon WHERE mahd='" + mahd + "'");
            if (rs.next()) {
                hd = new HoaDon(rs.getString("mahd"),
                        rs.getString("makh"),
                        rs.getString("manv"),
                        rs.getString("maphong"),
                        rs.getInt("giaphong"),
                        rs.getString("ngaythue"),
                        rs.getString("ngaytra"),
                        rs.getInt("thanhtien"),
                        rs.getInt("dathanhtoan"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return hd;
    }

    public boolean checkThanhToan(String maKh) {
        try {
            ResultSet rs = SqlManager.getDataTable("hoadon WHERE makh='" + maKh + "' AND dathanhtoan=" + 0);
            if (rs.next()) {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }

    public int soNgayThue(String mahd, String ngaytra) {
        int songay = -1;
        try {
            String query = "SELECT DATEDIFF('" + ngaytra + "',ngaythue) as 'songaythue' FROM hoadon WHERE mahd='" + mahd + "'";
            ResultSet rs = SqlManager.executeQuery(query);
            if (rs.next()) {
                songay = rs.getInt("songaythue");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return songay;
    }
}
