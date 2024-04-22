package com.fatec.e1_forms;

public class Cerveja {
    private String nome;
    private double quantidade;
    private String fabricante;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
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

    public String abrir() {
        return("Abrindo cerveja...");
    }

    public String beber() {
        return("Bebendo cerveja...");
    }

    public String adicionarAoCopo(double quantidade){
        return("Adicionando "+quantidade+"ml ao copo...");
    }
}
