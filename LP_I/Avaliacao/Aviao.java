package Avaliacao;

public class Aviao {

    // metodos de acesso e construtor -OK

    // minimo de 3 atributos - OK

    // minimo de 3 metodos - OK

    private String modelo;
    private String fabricante;
    private int capacidade;

    public Aviao(String modelo, String fabricante, int capacidade) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.capacidade = capacidade;
    }

    public void decolar() {
        System.out.println("O avião está decolando");
    }

    public void pousar() {
        System.out.println("O " + this.modelo + " está pousando");
    }

    public String informacoes() {
        return "Modelo: " + modelo + " Fabricante: " + fabricante + " Capacidade: " + capacidade;
    }

    public static void main(String[] args) {
        Aviao batata = new Aviao("Boeing 747", "Boeing", 416);
        System.out.println(batata.informacoes());
        batata.decolar();
        batata.pousar();
        Aviao foker = new Aviao("Foker 100", "indeterminado", 1000);
        foker.pousar();

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

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }
}