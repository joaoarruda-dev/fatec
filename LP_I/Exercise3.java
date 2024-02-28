import java.util.Scanner; // 1. importando a classe Scanner

public class Exercise3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            double P1, E1, E2, API, X, SUB;
            System.out.printf("Informe o valor da P1 do aluno:\n");
            P1 = read.nextDouble();
            read.nextLine();

            System.out.printf("Informe o valor da E1 do aluno:\n");
            E1 = read.nextDouble();
            read.nextLine();

            System.out.printf("Informe o valor da E2 do aluno:\n");
            E2 = read.nextDouble();
            read.nextLine();

            System.out.printf("Informe o valor da API do aluno:\n");
            API = read.nextDouble();
            read.nextLine();

            System.out.printf("Informe o valor do X do aluno:\n");
            X = read.nextDouble();
            read.nextLine();

            System.out.printf("Informe o valor da SUB do aluno:\n");
            SUB = read.nextDouble();
            read.nextLine();

            double nota = (P1 * 0.6 + ((E1 + E2) / 2) * 0.4) * 0.5
                    + (Math.max(((P1 * 0.6 + ((E1 + E2) / 2) * 0.4) - 5.9), 0)
                            / ((P1 * 0.6 + ((E1 + E2) / 2) * 0.4) - 5.9)) * (API * 0.5)
                    + X + (SUB * 0.2);

            System.out.println("------------------------------------");

            System.out.printf("Nota do aluno:%.2f\n", nota);
        } finally {
            read.close();
        }
    }
}
