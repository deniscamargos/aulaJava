package br.digitalHouse.objetosJava;

public class Animal {

    private String nomeAnimal;
    private String raca;
    private int idade;
    private String cor;
    private Pessoa donoAnimal;

    //Construtor especifico
    public Animal(String novoNomeAnimal){
        nomeAnimal = novoNomeAnimal;

    }
    //construtor padrao
    public Animal(){

    }
    // acesso get
    public String getNomeAnimal(){
        return nomeAnimal;
    }

    public int getIdade(){
        return idade;
    }
    public String getRaca(){
        return raca;
    }
    public String getCor(){
        return cor;
    }
    public Pessoa getDonoAnimal(){
        return donoAnimal;
    }

    //set
    public void setNomeAnimal(String novoNomeAnimal){
        nomeAnimal = novoNomeAnimal;
    }
    public void setIdade(int novaIdade){
        idade = novaIdade;
    }
    public void setRaca(String novaRaca){
        raca =novaRaca;
    }
    public void setCor(String novaCor){
        cor = novaCor;
    }
    public void setDonoAnimal (Pessoa novoDonoAnimal){
        donoAnimal = novoDonoAnimal;
    }
    public void brincar(){
        System.out.println("O animal está brincando");
    }

}
