

public class Main {
    public static void main(String[] args) {
        // área de um trapézio
        double b, B, h, area;
        b = 6.0;
        B = 8.0;
        h = 5.0;
        area = (b + B) / 2.0 * h;
        System.out.println(area);

        int a, b2;
        double resultado;
        a = 5;
        b2 = 2;
        resultado = a / b2;
        System.out.println(resultado); // resultado dá 2.
        // O compilador entende que é uma expressão entre números inteiros e dá o resultado em inteiro.
        // Para ele não truncar as casas decimais, colocamos o (double).
        resultado = (double) a / b2;
        System.out.println(resultado); // resultado dá 2.5.
    }
}