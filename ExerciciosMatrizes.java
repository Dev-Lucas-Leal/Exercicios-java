package org.yourcompany.yourproject;

//Autor: Lucas Leal Vieira.
//Docente: Professor Thyago Maia.
//Disciplina: Programação Orientada a Objetos.

import java.util.Scanner;

public class ExerciciosMatrizes {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        /*  Faça um programa em Java que lê 9 números inteiros em
            um matriz 3x3. Em seguida, o programa deverá escrever
            cada número e sua posição na matriz; */
        
        int matriz[][] = new int[3][3];
        System.out.println("Digite 9 numeros inteiros para a matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o numero da posicao [" + i + "][" + j + "]: ");
                matriz[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Os numeros digitados e suas posicoes sao:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Numero: " + matriz[i][j] + " Posicao: [" + i + "][" + j + "]");
            }
        }


        /*  Faça um programa em Java que possua uma matriz 4x4 que
            receberá em cada posição uma letra. Fazer com que o
            programa leia cada caractere e, após as leituras, escreva a
            palavra ou frase formada por cada letra da matriz. */

        char matrizChar[][] = new char[4][4];
        System.out.println("Digite 16 letras para a matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Digite a letra da posicao [" + i + "][" + j + "]: ");
                matrizChar[i][j] = entrada.next().charAt(0);
            }
        }
        System.out.println("A palavra ou frase formada pela matriz é:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrizChar[i][j]);
            }
        }
        System.out.println(); 


        /*  Faça um programa em Java que irá possuir 2 matrizes 3x3.
            As mesmas irão receber valores inteiros digitados pelo
            usuário. O programa deverá calcular e exibir a soma entre
            os valores das duas matrizes */

        int matriz1[][] = new int[3][3];
        int matriz2[][] = new int[3][3];
        System.out.println("Digite os valores da primeira matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o numero da posicao [" + i + "][" + j + "]: ");
                matriz1[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Digite os valores da segunda matriz 3x3:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o numero da posicao [" + i + "][" + j + "]: ");
                matriz2[i][j] = entrada.nextInt();
            }
        }
        System.out.println("A soma das duas matrizes é:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz1[i][j] + matriz2[i][j] + " ");
            }
            System.out.println();
        }


        /*  Faça um programa que armazena valores inteiros em uma
            matriz (2,3). A seguir, calcula e exibe a média dos valores
            positivos contidos na matriz. */

        int matriz3[][] = new int[2][3];
        int soma = 0;
        int count = 0;
        System.out.println("Digite os valores da matriz 2x3:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Digite o numero da posicao [" + i + "][" + j + "]: ");
                matriz3[i][j] = entrada.nextInt();
                if (matriz3[i][j] > 0) {
                    soma += matriz3[i][j];
                    count++;
                }
            }
        }
        if (count > 0) {
            double media = (double) soma / count;
            System.out.println("A média dos valores positivos é: " + media);
        } else {
            System.out.println("Não há valores positivos na matriz.");
        }

        /*  Faça um programa que lê valores inteiros em uma matriz
            (2,2). O programa deverá encontrar o maior valor contido
            na matriz e sua posição. */

        int matriz4[][] = new int[2][2];
        int maior = Integer.MIN_VALUE;
        int posicaoMaiorLinha = -1;
        int posicaoMaiorColuna = -1;
        System.out.println("Digite os valores da matriz 2x2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print("Digite o numero da posicao [" + i + "][" + j + "]: ");
                matriz4[i][j] = entrada.nextInt();
                if (matriz4[i][j] > maior) {
                    maior = matriz4[i][j];
                    posicaoMaiorLinha = i;
                    posicaoMaiorColuna = j;
                }
            }
        }
        System.out.println("O maior valor da matriz é: " + maior);
        System.out.println("Posição do maior valor: [" + posicaoMaiorLinha + "][" + posicaoMaiorColuna + "]");
          
    }
    
}
