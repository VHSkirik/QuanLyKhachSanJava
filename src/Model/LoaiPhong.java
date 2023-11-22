
package Model;

/**
 *
 * @author @VHSkirik
 */
public class LoaiPhong {
    private String Maloaiphong;
    private String Tenloaiphong;
    private int Giaphong;
    private String Mota;

    public LoaiPhong() {
    }

    public LoaiPhong(String Maloaiphong, String Tenloaiphong, int Giaphong, String Mota) {
        this.Maloaiphong = Maloaiphong;
        this.Tenloaiphong = Tenloaiphong;
        this.Giaphong = Giaphong;
        this.Mota = Mota;
    }

    public String getMaloaiphong() {
        return Maloaiphong;
    }

    public void setMaloaiphong(String Maloaiphong) {
        this.Maloaiphong = Maloaiphong;
    }

    public String getTenloaiphong() {
        return Tenloaiphong;
    }

    public void setTenloaiphong(String Tenloaiphong) {
        this.Tenloaiphong = Tenloaiphong;
    }

    public int getGiaphong() {
        return Giaphong;
    }

    public void setGiaphong(int Giaphong) {
        this.Giaphong = Giaphong;
    }

    public String getMota() {
        return Mota;
    }

    public void setMota(String Mota) {
        this.Mota = Mota;
    }
    
}
