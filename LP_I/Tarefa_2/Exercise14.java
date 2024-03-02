package Tarefa_2;

import java.util.Scanner;

public class Exercise14 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para calcular tempo de jogo de xadrez");
            System.out.println("------------------------------------");

            System.out.printf("Informe a hora de inicio do jogo:\n");
            int horaInicio = read.nextInt();

            System.out.printf("Informe a hora do fim do jogo:\n");
            int horaFim = read.nextInt();

            int duracaoJogo;

            if (horaFim > horaInicio) {
                duracaoJogo = horaFim - horaInicio;
            } else {
                duracaoJogo = (24 - horaInicio) + horaFim;
            }

            System.out.println("Duração de jogo: " + duracaoJogo + "h");
        } finally {
            read.close();
        }
    }
}
