package Tarefa_2;

import java.util.Scanner;

public class Exercise15 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para calcular salário");
            System.out.println("------------------------------------");

            System.out.printf("Informe o número de horas trabalhadas:\n");
            double horasTrabalhadas = read.nextInt();

            System.out.printf("Informe o salário por hora:\n");
            double salarioHora = read.nextInt();

            double salarioFinal = horasTrabalhadas > 160
                    ? horasTrabalhadas * salarioHora + (horasTrabalhadas - 160) * 1.5
                    : horasTrabalhadas * salarioHora;

            System.out.printf("Salário final: R$%.2f\n", salarioFinal);
        } finally {
            read.close();
        }
    }
}
