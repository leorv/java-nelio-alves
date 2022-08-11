import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa para ler o nome de um aluno e as três notas que ele obteve nos três trimestres do ano
 * (primeiro trimestre vale 30 e o segundo e terceiro valem 35 cada). Ao final, mostrar qual a nota final do aluno no
 * ano. Dizer também se o aluno está aprovado (PASS) ou não (FAILED) e, em caso negativo, quantos pontos faltam
 * para o aluno obter o mínimo para ser aprovado (que é 60% da nota). Você deve criar uma classe Student para
 * resolver este problema.
 */

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        Locale.setDefault(Locale.US);
        sc.useLocale(Locale.US);

        System.out.println("Digite o nome do aluno:");
        student.name = sc.nextLine();
        System.out.println("Digite a nota 1 (0 a 100):");
        student.nota1 = sc.nextDouble();
        System.out.println("Digite a nota 2 (0 a 100):");
        student.nota2 = sc.nextDouble();
        System.out.println("Digite a nota 3 (0 a 100):");
        student.nota3 = sc.nextDouble();

        double notaFinal = student.notaFinal();

        System.out.printf("A nota final do aluno %s é: %.2f%n", student.name, notaFinal);
        if (notaFinal < 60) {
            System.out.println("FAILED");
            double faltamPontos = 60 - notaFinal;
            System.out.printf("Faltam %.2f pontos para alcançar a nota desejada para aprovação.%n", faltamPontos);
        } else {
            System.out.println("PASS");
        }

        sc.close();
    }
}
