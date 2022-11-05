package br.edu.ifpi.dominio;

public class Poupanca extends Conta {

    private double taxa = 0.05;
    private double rendimento = 1.1;

    public Poupanca(int numeroAg, int numeroCo, double saldo, Cliente cliente2) {
        super(numeroAg, numeroCo, saldo, cliente2);
    }
    public double getRendimento() {
        return rendimento;
    }
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }
    @Override
    public void depositar(double valor) {
        setSaldo(getSaldo() + (valor * rendimento));
    }
    @Override
    public void transferir(Conta conta2, double valor) {
        if (super.getSaldo() >= valor) {
            super.setSaldo(super.getSaldo() - (valor * taxa));
            conta2.setSaldo(conta2.getSaldo() + valor);
        System.out.println("Transferência Realizada.");
        } else{
        System.out.println("Saldo Insuficiente.");
        }
    }
    public void mostrarDados() {
        System.out.println("Conta: " + getNumeroCo());
        System.out.format("Saldo: %.2f\n", getSaldo());
    }
    public int getNumeroAg() {
        return super.getNumeroAg();
    }
}
