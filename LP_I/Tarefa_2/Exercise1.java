package Tarefa_2;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        try {
            System.out.println("Bem vindo aos exercícios de Linguagem de Programação 1!");
            System.out.println("------------------------------------");
            System.out.println("Sistema para cálculo de dias de vida");
            System.out.println("------------------------------------");
            System.out.println("Informe sua data de nascimento: (DD/MM/AAAA)");
            String dataNascString = read.nextLine();
            DateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
            Date dataNascFormatado = formatador.parse(dataNascString);
            long diferencaDatas =  new Date().getTime() - dataNascFormatado.getTime();
            long dias = TimeUnit.DAYS.convert(diferencaDatas, TimeUnit.MILLISECONDS);
            System.out.println ("Dias desde seu nascimento: " + dias);
        } catch (Exception e) {
            System.out.println("m=Erro no sistema: " + e);
        } finally {
            read.close();
        }
    }
}
