package br.digitalHouse.novoObjetosJava;

public class Conta {
    //atributos
    private int numeroDaConta;
    private float saldo;
    private Cliente titular;

    //Construtor especifico
    public Conta(int novoNumeroDaConta){
        numeroDaConta= novoNumeroDaConta;
        }

    // acesso get
    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    //metodo
        public float deposito(valorDeposito){
        saldo = saldo + valorDeposito;
        System.out.println(saldo);
    }
    public float saque(){

    }

}
