import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n1 = 89; // 0101 1001
        int n2 = 60; // 0011 1100

        System.out.println(n1 & n2); // 0001 1000 (24)
        System.out.println(n1 | n2); // 0111 1101 (125)
        System.out.println(n1 ^ n2); // 0110 0101 (101)

        // Aplicação prática: verificar o sexto bit.
        // Macete: usar uma máscara, no caso, o número 32:
        // 0010 0000
        // então (0111 0001 & 0010 0000) => 0010 0000

        int n = sc.nextInt();
        int mask = 32;
        // em binário: int mask = 0b100000;

        // para testar: 89 tem que dar 0, 113 tem que dar 1.

        if ((n & mask) != 0) {
            System.out.println("6th bit is true!");
        }
        else {
            System.out.println("6th bit is false!");
        }

        sc.close();
    }
}