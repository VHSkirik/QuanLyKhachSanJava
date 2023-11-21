package Model;

/**
 *
 * @author @VHSkirik
 */
public class NhanVien {

    private String Taikhoan;
    private String Hotenvn;
    private String Ngaysinhnv;
    private String Gioitinhnv;
    private String Matkhau;
    private String Loainguoidung;

    public NhanVien(String Taikhoan) {
        this.Taikhoan = Taikhoan;
    }

    public NhanVien(String Taikhoan, String Hotenvn, String Ngaysinhnv, String Gioitinhnv, String Matkhau, String Loainguoidung) {
        this.Taikhoan = Taikhoan;
        this.Hotenvn = Hotenvn;
        this.Ngaysinhnv = Ngaysinhnv;
        this.Gioitinhnv = Gioitinhnv;
        this.Matkhau = Matkhau;
        this.Loainguoidung = Loainguoidung;
    }

    public String getTaikhoan() {
        return Taikhoan;
    }

    public void setTaikhoan(String Taikhoan) {
        this.Taikhoan = Taikhoan;
    }

    public String getHotenvn() {
        return Hotenvn;
    }

    public void setHotenvn(String Hotenvn) {
        this.Hotenvn = Hotenvn;
    }

    public String getNgaysinhnv() {
        return Ngaysinhnv;
    }

    public void setNgaysinhnv(String Ngaysinhnv) {
        this.Ngaysinhnv = Ngaysinhnv;
    }

    public String getGioitinhnv() {
        return Gioitinhnv;
    }

    public void setGioitinhnv(String Gioitinhnv) {
        this.Gioitinhnv = Gioitinhnv;
    }

    public String getMatkhau() {
        return Matkhau;
    }

    public void setMatkhau(String Matkhau) {
        this.Matkhau = Matkhau;
    }

    public String getLoainguoidung() {
        return Loainguoidung;
    }

    public void setLoainguoidung(String Loainguoidung) {
        this.Loainguoidung = Loainguoidung;
    }
    @Override
    public String toString(){
        return Taikhoan + ", " + Hotenvn + ", " + Ngaysinhnv + ", " + Gioitinhnv + ", " + Matkhau + ", " + Loainguoidung;
    }
}
