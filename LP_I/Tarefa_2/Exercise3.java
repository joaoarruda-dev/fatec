package Tarefa_2;

import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para cálculo de aumento de salário");
            System.out.println("------------------------------------");
            System.out.printf("Informe o salário do funcionário:\n");
            double salario = read.nextDouble();
            System.out.printf("Informe o a percentual de reajuste:\n");
            double aumento = read.nextInt();
            double porcentagemAumento = aumento/100;
            double aumentoSalario = salario + (salario*porcentagemAumento);
            System.out.println("------------------------------------");
            System.out.printf("Salário anterior: %.2f\n", salario);
            System.out.printf("Salário aumentado: %.2f\n", aumentoSalario);

        }finally{
            read.close();
        }
    }
}
