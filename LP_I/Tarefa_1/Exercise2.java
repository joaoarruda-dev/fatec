package Tarefa_1;

public class Exercise2 {
    public static void main(String[] args) {
        double jan = 15000;
        double fev = 23000;
        double mar = 17000;
        double total = jan + fev + mar;

        System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
        System.out.println("------------------------------------");
        System.out.println("Sistema para cálculo de despesas trimestrais");
        System.out.println("------------------------------------");
        System.out.printf("Janeiro: R$%.2f \nFevereiro: R$%.2f\nMarço: R$%.2f\n", jan, fev, mar);
        System.out.println("------------------------------------");
        System.out.printf("Total: R$%.2f \nMédia de gastos mensais: %.2f\n", total, ((double) total/3));
        System.out.println("------------------------------------");

    }

}
