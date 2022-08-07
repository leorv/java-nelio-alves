import models.Rectangle;

import java.util.Scanner;

/* Exercício 1
Fazer um programa para ler os valores da largura e altura de um trigângulo. Em seguida, mostrar na tela
o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto. */

public class Exercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.println("Enter rectangle width and height:");
        rectangle.setWidth(sc.nextDouble());
        rectangle.setHeight(sc.nextDouble());

        System.out.printf("Área: %.2f%n", rectangle.area());
        System.out.printf("Perímetro: %.2f%n", rectangle.perimetro());
        System.out.printf("Diagonal: %.2f%n", rectangle.diagonal());

        sc.close();
    }
}