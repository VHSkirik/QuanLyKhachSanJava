package DAO;

import DataBase.SqlManager;
import Model.KhachHang;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author @VHSkirik
 */
public class DAOKhachHang implements InterfaceDAO<KhachHang> {

    public static DAOKhachHang getInstance() {
        return new DAOKhachHang();
    }

    @Override
    public int insert(KhachHang kh) {
        String query = "INSERT INTO khachhang VALUES('" + kh.getMakh() + "','" + kh.getTenkh() + "','" + kh.getNgaysinhkh() + "','" + kh.getCmt() + "','" + kh.getQuoctich() + "','" + kh.getGioitinh() + "','" + kh.getSodienthoai() + "')";
        return SqlManager.updateData(query);
    }

    @Override
    public int delete(KhachHang kh) {
        String query = "DELETE FROM khachhang WHERE makh='" + kh.getMakh() + "'";
        return SqlManager.updateData(query);
    }

    @Override
    public int update(KhachHang kh) {
        String query = "UPDATE khachhang SET tenkh='" + kh.getTenkh() + "', ngaysinhkh='" + kh.getNgaysinhkh() + "', cmt='" + kh.getCmt() + "', quoctich='" + kh.getQuoctich() + "', gioitinh='" + kh.getGioitinh() + "', sodienthoai='" + kh.getSodienthoai() + "' WHERE makh='" + kh.getMakh() + "'";
        return SqlManager.updateData(query);
    }

    @Override
    public ArrayList<KhachHang> getAll() {
        ArrayList<KhachHang> dsKhachHang = new ArrayList<>();
        try {
            ResultSet rs = SqlManager.getDataTable("khachhang");
            while (rs.next()) {
                KhachHang kh = new KhachHang(
                        rs.getString("makh"),
                        rs.getString("tenkh"),
                        rs.getString("ngaysinhkh"),
                        rs.getString("cmt"),
                        rs.getString("quoctich"),
                        rs.getString("gioitinh"),
                        rs.getString("sodienthoai")
                );
                dsKhachHang.add(kh);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsKhachHang;
    }

    @Override
    public KhachHang getByID(String id) {
        KhachHang kh = null;
        try {
            ResultSet rs = SqlManager.getDataTable("khachhang WHERE makh='" + id + "'");
            if (rs.next()) {
                kh = new KhachHang(
                        rs.getString("makh"),
                        rs.getString("tenkh"),
                        rs.getString("ngaysinhkh"),
                        rs.getString("cmt"),
                        rs.getString("quoctich"),
                        rs.getString("gioitinh"),
                        rs.getString("sodienthoai")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return kh;
    }
}
