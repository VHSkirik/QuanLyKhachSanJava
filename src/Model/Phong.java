package Model;

/**
 *
 * @author @VHSkirik
 */
public class Phong {

    private String Maphong;
    private String Tenphong;
    private String Maloaiphong;
    private int Tinhtrang;

    public Phong() {
    }

    public Phong(String Maphong, String Tenphong, String Maloaiphong, int Tinhtrang) {
        this.Maphong = Maphong;
        this.Tenphong = Tenphong;
        this.Maloaiphong = Maloaiphong;
        this.Tinhtrang = Tinhtrang;
    }

    public String getMaphong() {
        return Maphong;
    }

    public void setMaphong(String Maphong) {
        this.Maphong = Maphong;
    }

    public String getTenphong() {
        return Tenphong;
    }

    public void setTenphong(String Tenphong) {
        this.Tenphong = Tenphong;
    }

    public String getMaloaiphong() {
        return Maloaiphong;
    }

    public void setMaloaiphong(String Maloaiphong) {
        this.Maloaiphong = Maloaiphong;
    }

    public int getTinhtrang() {
        return Tinhtrang;
    }

    public void setTinhtrang(int Tinhtrang) {
        this.Tinhtrang = Tinhtrang;
    }

}
