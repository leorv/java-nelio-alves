import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String x;
        System.out.println("Digite um texto sem espaços: ");
        x = sc.next(); // recebe texto sem espaço

        System.out.println("Você digitou " + x);

        int y;
        System.out.println("Digite um inteiro: ");
        y = sc.nextInt(); // inteiro
        System.out.println("Você digitou " + y);

        double z;
        System.out.println("Digite um double: ");
        z = sc.nextDouble(); // ponto flutuante
        System.out.println("Você digitou " + z);

        // Por padrão, ele pega o separador de decimal do sistema.
        // Se quisermos fazer ele pegar somente o ponto, temos que dar esse comando:
        // Locale.setDefault(Locale.US);

        double a;
        System.out.println("Digite um double: ");
        a = sc.nextDouble();
        System.out.printf("Você digitou %.2f%n", a); // Imprimir com a vírgula e não com o ponto.

        // Para ler um caractere
        char b;
        System.out.println("Digite um char: ");
        b = sc.next().charAt(0);
        System.out.println("Você digitou " + b);

        // Dados separados por um espaço
        System.out.println("Digite seu nome e sua idade, separados por um espaço.");
        String nome;
        int idade;
        nome = sc.next();
        idade = sc.nextInt();
        System.out.println("Você digitou: " + nome + " " + idade);

        sc.close();
    }
}