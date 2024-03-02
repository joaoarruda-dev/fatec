
package Tarefa_2;

import java.util.Scanner;

/**
 * Exercise10
 */
public class Exercise10 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para cálculo de notas do aluno");
            System.out.println("------------------------------------");
            System.out.printf("Informe o valor da M1 do aluno:\n");
            double m1 = read.nextDouble();
            read.nextLine();

            System.out.printf("Informe o valor da E1 do aluno:\n");
            double m2 = read.nextDouble();
            read.nextLine();

            double nota = (m1 + m2) / 2;
            System.out.println("------------------------------------");
            String situacao = nota >= 6 ? "APROVADO" : "REPROVADO";
            System.out.println("Situação: " + situacao);
            System.out.printf("Nota do aluno: %.2f\n", nota);
        } finally {
            read.close();
        }
    }
}