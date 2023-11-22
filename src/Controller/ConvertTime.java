package Controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author @VHSkirik
 */
public class ConvertTime {

    public static ConvertTime getInstance() {
        return new ConvertTime();
    }

    public static String changeToYMD(String dateString) {
        try {
            SimpleDateFormat formatter;
            if (dateString.trim().contains("-")) {
                formatter = new SimpleDateFormat("dd-MM-yyyy");
            } else if (dateString.trim().contains("/")) {
                formatter = new SimpleDateFormat("dd/MM/yyyy");
            } else {
                return null;
            }
            //kiem duyet cao
            formatter.setLenient(false);
            Date tmp = formatter.parse(dateString);
            return new SimpleDateFormat("yyyy-MM-dd").format(tmp);
        } catch (ParseException e) {
            return null;
        }
    }
    
    public static String changeToDMY(String dateString) {
        try {
            SimpleDateFormat formatter;
            if (dateString.trim().contains("-")) {
                formatter = new SimpleDateFormat("yyyy-MM-dd");
            } else if (dateString.trim().contains("/")) {
                formatter = new SimpleDateFormat("yyyy/MM/dd");
            } else {
                return null;
            }
            formatter.setLenient(false);
            Date tmp = formatter.parse(dateString);
            return new SimpleDateFormat("dd-MM-yyyy").format(tmp);
        } catch (ParseException e) {
            return null;
        }
    }
}
