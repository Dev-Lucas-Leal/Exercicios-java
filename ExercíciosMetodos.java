package org.yourcompany.yourproject;

//Autor: Lucas Leal Vieira.
//Docente: Professor Thyago Maia.
//Disciplina: Programação Orientada a Objetos.

import java.util.Scanner;

public class ExercíciosMetodos {
   public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        /*   Faça um programa que lê os lados de um retângulo
             e calcula o seu perímetro em um método;
–            Perímetro do retângulo = (2*largura) + (2*comprimento) 
             utilizando Método*/

        System.out.println("Digite a largura do retângulo: ");
        double largura = entrada.nextDouble();
        System.out.println("Digite o comprimento do retângulo: ");
        double comprimento = entrada.nextDouble();
        double perimetro = calcularPerimetro(largura, comprimento);
        System.out.println("O perímetro do retângulo é: " + perimetro);
    }

    public static double calcularPerimetro(double largura, double comprimento) {
        return (2 * largura) + (2 * comprimento);
    

    /*  Faça um programa que receba dois números e
        mostre o maior número digitado;
        Para checar o maior número, implemente um método
        com parâmetro e com retorno em uma classe secundária */
    
    
    }
}
