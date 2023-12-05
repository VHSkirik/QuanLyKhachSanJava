
package Model;

/**
 *
 * @author @VHSkirik
 */
public class LichSu {
    private String Malichsu;
    private String Taikhoan;
    private String Thoigian;
    private String Noidung;

    public LichSu() {
    }

    public LichSu(String Malichsu, String Taikhoan, String Thoigian, String Noidung) {
        this.Malichsu = Malichsu;
        this.Taikhoan = Taikhoan;
        this.Thoigian = Thoigian;
        this.Noidung = Noidung;
    }

    public String getMalichsu() {
        return Malichsu;
    }

    public void setMalichsu(String Malichsu) {
        this.Malichsu = Malichsu;
    }

    public String getTaikhoan() {
        return Taikhoan;
    }

    public void setTaikhoan(String Taikhoan) {
        this.Taikhoan = Taikhoan;
    }

    public String getThoigian() {
        return Thoigian;
    }

    public void setThoigian(String Thoigian) {
        this.Thoigian = Thoigian;
    }

    public String getNoidung() {
        return Noidung;
    }

    public void setNoidung(String Noidung) {
        this.Noidung = Noidung;
    }
    
    
}
