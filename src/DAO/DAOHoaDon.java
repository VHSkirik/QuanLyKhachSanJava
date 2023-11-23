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
        String query = "INSERT INTO hoadon VALUES ('" + hd.getMahd() + "','" + hd.getMakh() + "','" + hd.getManv() + "','" + hd.getMaphong() + "'," + hd.getGiaphong() + ",'" + hd.getNgaythue() + "','" + hd.getNgaytra() + "'," + hd.getThanhtien() + "," + hd.getDathanhtoan() + "";
        return SqlManager.updateData(query);
    }

    @Override
    public int delete(String id) {
        String query = "DELETE FROM hoadon WHERE mahd='" + id + "'";
        return SqlManager.updateData(query);
    }

    @Override
    public int update(HoaDon hd) {
        String query = "UPDATE hoadon SET makh='" + hd.getMakh() + "', manv='" + hd.getMakh() + "', maphong='" + hd.getMaphong() + "', giaphong=" + hd.getGiaphong() + ", ngaythue='" + hd.getNgaythue();
        return -1;
    }

    @Override
    public ArrayList<HoaDon> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public HoaDon getByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean checkThanhToan(String maKh) {
        try {
            ResultSet rs = SqlManager.getDataTable("hoadon WHERE makh='" + maKh + "' AND dathanhtoan=" + 0);
            if (rs.next()){
                return false;
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return true;
    }

}
