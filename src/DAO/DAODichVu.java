package DAO;

import DataBase.SqlManager;
import Model.DichVu;
import java.util.ArrayList;
import java.sql.*;

/**
 *
 * @author @VHSkirik
 */
public class DAODichVu implements InterfaceDAO<DichVu> {

    public static DAODichVu getInstance() {
        return new DAODichVu();
    }

    @Override
    public int insert(DichVu dv) {
        String query = "INSERT INTO dichvu VALUES('" + dv.getMadichvu() + "','" + dv.getTendichvu() + "'," + dv.getGiadichvu() + ")";
        return SqlManager.updateData(query);
    }

    @Override
    public int delete(DichVu dv) {
        String query = "DELETE FROM dichvu WHERE madichvu='" + dv.getMadichvu() + "'";
        return SqlManager.updateData(query);
    }

    @Override
    public int update(DichVu dv) {
        String query = "UPDATE dichvu SET tendichvu='" + dv.getTendichvu() + "', giadichvu=" + dv.getGiadichvu() + " WHERE madichvu='" + dv.getMadichvu() + "'";
        return SqlManager.updateData(query);
    }

    @Override
    public ArrayList<DichVu> getAll() {
        ArrayList<DichVu> dsDichVu = new ArrayList<>();
        try {
            ResultSet rs = SqlManager.getDataTable("dichvu");
            while (rs.next()) {
                DichVu dv = new DichVu(
                        rs.getString("madichvu"),
                        rs.getString("tendichvu"),
                        rs.getInt("giadichvu")
                );
                dsDichVu.add(dv);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dsDichVu;
    }

    @Override
    public DichVu getByID(String id) {
        DichVu dv = null;
        try {
            ResultSet rs = SqlManager.getDataTable("dichvu WHERE madichvu='" + id + "'");
            if (rs.next()) {
                dv = new DichVu(
                        rs.getString("madichvu"),
                        rs.getString("tendichvu"),
                        rs.getInt("giadichvu")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dv;
    }
}
