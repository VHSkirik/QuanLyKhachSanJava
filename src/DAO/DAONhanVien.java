package DAO;

import DataBase.SqlManager;
import Model.NhanVien;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author @VHSkirik
 */
public class DAONhanVien implements InterfaceDAO<NhanVien> {

    public static DAONhanVien getInstance() {
        return new DAONhanVien();
    }

    @Override
    public int insert(NhanVien nv) {
        String tk = nv.getTaikhoan();
        String ten = nv.getHotenvn();
        String ns = nv.getNgaysinhnv();
        String gt = nv.getGioitinhnv();
        String mk = nv.getMatkhau();
        String loai = nv.getLoainguoidung();
        String query = "INSERT INTO nhanvien VALUES('" + tk + "','" + ten + "','" + ns + "','" + gt + "','" + mk + "','" + loai + "')";
        return SqlManager.updateData(query);
    }

    @Override
    public int delete(NhanVien nv) {
        String tk = nv.getTaikhoan();
        String query = "DELETE FROM nhanvien WHERE taikhoan='" + tk + "'";
        return SqlManager.updateData(query);
    }

    @Override
    public int update(NhanVien nv) {
        String tk = nv.getTaikhoan();
        String ten = nv.getHotenvn();
        String ns = nv.getNgaysinhnv();
        String gt = nv.getGioitinhnv();
        String mk = nv.getMatkhau();
        String loai = nv.getLoainguoidung();
        String query = "UPDATE nhanvien SET hotennv='" + ten + "', ngaysinhnv='" + ns + "', gioitinhnv='" + gt + "', matkhau='" + mk + "', loainguoidung='" + loai + "' WHERE taikhoan='" + tk + "'";
        return SqlManager.updateData(query);
    }

    @Override
    public ArrayList<NhanVien> getAll() {
        ArrayList<NhanVien> dsNhanVien = new ArrayList<>();
        try {
            ResultSet rs = SqlManager.getDataTable("nhanvien");
            if (rs != null) {
                while (rs.next()) {
                    String tk = rs.getString("taikhoan");
                    String ten = rs.getString("hotennv");
                    String ns = rs.getString("ngaysinhnv");
                    String gt = rs.getString("gioitinhnv");
                    String mk = rs.getString("matkhau");
                    String loai = rs.getString("loainguoidung");
                    dsNhanVien.add(new NhanVien(tk,ten,ns,gt,mk,loai));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsNhanVien;
    }

    @Override
    public NhanVien getByID(String id) {
        NhanVien nv = null;
        try {
            ResultSet rs = SqlManager.getDataTable("nhanvien WHERE taikhoan='" + id + "'");
            if (rs.next()) {
                nv = new NhanVien(
                        rs.getString("taikhoan"),
                        rs.getString("hotennv"),
                        rs.getString("ngaysinhnv"),
                        rs.getString("gioitinhnv"),
                        rs.getString("matkhau"),
                        rs.getString("loainguoidung"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return nv;
    }
}
