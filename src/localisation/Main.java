package localisation;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Currency;
import java.util.Locale;
import java.util.stream.Stream;

/**
 * Created by Lena on 1/20/2018.
 */
public class Main {
    public static void main(String[] args) {

        Locale locale = Locale.getDefault();//получить текущую локаль
        System.out.println(locale);

        Locale.setDefault(Locale.CHINA); //установить другую локаль для текущего инстанса
        locale = Locale.getDefault();
        System.out.println(locale);


        NumberFormat nfGe = NumberFormat.getInstance(Locale.GERMANY);
        NumberFormat nfUs = NumberFormat.getInstance(Locale.US);
        NumberFormat nfFr = NumberFormat.getInstance(Locale.FRANCE);
        double iGe = 0, iUs = 0, iFr = 0;
        String str = "1.234,5"; //строк представляющая число
        try {
            //преобразование строки в германский формат
            iGe = nfGe.parse(str).doubleValue();
            //преобразование строки в американский формат
            iUs = nfUs.parse(str).doubleValue();
            //преобразование строки во французкий формат
            iFr = nfFr.parse(str).doubleValue();
        } catch (ParseException e) {
            System.err.print("Error position: " + e.getErrorOffset());
        }
        System.out.printf("iGe = %f\niUS = %f\niFr = %f", iGe, iUs, iFr);
        //преобразование числа из германского в американский формат
        String sUs = nfUs.format(iGe);
        //преобразование числа из германского во франзузкий формат
        String sFr = nfFr.format(iGe);
        System.out.println("\nUs " + sUs + "\nFr " + sFr);

    }
}
