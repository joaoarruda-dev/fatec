package Tarefa_2;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para cálculo de valor de carro");
            System.out.println("------------------------------------");
            double porcentagemImpostos = 0.28;
            double porcentagemCustoFabrica = 0.45;
            System.out.printf("Informe o valor do veículo :\n");
            double valorCarroFabrica = read.nextDouble();
            System.out.println("------------------------------------");
            double valorCarroTotal = valorCarroFabrica + (valorCarroFabrica * porcentagemImpostos)
                    + (valorCarroFabrica * porcentagemCustoFabrica);
            System.out.printf("Valor total do Carro: R$%.2f\n", valorCarroTotal);

        } finally {
            read.close();
        }

    }
}
