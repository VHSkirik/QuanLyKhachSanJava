package Model;

/**
 *
 * @author @VHSkirik
 */
public class ChiTietHoaDon {

    private String Mahd;
    private String Madichvu;
    private int Dongia;
    private int Soluong;

    public ChiTietHoaDon() {
    }

    public ChiTietHoaDon(String Mahd, String Madichvu, int Dongia, int Soluong) {
        this.Mahd = Mahd;
        this.Madichvu = Madichvu;
        this.Dongia = Dongia;
        this.Soluong = Soluong;
    }

    public String getMahd() {
        return Mahd;
    }

    public void setMahd(String Mahd) {
        this.Mahd = Mahd;
    }

    public String getMadichvu() {
        return Madichvu;
    }

    public void setMadichvu(String Madichvu) {
        this.Madichvu = Madichvu;
    }

    public int getDongia() {
        return Dongia;
    }

    public void setDongia(int Dongia) {
        this.Dongia = Dongia;
    }

    public int getSoluong() {
        return Soluong;
    }

    public void setSoluong(int Soluong) {
        this.Soluong = Soluong;
    }

}
