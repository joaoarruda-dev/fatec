package Tarefa_2_Classes.exercicio_3;

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

    public void abrir() {
        System.out.println("Abrindo cerveja...");
    }

    public void beber() {
        System.out.println("Bebendo cerveja...");
    }

    public void adicionarAoCopo(double quantidade){
        System.out.println("Adicionando "+quantidade+"ml ao copo...");
    }
}
