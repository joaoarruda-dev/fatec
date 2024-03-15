package Tarefa_2_Classes.exercicio_3;

public class Camisa {
    private String cor;
    private double preco;
    private String tamanho;

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public void comprarCamisa(double precoCamisa) {
        System.out.printf("Você comprou a camisa pelo valor de R$%.2f\nPreço original: R$%.2f", precoCamisa, preco);
    }

    public void descreverCamisa() {
        System.out.println("Camisa cor: " + cor);
        System.out.println("Camisa tamanho: " + tamanho);
        System.out.printf("Preço da camisa: R$%.2f\n", preco);
    }

    public void mostrarCamisa() {
        System.out.println("Mostrando camisa...");
    }

}
