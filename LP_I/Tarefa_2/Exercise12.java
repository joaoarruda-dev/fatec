package Tarefa_2;

import java.util.Scanner;

public class Exercise12 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para saber qual numero é maior");
            System.out.println("------------------------------------");

            System.out.printf("o primeiro valor:\n");
            int valor1 = read.nextInt();

            System.out.printf("o segundo valor:\n");
            int valor2 = read.nextInt();

            int maiorValor = Math.max(valor1, valor2);

            System.out.println("O maior valor é: " + maiorValor);
        } finally {
            read.close();
        }
    }
}
