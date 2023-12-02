package SLogic;

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
        if (dateString == null) {
            return null;
        }
        try {
            SimpleDateFormat formatter;
            if (dateString.trim().contains("-")) {
                formatter = new SimpleDateFormat("dd-MM-yyyy");
            } else {
                return null;
            }
            //kiem duyet cao
            formatter.setLenient(false);
            Date tmp = formatter.parse(dateString);
            return new SimpleDateFormat("yyyy-MM-dd").format(tmp);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String changeToDMY(String dateString) {
        if (dateString == null) {
            return null;
        }
        try {
            SimpleDateFormat formatter;
            if (dateString.trim().contains("-")) {
                formatter = new SimpleDateFormat("yyyy-MM-dd");
            } else {
                return null;
            }
            formatter.setLenient(false);
            Date tmp = formatter.parse(dateString);
            return new SimpleDateFormat("dd-MM-yyyy").format(tmp);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String changeToYMDTime(Date input) {
        String rsText = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss").format(input);
        return rsText;
    }

    public static String changeToDMYTime(Date input) {
        String rsText = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(input);
        return rsText;
    }

    public static String toString(Date date) {
        String datesString = new SimpleDateFormat("yyyy-MM-dd").format(date);
        return datesString;
    }

    public static Date toDate(String dateString) {
        try {
            return new SimpleDateFormat("dd-MM-yyyy").parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public static void main(String[] args) {
        String dateString = "8-5-2002";
        Date date = toDate(dateString);
        System.out.println(date);
    }
}
