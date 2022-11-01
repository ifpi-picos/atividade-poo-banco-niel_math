import java.util.Date;
import br.edu.ifpi.dominio.*;
import java.time.LocalDate;
import java.util.Scanner;

// Adicionar scanner completo.
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int loop = 0;
        while (loop == 0) {

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
                    if (respost == 1) {

                        Endereco endereco = new Endereco(null, null, null, respost);
                        Cliente cliente = new Cliente(null, null, null, endereco, null);
                        Corrente corrente = new Corrente(123, 456, 1000.00, cliente, 1000.00);

                        System.out.print(" Endereço: ");
                        System.out.println("Cidade: ");
                        endereco.setCidade(scanner.nextLine());
                        System.out.println("Bairro: ");
                        endereco.setBairro(scanner.nextLine());
                        System.out.println("Rua: ");
                        endereco.setRua(scanner.nextLine());
                        System.out.println("Numero: ");
                        endereco.setNumero(scanner.nextInt());

                        System.out.print(" Cliente: ");
                        System.out.println("Nome: ");
                        cliente.setNome(scanner.nextLine());
                        System.out.println("Cpf: ");
                        cliente.setCpf(scanner.nextLine());
                        System.out.println("Data de  Nascimento: ");
                        cliente.setDataNasc(scanner.nextLine());
                        cliente.setEndereco(endereco);

                        System.out.print(" Conta Corrente: ");
                        System.out.format("%d", corrente.getNumeroAg());
                        System.out.format("%d", corrente.getNumeroCo());
                        System.out.format("%d", corrente.getSaldo());
                        System.out.format("%d", corrente.getChequeEs());

                        break;
                    }
                    if (respost == 2) {

                        Endereco endereco = new Endereco(null, null, null, respost);
                        Cliente cliente = new Cliente(null, null, null, endereco, null);
                        Poupanca poupanca = new Poupanca(789, 654, 1000.00, cliente, 10);

                        System.out.println("Endereço ");
                        System.out.print("Cidade: ");
                        endereco.setCidade(scanner.nextLine());
                        endereco.setCidade(scanner.nextLine());
                        System.out.print("Bairro: ");
                        endereco.setBairro(scanner.nextLine());
                        System.out.print("Rua: ");
                        endereco.setRua(scanner.nextLine());
                        System.out.print("Numero: ");
                        endereco.setNumero(scanner.nextInt());

                        System.out.println("Cliente ");
                        System.out.print("Nome: ");
                        cliente.setNome(scanner.nextLine());
                        cliente.setNome(scanner.nextLine());
                        System.out.print("Cpf: ");
                        cliente.setCpf(scanner.nextLine());
                        System.out.print("Data de  Nascimento: ");
                        cliente.setDataNasc(scanner.nextLine());
                        cliente.setEndereco(endereco);

                        System.out.print(" Conta Corrente: ");
                        System.out.format("%d", poupanca.getNumeroAg());
                        System.out.format("%d", poupanca.getNumeroCo());
                        System.out.format("%d", poupanca.getSaldo());

                        break;
                    }
                case 2:

                    System.out.println("Entrar na conta.");
                    System.out.print("Informe seu CPF: ");
                    int resposta3 = scanner.nextInt();
                    System.out.print("Conta Selecionada: ");
            }
        }
    }

}