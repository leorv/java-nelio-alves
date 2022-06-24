import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
        // "Sao Multiplos" ou "Nao sao
        // Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os
        // números devem poder ser digitados em ordem crescente ou decrescente.

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b ) {
            if (a % b != 0){
                System.out.println("Nao sao multiplos");
            }
            else {
                System.out.println("Sao multiplos");
            }
        }
        else {
            if (b % a != 0) {
                System.out.println("Nao sao multiplos");
            } else {
                System.out.println("Sao multiplos");
            }
        }

        sc.close();

    }
}
