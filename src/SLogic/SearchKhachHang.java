package SLogic;

import DAO.DAOKhachHang;
import Model.KhachHang;
import java.util.ArrayList;

/**
 *
 * @author @VHSkirik
 */
public class SearchKhachHang {

    public static ArrayList<KhachHang> getALLByName(String name) {
        ArrayList<KhachHang> rs = new ArrayList<>();
        ArrayList<KhachHang> dsKhachHang = DAOKhachHang.getInstance().getAll();
        for (KhachHang kh : dsKhachHang) {
            if (kh.getTenkh().toLowerCase().contains(name)) {
                rs.add(kh);
            }
        }
        return rs;
    }

    public static ArrayList<KhachHang> getAllByCMT(String cmt) {
        ArrayList<KhachHang> rs = new ArrayList<>();
        ArrayList<KhachHang> dsKhachHang = DAOKhachHang.getInstance().getAll();
        for (KhachHang kh : dsKhachHang) {
            if (kh.getCmt().toLowerCase().contains(cmt)) {
                rs.add(kh);
            }
        }
        return rs;
    }
}
