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
                        Cliente cliente  = new Cliente(null, null, null, endereco, null);
                        Corrente corrente = new Corrente(123, 456, 2000.00, cliente, 1000.00);

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
                        Cliente cliente  = new Cliente(null, null, null, endereco, null);
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
                /*case 2:

                    System.out.println("Selecionar Conta");
                    System.out.print("Informe o número da conta: ");
                    int resposta3 = leitor.nextInt();
                    System.out.print("Conta Selecionada: ");
                    ContaBancaria contaSelecionada = b1.procurarConta(resposta3);


                    if (contaSelecionada != null) {
                        Scanner sc = new Scanner(System.in);
                        System.out.println("1. Depositar");
                        System.out.println("2. Sacar");
                        System.out.println("3. Transferir");
                        System.out.println("4. Gerar Relatório");
                        System.out.println("5. Retornar ao menu anterior");

                        System.out.print("Opção: ");
                        int resp = sc.nextInt();
                        switch (resp) {
                            case 1:
                                System.out.println("------------------------");
                                System.out.println("Depositar");
                                System.out.print("Valor: ");
                                double saldoAnterior = contaSelecionada.getSaldo();
                                double valorDeposito = sc.nextDouble();
                                double saldoComDeposito = contaSelecionada.depositar(valorDeposito);
                                System.out.println("------------------------");
                                System.out.println("Saldo Anterior: " + saldoAnterior);
                                System.out.println("Valor Depósito: " + valorDeposito);
                                System.out.println("Saldo com Depósito: " + contaSelecionada.getSaldo());
                                System.out.println("------------------------");
                                break;
                            case 2:
                                System.out.println("------------------------");
                                System.out.println("Sacar");
                                System.out.print("Valor: ");
                                double saldoAntecedente = contaSelecionada.getSaldo();
                                double valorSaque = sc.nextDouble();
                                double saldoComSaque = contaSelecionada.sacar(valorSaque);
                                System.out.println("------------------------");
                                System.out.println("Saldo Anterior: " + saldoAntecedente);
                                System.out.println("Valor Saque: " + valorSaque);
                                System.out.println("Saldo após saque: " + contaSelecionada.getSaldo());
                                System.out.println("------------------------");
                                break;
                            case 3:
                                System.out.println("------------------------");
                                System.out.println("Transferir");
                                System.out.print("Conta Destino: ");
                                int resp4 = sc.nextInt();
                                ContaBancaria contaDestino = b1.procurarConta(resp4);
                                if (contaDestino != null) {
                                    System.out.print("Valor: ");
                                    double valorTransf = sc.nextDouble();
                                    double saldoOrigem = contaSelecionada.getSaldo();
                                    double saldoDestino = contaDestino.getSaldo();
                                    contaSelecionada.transferir(valorTransf, contaDestino);
                                    System.out.println("------------------------");
                                    System.out.println("Conta Origem: " + contaSelecionada.getNumConta());
                                    System.out.println("Saldo Anteriror: " + saldoOrigem);
                                    System.out.println("Saldo Atual: " + contaSelecionada.getSaldo());
                                    System.out.println("------------------------");
                                    System.out.println("Conta Destino: " + contaDestino.getNumConta());
                                    System.out.println("Saldo Anterior: " + saldoDestino);
                                    System.out.println("Saldo Atual: " + contaDestino.getSaldo());
                                } else {
                                    System.out.println("Operação Abortada!");
                                }
                                System.out.println("------------------------");
                                break;
                            case 4:
                                System.out.println("------------------------");
                                System.out.println("Gerar Relatório");
                                Relatorio relatorio = new Relatorio();
                                relatorio.gerarRelatorio(contaSelecionada);
                                System.out.println("------------------------");
                                break;
                            case 5:
                                System.out.println("------------------------");
                                System.out.println("Retornar ao menu anterior");
                                System.out.println("------------------------");
                                break;
                            default:
                                System.out.println("Opção Inválida!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("------------------------");
                    System.out.println("Remover Conta");
                    System.out.print("Informe o número da conta: ");
                    int resposta4 = leitor.nextInt();
                    System.out.println("------------------------");
                    b1.removerConta(resposta4);
                    System.out.println("------------------------");
                    break;
                case 4:
                    System.out.println("------------------------");
                    System.out.println("Gerar Relatório");
                    b1.mostrarDados();
                    System.out.println("------------------------");
                    break;
                case 5:
                    System.out.println("------------------------");
                    System.out.println("Operação Finaliza!");
                    System.out.println("------------------------");
                    controle = 1;
                    break;
                default:
                    System.out.println("Opção Inválida!");*/
            }
        }
    }

}