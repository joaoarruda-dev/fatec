package Tarefa_2;

import java.util.Scanner;

public class Exercise11 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para saber se pode votar");
            System.out.println("------------------------------------");

            System.out.printf("o ano de nascimento:\n");
            int anoNasc = read.nextInt();

            System.out.printf("o ano atual:\n");
            int anoAtual = read.nextInt();

            System.out.println((anoAtual - anoNasc) < 16 ? "Não pode votar" : "Pode votar");
        } finally {
            read.close();
        }
    }
}
