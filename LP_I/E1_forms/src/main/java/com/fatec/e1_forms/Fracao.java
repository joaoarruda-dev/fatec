package com.fatec.e1_forms;

import java.util.List;

public class Fracao {
    private int denominador;
    private int numerador;

    public int getDenominador() {
        return denominador;
    }

    public void setDenominador(int denominador) {
        this.denominador = denominador;
    }

    public int getNumerador() {
        return numerador;
    }

    public void setNumerador(int numerador) {
        this.numerador = numerador;
    }

    public Fracao(int numerador, int denominador) {
        if (denominador == 0) {
            throw new IllegalArgumentException("O denominador não pode ser zero.");
        }
        this.numerador = numerador;
        this.denominador = denominador;
        simplificar();
    }

    public Fracao adicionar(Fracao outra) {
        int novoDenominador = this.denominador * outra.denominador;
        int novoNumerador = (this.numerador * outra.denominador) + (outra.numerador * this.denominador);
        return new Fracao(novoNumerador, novoDenominador);
    }

    public Fracao subtrair(Fracao outra) {
        int novoDenominador = this.denominador * outra.denominador;
        int novoNumerador = (this.numerador * outra.denominador) - (outra.numerador * this.denominador);
        return new Fracao(novoNumerador, novoDenominador);
    }


    public Fracao multiplicar(Fracao outra) {
        int novoNumerador = this.numerador * outra.numerador;
        int novoDenominador = this.denominador * outra.denominador;
        return new Fracao(novoNumerador, novoDenominador);
    }


    public Fracao dividir(Fracao outra) {
        if (outra.numerador == 0) {
            throw new ArithmeticException("Não é possível dividir por zero.");
        }
        int novoNumerador = this.numerador * outra.denominador;
        int novoDenominador = this.denominador * outra.numerador;
        return new Fracao(novoNumerador, novoDenominador);
    }


    public void simplificar() {
        int gcd = gcd(numerador, denominador);
        numerador /= gcd;
        denominador /= gcd;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}
