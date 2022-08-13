import java.util.Locale;
import java.util.Scanner;

/*
 * Faça um programa para ler a cotação em dólar, e depois um valor em dólares a ser comprado por
 * uma pessoa em reais. Informar quantos reais a pessoa vai pagar pelos dólares, considerando ainda
 * que a pessoa terá que pagar 6% de IOF sobre o valor em dólar. Criar uma classe CurrencyConverter
 * para ser responsável pelos cálculos.
 */

public class Exercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        double dolarPrice;
        double amount;

        System.out.print("What is the dolar price? ");
        dolarPrice = sc.nextDouble();
        System.out.println("How many dollars will be bought? ");
        amount = sc.nextDouble();

        System.out.printf("Amount to be paid in reais BRL: %.2f%n",
                CurrencyConverter.converterUSDBRL(dolarPrice, amount));

        sc.close();
    }
}