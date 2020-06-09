package homeWork;

public class Utils {

    final private static double vatPercent;

    static {
        vatPercent=17;
    }

    public static double priceWithoutVat(double price) {
        double vat = vatPercent / 100;
        return price / (1 + vat);
    }
}


