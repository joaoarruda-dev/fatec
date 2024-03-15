package Tarefa_2_Classes.exercicio_5;

public class Fracao {
    private double numerador;
    private double denominador;

    public double getNumerador() {
        return numerador;
    }

    public void setNumerador(double numerador) {
        this.numerador = numerador;
    }

    public double getDenominador() {
        return denominador;
    }

    public void setDenominador(double denominador) {
        this.denominador = denominador;
    }

    public double setFracao(double valor1, double valor2) {
        return valor1/valor2;
    }

    public double somar(double valor1, double valor2) {
        return valor1 + valor2;
    }

    public double subtrair(double valor1, double valor2) {
        return valor1 - valor2;
    }

    public double multiplicar(double valor1, double valor2) {
        return valor1 * valor2;
    }

    public double dividir(double valor1, double valor2) {
        return valor1 / valor2;
    }

}
