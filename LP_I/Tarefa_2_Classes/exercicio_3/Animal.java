package Tarefa_2_Classes.exercicio_3;

public class Animal {
    private String especie;
    private String nome;
    private double peso;

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void emitirSom(String tipoSom) {
        System.out.println("O " + nome + " emite o seguinte som: " + tipoSom);
    }

    public void descreverAnimal() {
        System.out.println("O " + nome + " é da espécie " + especie + " com o peso de " + peso + " kg");
    }

    public void mostrarAnimais() {
        System.out.println("Mostrando o belo animal " + nome);
    }
}
