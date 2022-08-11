import java.util.Locale;
import java.util.Scanner;

/*
 * Fazer um programa ler os dados de um funcionário (nome, salário bruto e imposto). Em
 * seguida, mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o
 * salário do funcionário com base em uma porcentagem dada (somente o salário bruto é 
 * afetado pela porcentagem) e mostrar novamente os dados do funcionário. Use a classe
 * projetada.
 */

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee employee = new Employee();
        Locale.setDefault(Locale.US); // OutPut com ponto
        sc.useLocale(Locale.US); // input com ponto

        System.out.println("Digite os dados do funcionário.");

        System.out.print("Nome: ");
        employee.setName(sc.nextLine());
        System.out.print("Salário bruto: ");
        employee.setGrossSalary(sc.nextDouble());
        System.out.print("Imposto: ");
        employee.setTax(sc.nextDouble());

        System.out.printf("Funcionário: %s.%nSalário líquido: %.2f%n", employee.getName(), employee.netSalary());

        System.out.println("Digite a porcentagem para aumento do salário:");
        employee.increaseSalary(sc.nextDouble());

        System.out.printf("Funcionário: %s.%nSalário líquido: %.2f%n", employee.getName(), employee.netSalary());

        sc.close();
    }
}