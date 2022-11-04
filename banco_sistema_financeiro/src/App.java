import java.util.List;
import br.edu.ifpi.dominio.*;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Corrente> listaCorrente = new ArrayList<Corrente>();
        ArrayList<Poupanca> listaPoupanca = new ArrayList<Poupanca>();
        List<String> nCpf = new ArrayList<>();
        String cpf, nome, data, bairro, cidade, rua;
        int agencia, nConta, nCasa;
        double saldo = 0, cheque = 1000.00;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int loop = 0;
        while (loop == 0) {
        //INTERFACE INICIAL;
            System.out.println("--------SISTEMA BANCARARIO--------");
            System.out.println("|1| Criar Conta.");
            System.out.println("|2| Entrar na Conta.");
            System.out.println("|0| Encerrar.");
            System.out.print("Digite: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("|1| Conta Corrente");
                    System.out.println("|2| Conta Poupança");
                    System.out.print("Digite: ");
                    int respost = scanner.nextInt();
                    //CONTA CORRENTE;
                    if (respost == 1) {
                        //ENDEREÇO/CLIENTE;
                        System.out.println("Endereço: ");
                        System.out.print("Cidade: ");
                        cidade = (scanner.nextLine());
                        cidade = (scanner.nextLine());
                        System.out.print("Bairro: ");
                        bairro = (scanner.nextLine());
                        System.out.print("Rua: ");
                        rua = (scanner.nextLine());
                        System.out.print("Numero: ");
                        nCasa = (scanner.nextInt());
                        System.out.println(" Cliente: ");
                        System.out.print("Nome: ");
                        nome = (scanner.nextLine());
                        nome = (scanner.nextLine());
                        System.out.print("Cpf: ");
                        cpf = (scanner.nextLine());
                        System.out.print("Data de  Nascimento: ");
                        data = (scanner.nextLine());
                        System.out.println("Conta Corrente: ");
                        //RANDOM;
                        agencia = random.nextInt(100, 1000);
                        nConta = random.nextInt(1000000, 10000000);
                        Endereco endereco = new Endereco(cidade, bairro, rua, nCasa);
                        Cliente cliente = new Cliente(nome, cpf, data, endereco);
                        Corrente corrente = new Corrente(agencia, nConta, saldo, cliente, cheque);
                        System.out.format("%d\n", corrente.getNumeroAg());
                        System.out.format("%d\n", corrente.getNumeroCo());
                        System.out.format("%.2f\n", corrente.getSaldo());
                        System.out.format("%.2f\n", corrente.getChequeEs());

                        break;
                    }
                    //CONTA POUPANÇA;
                    if (respost == 2) {
                        System.out.println("Endereço: ");
                        System.out.print("Cidade: ");
                        cidade = (scanner.nextLine());
                        cidade = (scanner.nextLine());
                        System.out.print("Bairro: ");
                        bairro = (scanner.nextLine());
                        System.out.print("Rua: ");
                        rua = (scanner.nextLine());
                        System.out.print("Numero: ");
                        nCasa = (scanner.nextInt());
                        System.out.println(" Cliente: ");
                        System.out.print("Nome: ");
                        nome = (scanner.nextLine());
                        nome = (scanner.nextLine());
                        System.out.print("Cpf: ");
                        cpf = (scanner.nextLine());
                        System.out.print("Data de  Nascimento: ");
                        data = (scanner.nextLine());
                        System.out.print("Conta Poupança: ");
                        //RANDOM;
                        agencia = random.nextInt(100, 1000);
                        nConta = random.nextInt(1000000, 10000000);
                        Endereco endereco = new Endereco(cidade, bairro, rua, nCasa);
                        Cliente cliente = new Cliente(nome, cpf, data, endereco);
                        Poupanca poupanca = new Poupanca(agencia, nConta, saldo, cliente);
                        System.out.format("%d\n", poupanca.getNumeroAg());
                        System.out.format("%d\n", poupanca.getNumeroCo());
                        System.out.format("%f\n", poupanca.getSaldo());

                        break;
                    }
                    //INTERFACE 2;
                case 2:

                    System.out.println("Entrar na conta.");
                    System.out.print("Informe seu CPF: ");
                    int resposta3 = scanner.nextInt();
                    System.out.print("Conta Selecionada: ");
            }
        }
    }
}