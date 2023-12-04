package Model;

/**
 *
 * @author @VHSkirik
 */
public class DoanhSoNhanVien {
    private String Taikhoan;
    private String Tennv;
    private int Doanhso;
    
    public DoanhSoNhanVien(){
        
    }

    public DoanhSoNhanVien(String Taikhoan, String Tennv, int Doanhso) {
        this.Taikhoan = Taikhoan;
        this.Tennv = Tennv;
        this.Doanhso = Doanhso;
    }

    public String getTaikhoan() {
        return Taikhoan;
    }

    public void setTaikhoan(String Taikhoan) {
        this.Taikhoan = Taikhoan;
    }

    public String getTennv() {
        return Tennv;
    }

    public void setTennv(String Tennv) {
        this.Tennv = Tennv;
    }

    public int getDoanhso() {
        return Doanhso;
    }

    public void setDoanhso(int Doanhso) {
        this.Doanhso = Doanhso;
    }
    
    
}
