package org.yourcompany.yourproject;

//Autor: Lucas Leal Vieira.
//Docente: Professor Thyago Maia.
//Disciplina: Programação Orientada a Objetos.

import java.util.Scanner;

public class ExerciciosVetores {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        /* Exercício 1: Faça um programa em Java que lê 20 números inteiros em
           um vetor. Em seguida, o programa deverá escrever cada
           número e sua posição no vetor; */

        int numeros[] = new int[20];
        System.out.println("Digite 20 numeros inteiros:");
        for (int i = 0; i < 20; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }

        System.out.println("\nNúmeros e suas posições:");
        for (int i = 0; i < 20; i++) {
            System.out.println("Posicao " + i + ": " + numeros[i]);
        }


        /* Escreva um programa em Java que lê 10 números inteiros
           em um vetor, calcula e exibe a quantidade de números
           maiores que 5 */
        
        int numeros2[] = new int[10];
        int count = 0;
        System.out.println("\nDigite 10 numeros inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros2[i] = entrada.nextInt();
            if (numeros2[i] > 5) {
                count++;
            }
        }
        System.out.println("Quantidade de números maiores que 5: " + count);


       /* Faça um programa que leia 10 números inteiros e os
          armazena em um vetor de 10 posições. O programa deverá
          escrever na tela apenas os valores positivos do vetor;  */

        int numeros3[] = new int[10];
        System.out.println("\nDigite 10 numeros inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros3[i] = entrada.nextInt();
    }

        System.out.println("\nValores positivos do vetor:");
        for (int i = 0; i < 10; i++) {
            if (numeros3[i] > 0) {
                System.out.println("Posicao " + i + ": " + numeros3[i]);
            }
        }

   
      /* Faça um programa que leia 10 números inteiros e os
         armazena em um vetor de 10 posições. O programa deverá
         trocar todos os valores negativos do vetor por 0. Após a
         substituição, o programa deverá escrever todo o conteúdo
         do vetor na tela; */

        int numeros4[] = new int[10];
        System.out.println("\nDigite 10 numeros inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros4[i] = entrada.nextInt();
            if (numeros4[i] < 0) {
                numeros4[i] = 0;
            }
        }
        System.out.println("\nConteúdo do vetor após substituição:");
        for (int i = 0; i < 10; i++) {
            System.out.println("Posicao " + i + ": " + numeros4[i]);
        }
        entrada.close();

        /*  Faça um programa que receba 5 números reais e os
            armazena em um vetor X de 5 posições. O programa deverá
            armazenar o valor/2 de cada posição do vetor X em um
            vetor Y, também de 5 posições. No final, o programa deverá
            escrever todo o conteúdo dos vetores X e Y na tela; */

        double x[] = new double[5];
        double y[] = new double[5];
        System.out.println("\nDigite 5 números reais:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            x[i] = entrada.nextDouble();
            y[i] = x[i] / 2;
        }
        System.out.println("\nConteúdo do vetor X:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + x[i]);
        }
        System.out.println("\nConteúdo do vetor Y:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Posição " + i + ": " + y[i]);
        }

        
    }
}