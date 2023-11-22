
package Model;

/**
 *
 * @author @VHSkirik
 */
public class DichVu {
    private String Madichvu;
    private String Tendichvu;
    private int Giadichvu;

    public DichVu() {
    }

    public DichVu(String Madichvu, String Tendichvu, int Giadichvu) {
        this.Madichvu = Madichvu;
        this.Tendichvu = Tendichvu;
        this.Giadichvu = Giadichvu;
    }

    public String getMadichvu() {
        return Madichvu;
    }

    public void setMadichvu(String Madichvu) {
        this.Madichvu = Madichvu;
    }

    public String getTendichvu() {
        return Tendichvu;
    }

    public void setTendichvu(String Tendichvu) {
        this.Tendichvu = Tendichvu;
    }

    public int getGiadichvu() {
        return Giadichvu;
    }

    public void setGiadichvu(int Giadichvu) {
        this.Giadichvu = Giadichvu;
    }
    
}
