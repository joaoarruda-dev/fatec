package Tarefa_2_Classes.exercicio_3;

public class Celular {
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

    public void ligar() {
        System.out.println("Ligando celular...");
    }

    public void desligar() {
        System.out.println("desligando celular...");
    }

    public void adicionarContato(String nome, String numero) {
        System.out.println("Salvando número: " + numero);
        System.out.println("Contato " + nome + " adicionado");
    }
}
