package Tarefa_2;

import java.util.Scanner;

public class Exercise8 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para mostrar se é positivo ou negativo");
            System.out.println("------------------------------------");
            System.out.println("Informe um valor");
            int valor = read.nextInt();
            String resposta = valor >= 0  ? "positivo" : "negativo ";
            System.out.println("------------------------------------");
            System.out.println(valor + " é " + resposta);

        } finally {
            read.close();
        }
    }
}
