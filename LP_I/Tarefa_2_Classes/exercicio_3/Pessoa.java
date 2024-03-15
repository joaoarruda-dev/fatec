package Tarefa_2_Classes.exercicio_3;

public class Pessoa {
    private String nome;
    private String sexo;
    private String idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public void falar(String texto) {
        System.out.println(nome+" falou:" + texto);
    }

    public void andar(){
        System.out.println(nome + " está andando...");
    }

    public void correr(){
        System.out.println(nome + " está correndo...");
    }

}
