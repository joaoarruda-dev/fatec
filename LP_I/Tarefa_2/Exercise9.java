package Tarefa_2;

import java.util.Scanner;

public class Exercise9 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para cálculo de maçã");
            System.out.println("------------------------------------");
            System.out.println("Informe quantidade de maçãs:");
            double macaQtd = read.nextInt();
            double macaValor = macaQtd >= 12 ? macaQtd : macaQtd * 1.3;
            System.out.println("------------------------------------");
            System.out.printf("O preço da maçã sairá a R$%.2f\n", macaValor);
        } finally {
            read.close();
        }
    }
}
