/*
 * 
Desafio

Faça um programa que leia um valor T e preencha um vetor N[1000] com a sequência de valores de 0 até T-1 repetidas vezes, conforme exemplo abaixo. Imprima o vetor N.

Entrada
A entrada contém um valor inteiro T (2 ≤ T ≤ 50).

Saída
Para cada posição do vetor, escreva "N[i] = x", onde i é a posição do vetor e x é o valor armazenado naquela posição.

 */


import java.util.Scanner;

public class vetor {

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int t = leitor.nextInt();

    int[] vet = new int[1000];

    int aux = 0;

    for (int i = 0; i < vet.length; i++) {
      if (aux == t) {
        aux = 0;
      }
      vet[i] = aux;

      System.out.println("N[" + i + "] = " + aux);
      aux++;
    }

    leitor.close();
  }
}
