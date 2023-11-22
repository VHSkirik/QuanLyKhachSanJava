
package Model;

/**
 *
 * @author @VHSkirik
 */
public class KhachHang {
    private String Makh;
    private String Tenkh;
    private String Ngaysinhkh;
    private String Cmt;
    private String Quoctich;
    private String Gioitinh;
    private String Sodienthoai;

    public KhachHang() {
    }

    public KhachHang(String Makh, String Tenkh, String Ngaysinhkh, String Cmt, String Quoctich, String Gioitinh, String Sodienthoai) {
        this.Makh = Makh;
        this.Tenkh = Tenkh;
        this.Ngaysinhkh = Ngaysinhkh;
        this.Cmt = Cmt;
        this.Quoctich = Quoctich;
        this.Gioitinh = Gioitinh;
        this.Sodienthoai = Sodienthoai;
    }

    public String getMakh() {
        return Makh;
    }

    public void setMakh(String Makh) {
        this.Makh = Makh;
    }

    public String getTenkh() {
        return Tenkh;
    }

    public void setTenkh(String Tenkh) {
        this.Tenkh = Tenkh;
    }

    public String getNgaysinhkh() {
        return Ngaysinhkh;
    }

    public void setNgaysinhkh(String Ngaysinhkh) {
        this.Ngaysinhkh = Ngaysinhkh;
    }

    public String getCmt() {
        return Cmt;
    }

    public void setCmt(String Cmt) {
        this.Cmt = Cmt;
    }

    public String getQuoctich() {
        return Quoctich;
    }

    public void setQuoctich(String Quoctich) {
        this.Quoctich = Quoctich;
    }

    public String getGioitinh() {
        return Gioitinh;
    }

    public void setGioitinh(String Gioitinh) {
        this.Gioitinh = Gioitinh;
    }

    public String getSodienthoai() {
        return Sodienthoai;
    }

    public void setSodienthoai(String Sodienthoai) {
        this.Sodienthoai = Sodienthoai;
    }
    
}
