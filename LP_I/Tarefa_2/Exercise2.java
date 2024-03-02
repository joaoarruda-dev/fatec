package Tarefa_2;

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para cálculo eleitoral");
            System.out.println("------------------------------------");
            System.out.printf("Informe a quantidade total de eleitores:\n");
            double totalEleitores = read.nextInt();
            System.out.printf("Informe a quantidade votos brancos:\n");
            double votosBrancos = read.nextInt();
            System.out.printf("Informe a quantidade votos nulos:\n");
            double votosNulos = read.nextInt();
            System.out.printf("Informe a quantidade votos válidos:\n");
            double votosValidos = read.nextInt();
            System.out.println("------------------------------------");
            System.out.printf("Total de eleitores: %.0f\n", totalEleitores);

            System.out.printf("Porcentagem total de votos brancos: %.2f\n", ((votosBrancos/totalEleitores)*100));
            System.out.printf("Porcentagem total de votos nulos: %.2f\n", ((votosNulos/totalEleitores)*100));
            System.out.printf("Porcentagem total de votos válidos: %.2f\n", ((votosValidos/totalEleitores)*100));

        } finally {
            read.close();
        }
    }
}
