package Tarefa_2_Classes.exercicio_3;

public class Pais {
    private String nome;
    private String continente;
    private int populacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public int getPopulacao() {
        return populacao;
    }

    public void setPopulacao(int populacao) {
        this.populacao = populacao;
    }

    public void mostrarIdioma(String idioma) {
        System.out.println("O país " + nome + " fala o " + idioma + " como idioma");
    }

    public void mostrarContinente() {
        System.out.println("O país " + nome + " pertence ao continente " + continente);
    }

    public boolean compararPopulacao(int pais1, int pais2) {
        return pais1 > pais2;
    }
}
