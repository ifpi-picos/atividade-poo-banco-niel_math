import java.util.Date;
import br.edu.ifpi.dominio.*;
import java.time.LocalDate;
import java.util.Scanner;

// Adicionar scanner completo.
public class App {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Qual Metodo de acesso: (0) ate (2)\n");
        System.out.println("| 1 | - Criar nova conta \n| 2 | - Entrar na conta \n| 0 | - Sair\n");
        int method = scanner.nextInt();

        if (method == 0) {
            System.out.println("Programa Finalizado.");
        } else if (method == 1) {
            Cliente cliente1 = new Cliente();
            System.out.println("Digite o nome: ");
            String nomedocliente = scanner.nextLine();
            cliente1.setNome(nomedocliente);
     
        } else if (method == 2) {

        } else {
            System.out.println("Número não corresponde");
        }

        //Endereco endereco = new Endereco("Pics", "Sao Jose", "Rua de zeze", 21);
        //Poupanca poupanca = new Poupanca(4893627, 026, 1000.00, null);
        //Corrente corrente = new Corrente(5427272, 054, 2000.00, null, 500.00);
        //Cliente cliente = new Cliente("Zeze", "514.297.801-51", LocalDate.of(2000, 1, 15), endereco, corrente);
        //Cliente cliente2 = new Cliente("teus", "514.291.941-15", LocalDate.of(2000, 1, 15), endereco, poupanca);

        //System.out.print("total conta poupanca = ");
        //System.out.println(poupanca.getSaldo());
        //System.out.print("total conta corrente = ");
        //System.out.println(corrente.getSaldo());

        // conta.transferir(conta2, 100.00);

        // System.out.println(conta2.getSaldo());
        // System.out.println(conta.getSaldo());

        //poupanca.sacar(1500.00);

        //System.out.println(poupanca.getSaldo());
    }
}