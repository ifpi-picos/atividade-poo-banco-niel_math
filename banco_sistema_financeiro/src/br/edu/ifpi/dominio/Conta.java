package br.edu.ifpi.dominio;

public class Conta {
    private int numeroAg;
    private int numeroCo;
    protected double saldo;
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

    public void depositar(double valor) {
        saldo += valor;
    }

    public void transferir(Conta conta2, double valor) {
        if (this.getSaldo() < valor) {
            System.out.println("Saldo insuficiente.");
        } else {
            this.setSaldo(this.getSaldo() - valor);
            conta2.setSaldo(conta2.getSaldo() + valor);
        }
    }

    public void sacar(double valor) {
        if (this.getSaldo() < valor){
            System.out.println("Saldo insuficiente.");
        }   else{
            this.setSaldo(this.getSaldo() - valor);
        }
    }

}