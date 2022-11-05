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
        int agencia, nConta, nCasa, loop2 = 0, loop3 = 0;
        double saldo = 0, cheque = 1000.00;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        Notification notification = null;

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
                        if (respost == 1) {
                            for (Corrente iterable_element : listaCorrente) {
                                while (cpf.equals(iterable_element.getCliente().getCpf())) {
                                    System.out.println("CPF já cadastrado no Sistema.");
                                    System.out.println();
                                    System.out.println("CPF: ");
                                    cpf = scanner.next();
                                }
                            }
                        }
                        if (nCpf.contains(cpf) == false) {
                            nCpf.add(cpf);
                        }
                        System.out.print("Data de  Nascimento: ");
                        data = (scanner.nextLine());
                        System.out.println("|1| Email.");
                        System.out.println("|2| SMS.");
                        System.out.println("Digite: ");
                        int respostaa = scanner.nextInt();
                        if (respostaa == 1) {
                            Notification email = new Email();
                            notification = email;
                        }
                        else if (respostaa == 2) {
                            Notification sms = new SmS();
                        notification = sms;
                       }
                        System.out.println("Conta Corrente: ");
                        //RANDOM;
                        agencia = random.nextInt(100, 1000);
                        nConta = random.nextInt(1000000, 10000000);
                        Endereco endereco = new Endereco(cidade, bairro, rua, nCasa);
                        Cliente cliente = new Cliente(nome, cpf, data, endereco);
                        Corrente corrente = new Corrente(agencia, nConta, saldo, cliente, cheque);
                        listaCorrente.add(corrente);
                        System.out.format("%d\n", corrente.getNumeroCo());
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
                        bairro   = (scanner.nextLine());
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
                        if (respost == 2) {
                            for (Poupanca iterable_element : listaPoupanca) {
                                while (cpf.equals(iterable_element.getCliente().getCpf())) {
                                    System.out.println("CPF já cadastrado no Sistema.");
                                    System.out.println();
                                    System.out.println("CPF: ");
                                    cpf = scanner.next();
                                }
                            }
                        }
                        if (nCpf.contains(cpf) == false) {
                            nCpf.add(cpf);
                        }
                        System.out.print("Data de  Nascimento: ");
                        data = (scanner.nextLine());
                        System.out.println("|1| Email.");
                        System.out.println("|2| SMS.");
                        System.out.println("Digite: ");
                        int respostaa = scanner.nextInt();
                        while(loop2 == 0)
                        if (respostaa == 1) {
                            Notification email = new Email();
                            notification = email;
                            loop2 = 1;
                        }
                        else if (respostaa == 2) {
                            Notification sms = new SmS();
                        notification = sms;
                        loop2 = 1;
                       } else {
                        System.out.println("Opção Invalida");
                        System.out.println("|1| Email.");
                        System.out.println("|2| SMS.");
                        System.out.println("Digite: ");
                        respostaa = scanner.nextInt();
                       }
                        System.out.println("Conta Poupança: ");
                        //RANDOM;
                        agencia = random.nextInt(100, 1000);
                        nConta = random.nextInt(1000000, 10000000);
                        Endereco endereco = new Endereco(cidade, bairro, rua, nCasa);
                        Cliente cliente = new Cliente(nome, cpf, data, endereco);
                        Poupanca poupanca = new Poupanca(agencia, nConta, saldo, cliente);
                        listaPoupanca.add(poupanca);
                        System.out.format("%d\n", poupanca.getNumeroAg());
                        System.out.format("%d\n", poupanca.getNumeroCo());
                        System.out.format("%.2f\n", poupanca.getSaldo());

                        break;
                    }
                    //INTERFACE 2;
                case 2:
                System.out.println("Entrar na conta.");
                System.out.println("|1| Conta Corrente");
                System.out.println("|2| Conta Poupança");
                System.out.print("Digite: ");
                int entre = scanner.nextInt();
                System.out.print("Informe seu CPF: ");
                cpf = scanner.nextLine();
                cpf = scanner.nextLine();
                while(nCpf.contains(cpf) == false) {
                    System.out.println("CPF Inválido.");
                    System.out.print("Informe seu CPF: ");
                    cpf = scanner.nextLine();
                }
                if (entre == 1) {
                    for (Corrente iterable_element : listaCorrente) {
                        if (cpf.equals(iterable_element.getCliente().getCpf())) {
                            while(loop3 == 0) {
                            System.out.println("Selecione sua Operação: ");
                            System.out.println("|1| Depositar.");
                            System.out.println("|2| Sacar.");
                            System.out.println("|3| Transferir.");
                            int operacao = scanner.nextInt();
                            if (operacao == 1) {
                                System.out.println("Digite Valor: ");
                                Double vdeposito = scanner.nextDouble();
                                iterable_element.depositar(vdeposito);
                                iterable_element.mostrarDados();
                            }
                            if (operacao == 2) {
                                System.out.println("Digite Valor: ");
                                Double vsaque = scanner.nextDouble();
                                iterable_element.sacar(vsaque);
                                iterable_element.mostrarDados();
                            } 
                            if (operacao == 3) {
                                System.out.println("Digite Valor: ");
                                Double vsaque = scanner.nextDouble();
                                iterable_element.sacar(vsaque);
                                iterable_element.mostrarDados();
                            } else if (operacao > 3 || operacao < 1) {
                                loop3 = 1;
                            }
                        } 
                        } 
                    }
                }
                if (entre == 2) {
                    for (Poupanca iterable_element : listaPoupanca) {
                        if (cpf.equals(iterable_element.getCliente().getCpf())) {
                            while(loop3 == 0) {
                            System.out.println("Selecione sua Operação: ");
                            System.out.println("|1| Depositar.");
                            System.out.println("|2| Sacar.");
                            System.out.println("|3| Transferir.");
                            int operacao = scanner.nextInt();
                            if (operacao == 1) {
                                System.out.println("Digite Valor: ");
                                Double vdeposito = scanner.nextDouble();
                                iterable_element.depositar(vdeposito);
                                iterable_element.mostrarDados();
                            }
                            if (operacao == 2) {
                                System.out.println("Digite Valor: ");
                                Double vsaque = scanner.nextDouble();
                                iterable_element.sacar(vsaque);
                                iterable_element.mostrarDados();
                            } 
                            if (operacao == 3) {
                                System.out.println("Digite Valor: ");
                                Double vsaque = scanner.nextDouble();
                                iterable_element.sacar(vsaque);
                                iterable_element.mostrarDados();
                            } else if (operacao > 3 || operacao < 1) {
                                loop3 = 1;
                            }
                        } 
                        } 
                    }
                }
                case 0:
                loop = 1;
            }
        }
    }
}