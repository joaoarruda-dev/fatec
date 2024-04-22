package com.fatec.e1_forms;

public class Carro {
    private String cor;
    private String modelo;
    private String fabricante;
    private double preco;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String trocarMarcha(String marcha) {
        return("Trocando para a marcha: " + marcha);
    }

    public String freiar() {
        return("Freiando...");
    }

    public String andar() {
        return ("Andando...");
    }
}
