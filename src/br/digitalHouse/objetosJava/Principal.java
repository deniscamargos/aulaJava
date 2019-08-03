package br.digitalHouse.objetosJava;

public class Principal {

    public static void main(String[] args) {

        Animal animalMamifero = new Animal("Bidu");

        System.out.println(animalMamifero.getNomeAnimal());

        Animal animalDomestico = new Animal();

        animalDomestico.setNomeAnimal("Ted");
        System.out.println(animalDomestico.getNomeAnimal());

        Pessoa pessoaJovem = new Pessoa("Erika");
        System.out.println(pessoaJovem.getNomePessoa());

        animalDomestico.setDonoAnimal(pessoaJovem);

        System.out.println(animalDomestico.getDonoAnimal().getNomePessoa());

        Pessoa pessoaIdosa = new Pessoa("Clotilde");
        animalDomestico.setDonoAnimal((pessoaIdosa));

        System.out.println(animalDomestico.getDonoAnimal().getNomePessoa());


    }
}
