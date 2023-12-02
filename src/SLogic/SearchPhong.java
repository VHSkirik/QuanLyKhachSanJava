
package SLogic;

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
        for (Phong phong : dsPhong){
            if (phong.getMaloaiphong().toLowerCase().equals(maLoai))
                rs.add(phong);
        }       
        return rs;
    }
}
