
package Controller;

import DAO.DAOChiTietHoaDon;
import Model.ChiTietHoaDon;

/**
 *
 * @author @VHSkirik
 */
public class LogicHoaDon {
    public static int themCTHD(ChiTietHoaDon cthd){
        ChiTietHoaDon check = DAOChiTietHoaDon.getInstance().getByID(cthd.getMahd(), cthd.getMadichvu());
        int rs;
        if (check == null){
            rs = DAOChiTietHoaDon.getInstance().insert(cthd);
        } else {
            cthd.setSoluong(cthd.getSoluong() + check.getSoluong());
            rs = DAOChiTietHoaDon.getInstance().update(cthd);
        }
        return rs;
    }
}
