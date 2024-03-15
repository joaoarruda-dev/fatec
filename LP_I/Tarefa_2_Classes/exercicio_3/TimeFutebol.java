package Tarefa_2_Classes.exercicio_3;

public class TimeFutebol {
    private String nome;
    private String pais;
    private int torcedores;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getTorcedores() {
        return torcedores;
    }

    public void setTorcedores(int torcedores) {
        this.torcedores = torcedores;
    }

    public void torcer() {
        System.out.println("Vai " + nome + "!!!!!");
    }

    public void escalarJogador(String nomeJogador) {
        System.out.println("Escalando " + nomeJogador + " para a partida...");
    }

    public void jogarPartida(String adversario) {
        System.out.println("Caros amigos da Fatec SJC");
        System.out.println("Jogo amistoso entre " + nome + "x" + adversario);
        System.out.println("Quem será que ganha ? ");
    }
}
