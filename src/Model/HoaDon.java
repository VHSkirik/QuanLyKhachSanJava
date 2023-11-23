
package Model;

import java.util.Date;

/**
 *
 * @author @VHSkirik
 */
public class HoaDon {
    private String Mahd;
    private String Makh;
    private String Manv;
    private String Maphong;
    private int Giaphong;
    private String Ngaythue;
    private String Ngaytra;
    private int Thanhtien;
    private int Dathanhtoan;

    public HoaDon() {
    }

    public HoaDon(String Mahd, String Makh, String Manv, String Maphong, int Giaphong, String Ngaythue, String Ngaytra, int Thanhtien, int Dathanhtoan) {
        this.Mahd = Mahd;
        this.Makh = Makh;
        this.Manv = Manv;
        this.Maphong = Maphong;
        this.Giaphong = Giaphong;
        this.Ngaythue = Ngaythue;
        this.Ngaytra = Ngaytra;
        this.Thanhtien = Thanhtien;
        this.Dathanhtoan = Dathanhtoan;
    }

    public String getMahd() {
        return Mahd;
    }

    public void setMahd(String Mahd) {
        this.Mahd = Mahd;
    }

    public String getMakh() {
        return Makh;
    }

    public void setMakh(String Makh) {
        this.Makh = Makh;
    }

    public String getManv() {
        return Manv;
    }

    public void setManv(String Manv) {
        this.Manv = Manv;
    }

    public String getMaphong() {
        return Maphong;
    }

    public void setMaphong(String Maphong) {
        this.Maphong = Maphong;
    }

    public int getGiaphong() {
        return Giaphong;
    }

    public void setGiaphong(int Giaphong) {
        this.Giaphong = Giaphong;
    }

    public String getNgaythue() {
        return Ngaythue;
    }

    public void setNgaythue(String Ngaythue) {
        this.Ngaythue = Ngaythue;
    }

    public String getNgaytra() {
        return Ngaytra;
    }

    public void setNgaytra(String Ngaytra) {
        this.Ngaytra = Ngaytra;
    }

    public int getThanhtien() {
        return Thanhtien;
    }

    public void setThanhtien(int Thanhtien) {
        this.Thanhtien = Thanhtien;
    }

    public int getDathanhtoan() {
        return Dathanhtoan;
    }

    public void setDathanhtoan(int Dathanhtoan) {
        this.Dathanhtoan = Dathanhtoan;
    }
    
}
