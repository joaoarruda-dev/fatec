package Tarefa_2_Classes.exercicio_3;

public class Flor {
    private String nome;
    private String cor;
    private String especie;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void cheirar() {
        System.out.println("Cheirando flor...");
    }

    public void colher() {
        System.out.println("Colhendo flor " + nome);
    }

    public void plantar() {
        System.out.println("Plantando flor " + nome + " da espécie " + especie + " da cor" + cor);
    }
}
