package Tarefa_2;

import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para cálculo de salário e comissão de venda de carros:");
            System.out.println("------------------------------------");
            System.out.println("Insira a quantidade de carros vendidos");
            double carrosVendidosQuantidade = read.nextInt();
            System.out.println("Insira o valor total de carros vendidos:");
            double carrosVendidosValor = read.nextDouble();
            System.out.println("Insira o salário fixo do funcionário");
            double salarioFixo = read.nextDouble();
            System.out.println("Insira o valor da comissão fixa: ");
            double comissaoFixa = read.nextDouble();

            double salarioFinal = salarioFixo + (carrosVendidosQuantidade * comissaoFixa)
                    + (carrosVendidosValor * 0.05);
            System.out.println("------------------------------------");
            System.out.printf("Valor final do funcionário: R$%.2f\n", salarioFinal);
        } finally {
            read.close();
        }
    }
}
