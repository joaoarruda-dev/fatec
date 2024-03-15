package Tarefa_2_Classes.exercicio_4;

import Tarefa_2_Classes.exercicio_3.*;

public class TestaClasse {
    public static void main(String[] args) {

        //TESTE ANIMAL
        Animal animal = new Animal();
        animal.setNome("cachorro");
        animal.setEspecie("canina");
        animal.setPeso(18);

        animal.descreverAnimal();
        animal.emitirSom("latido");

        System.out.println("---------------------------");

        //TESTE CAMISA
        Camisa camisa = new Camisa(); 
        camisa.setCor("vermelha");
        camisa.setPreco(29.9);
        camisa.setTamanho("M");

        camisa.comprarCamisa(29);
        camisa.descreverCamisa();
        camisa.mostrarCamisa();


        System.out.println("---------------------------");

        //TESTE CARRO
        Carro carro = new Carro(); 
        carro.setCor("preto");
        carro.setFabricante("Toyota");
        carro.setModelo("Prios");
        carro.setPreco(290000);

        carro.andar();
        carro.freiar();
        carro.trocarMarcha("R");


        System.out.println("---------------------------");

        //TESTE CELULAR
        Celular celular = new Celular(); 
        celular.setModelo("iPhone 15");
        celular.setCor("Black Piano");
        celular.setFabricante("Apple");
        celular.setPreco(7999);

        celular.ligar();
        celular.adicionarContato("Prof Adriana", "(12)99999-9999");
        celular.desligar();

        System.out.println("---------------------------");

        //TESTE CERVEJA
        Cerveja cerveja = new Cerveja();
        cerveja.setFabricante("Ambev");
        cerveja.setNome("Skol");
        cerveja.setPreco(1.99);
        cerveja.setQuantidade(200);

        cerveja.abrir();
        cerveja.adicionarAoCopo(200);
        cerveja.beber();

        System.out.println("---------------------------");

        //TESTE FLOR
        Flor flor = new Flor();
        flor.setCor("vermelha");
        flor.setEspecie("Rosaceae");
        flor.setNome("Rosa");

        flor.plantar();
        flor.colher();
        flor.cheirar();

        System.out.println("---------------------------");

        //TESTE MARCA
        Marca marca = new Marca();
        marca.setNome("Apple");
        marca.setPaisMarca("EUA");
        marca.setValorMercado(2000);

        boolean isInternational = marca.marcaInternacional("EUA");
        marca.mostrarMarca("Apple");
        System.out.println(isInternational);

        System.out.println("---------------------------");

        //TESTE PAÍS
        Pais pais = new Pais(); 
        pais.setNome("Brasil");
        pais.setContinente("America do Sul");
        pais.setPopulacao(200000000);
        System.out.println(pais.compararPopulacao(pais.getPopulacao(), 180000));;

        pais.mostrarIdioma("português");

        System.out.println("---------------------------");

        //TESTE PESSOA
        Pessoa pessoa = new Pessoa(); 
        pessoa.setIdade("23");
        pessoa.setNome("João");
        pessoa.setSexo("masculino");

        pessoa.andar();
        pessoa.correr();
        pessoa.falar("Alô alô");

        System.out.println("---------------------------");

        //TESTE TIME FUTEBOL
        TimeFutebol timeFutebol = new TimeFutebol();
        timeFutebol.setNome("Corinthians");
        timeFutebol.setPais("Brasil");
        timeFutebol.setTorcedores(20000000);

        timeFutebol.escalarJogador("Ronaldo");
        timeFutebol.jogarPartida("Palmeiras");
        timeFutebol.torcer();
    }
}
