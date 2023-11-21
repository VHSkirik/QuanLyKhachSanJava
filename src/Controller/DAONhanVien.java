package Controller;

import DataBase.SqlManager;
import Model.NhanVien;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author @VHSkirik
 */
public class DAONhanVien implements InterfaceDAO<NhanVien> {

    public static DAONhanVien getInstance(){
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
        String query = "INSERT INTO nhanvien VALUES('"+tk+"','"+ten+"','"+ns+"','"+gt+"','"+mk+"','"+loai+"')";
        return SqlManager.updateData(query);
    }

    @Override
    public int delete(NhanVien nv) {
        String tk = nv.getTaikhoan();
        String query = "DELETE FROM nhanvien WHERE taikhoan='"+tk+"'";
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
        String query = "UPDATE nhanvien SET hotennv='"+ten+"', ngaysinhnv='"+ns+"', gioitinhnv='"+gt+"', matkhau='"+mk+"', loainguoidung='"+loai+"' WHERE taikhoan='"+tk+"'";
        return SqlManager.updateData(query);
    }

    @Override
    public ArrayList<NhanVien> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public NhanVien getByID(String id) {
        NhanVien nv = null;
        try {
            ResultSet rs = SqlManager.getDataTable("nhanvien WHERE taikhoan='" + id + "'");
            if (rs.next()){
                nv = new NhanVien(rs.getString("taikhoan"), rs.getString("hotennv"), rs.getString("ngaysinhnv"), rs.getString("gioitinhnv"), rs.getString("matkhau"), rs.getString("loainguoidung"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return nv;
    }
}
