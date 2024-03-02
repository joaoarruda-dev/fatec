package Tarefa_2;

import java.util.Scanner;

/**
 * Exercise13
 */
public class Exercise13 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para colocar em ordem crescente");
            System.out.println("------------------------------------");

            System.out.printf("o primeiro valor:\n");
            int valor1 = read.nextInt();

            System.out.printf("o segundo valor:\n");
            int valor2 = read.nextInt();

            int aux; 

            if(valor2 > valor1) {
                aux = valor1; 
                valor1 = valor2;
                valor2 = aux;
            }

            System.out.println("Valores: " + valor1 + ", " + valor2);
        } finally {
            read.close();
        }
    }
}