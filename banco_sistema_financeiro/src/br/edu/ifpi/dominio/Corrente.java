package br.edu.ifpi.dominio;

public class Corrente extends Conta {
    private double chequeEs;

    public Corrente(int numeroAg, int numeroCo, double saldo, Cliente cliente1, double chequeEs) {
        super(numeroAg, numeroCo, saldo, cliente1);
        this.chequeEs = chequeEs;
    }

    @Override
    public void sacar(double valor) {
        if (this.getSaldo() + getChequeEs() >= valor)

            ;
    }

    @Override
    public void transferir(Conta conta2, double valor) {
        super.transferir(conta2, valor);
    }

    public void setChequeEs(double chequeEs) {
        this.chequeEs = chequeEs;
    }

    public double getChequeEs() {
        return chequeEs;
    }

    public void mostrarDados() {
        System.out.println("Conta: " + getNumeroCo());
        System.out.println("Saldo: " + getSaldo());
        System.out.println("Taxa de Operação: " + getChequeEs());
    }

}
