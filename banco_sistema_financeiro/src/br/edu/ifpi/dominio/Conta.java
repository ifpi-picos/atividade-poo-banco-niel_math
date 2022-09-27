package br.edu.ifpi.dominio;

public class Conta {
    private int numeroAg;
    private int numeroCo;
    private double saldo;
    private Cliente cliente;

    public Conta(int numeroAg, int numeroCo, double saldo) {
        this.numeroAg = numeroAg;
        this.numeroCo = numeroCo;
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public int getNumeroAg() {
        return numeroAg;
    }

    public int getNumeroCo() {
        return numeroCo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(Double valor) {
        saldo += valor;
    }

    public void transferir(int i, Conta outra) {
        if (this.temSaldoSuficiente(i)) {
            this.saldo -= i;
            outra.depositar(i);
        } else {
            System.out.println("saldo insusifiente");
        }
    }

    public void sacar(Double valor) {
        saldo -= valor;
    }

    public boolean temSaldoSuficiente(Double valor) {
        return this.saldo >= valor;
    }

}