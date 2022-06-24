import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int x = sc.nextInt();
            sc.nextLine();
            String s1 = sc.nextLine();
            String s2 = sc.nextLine();
            String s3 = sc.nextLine();

            // Temos que colocar o nextLine() após o nextInt() pelo fato da quebra de linha ficar pendente,
            // ou seja, quando digitamos ENTER, fica uma quebra de linha pendente e é absorvida pelo
            // próximo nextLine(), que ficaria com uma string vazia nele. E é um erro.
            // Para resolver isso colocamos um nextLine() após o nextint() para absorver essa
            // quebra de linha.

            System.out.println("Dados digitados:");
            System.out.println(x);
            System.out.println(s1);
            System.out.println(s2);
            System.out.println(s3);

            sc.close();
        }
}
