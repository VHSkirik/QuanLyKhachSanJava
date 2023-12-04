package DAO;

import Model.DoanhSoNhanVien;
import Model.HoaDon;
import Model.NhanVien;
import java.util.ArrayList;

/**
 *
 * @author @VHSkirik
 */
public class DAODoanhSoNhanVien {
    
    static final ArrayList<HoaDon> dsHoaDonDTT = DAOHoaDon.getInstance().getAll_DTT();
    static final ArrayList<NhanVien> dsNhanVien = DAONhanVien.getInstance().getAll();
    
    public static DAODoanhSoNhanVien getInstance() {
        return new DAODoanhSoNhanVien();
    }
    
    public ArrayList<DoanhSoNhanVien> getAll(){
        ArrayList<DoanhSoNhanVien> rs = new ArrayList<>();
        for (NhanVien nv : dsNhanVien){
            int doanhso = 0;
            for (HoaDon hd : dsHoaDonDTT){
                if (hd.getManv().equals(nv.getTaikhoan())){
                    doanhso += hd.getThanhtien();
                }
            }
            DoanhSoNhanVien dsnv = new DoanhSoNhanVien(nv.getTaikhoan(), nv.getHotenvn(), doanhso);
            rs.add(dsnv);
        }
        return rs;
    }
    
//    public static void main(String[] args) {
//        ArrayList<DoanhSoNhanVien> dsDSNV = getInstance().getAll();
//        for (DoanhSoNhanVien dsvn : dsDSNV){
//            System.out.println(dsvn.getTaikhoan());
//            System.out.println(dsvn.getTennv());
//            System.out.println(dsvn.getDoanhso());
//            System.out.println("");
//        }
//    }
}
