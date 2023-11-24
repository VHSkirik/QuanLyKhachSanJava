package Controller;

import DAO.DAOChiTietHoaDon;
import DAO.DAOHoaDon;
import DAO.DAOLoaiPhong;
import DAO.DAOPhong;
import Model.ChiTietHoaDon;
import Model.HoaDon;
import Model.LoaiPhong;
import Model.Phong;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/**
 *
 * @author @VHSkirik
 */
public class LogicHoaDon {

    public static int themCTHD(ChiTietHoaDon cthd) {
        ChiTietHoaDon check = DAOChiTietHoaDon.getInstance().getByID(cthd.getMahd(), cthd.getMadichvu());
        int rs;
        if (check == null) {
            rs = DAOChiTietHoaDon.getInstance().insert(cthd);
        } else {
            cthd.setSoluong(cthd.getSoluong() + check.getSoluong());
            rs = DAOChiTietHoaDon.getInstance().update(cthd);
        }
        return rs;
    }

    public static ArrayList<HoaDon> getAllbyMaKH(String makh) {
        ArrayList<HoaDon> dsHoadon = DAOHoaDon.getInstance().getAll();
        ArrayList<HoaDon> rs = new ArrayList<>();
        for (HoaDon hd : dsHoadon) {
            if (hd.getMakh().toLowerCase().equals(makh.toLowerCase())) {
                rs.add(hd);
            }
        }
        return rs;
    }

    public static LinkedHashMap<String, Integer> getMaLoai_GiaPhong() {
        //lay ma loai phong va gia
        LinkedHashMap<String, Integer> hmMaLoai_Gia = new LinkedHashMap<>();
        ArrayList<LoaiPhong> dsLoaiPhong = DAOLoaiPhong.getInstance().getAll();
        for (LoaiPhong lp : dsLoaiPhong) {
            hmMaLoai_Gia.put(lp.getMaloaiphong(), lp.getGiaphong());
        }
        //them gia vao ma phong theo maloai phong
        LinkedHashMap<String, Integer> rs = new LinkedHashMap<>();
        ArrayList<Phong> dsPhong = DAOPhong.getInstance().getAll();
        for (Phong phong : dsPhong) {
            rs.put(phong.getMaphong(), hmMaLoai_Gia.get(phong.getMaloaiphong()));
        }
        return rs;
    }
}
