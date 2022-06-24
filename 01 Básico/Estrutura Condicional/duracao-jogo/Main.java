import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
        // jogo, sabendo que o mesmo pode
        // começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e
        // máxima de 24 horas.

        int inicio = sc.nextInt();
        int termino = sc.nextInt();
        int duracao;
        if (termino > inicio){
            duracao = termino - inicio;
        }
        else if (termino == inicio){
            duracao = 24;
        }
        else {
            duracao = (24 - inicio) + termino;
        }
        System.out.printf("O jogo durou %s horas.%n", duracao);

        sc.close();

    }
}
