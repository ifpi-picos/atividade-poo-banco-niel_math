package br.edu.ifpi.dominio;

public class Corrente extends Conta {
    private double chequeEs;

    public Corrente(int numeroAg, int numeroCo, double saldo, Cliente cliente1, double chequeEs) {
        super(numeroAg, numeroCo, saldo, cliente1);
        this.chequeEs = chequeEs;
    }

    @Override
    public void sacar(double valor) {
        if (this.getSaldo() < valor);
    }
}
