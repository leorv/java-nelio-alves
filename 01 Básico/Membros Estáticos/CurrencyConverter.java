
public class CurrencyConverter {
    public static final double iofTax = 0.06;

    public static double converterUSDBRL(double price, double amount){
        double brlValue = price * amount * (1 + iofTax);
        return brlValue;
    }
}
