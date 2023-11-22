package DAO;

import DataBase.SqlManager;
import Model.ChiTietHoaDon;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author @VHSkirik
 */
public class DAOChiTietHoaDon implements InterfaceDAO<ChiTietHoaDon> {

    public static DAOChiTietHoaDon getInstance() {
        return new DAOChiTietHoaDon();
    }

    @Override
    public int insert(ChiTietHoaDon cthd) {
        String query = "INSERT INTO chitiethoadon VALUES('" + cthd.getMahd() + "','" + cthd.getMadichvu() + "'," + cthd.getDongia() + "," + cthd.getSoluong() + ")";
        return SqlManager.updateData(query);
    }

    @Override
    public int delete(ChiTietHoaDon cthd) {
        String query = "DELETE FROM chitiethoadon WHERE mahd='" + cthd.getMahd() + "' AND madichvu='" + cthd.getMadichvu() + "'";
        return SqlManager.updateData(query);
    }

    @Override
    public int update(ChiTietHoaDon cthd) {
        String query = "UPDATE chitiethoadon SET dongia=" + cthd.getDongia() + ", soluong=" + cthd.getSoluong() + " WHERE mahd='" + cthd.getMahd() + "' AND madichvu='" + cthd.getMadichvu() + "'";
        return SqlManager.updateData(query);
    }

    @Override
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

    @Override
    public ChiTietHoaDon getByID(String id) {
        ChiTietHoaDon cthd = null;
        String[] dsID = id.split(",");
        String mahd = dsID[0];
        String madichvu = dsID[1];
        try {
            ResultSet rs = SqlManager.getDataTable("chitiethoadon WHERE mahd='" +mahd+ "' AND madichvu='" +madichvu+ "'");
            if (rs.next()){
                cthd = new ChiTietHoaDon(
                rs.getString("mahd"),
                rs.getString("madichvu"),
                rs.getInt("dongia"),
                rs.getInt("soluong"));
            }
        } catch (SQLException e){
            e.printStackTrace();
        }
        return null;
    }
}
