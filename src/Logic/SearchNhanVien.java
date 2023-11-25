package Logic;

import DAO.DAONhanVien;
import Model.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author @VHSkirik
 */
public class SearchNhanVien {

    public static ArrayList<NhanVien> getAllbyName(String name) {
        ArrayList<NhanVien> rs = new ArrayList<>();
        ArrayList<NhanVien> dsNhanvien = DAONhanVien.getInstance().getAll();
        for (NhanVien nv : dsNhanvien) {
            if (nv.getHotenvn().toLowerCase().contains(name)) {
                rs.add(nv);
            }
        }
        return rs;
    }
}
