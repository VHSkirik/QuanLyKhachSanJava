package SLogic;

import DAO.DAOLichSu;
import Forms.Main;
import Model.LichSu;
import java.util.Date;

/**
 *
 * @author @VHSkirik
 */
public class History {

    public static int addAction(String noidung) {
        try {
            String tk = Main.nhanvien.getTaikhoan();
            String tg = ConvertTime.changeToYMDTime(new Date());
            LichSu ls = new LichSu(null, tk, tg, noidung);
            return DAOLichSu.getInstance().insert(ls);
        } catch (Exception e){
            return -1;
        }     
    }
}
