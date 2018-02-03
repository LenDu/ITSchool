package localisation;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Lena on 1/21/2018.
 */
public class Main2 {
    public static void main(String[] args) {
        DateFormat format = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.ENGLISH);
        DateFormat format1 = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru"));
        System.out.println(format.format(new Date()));
        System.out.println(format1.format(new Date()));

        DateFormat df = DateFormat.getDateInstance(DateFormat.MEDIUM, Locale.US);
        String str = "April 9, 2012";
        Date d = null;
        try {
            d = df.parse(str);
            System.out.println(d);
        }catch (ParseException e){
            System.err.print("Error position: " + e.getErrorOffset());
        }
        df = DateFormat.getDateInstance(DateFormat.LONG, new Locale("ru", "RU"));
        System.out.println(df.format(d));
        df = DateFormat.getDateInstance(DateFormat.FULL, Locale.GERMAN);
        System.out.println(df.format(d));
    }
}
