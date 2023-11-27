
package Controller;

import DAO.DAOPhong;
import Model.Phong;
import java.util.ArrayList;

/**
 *
 * @author @VHSkirik
 */
public class SearchPhong {
    public static ArrayList<Phong> getAllbyMaLoai(String maLoai){
        ArrayList<Phong> rs = new ArrayList<>();
        ArrayList<Phong> dsPhong = DAOPhong.getInstance().getAll();
        for (Phong p : dsPhong){
            if (p.getMaloaiphong().toLowerCase().equals(maLoai))
                rs.add(p);
        }       
        return rs;
    }
}
