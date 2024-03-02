package Tarefa_2;

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para conversão de graus Celsius para Fahrenheit:");
            System.out.println("------------------------------------");
            System.out.println("Informe o valor em ºC");
            double c = read.nextDouble(); 
            double f = (c * 1.8) + 32; 
            System.out.println("------------------------------------");
            System.out.printf("%.2fºC = %.2fºF\n",c,f);

        } finally {
            read.close();
        }

    }
}
