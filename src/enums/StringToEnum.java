package enums;

/**
 * Created by Lena on 12/23/2017.
 */
public class StringToEnum {
    private enum Currency {USD, AUD, GBP, EURO}

    public static void main(String[] args) {
        String usd = "USD";

        Enum currency = Enum.valueOf(Currency.class, usd); //
        currency = Currency.valueOf(usd);
        System.out.println("String to Enum Example: " + currency);
        String INR = "INR";
        Currency rupee = Currency.valueOf("INR");
    }
}
