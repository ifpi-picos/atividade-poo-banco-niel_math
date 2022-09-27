package br.edu.ifpi.dominio;
import java.time.LocalDate;

public class Cliente {
    private String nome;
    private String cpf;
    private LocalDate dataNasc;
    private Endereco endereco;
    
    public Cliente(String nome, String cpf, LocalDate dataNasc, Endereco endereco, Conta conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNasc = dataNasc;
        this.endereco = endereco;
    }

    
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}