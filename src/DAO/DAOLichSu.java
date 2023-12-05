package DAO;

import DataBase.KetNoiData;
import Model.LichSu;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author @VHSkirik
 */
public class DAOLichSu implements InterfaceDAO<LichSu> {

    public static DAOLichSu getInstance() {
        return new DAOLichSu();
    }

    @Override
    public int insert(LichSu ls) {
        int rs = -1;
        try {
            Connection c = KetNoiData.getConnection();
            String query = "INSERT INTO lichsu (taikhoan, thoigian, noidung) VALUES (?,?,?)";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, ls.getTaikhoan());
            stm.setString(2, ls.getThoigian());
            stm.setString(3, ls.getNoidung());
            rs = stm.executeUpdate();
            KetNoiData.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int delete(String malichsu) {
        int rs = -1;
        try {
            Connection c = KetNoiData.getConnection();
            String query = "DELETE FROM lichsu WHERE malichsu = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, malichsu);
            rs = stm.executeUpdate();
            KetNoiData.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public int update(LichSu ls) {
        int rs = -1;
        try {
            Connection c = KetNoiData.getConnection();
            String query = "UPDATE lichsu SET taikhoan = ?, thoigian = ?, noidung = ? WHERE malichsu = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, ls.getTaikhoan());
            stm.setString(2, ls.getThoigian());
            stm.setString(3, ls.getNoidung());
            stm.setString(4, ls.getMalichsu());
            rs = stm.executeUpdate();
            KetNoiData.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return rs;
    }

    @Override
    public ArrayList<LichSu> getAll() {
        ArrayList<LichSu> list = new ArrayList<>();
        try {
            Connection c = KetNoiData.getConnection();
            String query = "SELECT * FROM lichsu";
            PreparedStatement stm = c.prepareStatement(query);
            ResultSet rs = stm.executeQuery();
            while (rs.next()) {
                LichSu ls = new LichSu(
                        rs.getString("malichsu"),
                        rs.getString("taikhoan"),
                        rs.getString("thoigian"),
                        rs.getString("noidung"));
                list.add(ls);
            }
            KetNoiData.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    @Override
    public LichSu getByID(String malichsu) {
        LichSu ls = null;
        try {
            Connection c = KetNoiData.getConnection();
            String query = "SELECT * FROM lichsu WHERE malichsu = ?";
            PreparedStatement stm = c.prepareStatement(query);
            stm.setString(1, malichsu);
            ResultSet rs = stm.executeQuery();
            if (rs.next()) {
                ls = new LichSu();
                ls.setMalichsu(rs.getString("malichsu"));
                ls.setTaikhoan(rs.getString("taikhoan"));
                ls.setThoigian(rs.getString("thoigian"));
                ls.setNoidung(rs.getString("noidung"));
            }
            KetNoiData.closeConnection(c);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return ls;
    }

}
