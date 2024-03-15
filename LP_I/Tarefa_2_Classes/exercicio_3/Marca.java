package Tarefa_2_Classes.exercicio_3;

public class Marca {
    private String nome;
    private double valorMercado;
    private String paisMarca;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorMercado() {
        return valorMercado;
    }

    public void setValorMercado(double valorMercado) {
        this.valorMercado = valorMercado;
    }

    public String getPaisMarca() {
        return paisMarca;
    }

    public void setPaisMarca(String paisMarca) {
        this.paisMarca = paisMarca;
    }

    public void mostrarMarca(String nomeMarca) {
        System.out.print("A marca do país " + paisMarca + ", " + nome + " ");
        System.out.printf("possui o valor de mercado de R$.2fMM", valorMercado);
    }

    public void mostrarAreaSegmento(String segmento) {
        System.out.print("A marca " + nome + " é do segmento de " + segmento);
    }

    public boolean marcaInternacional(String paisMarca) {
        return paisMarca == "Brasil" || paisMarca == "Brazil";
    }
}
