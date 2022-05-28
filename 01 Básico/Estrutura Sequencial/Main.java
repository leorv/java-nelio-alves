import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        // Saída de dados em Java

        // println
        int y = 32;
        System.out.println(y);
        System.out.println("Bom dia!");

        // printf - f => formatado
        // ponto flutuante com duas casas decimais
        double x = 10.346278;
        System.out.printf("%.2f%n", x);
        // Saída: 10,35 <= usou vírgula porque pegou a configuração do computador.

        // Quebrar linha é %n ou \n

        // Usando sempre o ponto e não a vírgula como padrão.
        // Usando Locale

        Locale.setDefault(Locale.US);
        System.out.printf("%.2f%n", x);

        // Concatenando strings
        System.out.println("Resultado = " + x + " metros");
        System.out.printf("Resultado = %.2f metros%n", x);

        String nome = "Maria";
        int idade = 31;
        double renda = 4000;
        System.out.printf("%s tem %d anos e ganha R$ %.2f %n", nome, idade, renda);

        String txt1 = "Curso de ";
        String txt2 = "Java";
        System.out.printf("Concatenando as strings, temos: %s", txt1.concat(txt2));

    }
}
