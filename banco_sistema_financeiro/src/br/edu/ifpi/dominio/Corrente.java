package br.edu.ifpi.dominio;

public class Corrente extends Conta {
    private double chequeEs;
    private int qtdTransferecia;
    private double taxa = 0.05;

    public Corrente(int numeroAg, int numeroCo, double saldo, Cliente cliente1, double chequeEs) {
        super(numeroAg, numeroCo, saldo, cliente1);
        this.chequeEs = chequeEs;
    }
    @Override
    public void sacar(double valor) {
        if (this.getSaldo() + this.getChequeEs() >= valor) {
            System.out.println("Saldo Insuficiente.");
        } else {
            this.setSaldo(this.getSaldo() - valor);
        }
    }
    @Override
    public void transferir(Conta conta2, double valor) {
        double valorRetirado = qtdTransferecia < 3 ? valor : valor + (valor * taxa);
        
        if (valorRetirado <= getChequeEs() + getSaldo()) {
            if (qtdTransferecia < 3) {
                super.transferir(conta2, valor);
            } else {
                super.saldo = super.saldo - valorRetirado;
                conta2.depositar(valor);
            }
            qtdTransferecia +=1;
        } else {
            System.out.println("sem saldo");
        }
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
