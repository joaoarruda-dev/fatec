package Tarefa_2_Classes.exercicio_5;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        boolean isWorking = true;
        double resultado = 0;
        Scanner read = new Scanner(System.in);
        try {
            while (isWorking) {
                System.out.println("-----------------------------------");
                System.out.println("Selecione uma opção: ");
                System.out.println("1 - soma ");
                System.out.println("2 - subtração");
                System.out.println("3 - divisão");
                System.out.println("4 - multiplicação");
                System.out.println("5 - limpar resultado");
                System.out.println("0 - sair e mostrar resultado");
                System.out.println("-----------------------------------");

                String opcao = read.next();

                Fracao fr = new Fracao();

                switch (opcao) {
                    case "0":
                        isWorking = false;
                        System.out.println("-----------------------------------");
                        System.out.println("Seu resultado final é " + resultado);
                        System.out.println("Finalizando programa...");
                        System.out.print("-----------------------------------");
                        break;
                    case "1":
                        System.out.println("-----------------------------------");
                        System.out.println("Informe o numerador: ");
                        fr.setNumerador(read.nextDouble());
                        System.out.println("Informe o denominador: (digite 1 caso seja inteiro)");
                        fr.setDenominador(read.nextDouble());
                        double soma = fr.setFracao(fr.getNumerador(), fr.getDenominador());
                        resultado = resultado + soma;
                        System.out.println("Seu resultado até agora é " + resultado);
                        break;
                    case "2":
                        System.out.println("-----------------------------------");
                        System.out.println("Informe o numerador: ");
                        fr.setNumerador(read.nextDouble());
                        System.out.println("Informe o denominador: (digite 1 caso seja inteiro)");
                        fr.setDenominador(read.nextDouble());
                        resultado = resultado - fr.setFracao(fr.getNumerador(), fr.getDenominador());
                        System.out.println("Seu resultado até agora é " + resultado);
                        break;
                    case "3":
                        System.out.println("-----------------------------------");
                        System.out.println("Informe o numerador: ");
                        fr.setNumerador(read.nextDouble());
                        System.out.println("Informe o denominador: (digite 1 caso seja inteiro)");
                        fr.setDenominador(read.nextDouble());
                        resultado = resultado / fr.setFracao(fr.getNumerador(), fr.getDenominador());
                        System.out.println("Seu resultado até agora é " + resultado);
                        break;
                    case "4":
                        System.out.println("-----------------------------------");

                        System.out.println("Informe o numerador: ");
                        fr.setNumerador(read.nextDouble());
                        System.out.println("Informe o denominador: (digite 1 caso seja inteiro)");
                        fr.setDenominador(read.nextDouble());
                        resultado = resultado * fr.setFracao(fr.getNumerador(), fr.getDenominador());
                        System.out.println("Seu resultado até agora é " + resultado);
                        break;
                    case "5":
                        System.out.println("-----------------------------------");
                        System.out.println("Limpando resultado...");
                        resultado = 0;
                        break;
                    default:
                        System.out.println("Erro! Voltando a seleção de opções novamente!");
                        break;
                }
                System.out.println("-----------------------------------");

            }
        } finally {
            read.close();
        }
    }
}
