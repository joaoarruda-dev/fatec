package Tarefa_2;

import java.util.Scanner;

public class Exercise7 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para mostrar se é maior ou não que 10");
            System.out.println("------------------------------------");
            System.out.println("Informe um valor");
            int valor = read.nextInt();
            String resposta = valor > 10 ? "É MAIOR QUE 10!" : "NÃO É MAIOR QUE 10! ";
            System.out.println("------------------------------------");
            System.out.println(valor + " " + resposta);

        } finally {
            read.close();
        }
    }
}
