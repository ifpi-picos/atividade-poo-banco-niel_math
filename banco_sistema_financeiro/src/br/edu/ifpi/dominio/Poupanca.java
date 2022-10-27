package br.edu.ifpi.dominio;

public class Poupanca extends Conta {

    private double taxa;

    public Poupanca(int numeroAg, int numeroCo, double saldo, Cliente cliente2, double taxa) {
        super(numeroAg, numeroCo, saldo, cliente2);
    }
    
}
